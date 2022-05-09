import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int a;
    private T1 t1;
    private T2 t2;

    MyGeneric(int a, T1 t1, T2 t2) {
        this.a = a;
        this.t1=t1;
        this.t2 = t2;
    }
    
    public int geta() {
        return a;
    }
    public void seta(int a) {
        this.a = a;
    }
 
    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
      
    public T2 getT2() {
        return t2;
    }
    public void setT2(T2 t2) {
        this.t2 = t2;
    }
    
}
public class Ch16_2_generics {
    public static void main(String[] args){
        // ArrayList<Integer> al = new ArrayList<>();
        // // al.add("Str1");
        // al.add(65);
        // al.add(473);
        // int x = al.get(1);
        // // System.out.println(a);

        MyGeneric<String, String> g1 = new MyGeneric<>(234, "MyString", "Amit");
        System.out.println(g1.geta());
        System.out.println(g1.getT1()+" "+g1.getT2());
    }
    
}
