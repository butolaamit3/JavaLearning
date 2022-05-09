
class Employee{
    String name;
    int id;
    int salary;
    public void printDetails(){
        System.out.println("My name is "+name+". And my id is "+id+". And my salary is "+salary);
    }

    public int getSalary(){
        return salary;
    }
}

public class Ch8_Custom_class {
    public static void main(String[] args){
        System.out.println("This is our Custom Class");

        Employee amit = new Employee(); //Instantianting a new Employee Object.
        Employee harry = new Employee(); 

        // Setting Atributes for amit.
        amit.name = "javaLearning";
        amit.id = 96404;
        amit.salary = 34;

        // Setting Atributes for harry.
        harry.name = "CodeWithHarry";
        harry.id = 96407;
        harry.salary = 36;

             // Printing the Atributes/Properties
        // System.out.println(Amit.id);
        // System.out.println(Amit.name);
        amit.printDetails();
        harry.printDetails();
        System.out.println(amit.getSalary());
        System.out.println(harry.getSalary());
    }
    
}
