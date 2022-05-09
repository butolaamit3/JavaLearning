public class Recursionn {
    // This is recursive method.
    static int fact(int n) {
        if (n<=1) {
            return n;
        } else {
            return n * fact(n - 1);
        }
    }

    // This is iterative method.
    static int fact_iterative(int n) {
        if (n<=1) {
            return n;

        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println("The value of factorial n is: " + fact(5));
        System.out.println("The value of factorial n is: " + fact_iterative(4));
    }
}
