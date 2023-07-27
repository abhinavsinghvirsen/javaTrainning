public class Lab373 {
    public static void main(String args[]){
        Hello35 h=new Hello35();
        System.out.println(h.isDigit('A'));
        System.out.println(h.isDigit('8'));
    }
}
class Hello35{
    boolean isDigit(char ch){
        System.out.println("isDigit():"+ch);
        if(ch>=48 && ch<=57)
            return true;
        else
            return false;
            
    }
}
