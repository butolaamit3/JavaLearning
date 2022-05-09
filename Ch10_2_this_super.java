class Practice{
    int a;
    Practice(int a){
        this.a = a; 
    }
    public int returnone(){
        return 1;

    }
    public int getA() {
        return a;
    }
}

class Practice1 extends Practice{
    Practice1(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}


public class Ch10_2_this_super {
    public static void main(String[] args){
        Practice p = new Practice(5);
        // System.out.println(p.getA());
        Practice1 q = new Practice1(36);

        
    }
    
}
