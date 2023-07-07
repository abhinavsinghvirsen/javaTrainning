package abhinav;



public class Inheritance {



    public static void main(String[] args) {

        Suv h= new Suv();

        h.OffroadingCapability();


    }

}


class Car {

    public String engine;
    public int wheels=4;
    public String stering;

    public  void driving() {

        System.out.println("driving");

    }
}

    class Suv extends Car{


       public int groundclerance;
        public  boolean offroadingCapability;
        public int safteyrating;

        public  void OffroadingCapability(){

            System.out.println(super.wheels);
            super.driving();
            System.out.println("off roading also");

        }


    }


    class Sedan{
        public String engine;
        public int wheels;
        public String stering;

        public  void driving() {


        }
        public   int weelbase;
        public String sunroof;
        public void cruising(){




        }

    }




