package abhinav.runtime;

import java.io.IOException;

public class RuntimeExample {

    public static void main(String[] args) throws IOException {

        Runtime rt =Runtime.getRuntime(); //Singleton class
        String url = "open "+"https://www.google.com/search?q=abhinavsinghvirsen";
        Process p1 =rt.exec(url);
        /***
         *memory
         *
         * cmd exe
         *
         */
        System.out.println(rt.availableProcessors());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
    }
}
