import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class creatingwriting {
    public static void main(String[] args) throws IOException {
        File f=new File("sample.txt");
        if(f.createNewFile())
        {
            System.out.println("File created");
        }
        else
        {
            System.out.println("Exception in creating a file");
        }
        FileWriter writter=new FileWriter("sample.txt");
        writter.write("This is the first line of text file");
        writter.close();
        System.out.println("Done writing the file");
    }
}
