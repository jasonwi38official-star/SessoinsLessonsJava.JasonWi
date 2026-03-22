package Syntax.Lesson5_variables;

public class Variables {
    public static void main(String[] args) {

        // 0 0 0 1 0 0 1 0
        //bute 0..255 integers
        // bute => |-128.-127.-126....0...125.126.127|
        byte b= -128;
        System.out.println("byte = " +b);
        //______________________________________________________________________________________________________________

        //short 2^16 = 0...65536 integers
        //short => | -32768...32767
        short s =32767;
        System.out.println("short = "+ s);
        //______________________________________________________________________________________________________________

        //int 2^32
        //int => | -2billion...2billion |
        //default variable for integers
        int i=1345345156;
        System.out.println("int = "+i);
        //______________________________________________________________________________________________________________

        //long 2^64 8byte integers
        // long => | -............
        //the long variable is marked with the letter "L" or "l" at the end of the value
        long l =9_223_111_111_111_111_111L;
        System.out.println("long = "+l);
        //______________________________________________________________________________________________________________

        //float 4bytes   1.0002  fractional numbers
        //a float variable is marked with the letter "F" or "f" at the end of the value
        float f = 223.234F;
        System.out.println("float = " +f);
        //______________________________________________________________________________________________________________

        //double  8bytes fractional numbers
        //default variable for fractional numbers
        double d=123.123123;
        System.out.println("double = "+d);
        //______________________________________________________________________________________________________________

        //char Symbol  '.' and 1,2,3... and '\u1230'
        char c1=143;
        char c2='A';
        char c3='\u2344';
        System.out.println("char = " +c1+" , = "+c2+" , = "+c3);
        //______________________________________________________________________________________________________________


        //boolean, the boolean variable has only two values: true, false.
        boolean bool1 = false;
        boolean bool2 = true;
        System.out.println("boolean = "+ bool1+", = "+bool2);
        //______________________________________________________________________________________________________________

        /*var, the var variable itself determines
        //the type from the right-hand side of the assignment,
        //which is convenient when the type is clear and simplifies
        the writing of long variable names!
        */
        var varLong =123L;
        var varString = "asdfw";
        var varFloat = 123.23F;
        var varChar = '\u2344';
        var varBool = false;
        System.out.println("var = "+varLong+", = "+varString+", = "+varFloat+", = "+varChar+", = "+varBool);
        //______________________________________________________________________________________________________________
        /*
        You can also declare multiple
        variables of primitive data
        types at once, but this does
        not apply to "var" because it
        must be assigned a value immediately.
         */
        int q1,q2,q3,q4,q5;
        float w1,w2,w3,w4;
        boolean e1,e2,e3;
        char r1,r2,r3;
        //______________________________________________________________________________________________________________









    }
}
