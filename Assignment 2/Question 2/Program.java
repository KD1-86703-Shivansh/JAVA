import java.util.Scanner;

public class Program {
	
	public static int main() {
		   System.out.println("Menu: ");
		   System.out.println("1.Dosa\n2.Samosa\n3.Idli\n4.Vadapav\n5.udidwada\n6.Poha\n7.Misalpav\n8.Mataki\n9.Tea\n10.GenerateBill");
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt(); 
		   return n;  
	   }
	   public static void main(String[] args) {
		   
		   Scanner sc=new Scanner(System.in);
		   int choice=0;
		   int totalOrder=0;
		   while((choice=main())!=0) {
			   int q;
			   switch(choice) {
			   case 1: System.out.println("Enter Quantity : ");
			           q=sc.nextInt();
				       totalOrder+=q*30; 
			   break;
			   case 2: System.out.println("Enter Quantity : ");
		               q=sc.nextInt();
				       totalOrder+=q*15; 
			   break;
			   case 3: System.out.println("Enter Quantity : ");
		               q=sc.nextInt();
				       totalOrder+=q*30; 
			   break;
			   case 4:System.out.println("Enter Quantity : ");
		              q=sc.nextInt();
				      totalOrder+=q*15; 
			   break;
			   case 5: System.out.println("Enter Quantity : ");
		               q=sc.nextInt();
				       totalOrder+=q*15; 
			   break;
			   case 6:System.out.println("Enter Quantity : ");
		              q=sc.nextInt();
				      totalOrder+=q*20; 
			   break;
			   case 7: System.out.println("Enter Quantity : ");
		               q=sc.nextInt();
				      totalOrder+=q*35; 
			   break;
			   case 8: System.out.println("Enter Quantity : ");
		               q=sc.nextInt();
				       totalOrder+=q*15; 
			   break;
			   case 9: System.out.println("Enter Quantity : ");
		               q=sc.nextInt();
				       totalOrder+=q*10; 
			   break;
			   case 10: System.out.println("Total order is : "+ totalOrder);
			   System.out.println("Thank you for visiting us!");
			   System.exit(choice);
			   }    
		   } 
	   }
}
