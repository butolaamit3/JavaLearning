class Program{
    int value;
    String name;
    
    Program(){
        // this(5); //here this is used to call the next constructor while calling the present constructor, 
        // And this() is always in 1st line of the constructor, and 5 is the parameter value of next constructor. It is same as super keyword
        System.out.println("First Constructor");
        value = 34;

    }
    Program(int value){
        // Here this.value refers to the instance varaible on line 2 and value refers to the parameter on line 9
        this.value = value;
        System.out.println("Second Constructor");
    }
    Program(int value,String name){
        this.value = value;
        this.name = name;
        System.out.println("Third Constructor");
    }
}

public class Ch9_1_1_constructor {
    public static void main(String[] args) {
        Program pg = new Program();
        Program pg1 = new Program(5);
        Program pg2 = new Program(5,"Amit");

        
    }
    
}
