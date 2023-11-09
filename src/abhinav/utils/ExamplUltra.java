package abhinav.utils;

import java.util.HashSet;
import java.util.Objects;

public class ExamplUltra {

    public static void main(String[] args) {

        Person Abhinav= new Person(2334,"Abhinav");
        Person Abhinav2 = new Person(234,"Abhinav");



        HashSet hs = new HashSet();
        hs.add(Abhinav);
        hs.add(Abhinav2);

        System.out.println(hs);




    }
}
class Person{

    int acc;
    String name;

    public Person(int acc, String name) {
        this.acc = acc;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        Person person = (Person) o;
        return this.name.equalsIgnoreCase(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "acc=" + acc +
                ", name='" + name + '\'' +
                '}';
    }
}