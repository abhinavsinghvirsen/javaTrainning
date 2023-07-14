package abhinav.methodoveriding;

public class Child extends  Super{


    public PhyBook m1(int a, String x){
        System.out.println("child m1");
        return new PhyBook();
    }


}
