package abhinav;

public class Doubt {

    int sum;

    public static void main(String[] args) {

        int a=10;
        new Doubt().m1(a);
        System.out.println(a);

        String str="abhinav";
        new Doubt().m2(str);
        System.out.println(str);


        Doubt obj3= new Doubt();
        obj3.m3(obj3);
        System.out.println(obj3.sum);




    }

    void m1(int a){

      a=a+100;


    }


    void m2(String a){

        a=a+"kumar";


    }

    void m3(Doubt obj){

        obj.sum+=100;

    }

}
