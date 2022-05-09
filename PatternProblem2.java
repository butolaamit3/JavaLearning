// Print a hollow Rectangle pattern
// *****
// *   *
// *   *
// *   *
// *****


public class PatternProblem2 {
    public static void main(String[] args){
        for(int  i =1;i<=5;i++){
            for (int j =1;j<=5;j++){
                if(i==1||j==1||i==5||j==5){  //We only want star at (i,j)|| (1,1) (1,2) (1,3) (1,4) (1,5)
                    System.out.print("*");  //                           (2,1)                   (2,5)
                }                          //                               (3,1)                   (3,5)
                else{                     //                                (4,1)                   (4,5)
                    System.out.print(" "); //                            (5,1) (5,2) (5,3) (5,4) (5,5)
                }
            }
            System.out.println();
        }
    }
    
}
