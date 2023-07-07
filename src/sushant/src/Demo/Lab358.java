package Demo;

public class Lab358 {
	public static void main(String arg[]) {
		Student1qqq st=new Student1qqq();
		st.setAge(-12);
		System.out.println(st.age);
	}
	}
	class Student1qqq{
		int age=18;
		void setAge(int age) {
			if(age<18)
				return;
			this.age=age;
			
			
		}
	}



