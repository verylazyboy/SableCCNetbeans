package org.sableccsupport.parser;

import java.io.PushbackReader;
import org.sableccsupport.sccparser.lexer.Lexer;

/**
 *
 * @author phucluoi
 */
public class StateInitedPLexer extends Lexer
{
	public StateInitedPLexer(PushbackReader reader, Lexer.State state)
	{
		super(reader);
		this.state = state;
	}
	public Lexer.State getState()
	{
		return this.state;
	}
	public String getText()
	{
		return this.text.toString();
	}

}