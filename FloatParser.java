
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

enum StateFloat { S1_INIT, S2, S3_ACCEPT, S4, S5, S6_ACCEPT, S7, S8_ACCEPT };
enum Sign { POSITIVE, NEGETIVE };

public static double MyParseFloat(String s) throws Exception {
        // Using the code in DecimalParser.java write a finite state 
        // machine that parses a floating point number of the form 
        //             [-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?

    
    StateFloat state = StateFloat.S1_INIT;
    Sign sign = Sign.POSITIVE;

    int i = 0;
    double divider = 10;
    double value = 0;


    while(i < s.length()) {

        char ch = s.charAt(i);

        
    }

    return 0;

}

}








