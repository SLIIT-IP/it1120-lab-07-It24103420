public class IT24103420Lab7Q2B
{
	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++)
		{
			System.out.print(i + " _ ");
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}