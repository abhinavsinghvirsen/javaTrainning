package com.jlc.p2;

import com.jlc.p1.Hellooo ;

public class Lab516 {
    public static void main(String[] args) {

        Test516 tt = new Test516() ;
        tt.show() ;

    }
}


class Demo516 extends Hellooo { }

class Test516 extends Hellooo {
    void show() {
        Demo516 dd = new Demo516() ;

        // dd.display() ;
    }
}