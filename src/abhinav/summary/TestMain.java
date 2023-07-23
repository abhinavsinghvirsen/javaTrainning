package abhinav.summary;

public class TestMain {

    public static void main(String[] args) {

        X obj = new X(4);
        System.out.println(obj.getA());

    }
}



class X{

    private int a=1;

    X(int a){
       this.a=a;

    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA(){
        return this.a;
    }

    public void display(){

        System.out.println(this.a);
    }
}



