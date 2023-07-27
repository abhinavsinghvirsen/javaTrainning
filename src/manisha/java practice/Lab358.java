public class Lab358 {
    public static void main(String args[]){
        StudentN st=new StudentN();
        st.setAge(-12);
        System.out.println(st.age);
    }
}
class StudentN{
    int age=18;
    void setAge(int age){
        if(age<18)
        return;
        this.age=age;
    }
}
