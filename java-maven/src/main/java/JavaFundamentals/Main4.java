package JavaFundamentals;
import java.util.Scanner;

public class Main4 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two entegers");
		long first = in.nextLong();
		long second = in.nextLong();
		
		long sum = first + second;
		long product = first * second;
		
		System.out.println("The sum of numbers is " + sum);
		System.out.println("The product of numbers is " + product);
	}
}