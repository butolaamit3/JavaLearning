public class TryCatchhh {
    public static void main(String[] args){
        String [] cars = {"Amit","Swift","Hummer","Bmw","Audi"};
        // System.out.println(cars[5]);  //because there are no element in index 5 so it throws and error and the next SOP statement will never execute.
        // System.out.println("Amit is a good boy");  //Thats why we use try catch method to print the next line after error
        try{
            System.out.println(cars[5]);
            //thsi try will try this statement and if it will through error the catch will catch and print the next sop statement  
        }
        catch(Exception z){
            System.out.println(z);
        }
        System.out.println("Amit is a good boy");

    }
    
}