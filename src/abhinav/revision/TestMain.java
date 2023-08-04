package abhinav.revision;

import Utility.Math;


public class TestMain {

    public static void main(String[] args) {

        int result = Math.powerofthree(6);

        C obj = new C();

       P obj2 = new P();

    }

}



class P{

    private int swissbankbb;
    P(){
        

    }

    public P(int swissbankbb, int bb, int numperofhous) {
        this.swissbankbb = swissbankbb;
        this.bb = bb;
        this.numperofhous = numperofhous;
    }

    public int  bb;
   public int numperofhous;

   void dancing(){

       System.out.println("Parent dance");
    }


}


class C extends  P{

    C(){
       this(5);

    }
    C(int a){


    }

    public int bb;

    public void singing(){

        System.out.println("child singing ");
    }


    public int getNetWorth(){

       int c= super.bb+this.bb;


        return c;
    }

    public int ownearned(){

       return this.bb;

    }




}



