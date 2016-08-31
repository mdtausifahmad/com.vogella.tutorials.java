public void causeANullPointerException() {
	String thisStringIsNull = getMessage(false);
	
	// because the thisStringIsNull object is null
	// this will cause a NullPointerException
	thisStringIsNull.toLowerCase();
}

public String getMessage(boolean messageIsAvailable) {
	if(messageIsAvailable) {
		return message;
	}
	
	return null;
}