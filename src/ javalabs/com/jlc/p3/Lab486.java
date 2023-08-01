package com.jlc.p3 ;

import com.jlc.p1.* ;

import com.jlc.p2.* ;

public class Lab486 {

    public static void main(String[] args) {

        A a1  = new A() ;

        a1.showA() ;

        B b1 = new B() ;

        b1.showB() ;

        C c1 = new C() ;

        c1.showC() ;

        D d1 = new D() ;

        d1.showD() ;

        E e1 = new E() ;

        e1.showE() ;
    }
}

/* A -> show()
10
20
30
40
B -> showB()
20
30
40
C -> showC()
20
30
40
D -> showD()
30
40
E -> showE()
40*/
