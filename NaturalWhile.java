import java.util.Scanner;

public class NaturalWhile {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i = 1;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		while(i <= number)
		{
			System.out.print(i +"\t"); 
			i++;
		}	
	}
}