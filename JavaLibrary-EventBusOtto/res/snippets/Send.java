// post a string object
bus.post("Hello");

// example data to post
public class TestData {
	public String message;
}

// post this data 
bus.post(new TestData().message="Hello from the activity");
