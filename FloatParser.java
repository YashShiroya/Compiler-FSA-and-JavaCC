
import java.io.InputStream;
import java.io.InputStreamReader;

class FloatParser {
  public static void main(String args[]) throws Exception {
	if (args.length==0) {
          	System.out.println("Usage: java NumberParser value");
		System.exit(1);
        }
        double val = MyParseFloat(args[0]);
	System.out.println("Value="+val);
  }

  enum StateFloat { SSTART, SINTEGER, SDECIMAL, SEND };

  public static double MyParseFloat(String s) throws Exception {
    // Using the code in DecimalParser.java write a finite state 
    // machine that parses a floating point number of the form 
    //             [-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)? 
 
    return 0;


  }

}


