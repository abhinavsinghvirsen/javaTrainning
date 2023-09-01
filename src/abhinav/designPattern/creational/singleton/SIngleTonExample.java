package abhinav.designPattern.creational.singleton;

import org.w3c.dom.ls.LSOutput;

public class SIngleTonExample {

    public static void main(String[] args) throws Exception{
        School vms = School.getInstance("tms");
        School tms = School.getInstance("hdfh");
        School tm = School.getInstance("KMpm");
        School cl = (School) tm.clone();
        System.out.println(vms);
        System.out.println(tm);
        System.out.println(tms);
        System.out.println(cl);
    }

}


class School implements Cloneable{

    private static School obj;

    String name ;

    private School(String name ){

         this.name=name;

    }

    public static School getInstance(String c){

        if(null==obj) {
            obj = new School(c);
        }else{

            obj.name=c;
        }
        return  obj;

    }

    protected Object clone() throws CloneNotSupportedException {


        return obj;




    }




}