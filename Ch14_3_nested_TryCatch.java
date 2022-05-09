import java.util.Scanner;

public class Ch14_3_nested_TryCatch {
    public static void main (String [] arge){
        int [] marks = new int[3];
        marks[0] = 4;
        marks[1] = 44;
        marks[2] = 34;
        Scanner sc  = new Scanner(System.in);'
        '
        boolean flag = true;
        while (flag){
            System.out.println("Enter the value of index");
            int index = sc.nextInt();
            try{
                System.err.println("Welcome to chapter 14");
                try{
                    System.err.println(marks[index]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.err.println("Sorry this index is not exist");
                    System.err.println("Exception in lvl 2");
    
                }
    
            }
            catch(Exception e){
                System.err.println("Exception in lvl 1");
    
            }
        }
        System.out.println("Thanks for using this program");
    }
    
}
