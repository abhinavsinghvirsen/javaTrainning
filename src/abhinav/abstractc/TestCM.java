package abhinav.abstractc;

import java.util.HashMap;
import java.util.HashSet;

public class TestCM {

    public static void main(String[] args) {

        Math str= Mathme::sub;


        int c= str.m(4,6);
        System.out.println(c);


        HashMap<String,String> hs = new HashMap<>();
        hs.put("1","abhina");
        hs.put("3","rakesh");



        hs.forEach((a,b)->{
            System.out.println(a+""+b);
        });





    }
}

class Mathme{


    public int power(int a){

        return a*a;
    }
    public static int sub(int a, int b){
        System.out.println("hello ");
        return a-b;
    }



}