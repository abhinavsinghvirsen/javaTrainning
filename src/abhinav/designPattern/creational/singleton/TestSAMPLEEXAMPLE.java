package abhinav.designPattern.creational.singleton;

public class TestSAMPLEEXAMPLE {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("bbsr");
        System.out.println(sb);

        Studentv obj = new Studentv("abhi",345,sb);
        System.out.println(obj);
        StringBuilder cv =obj.getAddress();
        cv.append("sample");
        System.out.println(obj);

    }

}








final class Studentv{

   private final  String name;

   private final int roll;

   private final StringBuilder address;


    public Studentv(String name, int roll, StringBuilder address) {
        this.name = name;
        this.roll = roll;
        this.address = new StringBuilder(address.toString());
    }

    public String getName(){

        return this.name;
    }

    public  int getRoll(){

        return  this.roll;

    }

    public StringBuilder getAddress(){

        return new StringBuilder(this.address);
    }

      public String toString(){
        return "{ name : "+name+ " \n roll :" +roll + " \n add :  "+address.toString()+"\n}";
      }



}













