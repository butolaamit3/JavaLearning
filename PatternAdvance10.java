
// butterfly pattern
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
public class PatternAdvance10 {
    public static void main(String[] args) {
        // Upper half
        for(int i = 1;i<=5;i++){
            // 1st part
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            int spaces = 2*(5-i);
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        // Lower half
        for(int i = 5;i>=1;i--){
            // 1st part
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            int spaces = 2*(5-i);
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
    

