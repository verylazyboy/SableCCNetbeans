package org.sablecc.sablecc;

import java.util.*;
import org.sablecc.sablecc.analysis.DepthFirstAdapter;
import org.sablecc.sablecc.node.*;

/**
 *
 * @author hbui
 */
public class AstDiagnoser extends DepthFirstAdapter
{

	int depth = 0;
	private String productName;
	//private boolean elementIdIsProd = true;
		
	private IdSpec idSpec = IdSpec.UN_SPEC;
	
	private HashMap<String,TId> tokenTable;
	private HashMap<String,TId> astProductTable;
	
	private int errorCount;

	public AstDiagnoser(final TokenRegister tokenReg)
	{
		tokenTable = tokenReg.getTokenTable();
		astProductTable = tokenReg.getAstProductNameTable();
	}
	
	@Override
	public void caseAGrammar(AGrammar node) 
	{
		//super.caseAGrammar(node);
		
		if(node.getAst() != null)
		{
			node.getAst().apply(this);
		}
		
	}

	
	@Override
	public void caseAAst(AAst node) 
	{
		inAAst(node);
		LinkedList l = node.getProds();
		for (int i = 0; i< l.size(); ++i)
		{
			 ((PAstProd) l.get(i)).apply(this);
		}
		outAAst(node);
	}

	@Override
	public void caseAAstProd(AAstProd node) 
	{
		//inAAstProd(node);
		productName = node.getId().getText();
		// TODO: make a production Node hier
		/*
		if(node.getId() != null)
		{
		  node.getId().apply(this);
		}
		*/
		
		{
		  Object temp[] = node.getAlts().toArray();
		  for(int i = 0; i < temp.length; i++)
		  {
			((PAstAlt) temp[i]).apply(this);
		  }
		}
		outAAstProd(node);
	}

	@Override
	public void caseAAstAlt(AAstAlt node) 
	{
		
		{
		  Object temp[] = node.getElems().toArray();
		  for(int i = 0; i < temp.length; i++)
		  {
			((PElem) temp[i]).apply(this);
		  }
		}
		//outAAstAlt(node);
	}

	@Override
	public void caseAElem(AElem node) 
	{
		inAElem(node);
		TId id = node.getId();
		String elementId = node.getId().getText();
		if(node.getSpecifier() != null)
    	{
      		node.getSpecifier().apply(this);
			if (idSpec == IdSpec.TOKEN)
			{
				System.out.println(productName +  " -> " + "T." + elementId);
			}else
			{
				System.out.println(productName +  " -> " + "P." + elementId);
			}
	    }else
		{
			TId token = tokenTable.get(elementId);
			TId astProd = astProductTable.get(elementId);
			if (token == null)
			{
				if (astProd == null)
				{
					// No token and no production -> Error
					errorHandling("["+id.getLine() +":" + id.getPos() + "] " 
							+"Production >>" + id.getText() + "<< and token >>" 
							+ id.getText() 
							+ "<< undefined. If it is a production, "
							+ "it should be defined in AST section.");
				}else
				{
					// No Token and Production found -> print a edge from production to produciton
					System.out.println(productName +  " -> " + "P." + elementId);
				}
			}else
			{
				if (astProd == null)
				{
					// No Production and Token found -> print a edge from production to Token
					System.out.println(productName +  " -> " + "T." + elementId);
				}else
				{
					// Found Token and Production -> print error
					errorHandling("[" + id.getLine() + ":" + id.getPos() + "] "
							+ "Ambiguous production and token: >>" 
							+ id.getText() 
							+ "<<, production at ["
							+ astProd.getLine() + ":" + astProd.getPos() 
							+"], token at ["
							+token.getLine()+":"+token.getPos()
							+ "]"
							);
				}
			}
		}
	}

	@Override
	public void caseATokenSpecifier(ATokenSpecifier node) 
	{
		this.idSpec = IdSpec.TOKEN;
	}

	@Override
	public void caseAProductionSpecifier(AProductionSpecifier node) 
	{
		this.idSpec = IdSpec.PROCDUCTION;
	}

	@Override
	public void inAElem(AElem node) {
		idSpec = IdSpec.UN_SPEC;
	}

	@Override
	public void outAElem(AElem node) {
		idSpec = IdSpec.UN_SPEC;
	}

	
	private String getNameOfNode(Node node)
	{
		String name = node.getClass().getName();
		if (name.lastIndexOf('.') > 0) {
		    name = name.substring(name.lastIndexOf('.')+1);
		}
		return name;
	}

	private void errorHandling(String msg)
	{
		errorCount = errorCount +1;
		System.err.print(msg);
	}

	public int getError(){return errorCount;}
	
}

