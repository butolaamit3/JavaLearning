import java.util.Scanner;

// Write a program to find the sum of first n natural number usig method.
public class PP3SumMethod {
    static int NaturalSum(int n) {
        // sum(3) = 3+sum(2)
        // sum(2) = 3 + sum(1)
        // sum(1) = 1
        if (n == 1) { // Base Condition which Terminate Recursive Function
            return 1;
        } 
        else {
            return n + NaturalSum(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(NaturalSum(a));
    }
}
