public class MethodAnother {
        int logic(int x, int y){
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
//Another way to create a method
        MethodAnother obj = new MethodAnother(); //Method invocation using Object creation
        c = obj.logic(a,b);
        int a1 =12;
        int b1= 5;
        int c1;
        c1 = obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);   
    }
    
    
}
