package com.jlc.p2;

import com.jlc.p1.Hello;

class Xyz extends Hello{ 
    protected void display(){}
}

class Hai27 extends Hello{
    void show(){
        Xyz ref=new Xyz();
        ref.display();
    }
}
public class Lab517 {
    public static void main(String args[]){
        Hai27 hai=new Hai27();
        hai.show();
    }
}
