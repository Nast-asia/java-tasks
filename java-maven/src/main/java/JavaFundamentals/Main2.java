package JavaFundamentals;
import java.util.Scanner;

public class Main2 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter five numbers or words");
		String first = in.next();
		String second = in.next();
		String third = in.next();
		String fourth = in.next();
		String fifth = in.next();
		System.out.print("Reverse order: " + fifth + ", " + fourth + ", " + third + ", " + second + ", " + first);
	}
}