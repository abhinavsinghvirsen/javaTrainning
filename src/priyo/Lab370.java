package priyo;

public class Lab370 {

    public static void main(String[] args) {

        Demo370 dd = new Demo370() ;
        System.out.println(dd.show(10) );
    }
}

class Demo370 {
    boolean show(int x) {
      //  return 0 ; //Incompatible types. Found: 'int', required: 'boolean'
        return false ;
       // return false ; unrechable statement
    }
}