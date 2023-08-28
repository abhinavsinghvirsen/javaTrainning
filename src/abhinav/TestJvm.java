package abhinav;

public class TestJvm {


    public static void main(String[] args) {


    Stu []a = new Stu[100000];

       for(int i=0;i<a.length;i++){
           a[i]= new Stu("A"+i,"Add"+i);


       }

    }
}
class Stu{
    Double d[] = new Double[123456];
    String name;
    String add;

    public Stu(String name, String add) {
        System.out.println("hi"+name);
        this.name = name;
        this.add = add;
    }

    protected void finalize(){

        System.out.println("finalize"+name);
    }

}

