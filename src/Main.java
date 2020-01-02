import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("((.){3}\\.?){4}$");
		System.out.println(pattern.matcher(input).matches());
	}
}