package abhinav.utils;

import java.lang.constant.Constable;
import java.util.*;

public class GenericExamples {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(2);
        al.add(7);
        al.add(1);
        System.out.println("before sorting "+al.toString());

        Collections.sort(al,new IntegerRev());

        System.out.println("after sorting "+ al);

       Collections.synchronizedList(al);

       Collections.unmodifiableList(al);


    }

}
class IntegerRev implements Comparator<Integer>{



    @Override
    public int compare(Integer o1, Integer o2) {

        return o2.intValue()-o1.intValue();
    }
}