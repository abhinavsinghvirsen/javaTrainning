package abhinav.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LitItrExample {

    public static void main(String[] args) {


        List listOfFruit = new ArrayList(3);
        listOfFruit.add("apple");
        listOfFruit.add("kiwi");
        listOfFruit.add("orange");
        listOfFruit.add("lemon");


        ListIterator lit = listOfFruit.listIterator();

       // System.out.println(listOfFruit);

        while (lit.hasNext()){

            String  ob = (String) lit.next();
            if(ob.equalsIgnoreCase("apple") ){
             lit.remove();

          }
           


        }

        System.out.println(listOfFruit);






    }
}
