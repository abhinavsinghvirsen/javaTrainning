class Lab232 {
    public static void main(String as[]){
        sd:
        for(int i=1;i<5;i++){
            System.out.println(i);
        }
        for(int i=1;i<15;i++){
            if(i == 3)
            System.out.println(i);
            continue sd;
            }
    }
}
