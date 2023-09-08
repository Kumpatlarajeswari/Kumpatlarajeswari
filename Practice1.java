
class Practice1 {

	public static void main(String[] args) {
	StringBuilder sb1=new StringBuilder("Setter");
	StringBuilder sb2=new StringBuilder("better");
	StringBuilder sb3=new StringBuilder("getter");
	System.out.println(sb1+" "+sb2+" "+sb3);
	System.out.println(sb1.reverse());
	System.out.println(sb2.delete(0,2));
	System.out.println(sb3.append("go"));
	System.out.println(sb2.insert(0,"get" ));
	System.out.println(sb1.length());
	
	StringBuffer ob1=new StringBuffer("Setter");
	StringBuffer ob2=new StringBuffer("better");
	StringBuffer ob3=new StringBuffer("getter");
	System.out.println(ob1+" "+ob2+" "+ob3);
	System.out.println(ob1.reverse());
	System.out.println(ob2.delete(0,2));
	System.out.println(ob3.append("go"));
	System.out.println(ob2.insert(0,"get" ));
	System.out.println(ob1.length());
	}

}





