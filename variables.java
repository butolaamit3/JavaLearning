
public class variables {
    public static void main(String[] args) {
        System.out.println("Hello World");

        /*
         * In java:
         * variabler are the containers which store data values
         * Strings, int, float, char, boolean
         * 
         * How to declear variables:
         * syntax - <dataType> <variableName> = <value>;
         */

        String name = "Amit";
        System.out.println(name);

        int a = 45;
        float b = 12.45f;
        float sum = a + b;
        boolean isAdult = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);
        System.out.println(isAdult);

        /*
         * Operators in Java
         * 
         * Operand, operator, Operand = Result
         * 4 + 7 = 11
         * 
         * Types of operators in Java
         * 
         * 1.Arithmetic operators
         * 2.Assignment operators
         * 3.Logical Operators
         * 4.Comparison Operators
         * 
         */

        int num1 = 20, num2 = 2;
        System.out.print("The value of num1 + num2 is:");
        System.out.println(num1 + num2);

        System.out.print("The value of num1 - num2 is:");
        System.out.println(num1 - num2);

        System.out.print("The value of num1 * num2 is:");
        System.out.println(num1 * num2);

        System.out.print("The value of num1 / num2 is quotient:");
        System.out.println(num1 / num2);

        System.out.print("The value of num1 % num2 is reminder:");
        System.out.println(num1 % num2);

        System.out.println(num1++);    //first print then increment
        System.out.println(num1);      
        System.out.println(++num1);    //first incriment then print
        System.out.println(num1--);    //first print then decriment
        System.out.println(num1);
        System.out.println(--num1);    //first decriment then print


        int num5 = 5;
        num5 *=2;
        System.out.println(num5);

        int num6 = 5;
        num6 /=3;
        System.out.println(num6);

        int num7 = 5;
        num7 %=3;
        System.out.println(num7);

    
    
    /*
    * Comparison Operators:

    * 1. == : checks for equality of two values
    * 2. != : checks if two values are not equal
    * 3. <
    * 4. >
    * 5. <=
    * 6. >=


    * Logical Operators:

    * 1. && - Logical and operator - returns true only if both conditions are true
    * 2. || - Logical or operator - returns true if any one condition is true
    * 3. ! - Logical not - Reverse the result from true to false and vice versa
    */


    


    }
}
