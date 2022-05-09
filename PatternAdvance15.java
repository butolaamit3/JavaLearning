// Diamond Pattern
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

public class PatternAdvance15 {
    public static void main(String[] args) {
        // For outer loop 
        // Upper half
        for(int i = 1;i<=4;i++){
            // For spaces
             //Here No. of spaces in 1 row is 3 = (4-i) then in 2 rpw is 2 = (4-i). Here i is the present row number
            for(int j = 1;j<=4-i;j++){  
                System.out.print(" ");
            }
            // Stars
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i = 4;i>=1;i--){
            // For spaces
             //Here No. of spaces in 1 row is 3 = (4-i) then in 2 rpw is 2 = (4-i). Here i is the present row number
            for(int j = 1;j<=4-i;j++){  
                System.out.print(" ");
            }
            // Stars
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
    }   
    
}
