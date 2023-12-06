package filehanndling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileHandling {

    public static void main(String[] args) throws IOException {

        File f = new File("/Users/abhinavsingh/Downloads/priyo_labs");
        System.out.println(f.mkdir());

        File leaveapp = new File(f.getCanonicalPath()+"/application-leave.txt");
        leaveapp.createNewFile();


        FileWriter fw = new FileWriter(leaveapp);
        fw.write("hello sir ji  i want leave");
        fw.close();
    }

}
