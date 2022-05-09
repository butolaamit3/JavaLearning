import java.util.Scanner;

// Write a program that allow you to keep accessing an array until a valid index is given, If max return exceed 5 print "Error".
// also create a custom exception and if you would reach your limit then use this exception
class MyException extends Exception{
    @Override
    public String toString() {
        return "Max limit reach";
    }
    @Override
    public String getMessage() {
        return "Max limit is over, you cannot proceed";
    }
}
public class Ch14_7_pp3 {
    public static void main(String[] args){
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 4;
        marks[1] = 44;
        marks[2] = 34;
        Scanner sc = new Scanner(System.in);
        int i =0;
        while(true &&i<5){
            System.out.print("Exter the value of index: ");
            int index = sc.nextInt();
            try{
                System.out.print("The value of marks[index] is: "+marks[index]);
                break;
                
            }
            catch(Exception e){
                System.out.println("Invalid Index");
            }
            i++;
        }
        if(i>=5){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
