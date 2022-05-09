import java.util.*;
public class Ch15_1_arrayList {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>(); 
        ArrayList<Integer> l2 = new ArrayList<>(5); 

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
        // l1.clear(); // to clear the list.
        for(int i = 0;i<l1.size();i++){
            System.out.print(l1.get(i)+",");
            
        }
        System.out.println();

        for (Integer a : l1) { //this is for each loop we can also try this to print the element of the list./
            System.out.print(a+",");
            
        }System.out.println();
        
        System.out.println("Arraylist: "+l1); // This is the another way to print arrayList.
        
        l1.ensureCapacity(500); // this is use to increase thwe capacity of array list
    

        System.out.println("\nReturen the boolena if the element is present or not: "+l1.contains(62)); 
        System.out.println("Return the index of element: "+l1.indexOf(62));
        System.out.println("return the index of element at first occurance: "+l1.indexOf(6)); 
        System.out.println("Return the index of element at last occurance: "+l1.lastIndexOf(6));
        System.out.println("Remove the element at index 3: "+l1.remove(3));
        l1.set(1,564); // To change the element at a given index
        System.out.println("Return the element at index: "+l1.get(4));
        System.out.println("Return boolean if the list is eplty or not: "+l1.isEmpty());
        for(int i = 0;i<l1.size();i++){
            System.out.print(l1.get(i)+",");

        }System.out.println();

        System.out.println("Maximun Element: "+Collections.max(l1));
        System.out.println(l1.remove(1)); // Remove the element at index.
        
    }
    
}
