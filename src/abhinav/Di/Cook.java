package abhinav.Di;

public class Cook {

    String name;
    int age;

    public Cook(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cook{" +

                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
