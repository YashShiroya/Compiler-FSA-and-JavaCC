
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

 enum StateFloat { S1_INIT, S2, S3_ACCEPT, S4, S5, S6_ACCEPT, S7, S8_ACCEPT, S_END };
 enum Sign { POSITIVE, NEGETIVE };
 enum EPower { E_POSITIVE, E_NEGETIVE, E_DEFAULT };

 public static void checkTrueEnd(int s_length, int index) throws Exception {
    if(index >= s_length) {
        throw new Exception("Bad format");
    }
 }

 public static double MyParseFloat(String s) throws Exception {
        // Using the code in DecimalParser.java write a finite state 
        // machine that parses a floating point number of the form 
        //             [-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?

    
    StateFloat state = StateFloat.S1_INIT;
    Sign sign = Sign.POSITIVE;
    EPower ePower = EPower.E_DEFAULT; 


    int i = 0;
    double divider = 10;
    double value = 0;
    int e_val = 0;
    boolean e_exists = false;
    StateFloat state_prev = StateFloat.S1_INIT;
    int s_len = s.length();


    while(i < s.length() && state != StateFloat.S_END) {

        char ch = s.charAt(i);

        switch(state) {

            case S1_INIT:

            if(Character.isDigit(ch)) {
                state = StateFloat.S3_ACCEPT;
                value = Character.getNumericValue(ch);
                i++;
            }

            else if(ch == '+') { 
                sign = Sign.POSITIVE;
                state = StateFloat.S2;
                i++;
                checkTrueEnd(s_len, i);
            }

            else if(ch == '-') {
                sign = Sign.NEGETIVE;
                state = StateFloat.S2;
                i++;
                checkTrueEnd(s_len, i);
            }

            else if(ch == '.') {
                state = StateFloat.S4;
                i++;
                checkTrueEnd(s_len, i);
            }

            else throw new Exception("Bad format");

            break;

            case S2:

            if(Character.isDigit(ch)) {
                state = StateFloat.S3_ACCEPT;
                value = Character.getNumericValue(ch);
                i++;
            }
            else if(ch == '.') {
                state = StateFloat.S4;
                i++;
                checkTrueEnd(s_len, i);
            }

            else throw new Exception("Bad format");

            break;

            case S3_ACCEPT:

            state_prev = StateFloat.S3_ACCEPT;

            if (Character.isDigit(ch)) {
                value = 10.0*value + Character.getNumericValue(ch);
                i++;
            }
            else if(ch == '.') {
                state = StateFloat.S4;
                i++;
                checkTrueEnd(s_len, i);
            }
            else if(ch == 'e' || ch == 'E') {
                state = StateFloat.S5;
                e_exists = true;
                i++;
                checkTrueEnd(s_len, i);
            }

            //else state = StateFloat.S_END;
            else throw new Exception("Bad format");

            break;

            case S4:

            if(Character.isDigit(ch)) {
                state = StateFloat.S6_ACCEPT;
                value = value + Character.getNumericValue(ch)/divider;
                divider = divider * 10;
                i++;
            }

            else throw new Exception("Bad format");

            break;

            case S5:

            //ePower
            if(ch == '+') {
                state = StateFloat.S7;
                ePower = EPower.E_POSITIVE;
                i++;
                checkTrueEnd(s_len, i);
            }

            else if(ch == '-') {
                state = StateFloat.S7;
                ePower = EPower.E_NEGETIVE;
                i++;
                checkTrueEnd(s_len, i);
            }

            else if(Character.isDigit(ch)) {
                state = StateFloat.S8_ACCEPT;
                e_val = Character.getNumericValue(ch);
                i++;
            }

            else throw new Exception("Bad format");

            break;

            case S6_ACCEPT:

            if(ch == 'e' || ch == 'E') {
                state = StateFloat.S5;
                e_exists = true;
                i++;
                checkTrueEnd(s_len, i);
            }

            else if(Character.isDigit(ch)) {
                value = value + Character.getNumericValue(ch)/divider;
                divider = divider * 10;
                i++;
            }

            //else state = StateFloat.S_END;
            else throw new Exception("Bad format");

            break;

            case S7:

            if(Character.isDigit(ch)) {
                state = StateFloat.S8_ACCEPT;
                e_val = Character.getNumericValue(ch);
                i++;
            }

            else throw new Exception("Bad format");

            break;

            case S8_ACCEPT:

            if(Character.isDigit(ch)) {
                e_val = 10 * e_val + Character.getNumericValue(ch);
                i++;
            }

            //else state = StateFloat.S_END;
            else throw new Exception("Bad format");

            break;

        }
    }

    if(sign == Sign.NEGETIVE) {
        value *= -1;
    }

    if(e_exists == true) {

        if(ePower == EPower.E_NEGETIVE) e_val *= -1;

        value *= Math.pow(10, e_val);
    }

    if(state == StateFloat.S3_ACCEPT || state == StateFloat.S6_ACCEPT || state == StateFloat.S8_ACCEPT) {
        return value;
    }
    else {
        throw new Exception("Bad format");
    }
    

}

}








