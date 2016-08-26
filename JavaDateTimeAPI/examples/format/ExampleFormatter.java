import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ExampleFormatter {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
		// use this format to get always two digits for the day
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
		LocalDate date = LocalDate.of(2015, Month.JULY, 1);
		System.out.println(date.format(formatter));
		System.out.println(date.format(f1));
		LocalDate d2 = LocalDate.of(2015, Month.JULY, 15);
		System.out.println(d2.format(formatter));
	}
}
