package abhinav;

public class VarArgsExample {


    public static void main(String... args) {


        VarArgsExample ob= new VarArgsExample();
        ob.sum(new int[]{1,2});
        ob.sum(3,4);
        ob.sum(3,4);
        ob.area(4);
        ob.area(4,5);

        ob.sum("n","c","d","f");
    }




      void area(int ... args){

        if(args.length==1){

           double sum=3.14*args[0]*args[0];
            System.out.println(sum);

        }

          if(args.length==2){

              double sum=args[0]*args[1];
              System.out.println(sum);

          }


      }




    void sum(int ...args){
        int sum=0;
        for(int a:args){
            sum+=a;

        }
        System.out.println(sum);

    }




    void sum(String ...args){


    }



    
}
