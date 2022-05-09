public class VarArgs {
// The below methods are use to sum and we are overloading it again and again to
    // add extra integer.
    // static int sum(int a, int b){
    // return(a+b);
    // }
    // static int sum(int a, int b,int c){
    // return(a+b+c);
    // }

// By using varargs we don not want to create the same method again and again.
    static int sum(int... arr) {
        // available as int arr[];
        int result = 0;
        for (int a : arr){
            result +=a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Variable Argument Tutorial");
        System.out.println("The sum is: " + sum(3, 5));
        // System.out.println("The sum is: " + sum(3, 5, 7));
        // System.out.println("The sum is: " + sum(3, 5,1,7));
        // System.out.println("The sum is: " + sum(3, 5,1,2,7));

    }

}
