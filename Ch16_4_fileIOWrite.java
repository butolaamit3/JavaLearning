import java.io.FileWriter;
import java.io.IOException;

public class Ch16_4_fileIOWrite {
    public static void main(String[] args){
        
        // Code to write a file
        
        try {
            FileWriter fw = new FileWriter("FileIo");
            fw.write("This is out first file from this java code\nOkay now bye");
            fw.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
