package com.jlc.p2;

import com.jlc.p1.Hellooo ;

public class Lab517
{
    public static void main(String[] args) {

        Test517 tt = new Test517() ;
        tt.show() ;

    }
}


class Demo517 extends Hellooo {
    protected  void display() {}
}

class Test517 extends Hellooo {
    void show() {
        Demo517 dd = new Demo517() ;

         dd.display() ;
    }
}
