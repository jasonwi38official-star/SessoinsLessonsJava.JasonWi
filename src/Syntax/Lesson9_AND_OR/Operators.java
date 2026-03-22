package Syntax.Lesson9_AND_OR;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Операции сравнения
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessOrEqual = a <= b;


        //And(&&)_Or(||)
        boolean aIsGreaterThanB = a > b; //true
        boolean aIsEqualOfB = a == b; // false

        //Конъюнция
        boolean logicalAND = aIsGreaterThanB && aIsEqualOfB;
        //Дизъюнция
        boolean logicalOR = aIsGreaterThanB || aIsEqualOfB;

        System.out.println("aIsGreaterThanB = " + aIsGreaterThanB);
        System.out.println("aIsEqualOfB = " + aIsEqualOfB);
        System.out.println(aIsGreaterThanB || aIsEqualOfB);
        System.out.println("The result of expression: a>b AND a==b is " + logicalAND);
        System.out.println("The result of expression: a>b OR a==b is " + logicalOR);

    }
}
