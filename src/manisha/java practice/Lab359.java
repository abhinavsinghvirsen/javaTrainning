public class Lab359 {
    public static void main(String args[]){
        StudentO st=new StudentO();
        st.setAge(-12);
        System.out.println(st.age);
    }
}
class StudentO{
    int age=18;
    void setAge(int age){
        if(age<18)
        return 0;
        this.age=age;
    }
}
