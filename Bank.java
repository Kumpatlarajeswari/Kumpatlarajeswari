class Bankdemo{
	 int anum;
	 String aname;
	 String atype;
	 Bankdemo(){
		 anum = 9121952;
		 aname = "raji";
		 atype = "savings";
		 
	 }
	 Bankdemo(int a,String b, String c)
	 {
		 anum = a;
		 aname = b;
		 atype = c;
	 }
	void main()
	{
		System.out.println(anum+" "+aname+" "+atype);
	}
		
		
		 
		 
 }	 
public class Bank{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankdemo b1=new Bankdemo();
		Bankdemo b2=new Bankdemo(6,"raji","Currentacount");
		b1.main();
		b2.main();
		
	}

}
