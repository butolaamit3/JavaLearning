public class while1to100 {
    public static void main(String[] args){
        int n = 0;
        while(n<10){ 
            if(n==5){
                n++;
                continue;
            }
            if(n==8){
                break;
            }
            System.out.println(n);
            n++;
            
        }
        
    }
    
}
