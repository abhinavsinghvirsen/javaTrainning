package abhinav.String;

public class TestStringbuffer {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("ravi");
        System.out.println(str.capacity());
        str.append("kumar").append("chopra");
        System.out.println(str);

        StringBuilder str4= new StringBuilder("Abhinav");
        str4.append("singh");
        System.out.println(str4);

        
    }

}
