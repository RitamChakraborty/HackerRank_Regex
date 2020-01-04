import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("^[a-z][1-9][^a-z][^A-Z][A-Z].*");
		System.out.println(pattern.matcher(input).matches());
	}
}
