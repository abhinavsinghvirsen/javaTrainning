package filehanndling;

import java.io.File;
import java.io.IOException;

public class TestFileHandling {

    public static void main(String[] args) throws IOException {

        File  f = new File("/Users/abhinavsingh/Downloads");
        String []name = f.list();
        System.out.println("no of file & directory "+ name.length);

        int fc=0;
        int dc=0;
        for(String n:name){
            File t = new File("/Users/abhinavsingh/Downloads/"+n) ;
            if (t.isFile()){
                fc++;
                System.out.println(fc +" == file name" + t.getName());

            }else{
                dc++;
                System.out.println(dc +"== directory name" + t.getName());

            }
        }

        System.out.println( "total number of files"+fc);
        System.out.println("total number of directory"+dc);

    }

}
