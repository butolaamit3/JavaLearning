// Inverted half Pyramid rotated by 180 degree
//    *
//   **
//  ***
// ****
public class PatternProblem5 {
    public static void main(String[] args) {
        for(int i =1;i<=4;i++){
            // This is for printing space (n-i)
            for(int j = 1;j<=4-i;j++){ // first print 3 space then star
                System.out.print(" "); // Then print 2 space 2 star
            }                         //  Then print 1 space 3 star
            //                            Then print 0 space and 4 star
            for(int j =1;j<=i;j++){ // This is for printing star
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    
}
