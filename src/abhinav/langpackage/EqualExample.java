package abhinav.langpackage;

import java.util.Objects;

public class EqualExample {

    public static void main(String[] args) {

        int a=1; int b=1;

        System.out.println(a==b);

        Pop ob1 = new Pop(1,5);
        Pop ob2 = new Pop(1,2);
        System.out.println(ob1==ob2);
        System.out.println(ob1.equals(ob2));

    }
}
class Pop{

    int a;
    int b;


    Pop(int a,int b){
        this.a=a;
        this.b=b;

    }

  public boolean equals(Object obj){

    Pop tmp = (Pop)obj;

    boolean result = this.a==tmp.a   &&  this.b == tmp.b ;

    return result;


  }

}
