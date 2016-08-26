import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class ExampleLocalDateandTimeCreation {
	public static void main(String[] args) {
		// The current date and time
		LocalDateTime dateTime = LocalDateTime.now();
		// from values
		LocalDate d1 = LocalDate.of(2015, Month.JULY, 13);

		// construct time object based on hours and minutes
		LocalTime t1 = LocalTime.of(17, 18);
		// create time object based on a String
		LocalTime t2 = LocalTime.parse("10:15:30");

		// Get the time or date from LocalDateTime
		LocalDate date = dateTime.toLocalDate();
		Month month = dateTime.getMonth();
		int day = dateTime.getDayOfMonth();
		int minute = dateTime.getMinute();
		
		
		// Perform operations on these objects will always return a new object
		// as these objects are immutable
		
		LocalDateTime updatedDate = dateTime.withDayOfMonth(13).withYear(2015);
		LocalDateTime plusYears = updatedDate.plusDays(25).plusYears(2);
		
		// the API also allow to use Adjusters for the API,
		// for example the following will set the day to the last day in the monthd
		LocalDateTime newDate = dateTime.with(TemporalAdjusters.lastDayOfMonth());
		
		// You can also truncate certain time units, e.g., remove the seconds from a time 
		// object
		LocalTime truncatedSeconds = t2.truncatedTo(ChronoUnit.SECONDS);
	}
}
