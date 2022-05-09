import java.util.HashSet;

// Create a HashSet in java. Try to atore duplicate elements inside this set and verify that only one instance is stored.

public class Ch15_11_pp2 {
    public static void main(String[] args){
        HashSet<Integer> s = new HashSet<>();
        s.add(45);
        s.add(12);
        s.add(65);
        s.add(35);
        s.add(44);
        System.out.println(s);
         
    }
    
}
