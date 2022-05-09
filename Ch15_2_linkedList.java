import java.util.*;
public class Ch15_2_linkedList {
    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>(); 
        LinkedList<Integer> l2 = new LinkedList<>(); 

        l2.add(16);
        l2.add(62);
        l2.add(67);
        l1.add(6);
        l1.add(7);
        l1.add(0,4); // First this is at index 0.
        l1.add(6);
        l1.add(5);
        l1.add(0,12); //then this is at index 0 and the prevoius 0 is at 1.
        l1.addAll(1,l2); // Now to l2 elements is starting at index 1 and this previous shifts after the l2 elements.
        l1.addLast(243); // This method is only for LinkedList
        l1.addFirst(543); // This method is only for LinkedList
        // l1.clear(); // to clear the list.
        for(int i = 0;i<l1.size();i++){
            System.out.print(l1.get(i)+",");
            
        }System.err.println();
        System.out.println("LinkedList: "+l1);

        System.out.println(l1.clone()); // To clone the list
    }
    
}
