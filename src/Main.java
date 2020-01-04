import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("^[^0-9][^aeiou][^bcDF][\\S][^AEIOU][^.,]$");
		System.out.println(pattern.matcher(input).matches());
	}
}
