import java.io.File;
import java.io.IOException;

public class Ch16_3_fileIOCreate {
    public static void main(String[] args){
        
        
        // Code to create a new File
        File myFile = new File("FileIo.txt");
        try {
            myFile.createNewFile();
        } 
        catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
    }
}