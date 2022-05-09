class Student{

    // This is final you can not change it
    public static final int My_Constant = 8;

    public String name ;
    public static String studentClass;
    public static int count = 0;
    Student(){
        count ++;
    }


    public void studentName(){
        System.out.println(name);
        // Non static method can access static data
        System.out.println(name+ " is enrolled in: " +studentClass);
    }

    // Static method can access static variable because the both belong to the class
    
    public static void classInfo(){
        System.out.println("java");
        System.out.println(studentClass);
        // Static method can not access instance variable(non static)
        // System.out.println(name); -->give error
    }
}

public class Static_final {
    public static void main(String[] args) {

        // static variable is alson known as class varaible.
        // To access static varaible first use Classname then dot then varaible name
        Student.studentClass = "web developement Fundamental"; //To initiate a static object use class name
        System.out.println(Student.studentClass);

        // To access the static method you must first call the name opf the class and then Static method name.
        Student.classInfo();
        System.out.println("Before creating objects: "+ Student.count);
        

        Student s1= new Student();
        Student s2= new Student();
        System.out.println("After creating objects: "+ Student.count);
        
        // Non static variable is alson known as instance varaible because each object gets is own copy.
        s1.name = "Amit";
        s2.name = "Sumit";

        // System.out.println(s1.name);
        // System.out.println(s2.name

        s1.studentName();
        s2.studentName();

        System.out.println(Student.My_Constant);

        
    }
    
}
