package abhinav.Wrapper;

public class Boxing {


    public static void main(String[] args) {

        //java 5

        int x=10;
        Integer y=x;  //5 not valid

        Integer obj = new Integer(x);


        Integer bo = new Integer(x);

        int w =bo;  //auto unboxing  java 5

        int z= bo.intValue(); //


    Integer ref = 1;
    Integer ref2 = new Integer(123);

    int a=ref;
    int b= ref2.intValue();





    Integer relob = new Integer(10);
    Integer cop = new Integer(10);

    System.out.println(relob==cop);




        Integer v1 =15;
        Integer v2 = 15;

        System.out.println(v1==v2);



        Integer v3 =Integer.valueOf(129);
        Integer v4 = Integer.valueOf(129);

        System.out.println(v3==v4);

        Integer v7 =new Integer(16);
        Integer v8 = new Integer(16);

        System.out.println(v7==v8);

        Integer v5 =200;
        Integer v6 = 200;

        System.out.println(v5.equals(v6));


    }

}
