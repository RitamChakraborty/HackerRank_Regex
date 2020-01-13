import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("(.)(?!\\1)");
		Matcher matcher = pattern.matcher(input);
		int count = 0;
		
		while (matcher.find()) {
			++count;
		}
		
		System.out.println("Number of matches : " + count);
	}
}
