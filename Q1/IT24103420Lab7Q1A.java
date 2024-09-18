import java.util.Scanner;
public class IT24103420Lab7Q1A{
  public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		int subject1,subject2,subject3,subject4;
		double average;
		System.out.print("Enter marks for subject1: ");
		subject1=input.nextInt();
		System.out.print("Enter marks for subject2: ");
		subject2=input.nextInt();
		System.out.print("Enter marks for subject3: ");
		subject3=input.nextInt();
		System.out.print("Enter marks for subject4: ");
		subject4=input.nextInt();
		average=(subject1+subject2+subject3+subject4) /4.0;
		System.out.println("Average Marks: " +average);
		if (average >= 75 && average <=100)
		{
			System.out.println("Grade:Distinction");
		} 
		else if (average >= 50 && average <75)
		{
			System.out.println("Grade: Credit");
		}
		else if (average >=0 && average <50)
		{
			System.out.println("Grade:Fail");
		}
		else {
		   System.out.println("Invaild marks entered.Please check your input.");
		}
	}
}
	
		
		
		