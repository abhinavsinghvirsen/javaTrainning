public class Lab144 {
    
    public static void main(String[] args) {
        
        int a = 12 ;

        boolean b =  a > 10 && a++ < 5 ;

        System.out.println(a);  // 13

        System.out.println(b);  // false
    }
}
