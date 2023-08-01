public class VarArgsLab399_409 {

    public static void main(String[] args) {

        Demo399_409 dd = new Demo399_409() ;

       // dd.sum(10,20) ;


        /*
        dd.sum(12,10) ;
        dd.sum(12,10,20) ;
        */




       /* dd.sum(new int[0]) ;
        dd.sum(new int[] {10,20,30,40}) ;
        dd.sum(new int[] {10,20,30,40,50,60}) ;
       // dd.sum() ;
       // dd.sum(12,33,54) ;
       // dd.sum(45,76,89) ;*/







/*
        dd.sum(new int[0]) ;
        dd.sum(new int[] {10,20,30,40}) ;
        dd.sum(new int[] {10,20,30,40,50,60}) ;
         dd.sum() ;
         dd.sum(12,33) ;
         dd.sum(45,76,89) ;*/




        // dd.show() ;



/*

        dd.show(10) ;
        dd.show(10,20) ;
        dd.show(10,20,30) ;
*/





      //  dd.m1() ; Ambiguous method call.






        // dd.show(10) ;




        // dd.show(10) ;



        dd.show() ;
        int arr1[] = new int[]{10} ;
        int arr2[] = new int[]{20,30,50} ;
        dd.show(arr1,arr2) ;
    }

}

class Demo399_409 {

   /* void sum(int a , int b) {

        System.out.println("..sum(int,int)") ;
        System.out.println(a+b) ;
    }
    */






   /* void sum(int a , int b) {

        System.out.println("..sum(int,int)") ;
        System.out.println(a+b) ;
    }
    void sum(int a , int b,int c ) {

        System.out.println("..sum(int,int,int)") ;
        System.out.println(a+b+c) ;
    } */






 /*   void sum(int arr[]) {
        System.out.println("(--sum(int [] ) )") ;
        System.out.println("Length: "+ arr.length) ;

        int s = 0 ;

        for(int a : arr){
            s = s + a ;
        }
        System.out.println("Sum is : " + s) ;

    }

    (--sum(int [] ) )
    Length: 0
    Sum is : 0
            (--sum(int [] ) )
    Length: 4
    Sum is : 100
            (--sum(int [] ) )
    Length: 6
    Sum is : 210   */









  /*  void sum(int... arr) {
        System.out.println("(--sum(int... ) )") ;
        System.out.println("Length: "+ arr.length) ;

        int s = 0 ;

        for(int a : arr){
            s = s + a ;
        }
        System.out.println("Sum is : " + s) ;

    }



    (--sum(int... ) )
    Length: 0
    Sum is : 0
            (--sum(int... ) )
    Length: 4
    Sum is : 100
            (--sum(int... ) )
    Length: 6
    Sum is : 210
            (--sum(int... ) )
    Length: 0
    Sum is : 0
            (--sum(int... ) )
    Length: 2
    Sum is : 45
            (--sum(int... ) )
    Length: 3
    Sum is : 210    */







   /* void show(int a , int... arr) {
        System.out.println("\n show(int,int...) ") ;

    }*/





/*    void show(int a , int... arr) {
        System.out.println("\n show(int,int...) ") ;

    }*/








   /* void m1(int... a) {
        System.out.println("m1(int...)");
    }

    void m1(String... a) {
        System.out.println("m1(String...)");
    }*/




    /*
    void show(int... arr1,int... arr1) {
        System.out.println("\n show(int...,int...)") ;
    }*/





    /*
    void show(int... arr1) {
        System.out.println("\n show(int...)") ;
    }
    void show(int[] arr1) {
        System.out.println("\n show(int[] )") ;
    }
 */







    void show(int[]... arr1) {
        System.out.println("\n show(int...)") ;
    }




}

