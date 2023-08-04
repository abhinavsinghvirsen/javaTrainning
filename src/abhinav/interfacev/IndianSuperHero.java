package abhinav.interfacev;

 interface SuperHuman {

     



}

interface Human {
    String coustume = "blue custume";
     int adharid = 5;

    void speak();

    void run();

    void eat();



}


public class IndianSuperHero implements SuperHuman,Human{


    //upcasting
    Superclass sobj = new Superclass();

    Sublass subobj = new Sublass();

    Superclass superref=subobj;  //upcasting


    Sublass subobjtry =  (Sublass) sobj;//downcasting




     final static int adharid = 0;
    public static void main(String[] args) {

        SuperHuman shaktimaan = new IndianSuperHero();
       // System.out.println(SuperHuman.coustume);



        Human gangadhar = new IndianSuperHero();

      //  System.out.println(gangadhar.adharid);

        IndianSuperHero krish = new IndianSuperHero();
        krish.superpower();

        System.out.println(IndianSuperHero.adharid);
        System.out.println(IndianSuperHero.adharid);
        System.out.println(Human.coustume);







    }


    public void superpower() {

    }


    public void fly() {

    }

    @Override
    public void speak() {

    }

    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }
}


class Superclass{


}

class Sublass extends Superclass{


}
