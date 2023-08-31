class Person{
	int pid;
	String pname;
Person(){
	pid = 1;
	pname = "raji";
}

}
class Stut extends Person{
int marks;
void main()
{
marks = 60;
System.out.println(pid+" "+pname+" "+marks);
}
}
class Emp extends Person{
	int salary;
	void so()
	{
		salary=67900;
		System.out.println(salary+" "+pname+" "+pid);
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stut obj1=new Stut();
		Emp obj2=new Emp();
		obj1.main();
		obj2.so();
	}

}
