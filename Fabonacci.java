public class Fabonacci {
    public static void main(String[] args){
        int n = 10, firstTerm = 0, secondTerm = 1;
        for (int i =0;i<n;i++){
            System.out.print(firstTerm +",");
            int nextTerm = firstTerm + secondTerm;//(0+1)
            firstTerm= secondTerm;   //(1)
            secondTerm  = nextTerm;  //(1)
        }
    }  
}
