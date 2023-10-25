package abhinav.utils;

import java.util.*;

public class SetExample {


    public static void main(String[] args) {

        //  order maintain no duplicate

        HashSet hs = new HashSet();
        hs.add("Z");
        hs.add("B");
        hs.add("C");
        hs.add("N");
        hs.add("T");
        hs.add("T");

        System.out.println( "T".hashCode());
        System.out.println(hs);

        Iterator obj=  hs.iterator();
        while(obj.hasNext()){
            System.out.println(obj.next());

        }

      /*  hs.forEach(x-> System.out.println(x));

        for(Object c:hs){
            System.out.println(c);
        }



        ArrayList obl = new ArrayList(hs);
         for(int i=0;i<obl.size();i++){
             System.out.println(obl.get(i));

         }






      Iterator obj=hs.iterator();

        while(obj.hasNext()){
            System.out.println(obj.next());

        }*/



    }
}
