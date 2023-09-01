package abhinav.designPattern.creational.singleton;

public class TestImmutable {

    public static void main(String[] args) {
        StringBuilder add = new StringBuilder("bbsr");
        student abhi = new student(12,"abhi", add );

        StringBuilder obc = abhi.getStr();
        obc.append("apendedddddd");
        add.append(" odisha");
        System.out.println(obc.toString());
        System.out.println(abhi);
    }

}

 final class student{

     private final int roll;
     private final String  name ;
     private final  StringBuilder str ;

     public student(int roll, String name, StringBuilder str) {
         this.roll = roll;
         this.name = name;
         this.str = new StringBuilder(str.toString());
     }

     public int getRoll() {
         return roll;
     }

     public String getName() {
         return name;
     }

     public StringBuilder getStr() {
         return new StringBuilder(str.toString());
     }

     @Override
     public String toString() {
         return "student{" +
                 "roll=" + roll +
                 ", name='" + name + '\'' +
                 ", str=" + str +
                 '}';
     }
 }