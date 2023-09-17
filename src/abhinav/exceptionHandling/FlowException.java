package abhinav.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class FlowException {

    public static void main(String[] args) {

        try(FileReader rd= new FileReader(new File("abc.txt"));){


        }catch(Exception e){


        }






    }
}


class A{

   void m1() throws NullPointerException {


    }
}

class B extends A{

   void m1()  {


    }
}