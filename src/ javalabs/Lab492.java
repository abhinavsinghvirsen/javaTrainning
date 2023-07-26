public class Lab492 {

    public static void main(String[] args) {

        Test492 tt = new Test492(99) ;
        System.out.println(tt.getX()) ;
    }
}

class Demo492 {

    private int x ;
    Demo492(int x) {
        this.x = x ;
    }

    int getX(){
        return this.x ;
    }
}

class Test492 extends Demo492 {

    Test492(int x) {
        super(x) ;
    }

}
