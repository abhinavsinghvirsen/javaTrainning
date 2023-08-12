package abhinav.cloning;

public class Reverse {

    public static void main(String[] args) {

        int num=121;

        int clone=num;

        int revNum=0;

        while(num!=0){

            int digit=num%10;
            revNum=revNum*10+digit;
            System.out.println(num);
            num=num/10;



        }

        System.out.println(revNum);
        if(clone==revNum){
            System.out.println("palindroum");
        }
    }
}
