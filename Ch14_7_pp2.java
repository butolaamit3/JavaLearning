// Write a program that  prints "haha" during Arithmatic exception and "hehe" dusring illeligal argument exception

public class Ch14_7_pp2 {
    public static void main(String[] args){
        try{
            int a = 666/9;
            System.out.println(a);
        }
        catch(IllegalArgumentException e){
            System.out.println("heheh");
        }
        catch(ArithmeticException e){
            System.out.println("hahaha");
        }
    }
    
}
