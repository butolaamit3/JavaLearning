import java.util.ArrayDeque;

public class Ch15_3_arrayDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(6);
        ad.add(57);
        ad.add(353);
        ad.add(435);
        ad.addFirst(624);
        ad.addLast(1324);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println("ArrayDeque"+ad);

    }
    
}
