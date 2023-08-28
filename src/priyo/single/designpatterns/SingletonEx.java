package single.designpatterns ;

public class SingletonEx {

    public static void main(String[] args) {

        School sc = School.getInstance("ssvm") ;

        School sc1 = School.getInstance("BHS") ;

        School sc2 = School.getInstance("ssvm") ;

        System.out.println(sc) ;

        System.out.println(sc1) ;

        System.out.println(sc2) ;


    }
}

class School {

    private static School obj;

    String name;

    private School(String name) {

        this.name = name;
    }

    public static School getInstance(String name) {

        if (null == obj) {

            obj = new School(name);
        }
            return obj;

    }
}