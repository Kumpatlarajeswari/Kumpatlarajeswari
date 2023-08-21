import java.util.Scanner;

public class Employeesalary {

	public static void main(String[] args) {
	int salary;
	double da,hra,pf,gross;
	System.out.println(" Employee Total salary");
	Scanner sc = new Scanner (System.in);
	salary =sc.nextInt();
	da=salary*12/100;
	hra=salary*13/100;
	pf=salary*15/100;
	System.out.println("Employee salary");
	gross=salary+da+hra+pf;
	System.out.println("employee salary==" +salary+" "+da+" "+hra+" "+pf);

	}

}
