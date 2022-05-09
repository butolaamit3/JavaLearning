import java.util.HashSet;

public class Ch15_4_hashSet {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(5);
        hs.add(23);
        hs.add(87);
        hs.add(57);
        hs.add(57);
        hs.add(3);
        System.out.println(hs);

    }
    
}
