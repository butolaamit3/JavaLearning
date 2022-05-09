class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;  
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

}

public class Ch9_0_accesModifies {
    public static void main(String[] args){

        MyEmployee amit = new MyEmployee();
        // amit.id = 43;
        // amit.name = "CodeWithAmit";  --> Throws and error due to private acces modifier.

        amit.setName("CodeWithAmit");
        amit.setId(43);
        
        System.out.println(amit.getName());
        System.out.println(amit.getId());
        

    }
    
}
