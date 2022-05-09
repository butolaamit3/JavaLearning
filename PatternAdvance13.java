// Number Pyramid
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

public class PatternAdvance13 {
    public static void main(String[] args) {
        // For outer loop
        for(int i = 1;i<=5;i++){
            // For spaces
             //Here No. of spaces in 1 row is 4 = (5-i) then in 2 rpw is 3 = (5-i). Here i is the present row number
            for(int j = 1;j<=5-i;j++){  
                System.out.print(" ");
            }
            // For inner loop print row number into row numbers of time
            for(int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
