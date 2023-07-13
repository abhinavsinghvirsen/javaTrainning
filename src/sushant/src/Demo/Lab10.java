package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lab10 {
public static void main(String arg[]) {
	
	List<Student> list = new ArrayList<Student>();
	list.add(new Student(1,"Ramesh",30.0,22));
	list.add(new Student(2,"Vibin",55.0,25));
	list.add(new Student(3,"Rahul",69.0,32));
	list.add(new Student(4,"Raghu",78.0,18));
	list.add(new Student(5,"Vasanth",32.0,20));
	
	List<Student> stu = list.stream().filter(l->l.getId()%2==0).collect(Collectors.toList());
	System.out.println(stu);
	}
}