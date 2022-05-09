import java.io.File;

public class Ch16_6_fileIODelete {
    public static void main(String[] args){
        File myFile = new File("FileIo");
        if(myFile.delete()){
            System.out.println("I have deleted: "+myFile.getName());
        }
        else{
            System.out.println("Some problem occured while deleting the file");
        }
    }
    
}
