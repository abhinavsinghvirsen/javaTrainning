package abhinav.utils;

import java.util.Comparator;
import java.util.TreeSet;

public class ExampleTreeSet{

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        ts.add(new Student(5,"A"));
        ts.add(new Student(2,"C"));
        ts.add(new Student(1,"B"));
        System.out.println(ts);

        TreeSet cr = new TreeSet(new CarNumberSort());

        cr.add(new Car(4) );
        cr.add(new Car(3));
        System.out.println(cr);

    }
}

class Student implements  Comparable{

    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Object abc) {

        Student obj = (Student) abc;
        System.out.println(this.roll + " - "+ obj.roll + " = "+ (this.roll- obj.roll));
        return this.roll-(obj.roll);

    }



}

class Car{

    int number;

     Car(int num){
       this.number=num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                '}';
    }
}



 class CarNumberSort implements Comparator<Car> {

    @Override
    public int compare(Car carfirst, Car carsecond) {
        return carfirst.number-carsecond.number;
    }
}