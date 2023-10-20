package abhinav.utils;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {

        Collection Ll = new LinkedList();

        List Ll1 = new LinkedList();


        LinkedList obj = new LinkedList();

        obj.add("adafas");
        obj.add("dvdsvsdvsd");

        for(Object x:obj){

            System.out.println(x);
        }

        for(int i=0;i<obj.size();i++){

         //   obj.get(i);
            System.out.println(obj.get(i));
        }


        Iterator data = obj.iterator();
        while(data.hasNext()){

            System.out.println(data.next());
        }

        obj.stream().peek(System.out::println);

        obj.forEach(x-> System.out.println(x));
        



    }
}
