class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;

    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;        
    }
}

public class Ch8_PP1_Class {
    public static void main(String[] args){
        Employee1 amit = new Employee1();
        amit.setName("javaLearning");
        amit.getName();
        amit.salary = 24;
        System.out.println(amit.getName());
        System.out.println(amit.getSalary());

    }

    
}
