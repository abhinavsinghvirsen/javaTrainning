package abhinav.abstractc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainExample {

    public static void main(String[] args) {

        // Stream.of(1,3,3).findFirst();
        System.out.println(Stream.of(1, 3, 3).findFirst().get());

        ArrayList<Integer> al = new ArrayList();
        al.add(1000);
        al.add(3000);
        al.add(6066600);
        al.add(5000);

        //  al.stream().forEach(System.out::println);

        // al.stream().filter((x)->x.startsWith("r")).forEach(System.out::println);

        // Long c =  al.stream().map((x)->x+"cap").count();
        //   System.out.println(c);
        List s = al.stream().filter(x -> x > 6000).collect(Collectors.toList());

        System.out.println(s);

  List<Integer> even = Arrays.asList( 2, 4, 6, 8, 10);

  List<Integer> odd = Arrays.asList( 3, 5, 7, 9, 11);

       List<Integer> primes = Arrays.asList(17, 19, 23, 29, 31);


 List<List<Integer>> listOfNumbers = new ArrayList<>();
 listOfNumbers.add(even); listOfNumbers.add(odd); listOfNumbers.add(primes);
 System.out.println("list of numbers: " + listOfNumbers);
 // above list is not really a list of numbers but a list of list
        // to convert that into a list of numbers we will use // the flatMap function
         List<Integer> flattenedList = listOfNumbers.stream() .flatMap(l -> l.stream()).filter(x->x%2==0).collect(Collectors.toList());
         System.out.println("list of numbers (flattend) : " + flattenedList);
    }
}


