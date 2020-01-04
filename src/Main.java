import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("^[1-3][0-2][xs0][30aA][xsu][.,]$");
		System.out.println(pattern.matcher(input).matches());
	}
}
