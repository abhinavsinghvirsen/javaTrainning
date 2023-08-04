public class Employee extends Person {

    @Override
    void walking() {
        System.out.println("employee-> walking()");
    }

    static void sleeping() {
        System.out.println("employee->sleeping()");
    }

    void working() {
        System.out.println("employee -> working()") ;
    }
}
