package abhinav.exceptionHandling;

import javax.lang.model.type.ArrayType;

public class TryCatchSyntx {

    public static void main(String[] args) {



      /*  try{


        }catch (Exception obj){


        }


        */


       try{


        }finally {

           try{


           }catch(Exception cv){


           }

        }

        try{

            try{


            }catch (Exception obj){

            }


        }catch (NullPointerException obj){

            try{

            }catch(Exception objc){


            }

        }catch(Exception r){


        }



        try{


        }catch (NullPointerException | ArithmeticException e){


        }


    }
}
