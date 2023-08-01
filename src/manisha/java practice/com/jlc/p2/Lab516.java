package com.jlc.p2;

import com.jlc.p1.Hello;

class Xyz extends Hello{ }

class Hai26 extends Hello{
    void show(){
        Xyz ref=new Xyz();
        ref.display();
    }
}
public class Lab516 {
    public static void main(String args[]){
        Hai26 hai=new Hai26();
        hai.show();
    }
}
