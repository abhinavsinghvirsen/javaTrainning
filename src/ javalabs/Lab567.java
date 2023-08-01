public class Lab567 {


    public static void main(String[] args) {

        Demo567 arr[] = new Test567[3] ;

        arr[0] = new Test567() ;

        arr[1] = new Test1_567() ;

        arr[2] = new Test2_567() ;

        for(int i = 0 ; i < arr.length ;i++) {
            System.out.println(arr[i]) ;
        }
    }
}

interface Demo567 {

}

class Test567 implements Demo567 { }

class Test1_567 extends   Test567 { }

class Test2_567 extends   Test567 { }

