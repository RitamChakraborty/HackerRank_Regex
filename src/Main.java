import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("^((tactac)+tic)+(tac|(tac)+tic)*$");
		System.out.println(pattern.matcher(input).matches());
	}
}
