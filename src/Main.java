import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		Pattern pattern = Pattern.compile("<a href=\"([^ ]*)\"[^</>]*>([^</>]*)</a>");

		while (n-- > 0) {
			String string = scanner.nextLine();
			Matcher matcher = pattern.matcher(string);

			while (matcher.find()) {
				System.out.print(matcher.group(1) + ",");
				System.out.println(matcher.group(2));
			}
		}
	}
}
