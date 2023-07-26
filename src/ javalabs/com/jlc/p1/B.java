package com.jlc.p1;

public class B extends  A {

    public  void showB() {
        System.out.println("B -> showB()") ;

   //     System.out.println(a) ; 'a' has private access in 'com.jlc.p1.A'

        System.out.println(b) ;

        System.out.println(c) ;

        System.out.println(d) ;

    }
}
