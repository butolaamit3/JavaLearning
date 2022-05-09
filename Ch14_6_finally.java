public class Ch14_6_finally {
    public static int greet(){  
    try{
        int a = 10;
        int b = 2;
        int c = a/b;
        return c;
    }
    catch(Exception e){

        System.out.println(e);
    }
    finally{
        System.out.println("This is the end of the program");
    }
    return 0;
}
    public static void main(String[] args){
        System.out.println(greet());
        for(int  i =0;i<5;i++){
            try{
                if(i==2){
                    System.out.println(i);
                    break;
                }
            }
            catch(Exception e){
                System.out.println(e);
                break;
    
            }
            finally{
                System.out.println("I am finally value of b ="+i);
            
            }
        }

        
    }

    
}
