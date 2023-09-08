class Object {
int sid;
String sname;
Object(int a,String b){
	sid=a;
	sname=b;
}
}

public class Practice2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob1 = new Object(10, "raji");
		Object ob2 = new Object(10, "vinnu");
		Object ob3 = new Object(10, "akula");
System.out.println(ob1.equals(ob3));
System.out.println(ob1==ob3);
System.out.println(ob2.hashCode());
System.out.println(ob3.toString());
System.out.println(ob1.getClass());



	}

}
