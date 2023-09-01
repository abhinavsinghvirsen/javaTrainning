package abhinav.Wrapper;

public class TestWrapper {

    public static void main(String[] args) {


          // primitvie to String

        byte b= 10;
        //1
        String s= ""+b;

        String  v=String.valueOf(b);
        System.out.println(v.length());


        String bv = Byte.toString(b);


        //

        String qrt ="12";

        int a = Integer.parseInt(qrt);
        byte bvb =Byte.parseByte(qrt);
        System.out.println(a);

        //primitive to wrapper

        byte b1 = 3;
        Byte objb = new Byte(b1);
        Byte obbb= Byte.valueOf(b1);
        int axy =456;
        Integer obw = new Integer(456);
        Integer t = Integer.valueOf(axy);

//wrapper to primitive

        Integer intw=10;

        int wv = intw.intValue();
        Long lw =30l;
        long lww = lw.longValue();
        Boolean bw =false;
        boolean bwp = bw.booleanValue();

        Integer mm= 200;
        String xdsdg=mm.toString();
        System.out.println(xdsdg);

    }


}

