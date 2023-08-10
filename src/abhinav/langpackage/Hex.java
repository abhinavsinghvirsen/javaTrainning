package abhinav.langpackage;

public class Hex {

    public static void main(String[] args) {

        Student st = new Student();
        System.out.println(st.toString());
        System.out.println(st.displaySampleV());


    }
}
class Student{
    int a;




    public String displaySampleV() {
        Class c = this.getClass();
        int hc = this.hashCode();
        String value = Integer.toHexString(hc);
        return(c.getName()+""+value);
    }
}
