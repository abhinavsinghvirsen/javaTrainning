package abhinav.methodoveriding;

public class Super {


    public Book m1(int  a,String v){
        System.out.println("super m1");
        Book b1 = new Book();

        return b1;
    }

   int  m2(){

      return 1;

    }

       public native void dancing();



     private void  speaching(){


    }


    protected int  m4(){

        return 2;
    }


    void mshow(){

        System.out.println("super");
    }

}
