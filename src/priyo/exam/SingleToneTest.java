package java360.exam;

public class SingleToneTest {

    public static void main(String[] args) {

        Car bmw = Car.getCar("BMW X5") ;

        Car audi = Car.getCar("AUDI Q3") ;

        Car bmw1 = Car.getCar("BMW X3") ;

        System.out.println(bmw) ;

        System.out.println(audi) ;

        System.out.println(bmw1) ;
    }
}

class Car {

    private static Car car ;

    String car_Name ;

    private Car( String car_Name ) {

        this.car_Name = car_Name ;
    }

    public static Car getCar(String name) {

        if(null == car) {

            car = new Car(name) ;
        }

        return car ;
    }
}
