package abhinav.utils;

import java.util.Comparator;
import java.util.TreeSet;

public class TreemaoExample {

    public static void main(String[] args) {

        PGStudent priyo = new PGStudent(2,"priyo");
        PGStudent arpita = new PGStudent(3,"arpita");
        PGStudent rohit = new PGStudent(4,"rohit");

        PgStudentRollNumberSorter Rollsorter = new PgStudentRollNumberSorter();
        PgStudentNamerSorter  nameSorter = new PgStudentNamerSorter();
        TreeSet ts = new TreeSet(Rollsorter);
        ts.add(rohit);
        ts.add(priyo);
        ts.add(arpita);
        System.out.println(ts);

        TreeSet tsn = new TreeSet(nameSorter);
        tsn.add(rohit);
        tsn.add(priyo);
        tsn.add(arpita);
        System.out.println(tsn);




    }

}
class PGStudent {

    int roll;
    String name;

    public PGStudent(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }



    @Override
    public String toString() {
        return "PGStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}



class PgStudentRollNumberSorter  implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {

        PGStudent obj1 = (PGStudent) o1;
        PGStudent obj2 = (PGStudent) o2;

        return obj2.roll - obj1.roll;


    }

}

    class PgStudentNamerSorter  implements Comparator {


        @Override
        public int compare(Object o1, Object o2) {

            PGStudent obj1 =(PGStudent) o1;
            PGStudent obj2 =(PGStudent) o2;

            return obj1.name.compareTo(obj2.name);


        }
}