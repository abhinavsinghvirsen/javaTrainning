package abhinav;

public class CallBYValueAndReffrence {

    int sum;

    public static void main(String[] args) {

        int a=10;
        new CallBYValueAndReffrence().m1(a);
        System.out.println(a);

        String str="abhinav";
        new CallBYValueAndReffrence().m2(str);
        System.out.println(str);


        CallBYValueAndReffrence obj3= new CallBYValueAndReffrence();
        obj3.m3(obj3);
        System.out.println(obj3.sum);




    }

    void m1(int a){

      a=a+100;


    }


    void m2(String a){

        a=a+"kumar";


    }

    void m3(CallBYValueAndReffrence obj){

        obj.sum+=100;

    }

}
