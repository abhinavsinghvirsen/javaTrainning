package Demo;

public class Lab343 {
	public static void main(String arg[]) {
		Studentcbb stu1=new Studentcbb(88,"Srinivas"); 
		stu1.show();
		Studentcbb stu2=new Studentcbb(99,"Dande"); 
			stu2.show();
		
		}
			}
			class Studentcbb{
				int sid; String sname;
				Studentcbb(int sid,String sname){
					System.out.println("Student 2-Arg constructor");
					this.sid=sid;
					this.sname=sname;
				}
				void show() {
					System.out.println(sid+"\t"+sname);
				}
			}
		
		

