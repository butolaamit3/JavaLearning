class MyMainEmployee{
    private int id;
    private String name;


    MyMainEmployee(){ 
        id = 1;
        name = "CodeWithAmit";
    }

    MyMainEmployee(String myName){ 
        id = 45;
        name = myName;
    }

    MyMainEmployee(String myName,int myId){ 
        id = myId;
        name = myName;
    }
    
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}

public class Ch9_3_constructorsOverloading {
    public static void main(String[] args){
        MyMainEmployee Amit = new MyMainEmployee("amazingAmit",96404); //This is a object
        MyMainEmployee rohit = new MyMainEmployee();
        MyMainEmployee sohit = new MyMainEmployee("codeWithRohit");

        System.out.println(Amit.getName());
        System.out.println(Amit.getId());
        System.out.println(rohit.getName());
        System.out.println(rohit.getId());
        System.out.println(sohit.getName());
        System.out.println(sohit.getId());
        
    }
    
}

