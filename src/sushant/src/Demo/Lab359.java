package Demo;

public class Lab359 {
	public static void main(String arg[]) {
		Student1qqqq st=new Student1qqqq();
		st.setAge(-12);
		System.out.println(st.age);
	}
	}
	class Student1qqqq{
		int age=18;
		void setAge(int age) {
			if(age<18)
				return 0;
			this.age=age;
			
			
		}
	}


