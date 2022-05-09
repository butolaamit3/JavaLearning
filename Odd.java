import java.util.Scanner;

public class Odd {
    public static void main(String[] args){
         //2n = Even Number = 2*1=2, 2*2=4, 2*3=6
         //2n+1 = Odd Number = 2*0+1=1, 2*1+1=3, 2*2+1=5 
        System.out.print("Enter the number as many as you want to print the odd number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){//for first n odd numbers
            System.out.println(2*i+1);
        }
             //the below code is for to print odd number as far you want to print the odd number.
        // for(int i=0; i<10;i++){
        //     if(i%2!=0){
        //         System.out.println(i);
        //     }
        //}
    }   
}
