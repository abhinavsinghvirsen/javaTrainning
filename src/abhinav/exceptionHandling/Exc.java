package abhinav.exceptionHandling;

import java.io.*;

public class Exc {

    public static void main(String[] args)  {







        uncheck();






    }

    public static void writeFilelele() throws IOException {

        File f = new File("str.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("hello i am abhinav");


    }


    public static void uncheck()  {

   //    int c =888/0;

        try {



        }catch (Exception e){

            if(e instanceof  RuntimeException){

                System.out.println("unchecked");

            }else{
                e.printStackTrace();
                System.out.println("check");
            }



        }


    }
}
