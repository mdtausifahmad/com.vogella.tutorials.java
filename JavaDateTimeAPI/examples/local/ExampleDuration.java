import java.time.Duration;

public class ExampleDuration {
public static void main(String[] args) {
	// define a duration of 5 hours
	Duration duration = Duration.ofHours(5);
	// add 20 minutes
	Duration plusMinutes = duration.plusMinutes(20);
}
}
