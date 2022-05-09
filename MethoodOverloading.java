public class MethoodOverloading {
    
    static void tellJoke(){
        System.out.println("You are beautiful");
    }

    static void change(int a){
        a = 45;
    }
    static void change2(int arr[]){
        arr[0] = 98;
    }

    public static void main(String[] args){
        tellJoke();
// Case1: Changing the Integer
        int x = 24;
        change(x);
        System.out.println("The value of x after change is: "+ x);

// Case2: Changing the Array
        int marks[] = {1,23,42,13,22};
        change2(marks);
        System.out.println("The value of x after changeis : " +marks[0] );
    }
    
}
