import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("^[02468a-zA-Z]{40}[13579\\s]{5}$");
		System.out.println(pattern.matcher(input).matches());
	}
}
