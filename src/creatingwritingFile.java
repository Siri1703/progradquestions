import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class creatingwritingFile {

    public static void main(String[] args) throws IOException {
        File f=new File("sample.txt");
       if(f.createNewFile())
       {
           System.out.println("File created");
       }
       else
       {
           System.out.println("exception in creating a file");
       }
        FileWriter file=new FileWriter("sample.txt");
       file.write("This is the very first line of file");
       file.close();
    }
}
