public class Lab372 {
    public static void main(String args[]){
        Hello34 h=new Hello34();
        System.out.println(h.isDigit('A'));
        System.out.println(h.isDigit('8'));
    }
}
class Hello34{
    boolean isDigit(char ch){
        System.out.println("isDigit():"+ch);
        boolean b=ch>=48 && ch<=57;
        return b;
    }
}
