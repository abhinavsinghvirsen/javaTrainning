class Helloo0{
    long factorial(int n){
        if(n==0 || n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
}
public class Lab395 {
    public static void main(String args[]){
        Helloo0 h=new Helloo0();
        int n=4;
        long fact=h.factorial(n);
        System.out.println("Factorial is:"+fact);
    }
}
