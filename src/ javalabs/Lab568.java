public class Lab568 {

    public static void main(String[] args) {

        Demo568 arr[] = new Test1_568[3] ;


       // arr[0] = new Test568() ;

        // arr[1] = new Test1_568() ;

        for(int i = 0 ; i < arr.length ;i++) {
            System.out.println(arr[i]) ;
    }
}

interface Demo568 { }

class Test568 implements Demo568 { }

class Test1_568 extends  Test568 { }

class Test2_568 extends Test568 { }
