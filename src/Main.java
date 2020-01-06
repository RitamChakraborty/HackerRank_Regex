import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("^([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([a-zA-Z])([aeiouAEIOU])(\\S)\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10$");
		System.out.println(pattern.matcher(input).matches());
	}
}
