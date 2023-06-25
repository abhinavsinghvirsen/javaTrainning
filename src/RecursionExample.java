

public class RecursionExample {
    public static void main(String[] args) {


        // 0 1 1 2 3 5 8 13 21 34
        for(int i=0;i<10;i++){

            int result =fibo(i);
            System.out.println(result);
        }



    }

    public static int fact(int num){

        //base condition
        if(num==0){
            return 1;
        }else{
            // System.out.println(num);
            return   num * fact(num-1);

        }

    }

    public static int fibo(int num){

        //base  case //to break recursiv

        if(num<=1){
            return num;
        }else{
            // System.out.println(num);
            return fibo(num-1) +  fibo(num-2);
        }

    }


}
