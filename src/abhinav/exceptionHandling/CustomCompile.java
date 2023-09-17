package abhinav.exceptionHandling;


//checked
public class CustomCompile extends Exception{

    public CustomCompile(String message) {
        super(message);
    }
}

class CustomRuntime extends RuntimeException{

    public CustomRuntime(String s) {
        super(s);
    }

    public String getMessage(){

        return "because of wrong dancer name";
    }


}
