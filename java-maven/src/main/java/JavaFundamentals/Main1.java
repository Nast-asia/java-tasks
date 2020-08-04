package JavaFundamentals;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.next();
		System.out.println("Hello, " + name);
	}
}