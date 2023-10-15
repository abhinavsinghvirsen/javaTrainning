package abhinav.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {


    public static void main(String[] args) {

        List vegname = new ArrayList();
        vegname.add("allu");
        vegname.add("gobi");

        ArrayList vegname2 = new ArrayList();

        Collection ob = new ArrayList();


        for (Object str:vegname){
            System.out.println(str);
        }



        Iterator readobj = ob.iterator();

        while (readobj.hasNext()){

            System.out.println(readobj.next());


        }


        for (int  i=0; i<vegname.size();i++)
        {
            System.out.println(vegname.get(i));
        }


        vegname.forEach(x->{

            System.out.println(x);
        });


        vegname.stream().peek(System.out::println);


      List firstclass = new ArrayList();
      firstclass.add("ram");
      firstclass.add("shyam");

      if (firstclass.contains("Abhinav")){
          System.out.println("first class");
      }


    }
}
