package abhinav.String;

public class TestString {

    public static void main(String[] args) {


//        String str ="Abhinav";  // check in constant pool create
//        String str2="Abhinav"; //
//
//       // String str3 = new String("Abhinav");
//
//        System.out.println(str.hashCode());
//        System.out.println(str2.hashCode());
//       // System.out.println(str3.hashCode());
//        System.out.println(str==str2);



        String srt = new String("A"); //check if not create
        String srt2= new String("A");//check if yes then create outside
        String srt3 ="A";
        System.out.println(srt2==srt3);
        System.out.println(srt.hashCode());


        //intern()



        String st= new String ("ok");
        String st2 =st.intern();
        String st3 ="ok";
        System.out.println(st==st3);







    }
}
