package abhinav.cloning;

public class TestDeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {


        Book phy= new Book("phy",300);
        Student Abhinav = new Student("abhinav",3,50,"HIG",phy);

        Student ravi= (Student) Abhinav.clone();
        Student rekha= (Student) Abhinav.clone();
        rekha.name="rekha";
        Student priyo= (Student) Abhinav.clone();
        priyo.name="priyo";

        ravi.name="ravi";
        Abhinav.book1.name="chem";

        priyo.book1.name="mathematics";
        System.out.println(Abhinav);
        System.out.println(ravi);
        System.out.println(rekha);
        System.out.println(priyo);

    }




}

