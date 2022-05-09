// import java.util.Scanner;  //-->you can use Scanner class either in this way or in next way
import java.util.*;

public class Ch12_0_package {
    public static void main(String[] args){
        System.out.println();  //-->Use scanner either in this way or in next way
        // java.util.Scanner sc = new java.util.Scanner(System.in); --> You can also use ity directly
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("This is my scanner taking iput as "+a);
    }
    
}
