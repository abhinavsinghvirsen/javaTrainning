package Demo;

public class Student {
	
	private Integer id;
	private String name;
	private Double marks;
	private Integer age;



	public Student(Integer id, String name, Double marks, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getMarks() {
		return marks;
	}



	public void setMarks(Double marks) {
		this.marks = marks;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}

	
	

}
