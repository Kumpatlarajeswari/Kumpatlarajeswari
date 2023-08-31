class Stu {

	
		
		int sid;
		String sname;
		int marks;
		void input() {
	 sid = 1;
	 sname = "raji";
	 marks = 10;
		}
		void output() {
			System.out.println(sid+" "+sname+" "+marks);
			
		}

		}
	public class Student{
		public  static void main(String[] args) {
			Stu sc=new Stu();
			sc.input();
			sc.output();

		}
		
	}


