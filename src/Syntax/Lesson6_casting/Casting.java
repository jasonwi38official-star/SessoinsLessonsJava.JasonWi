package Syntax.Lesson6_casting;

public class Casting {
    public static void main(String[] args) {
        //casting
        byte b= -128;
        short varForCasting = b;
        System.out.println("After casting varForCasting: "+varForCasting);

        int intNewVar = varForCasting;
        System.out.println("After casting intNewVar: "+intNewVar);

        int intVariable = 6_000_012;
        byte byteVariable= (byte)intVariable;
        System.out.println("After casting byteVariable: "+byteVariable);

        var doubleVar=4.18;
        int newInteger = (int) doubleVar;
        System.out.println("After casting newInteger: "+newInteger);
    }
}
