// 0-1 Triangle Pattern


// 1              -->on (1,1)       i,j cell, if the sum of i+j cell ==even it print 1 else it print 0
// 0 1            -->on (2,1)  (2,2)
// 1 0 1           -->  (3,1)  (3,2) (3,3)
// 0 1 0 1          --> (4,1)  (4,2) (4,4) (4,4)
// 1 0 1 0 1         -->(5,1)  (5,2) (5,3) (5,4) (5,5)

public class PatternProblem9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) { // we solve it through the help of matrix 
                int sum = i + j;           
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } 
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }

}
