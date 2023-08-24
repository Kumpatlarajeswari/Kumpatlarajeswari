public class Discount {
	
	public static void main(String[] args) {
	
		System.out.println(" Enter Choice Products");
		int choice;
		int discount;
		int bill=20000 ;

		switch(choice=1)
		{
		case 1: 
			discount=bill*100/10;
			System.out.println("Discount on nuts="+discount);
		
		case 2 :
			discount=bill*100/5;
			System.out.println("Discount on oils="+discount);
	
		case 3:
			discount=bill*100/12;
			System.out.println("Discount on soaps="+discount);
		case 4:
			discount=bill*100/2;
			System.out.println("Discount on Otherproducts="+discount);
			break;
		}
		}
	}

 
