package abhinav.modifiersub;

import abhinav.modifier.Parent;

public class ChildB  extends Parent {


   public void disply(){





   }


    public static void main(String[] args) {


        ChildB obj = new ChildB();
        obj.smile();
    }

}

class X extends  Parent{


    public static void main(String[] args) {
        X obj = new X();
        obj.smile();
    }
}
