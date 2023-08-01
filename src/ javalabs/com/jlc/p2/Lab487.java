package com.jlc.p2;

import com.jlc.p1.Hellooo ;

public class Lab487 {

    public static void main(String[] args) {

        Haii hi = new Haii() ;
        hi.show() ;
    }
}

    class Xyz extends Hellooo {}

    class Haii extends  Hellooo {

        void show() {
            System.out.println("Hai->show()") ;
            Hellooo hhh = new Hellooo() ;
           // System.out.println(hhh.ab) ;

            Xyz obj = new Xyz() ;
           // System.out.println(obj.ab) ;
        }
    }

