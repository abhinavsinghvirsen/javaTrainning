public class Lab491 {

    public static void main(String[] args) {

        Demo491 dd = new Demo491() ;
        dd.setX(99) ;
        System.out.println(dd.getX()) ;
    }
}

class Demo491 {

    private  int x ;

    public void setX(int x) {

        this.x = x ;
    }

    public int getX() {

        return this.x ;
    }
}
