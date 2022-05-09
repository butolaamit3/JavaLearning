import java.io.FileWriter;
import java.io.IOException;

// Write a brogram to generate a multiplication table of a given number and write it to a file.
public class Ch16_7_pp3 {
    public static void main(String[] args){
        int x = 17;
        String table = "";
        for(int i = 1;i<=10;i++){
            table += x+ "X"+ i+ "="+ x*i;
            table += "\n";
            System.out.printf("%d x %d = %d\n",x,i,x*i);
        }
        try {
            FileWriter fw = new FileWriter("MultiplicationTable.txt");
            fw.write(table);
            fw.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
