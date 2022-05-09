// Pattern problem
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

public class PatternAdvance17 {
    public static void main(String[] args) {
        // for upper part
        for(int i = 1;i<=5;i++){
            // for spaces
            for(int j = 1;j<=5-i;j++){
                System.out.print(" ");
            }
            // for stars
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            // for next line
            System.out.println();
        }
        // for lower part
        for(int i = 1;i<=4;i++){
            // for spaces
            for (int j = 1;j<=i;j++){
                System.out.print(" ");

            }
            // for stars
            for(int j = 1;j<=5-i;j++){
                System.out.print("*"+" ");
            }
            // for next line
            System.out.println();
        }
    }
    
}
