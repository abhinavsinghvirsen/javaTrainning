public class Lab185 {
    
    public static void main(String[] args) {
        
        char ch = 'A' ;

        if(ch >= 65 && ch <= 90) {

            switch(ch) {

                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' :
                case 'U' :
                         System.out.println("Character is Vowel") ; // print
                         break ;
                default :        
                         System.out.println("Character is consonant") ; 
            }
        } else {
            System.out.println("invalid Alphabet");
        }
    }
}
