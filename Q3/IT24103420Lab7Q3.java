import java.util.Scanner;
public class IT24103420Lab7Q3 
{
	public static void main(String[] args)
	{
	  Scanner scanner=new Scanner(System.in);
	  final double DISCOUNT_RATE=0.05;
	  int numCustomers=5;
	  
	  for (int i = 1; i<= numCustomers; i++)
	  {
		  System.out.println("Customer " + i);
		  
		  System.out.print("Enter the total bill amount: ");
		  double billAmount=scanner.nextDouble();
		  
		  System.out.print("Enter paymet mode (C for cash, O for other): ");
		  char paymentMode=scanner.next().charAt(0);
		  
		  if (paymentMode == 'C' || paymentMode == 'c' )
		  {
			  double discount=billAmount * DISCOUNT_RATE;
			  double finalAmount=billAmount - discount;
			  System.out.println("Discount is : $" + discount);
			  System.out.println("Amount to be paid: $" + finalAmount);
		  }
		  else if (paymentMode == 'O' || paymentMode == 'o' )
		  {
			  System.out.println("No discount applicable.");
			  System.out.println("Amount to be paid: $" + billAmount);
		  }
		  else
		  {
			  System.out.println("Payment Mode is not valid.");
		  }
		  
		  System.out.println();
	  }
	}
}	