package abhinav.Di;

public class Restaurant {

    Cook ck;
    String name;


    public Restaurant(Cook ck) {
        this.ck = ck;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "ck=" + ck +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Restaurant obj = new Restaurant(new Cook("ravi",43));
        System.out.println(obj.ck.name);


    }
}
