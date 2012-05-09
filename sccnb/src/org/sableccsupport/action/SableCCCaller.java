package org.sableccsupport.action;

import com.dreamer.outputhandler.OutputHandler;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import org.openide.util.Exceptions;
import org.sablecc.sablecc.EmbeddedSableCC;
import org.sablecc.sablecc.SableCC;

/**
 *
 * @author phucluoi
 */
public class SableCCCaller 
{
	static PrintStream orgOutStream 	= null;
	static PrintStream orgErrStream 	= null;
	
	public static void callSableCC(String filename)
	{
		Helper h = new Helper();
		h.setup(filename);
		h.start();
	}
}



class Helper extends Thread
{
	private String filename;
	static PrintStream orgOutStream 	= null;
	static PrintStream orgErrStream 	= null;
	private static Color errorColor = Color.decode("0xA40000");
	public void setup(String filename)
	{
		this.filename = filename;
	}

	@Override
	public void run() {
		try {
			redirectSystemStreams();
			String msg = "+++++++++++++++++" + filename + "+++++++++++++";
			System.out.println (msg);
			SableCC.processGrammar(filename,null);
			msg = "================= build success  =================" ;
			System.out.println (msg);
		} catch (Exception ex) {
			//Exceptions.printStackTrace(ex);
			System.err.println(ex.getMessage());
		}finally
		{
			setBackOutput();
		}
    }



	private static void redirectSystemStreams() 
	{
        OutputStream out = new OutputStream() {

            @Override
            public void write(int i) throws IOException {
                OutputHandler.output(EmbeddedSableCC.SABLE_CC_OUTPUT_TITLE ,
						String.valueOf((char) i));
            }

            @Override
            public void write(byte[] bytes) throws IOException {
                OutputHandler.output(EmbeddedSableCC.SABLE_CC_OUTPUT_TITLE, 
						new String(bytes));
            }

            @Override
            public void write(byte[] bytes, int off, int len) throws IOException {
                OutputHandler.output(EmbeddedSableCC.SABLE_CC_OUTPUT_TITLE, 
						new String(bytes, off, len));
            }
        };

		OutputStream err = new OutputStream() {

            @Override
            public void write(int i) throws IOException {
                OutputHandler.output(EmbeddedSableCC.SABLE_CC_OUTPUT_TITLE ,
						String.valueOf((char) i), errorColor);
            }

            @Override
            public void write(byte[] bytes) throws IOException {
                OutputHandler.output(EmbeddedSableCC.SABLE_CC_OUTPUT_TITLE, 
						new String(bytes), errorColor);
            }

            @Override
            public void write(byte[] bytes, int off, int len) throws IOException {
                OutputHandler.output(EmbeddedSableCC.SABLE_CC_OUTPUT_TITLE, 
						new String(bytes, off, len), errorColor);
            }
        };
		orgOutStream = System.out;
		orgErrStream = System.err;
        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(err, true));
    }

	private static void setBackOutput()
	{
		System.setErr(orgErrStream);
		System.setOut(orgOutStream);
	}
}