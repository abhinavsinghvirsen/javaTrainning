package abhinav.utils;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

//searching insertion  no order maintain
        HashMap hm = new HashMap(); //16

        hm.put(123,"Abhinav");


        hm.put(234,"rakesh");
        hm.put(456,"mahesh");

        hm.get("123");


        Set hset = hm.keySet();

        Iterator it = hset.iterator();



        while(it.hasNext()){

           // System.out.println("key "+it.next());
          Object ob=  hm.get(it.next());
          System.out.println(ob);

        }




      //  System.out.println(hm.size());

    }
}
