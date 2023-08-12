package abhinav.innerclasses;

public class TestM2 {

    public static void main(String[] args) {

        Outer obj = new Outer();

        Outer.Inner objx = new Outer.Inner();
        String name = Outer.Inner.name;


    }
}

class Outer{


    String name="abhinav";
    static int roll=20;


   static class Inner{

        String adress="banglore;";
       static String name="riya";
      public void display(){

          System.out.println(this.name);
          System.out.println(roll);
      }

    }
    public void show(){


       class localclass {

              int  x;
              void  m1(){
             System.out.println(name);

           }

        }

        Inner obj = new Inner();
        System.out.println(obj.adress);
        System.out.println(Inner.name);
    }

    }







