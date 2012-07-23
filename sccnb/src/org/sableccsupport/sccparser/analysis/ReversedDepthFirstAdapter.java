/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.sccparser.analysis;

import java.util.*;
import org.sableccsupport.sccparser.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPGrammar().apply(this);
        outStart(node);
    }

    public void inAGrammar(AGrammar node)
    {
        defaultIn(node);
    }

    public void outAGrammar(AGrammar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGrammar(AGrammar node)
    {
        inAGrammar(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        if(node.getProductions() != null)
        {
            node.getProductions().apply(this);
        }
        if(node.getIgnTokens() != null)
        {
            node.getIgnTokens().apply(this);
        }
        if(node.getTokens() != null)
        {
            node.getTokens().apply(this);
        }
        if(node.getStates() != null)
        {
            node.getStates().apply(this);
        }
        if(node.getHelpers() != null)
        {
            node.getHelpers().apply(this);
        }
        {
            List<TPkgId> copy = new ArrayList<TPkgId>(node.getPackage());
            Collections.reverse(copy);
            for(TPkgId e : copy)
            {
                e.apply(this);
            }
        }
        outAGrammar(node);
    }

    public void inAHelpers(AHelpers node)
    {
        defaultIn(node);
    }

    public void outAHelpers(AHelpers node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHelpers(AHelpers node)
    {
        inAHelpers(node);
        {
            List<PHelperDef> copy = new ArrayList<PHelperDef>(node.getHelperDefs());
            Collections.reverse(copy);
            for(PHelperDef e : copy)
            {
                e.apply(this);
            }
        }
        outAHelpers(node);
    }

    public void inAHelperDef(AHelperDef node)
    {
        defaultIn(node);
    }

    public void outAHelperDef(AHelperDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHelperDef(AHelperDef node)
    {
        inAHelperDef(node);
        if(node.getRegExp() != null)
        {
            node.getRegExp().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAHelperDef(node);
    }

    public void inAStates(AStates node)
    {
        defaultIn(node);
    }

    public void outAStates(AStates node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStates(AStates node)
    {
        inAStates(node);
        {
            List<TId> copy = new ArrayList<TId>(node.getListId());
            Collections.reverse(copy);
            for(TId e : copy)
            {
                e.apply(this);
            }
        }
        outAStates(node);
    }

    public void inATokens(ATokens node)
    {
        defaultIn(node);
    }

    public void outATokens(ATokens node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATokens(ATokens node)
    {
        inATokens(node);
        {
            List<PTokenDef> copy = new ArrayList<PTokenDef>(node.getTokenDefs());
            Collections.reverse(copy);
            for(PTokenDef e : copy)
            {
                e.apply(this);
            }
        }
        outATokens(node);
    }

    public void inATokenDef(ATokenDef node)
    {
        defaultIn(node);
    }

    public void outATokenDef(ATokenDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATokenDef(ATokenDef node)
    {
        inATokenDef(node);
        if(node.getLookAhead() != null)
        {
            node.getLookAhead().apply(this);
        }
        if(node.getSlash() != null)
        {
            node.getSlash().apply(this);
        }
        if(node.getRegExp() != null)
        {
            node.getRegExp().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getStateList() != null)
        {
            node.getStateList().apply(this);
        }
        outATokenDef(node);
    }

    public void inAStateList(AStateList node)
    {
        defaultIn(node);
    }

    public void outAStateList(AStateList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStateList(AStateList node)
    {
        inAStateList(node);
        {
            List<PStateListTail> copy = new ArrayList<PStateListTail>(node.getStateLists());
            Collections.reverse(copy);
            for(PStateListTail e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getTransition() != null)
        {
            node.getTransition().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAStateList(node);
    }

    public void inAStateListTail(AStateListTail node)
    {
        defaultIn(node);
    }

    public void outAStateListTail(AStateListTail node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStateListTail(AStateListTail node)
    {
        inAStateListTail(node);
        if(node.getTransition() != null)
        {
            node.getTransition().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAStateListTail(node);
    }

    public void inATransition(ATransition node)
    {
        defaultIn(node);
    }

    public void outATransition(ATransition node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATransition(ATransition node)
    {
        inATransition(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outATransition(node);
    }

    public void inAIgnTokens(AIgnTokens node)
    {
        defaultIn(node);
    }

    public void outAIgnTokens(AIgnTokens node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgnTokens(AIgnTokens node)
    {
        inAIgnTokens(node);
        {
            List<TId> copy = new ArrayList<TId>(node.getListId());
            Collections.reverse(copy);
            for(TId e : copy)
            {
                e.apply(this);
            }
        }
        outAIgnTokens(node);
    }

    public void inARegExp(ARegExp node)
    {
        defaultIn(node);
    }

    public void outARegExp(ARegExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARegExp(ARegExp node)
    {
        inARegExp(node);
        {
            List<PConcat> copy = new ArrayList<PConcat>(node.getConcats());
            Collections.reverse(copy);
            for(PConcat e : copy)
            {
                e.apply(this);
            }
        }
        outARegExp(node);
    }

    public void inAConcat(AConcat node)
    {
        defaultIn(node);
    }

    public void outAConcat(AConcat node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConcat(AConcat node)
    {
        inAConcat(node);
        {
            List<PUnExp> copy = new ArrayList<PUnExp>(node.getUnExps());
            Collections.reverse(copy);
            for(PUnExp e : copy)
            {
                e.apply(this);
            }
        }
        outAConcat(node);
    }

    public void inAUnExp(AUnExp node)
    {
        defaultIn(node);
    }

    public void outAUnExp(AUnExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnExp(AUnExp node)
    {
        inAUnExp(node);
        if(node.getUnOp() != null)
        {
            node.getUnOp().apply(this);
        }
        if(node.getBasic() != null)
        {
            node.getBasic().apply(this);
        }
        outAUnExp(node);
    }

    public void inACharBasic(ACharBasic node)
    {
        defaultIn(node);
    }

    public void outACharBasic(ACharBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharBasic(ACharBasic node)
    {
        inACharBasic(node);
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outACharBasic(node);
    }

    public void inASetBasic(ASetBasic node)
    {
        defaultIn(node);
    }

    public void outASetBasic(ASetBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASetBasic(ASetBasic node)
    {
        inASetBasic(node);
        if(node.getSet() != null)
        {
            node.getSet().apply(this);
        }
        outASetBasic(node);
    }

    public void inAStringBasic(AStringBasic node)
    {
        defaultIn(node);
    }

    public void outAStringBasic(AStringBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringBasic(AStringBasic node)
    {
        inAStringBasic(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringBasic(node);
    }

    public void inAIdBasic(AIdBasic node)
    {
        defaultIn(node);
    }

    public void outAIdBasic(AIdBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdBasic(AIdBasic node)
    {
        inAIdBasic(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdBasic(node);
    }

    public void inARegExpBasic(ARegExpBasic node)
    {
        defaultIn(node);
    }

    public void outARegExpBasic(ARegExpBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARegExpBasic(ARegExpBasic node)
    {
        inARegExpBasic(node);
        if(node.getRegExp() != null)
        {
            node.getRegExp().apply(this);
        }
        outARegExpBasic(node);
    }

    public void inACharChar(ACharChar node)
    {
        defaultIn(node);
    }

    public void outACharChar(ACharChar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharChar(ACharChar node)
    {
        inACharChar(node);
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outACharChar(node);
    }

    public void inADecChar(ADecChar node)
    {
        defaultIn(node);
    }

    public void outADecChar(ADecChar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecChar(ADecChar node)
    {
        inADecChar(node);
        if(node.getDecChar() != null)
        {
            node.getDecChar().apply(this);
        }
        outADecChar(node);
    }

    public void inAHexChar(AHexChar node)
    {
        defaultIn(node);
    }

    public void outAHexChar(AHexChar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHexChar(AHexChar node)
    {
        inAHexChar(node);
        if(node.getHexChar() != null)
        {
            node.getHexChar().apply(this);
        }
        outAHexChar(node);
    }

    public void inAOperationSet(AOperationSet node)
    {
        defaultIn(node);
    }

    public void outAOperationSet(AOperationSet node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOperationSet(AOperationSet node)
    {
        inAOperationSet(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getBinOp() != null)
        {
            node.getBinOp().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAOperationSet(node);
    }

    public void inAIntervalSet(AIntervalSet node)
    {
        defaultIn(node);
    }

    public void outAIntervalSet(AIntervalSet node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntervalSet(AIntervalSet node)
    {
        inAIntervalSet(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAIntervalSet(node);
    }

    public void inAStarUnOp(AStarUnOp node)
    {
        defaultIn(node);
    }

    public void outAStarUnOp(AStarUnOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStarUnOp(AStarUnOp node)
    {
        inAStarUnOp(node);
        if(node.getStar() != null)
        {
            node.getStar().apply(this);
        }
        outAStarUnOp(node);
    }

    public void inAQMarkUnOp(AQMarkUnOp node)
    {
        defaultIn(node);
    }

    public void outAQMarkUnOp(AQMarkUnOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAQMarkUnOp(AQMarkUnOp node)
    {
        inAQMarkUnOp(node);
        if(node.getQMark() != null)
        {
            node.getQMark().apply(this);
        }
        outAQMarkUnOp(node);
    }

    public void inAPlusUnOp(APlusUnOp node)
    {
        defaultIn(node);
    }

    public void outAPlusUnOp(APlusUnOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusUnOp(APlusUnOp node)
    {
        inAPlusUnOp(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusUnOp(node);
    }

    public void inAPlusBinOp(APlusBinOp node)
    {
        defaultIn(node);
    }

    public void outAPlusBinOp(APlusBinOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusBinOp(APlusBinOp node)
    {
        inAPlusBinOp(node);
        outAPlusBinOp(node);
    }

    public void inAMinusBinOp(AMinusBinOp node)
    {
        defaultIn(node);
    }

    public void outAMinusBinOp(AMinusBinOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusBinOp(AMinusBinOp node)
    {
        inAMinusBinOp(node);
        outAMinusBinOp(node);
    }

    public void inAProductions(AProductions node)
    {
        defaultIn(node);
    }

    public void outAProductions(AProductions node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProductions(AProductions node)
    {
        inAProductions(node);
        {
            List<PProd> copy = new ArrayList<PProd>(node.getProds());
            Collections.reverse(copy);
            for(PProd e : copy)
            {
                e.apply(this);
            }
        }
        outAProductions(node);
    }

    public void inAProd(AProd node)
    {
        defaultIn(node);
    }

    public void outAProd(AProd node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProd(AProd node)
    {
        inAProd(node);
        {
            List<PAlt> copy = new ArrayList<PAlt>(node.getAlts());
            Collections.reverse(copy);
            for(PAlt e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PElem> copy = new ArrayList<PElem>(node.getProdTransform());
            Collections.reverse(copy);
            for(PElem e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getArrow() != null)
        {
            node.getArrow().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAProd(node);
    }

    public void inAAlt(AAlt node)
    {
        defaultIn(node);
    }

    public void outAAlt(AAlt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAlt(AAlt node)
    {
        inAAlt(node);
        if(node.getAltTransform() != null)
        {
            node.getAltTransform().apply(this);
        }
        {
            List<PElem> copy = new ArrayList<PElem>(node.getElems());
            Collections.reverse(copy);
            for(PElem e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAltName() != null)
        {
            node.getAltName().apply(this);
        }
        outAAlt(node);
    }

    public void inAAltTransform(AAltTransform node)
    {
        defaultIn(node);
    }

    public void outAAltTransform(AAltTransform node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAltTransform(AAltTransform node)
    {
        inAAltTransform(node);
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        {
            List<PTerm> copy = new ArrayList<PTerm>(node.getTerms());
            Collections.reverse(copy);
            for(PTerm e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        outAAltTransform(node);
    }

    public void inANewTerm(ANewTerm node)
    {
        defaultIn(node);
    }

    public void outANewTerm(ANewTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANewTerm(ANewTerm node)
    {
        inANewTerm(node);
        {
            List<PTerm> copy = new ArrayList<PTerm>(node.getParams());
            Collections.reverse(copy);
            for(PTerm e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getProdName() != null)
        {
            node.getProdName().apply(this);
        }
        outANewTerm(node);
    }

    public void inAListTerm(AListTerm node)
    {
        defaultIn(node);
    }

    public void outAListTerm(AListTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListTerm(AListTerm node)
    {
        inAListTerm(node);
        {
            List<PListTerm> copy = new ArrayList<PListTerm>(node.getListTerms());
            Collections.reverse(copy);
            for(PListTerm e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        outAListTerm(node);
    }

    public void inASimpleTerm(ASimpleTerm node)
    {
        defaultIn(node);
    }

    public void outASimpleTerm(ASimpleTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleTerm(ASimpleTerm node)
    {
        inASimpleTerm(node);
        if(node.getSimpleTermTail() != null)
        {
            node.getSimpleTermTail().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getSpecifier() != null)
        {
            node.getSpecifier().apply(this);
        }
        outASimpleTerm(node);
    }

    public void inANullTerm(ANullTerm node)
    {
        defaultIn(node);
    }

    public void outANullTerm(ANullTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANullTerm(ANullTerm node)
    {
        inANullTerm(node);
        outANullTerm(node);
    }

    public void inANewListTerm(ANewListTerm node)
    {
        defaultIn(node);
    }

    public void outANewListTerm(ANewListTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANewListTerm(ANewListTerm node)
    {
        inANewListTerm(node);
        {
            List<PTerm> copy = new ArrayList<PTerm>(node.getParams());
            Collections.reverse(copy);
            for(PTerm e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getProdName() != null)
        {
            node.getProdName().apply(this);
        }
        outANewListTerm(node);
    }

    public void inASimpleListTerm(ASimpleListTerm node)
    {
        defaultIn(node);
    }

    public void outASimpleListTerm(ASimpleListTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleListTerm(ASimpleListTerm node)
    {
        inASimpleListTerm(node);
        if(node.getSimpleTermTail() != null)
        {
            node.getSimpleTermTail().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getSpecifier() != null)
        {
            node.getSpecifier().apply(this);
        }
        outASimpleListTerm(node);
    }

    public void inAProdName(AProdName node)
    {
        defaultIn(node);
    }

    public void outAProdName(AProdName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProdName(AProdName node)
    {
        inAProdName(node);
        if(node.getProdNameTail() != null)
        {
            node.getProdNameTail().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAProdName(node);
    }

    public void inAElem(AElem node)
    {
        defaultIn(node);
    }

    public void outAElem(AElem node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElem(AElem node)
    {
        inAElem(node);
        if(node.getUnOp() != null)
        {
            node.getUnOp().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getSpecifier() != null)
        {
            node.getSpecifier().apply(this);
        }
        if(node.getElemName() != null)
        {
            node.getElemName().apply(this);
        }
        outAElem(node);
    }

    public void inATokenSpecifier(ATokenSpecifier node)
    {
        defaultIn(node);
    }

    public void outATokenSpecifier(ATokenSpecifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATokenSpecifier(ATokenSpecifier node)
    {
        inATokenSpecifier(node);
        outATokenSpecifier(node);
    }

    public void inAProductionSpecifier(AProductionSpecifier node)
    {
        defaultIn(node);
    }

    public void outAProductionSpecifier(AProductionSpecifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProductionSpecifier(AProductionSpecifier node)
    {
        inAProductionSpecifier(node);
        outAProductionSpecifier(node);
    }

    public void inAAst(AAst node)
    {
        defaultIn(node);
    }

    public void outAAst(AAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAst(AAst node)
    {
        inAAst(node);
        {
            List<PAstProd> copy = new ArrayList<PAstProd>(node.getProds());
            Collections.reverse(copy);
            for(PAstProd e : copy)
            {
                e.apply(this);
            }
        }
        outAAst(node);
    }

    public void inAAstProd(AAstProd node)
    {
        defaultIn(node);
    }

    public void outAAstProd(AAstProd node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAstProd(AAstProd node)
    {
        inAAstProd(node);
        {
            List<PAstAlt> copy = new ArrayList<PAstAlt>(node.getAlts());
            Collections.reverse(copy);
            for(PAstAlt e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAAstProd(node);
    }

    public void inAAstAlt(AAstAlt node)
    {
        defaultIn(node);
    }

    public void outAAstAlt(AAstAlt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAstAlt(AAstAlt node)
    {
        inAAstAlt(node);
        {
            List<PElem> copy = new ArrayList<PElem>(node.getElems());
            Collections.reverse(copy);
            for(PElem e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAltName() != null)
        {
            node.getAltName().apply(this);
        }
        outAAstAlt(node);
    }
}
