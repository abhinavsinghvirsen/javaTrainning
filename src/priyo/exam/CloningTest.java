package java360.exam;

public class CloningTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Test t1 = new Test(101) ;

        WhichObjectCloned woc = new WhichObjectCloned(24 , "Subham",t1) ;

        WhichObjectCloned wdc1 = (WhichObjectCloned) woc.clone() ;

        
    }
}

class Test {

    int id ;
    Test(int id) {

        this.id = id ;
    }
}

class WhichObjectCloned implements Cloneable {

    int age ;

    String name ;

    Test tt ;

    public WhichObjectCloned(int age,String name,Test tt) {
        this.age = age;
        this.name = name ;
        this.tt = tt ;
    }

    public Object clone() throws CloneNotSupportedException {

        return  super.clone() ;
    }


}

