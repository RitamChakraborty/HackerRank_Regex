import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("(\\w){3}\\W(\\w){10}\\W(\\w){3}");
		System.out.println(pattern.matcher(input).matches());
	}
}
