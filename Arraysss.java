import java.util.Arrays;

// Default value of String array is null
// Default value of int array is 0
// Default value of boolean array is false 

public class Arraysss {
    public static void main(String[] args){
        int[] marks = {1,5,13,9};
        marks[2]= 24; //this will update index 2
        // System.out.println(marks[0]);
        // System.out.println(marks[2]);

        //classical way to iterate an array
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);

        }
        //another way (for each loop)
        for(int value:marks){
            System.out.println(value);
        }

        //multidimentional array

        int [][] m = {{1,2,3},{4,5,6}};
        System.out.println(m[1][0]);

        //String Array
        String [] cars = {"Amit","Swift","Hummer","Bmw","Audi"};
        
        System.out.println(Arrays.toString(cars));
        //for(String values:cars){
            //System.out.println(values);
       // }
    }
    
}
