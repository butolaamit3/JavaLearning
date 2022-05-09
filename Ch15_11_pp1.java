import java.util.ArrayList;


// create a array list to store the name of 10 students

public class Ch15_11_pp1 {
    public static void main(String[] args){
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Student1");
        ar.add("Student2");
        ar.add("Student3");
        ar.add("Student4");
        ar.add("Student5");
        ar.add("Student6");
        ar.add("Student7");
        ar.add("Student8");
        ar.add("Student9");
        ar.add("Student10");
        for (Object o : ar) {
            System.out.println(o);
            
        }
    }
    
}
