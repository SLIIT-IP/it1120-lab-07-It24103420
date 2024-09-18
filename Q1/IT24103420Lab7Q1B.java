import java.util.Scanner;
public class IT24103420Lab7Q1B
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		for (int student=1;student<=3;student++)
		{
			System.out.println("Enter marks for student" + student + ": ");
			String[] marksInput=input.nextLine().split(" ");
			
			int subject1=Integer .parseInt(marksInput[0] );
			int subject2=Integer .parseInt(marksInput[1] );
			int subject3=Integer .parseInt(marksInput[2] );
			int subject4=Integer .parseInt(marksInput[3] );
			double average=(subject1+subject2+subject3+subject4)/4.0;
			System.out.println("Average is : " + average);
			if(average>=75 && average <=100)
			{
				System.out.println("Grade:Distinction");
			}
			else if(average >=50 && average <75)
			{
				System.out.println("Grade:Credit");
			}
			else if(average >=0 && average <50)
			{
				System.out.println("Grade:Fail");
			}
			else
			{
				System.out.println("Invaild marks entered for student " + student + ".Please check your input.");
			}
			System.out.println();
		}
	}
}
			