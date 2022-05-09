public class PatternAdvance18 {
    public static void main(String[] args) {
        for(int i = 1;i<=7;i++){
            for(int j = 1;j<=7;j++){
                if(i==1||j==1||i==7||j==7){
                    System.out.print(4);
                }
                else{
                    System.out.print(3);
                }
            }
            System.out.println();
        }
    }
    
}
