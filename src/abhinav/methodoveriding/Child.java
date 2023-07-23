package abhinav.methodoveriding;

public class Child extends  Super{


    public PhyBook m1(int a, String x){
        System.out.println("child m1");
        return new PhyBook();
    }

    public PhyBook m1(char a, String x){
        System.out.println("child m1");
        return new PhyBook();
    }

    @Override
    int  m2() {
        return super.m2();
    }


    @Override
    public final void dancing() {
        super.dancing();
    }

    public strictfp void display() {

    }

    public  void  speaching(){


    }

    public int  m4(){

        return 2;
    }

    void mshow(){

        System.out.println("child");
    }
}

class GrandChild extends  Child{



}
