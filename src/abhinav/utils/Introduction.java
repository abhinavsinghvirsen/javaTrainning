package abhinav.utils;

import java.util.*;
public class Introduction {


    public static void main(String[] args) {


        Vector emails = new Vector();
        emails.add("abhi@gmail");
        emails.add("priyo@gmail");

        Stack emailss = new Stack();
        emailss.add("efevbvx@gmai");


        Properties pr = new Properties();
        pr.put("bihar","patna");
        pr.put("odisha","bhubaneswar");
        pr.put("mp","bhopal");

        Dictionary dt = new Hashtable();

        dt.put("123","abhinav");
        dt.put("345","priyo");


        Hashtable th = new Hashtable();
        th.put("jho51234","safari");
        th.put("od013456","creata");


        //vector data :::----//

        Enumeration listofelement = emails.elements();

        while(listofelement.hasMoreElements()){

           Object obj = listofelement.nextElement();

            System.out.println(obj);

        }

//key

      Enumeration propname =  pr.propertyNames();

        while(propname.hasMoreElements()){


            Object state = propname.nextElement();

            Object captial = pr.getProperty((String)state);

            System.out.println(state + " --- "+captial);




        }



    }




}
