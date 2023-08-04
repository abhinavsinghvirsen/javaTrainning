class Lab173 {
    public static void main(String as[]){
        int a= 10;
        int b= 20;
        int c= 15;
        int max= 0;
        if(a>b && b>c)
        max = a;
        else if(b>a && b>c)
        max = b;
        else
        max = c;
        System.out.println("Max value is" +max);
    }
}
