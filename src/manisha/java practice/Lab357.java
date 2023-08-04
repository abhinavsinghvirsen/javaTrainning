public class Lab357 {
    public static void main(String args[]){
        StudentL st=new StudentL();
        st.setAge(-12);
        System.out.println(st.age);
    }
}
class StudentL{
    int age;
    void setAge(int age){
        this.age=age;
    }
}
