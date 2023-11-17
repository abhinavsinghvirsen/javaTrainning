package abhinav.abstractc;

public class TestCM {

    public static void main(String[] args) {

        Math str= Mathme::sub;


        int c= str.m(4,6);
        System.out.println(c);



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