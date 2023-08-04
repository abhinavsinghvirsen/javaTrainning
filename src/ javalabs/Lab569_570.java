public class Lab569_570 {

    public static void main(String[] args) {

        Demo569 arr[] = new Ex2[3] ;

        arr[0] = new Ex2() ;

        arr[1] = new Ex2() ;

       arr[2] = new Ex2() ;

   //     arr[2] = new Ex3() ; Exception in thread "main" java.lang.ArrayStoreException

        for (int i = 0 ; i < arr.length ; i++)
            System.out.println(arr[i]) ;
    }
}

interface Demo569 { }

class Ex1 implements  Demo569 { }

class Ex2  extends  Ex1 { }

class Ex3  extends  Ex1 { }




