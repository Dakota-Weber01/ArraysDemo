package Arrays.Controller;
import java.util.Scanner;
public class ArrayController
{
	private String [] words = {"One", "Two", "Three", "Four"};
	private int [] numbers;
	
	public ArrayController()
	{
		words = new String[5];
		numbers = new int [5];
	}
	public void start()
	{
		//yuh
		System.out.println(numbers);
		System.out.println(words);
		
		words[0] = "Neccessary";
		words[1] = "Evil";
		words[2] = "By";
		words[3] = "Token";
		words[4] = "Genre: Hip Hop";
		
			System.out.println(words[0]);
			System.out.println(words[1]);
			System.out.println(words[2]);
		
			for (String current : words)
			{
				System.out.println(current);
			}
			for (int index = 0; index < numbers.length; index =+ 1)
			{
				System.out.println(numbers[index]);
			}
	}
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
	}
}