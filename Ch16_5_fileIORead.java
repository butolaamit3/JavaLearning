import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ch16_5_fileIORead {
    public static void main(String[] args){
        // Reading a file

        File myFile = new File("FileIo");
        try {
            Scanner sc = new Scanner(myFile); 
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }
    
}
