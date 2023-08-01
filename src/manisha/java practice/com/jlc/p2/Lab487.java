package com.jlc.p2;
// import com.jlc.p1.Hello;

class Xyz extends Hello{}

class Hai22 extends Hello{
    void show(){
        System.out.println("Hai -> show()");
    
    Hello h = new Hello();
    System.out.println(h.ab);
    Xyz ref=new Xyz();
    System.out.println(ref.ab);
}
}
public class Lab487 {
    public static void main(String args[]){
        Hai22 hai=new Hai22();
        hai.show();
    }
}
