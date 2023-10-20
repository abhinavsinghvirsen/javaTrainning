package abhinav.utils;

import java.util.*;

public class SetExample {


    public static void main(String[] args) {

        // no order maintain no duplicate

        HashSet hs = new HashSet();
        hs.add("Z");
        hs.add("AB");
        hs.add("cc");
        hs.add("priyo");
        hs.add("AB");

        System.out.println(hs);

        hs.forEach(x-> System.out.println(x));

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

        }



    }
}
