public class Lab566 {

    public static void main(String[] args) {

        Demo566 arr[] = new Demo566[3] ;

        arr[0] = new Test566() ;

        arr[1] = new Test1_566() ;

        arr[2] = new Test2_566() ;

        for(int i = 0 ; i < arr.length ;i++) {
            System.out.println(arr[i]) ;
        }
    }
}

interface Demo566 {

}

class Test566 implements Demo566 { }

class Test1_566 extends   Test566 { }

class Test2_566 extends   Test566 { }


