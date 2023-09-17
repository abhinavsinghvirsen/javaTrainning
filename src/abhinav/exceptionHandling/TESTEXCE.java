package abhinav.exceptionHandling;

import java.io.IOException;

public class TESTEXCE {

    public static void main(String[] args)  {

        try{
       String val = checking(2);
            System.out.println(val);
        }catch(Exception e){
            e.printStackTrace();
            if(e instanceof CustomRuntime){
                System.out.println("please enter madhuri    "+e.getMessage());

            }



        }






}

    public static void dancing(String name) throws CustomCompile {

        if(name.equalsIgnoreCase("madhuri")){

            System.out.println("good dancer");
        }else{

            throw new CustomCompile("not good dancer exception");

        }



    }



    public static String   checking(int roll) throws CustomCompile {

        if(roll==1){
            return "abhinav";

        }else{
            throw new CustomCompile("not good dancer exception");

        }



    }


}
