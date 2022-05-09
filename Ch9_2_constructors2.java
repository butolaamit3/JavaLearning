// In this we pass argumentt to the constructor..

class MyMainEmployee{
    private int id;
    private String name;

    MyMainEmployee(String name,int id){
        this.id =id;
        this.name = name;
    }

    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

}

public class Ch9_2_constructors2 {
    public static void main(String[] args){
        MyMainEmployee Amit = new MyMainEmployee("CodeWithAmit",96404); //This is a object
        // Insted of writing below code again and again for every property, 
        // we simpally create constructor amd then we dont wnt to set properties.See line 7.

        // Amit.setName("CodeWithAmit");
        // Amit.setId(96404);
        System.out.println(Amit.getName());
        System.out.println(Amit.getId());
        
    }
    
}
