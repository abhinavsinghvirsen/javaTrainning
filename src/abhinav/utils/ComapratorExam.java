package abhinav.utils;

import java.util.Comparator;
import java.util.TreeSet;

public class ComapratorExam {

    public static void main(String[] args) {

        StringBuilder priyo = new StringBuilder("priyo");
        StringBuilder zen = new StringBuilder("zen");
        StringBuilder rain = new StringBuilder("rain");
        TreeSet ts = new TreeSet(new StringDescSorter());
        ts.add(priyo);
        ts.add(zen);
        ts.add(rain);
        System.out.println(ts);




    }
}
class StringDescSorter implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof  StringBuilder && o2 instanceof  StringBuilder){

            StringBuilder first =  (StringBuilder) o1;
            StringBuilder Second =  (StringBuilder) o2;

            return first.compareTo(Second);

        }
        return  0;


    }
}


class University {

   String name;
   School p1;

    public University(School p1) {
        this.p1 = p1;
    }

    public University(String name, School p1) {
        this.name = name;
        this.p1 = p1;
    }

    public University() {
    }

    public void sortinggg(){

        System.out.println("un sort");

    }
}

interface  School{

}

class Rohan implements  School{

    public Rohan() {

        this.sortinggg();
    }

    void  hello(){
       System.out.println("rohan hello");
     }

   public void sortinggg(){

       System.out.println("rohan sorting");
    }
}