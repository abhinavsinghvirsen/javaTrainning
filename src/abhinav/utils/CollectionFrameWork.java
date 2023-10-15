package abhinav.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionFrameWork {

    public static void main(String[] args) {













        List<String> name = new ArrayList<String>();
        name.add("allu");
        name.add("tamator");
        name.add("gobi");

        List<String> newname = new ArrayList<String>();
        newname.add("allu");
        newname.add("tamator");


        Iterator<String> n =name.iterator();



        while(n.hasNext()){

            System.out.println(n.next());


        }

       // name.remove("abhinav");

        System.out.println(name);

       //  name.addAll(newname);



         if(name.containsAll(newname)){
             System.out.println("yes");

         }else{

             System.out.println("no");
         }

        //System.out.println(name);
        System.out.println(name.retainAll(newname));
        System.out.println(name);

        System.out.println(name.isEmpty());

    }
}
