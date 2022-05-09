// The below are the functions
// Functions are called directly
// Methods are called through class of abject

public class Methodd {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;

    }
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c;
        c= logic(a,b);
        int a1 =12;
        int b1= 5;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);   
    }
    
    
}
