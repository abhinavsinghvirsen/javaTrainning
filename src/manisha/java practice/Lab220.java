class Lab220 {
    public static void main(String as[]){
        for(int i=1;i<=5;i++){
            System.out.println("\n"+i);
            for(int j=1;j<=5;j++,System.out.print("J++")){
            if(i == 3) break;
            System.out.print("JLC"+j);
            }
        }
    } 
}
