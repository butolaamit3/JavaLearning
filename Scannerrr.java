import java.util.Scanner;

public class Scannerrr {
    public static void main(String[] args){
    

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.print("Enter the Double: ");
        double d = sc.nextDouble();
        System.out.println(d);

        sc.nextLine(); // This is mandatory to skip the remainder of the double, 
        // if you do not skip this Your string should not readable and it print a null line
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        System.out.println(s);

        
    }
    
}
