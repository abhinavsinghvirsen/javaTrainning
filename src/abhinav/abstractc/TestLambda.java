package abhinav.abstractc;

import java.util.Optional;

public class TestLambda {


    public static void main(String[] args) {

        String[] p = new String[10];
        Optional<String> checkNull =Optional.of("7");
               // Optional.ofNullable(p[5]);
        if (checkNull.isPresent()) {
            String word = checkNull.get();
            System.out.print(p);
        } else{
            System.out.println("string is null");
    }




    Sample str= (a)->{
            System.out.println("hello world");
        };
        str.m(6);

        Math t =(x,c)->{
            return x+c;
        };

        System.out.println( t.m(4,5));

        runLamda((x)->{
            int a=6;
            int b=9;
            System.out.println(a+b+x);
        });


    }

    public static void runLamda(Sample st) {
        st.m(5);

    }
}
