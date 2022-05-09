public class PP6StarRec {
    static void patRec(int n){
        if(n>0){
            patRec(n-1);
            for(int i = 0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        patRec(6);
    }

}
// How this program work.
// Step1: patRec(3)
// Step2: patRec(2) + 3times star print and a new line. 
// Step3: patRec(1) + 2times star print and a new line + 3times star print and a new line. 
// Step4: patRec(0) + 1time star print and a new line + 2times star print and a new line + 3times star print and a new line. 