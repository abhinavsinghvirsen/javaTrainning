package abhinav.langpackage;

import java.util.Objects;

public class TestToString {

    public static void main(String[] args) {


Stud1 obj1 = new Stud1("ab",2);
Stud1 obj2 = new Stud1("abc",1);

int a =5;
int b=5;
System.out.println(a==b);

System.out.println(obj1.equals(obj2));




    }
}

class Stud1 {

    String name;
    int roll ;

    public Stud1(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public Stud1() {

    }

    @Override
    public String toString() {
        return name+roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stud1 stud1 = (Stud1) o;
        return roll == stud1.roll && Objects.equals(name, stud1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }
}
