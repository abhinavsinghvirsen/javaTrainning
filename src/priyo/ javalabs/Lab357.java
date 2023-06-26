public class Lab357 {

    public static void main(String[] args) {

        Demo357 dd = new Demo357() ;
        dd.setAge(24) ;
        System.out.println(dd.age) ;

    }
}

class Demo357 {

    int age ;

    void setAge(int age) {

        this.age = age ;
    }
}