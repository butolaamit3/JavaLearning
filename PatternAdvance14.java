// Palindrom Pattern
//     1
//    212
//   32123
//  4321234
// 543212345

public class PatternAdvance14 {
    public static void main(String[] args) {
        // For outer loop
        for(int i = 1;i<=5;i++){
            // For spaces
             //Here No. of spaces in 1 row is 4 = (5-i) then in 2 rpw is 3 = (5-i). Here i is the present row number
            for(int j = 1;j<=5-i;j++){  
                System.out.print(" ");
            }
            // 1st half
            for(int j=i ;j>=1;j--){
                System.out.print(j);
            }
            // 2nd half
            for(int j =2;j<=i;j++){ //for first line it will skip because j = 2 and condition says j<=i
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}
