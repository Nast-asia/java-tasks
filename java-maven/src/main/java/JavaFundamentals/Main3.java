package JavaFundamentals;
import java.util.Scanner;
import java.util.Random;

public class Main3 {
	public static void main (String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you want to see?");
		int arrayLength = in.nextInt();
		
		int[] arrayWith = new int [arrayLength];
		System.out.println("With line break:");
		for (int i = 0; i < arrayWith.length; i++) {
			arrayWith[i] = rand.nextInt(999);
			System.out.println(arrayWith[i]);
		} // with line break
		
		System.out.println("Without line break:");
		for (int i = 0; i < arrayWith.length; i++) {
			arrayWith[i] = rand.nextInt(999);
			System.out.print(arrayWith[i] + " ");
		} // without line break
	}
}