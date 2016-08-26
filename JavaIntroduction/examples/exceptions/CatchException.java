public void fileNotFoundExceptionIsCaughtInside() {
	try {
		createFileReader();
	} catch (FileNotFoundException e) {
		logger.error(e.getMessage(), e);
	}
}

public void fileNotFoundExceptionIsReThrown() throws FileNotFoundException {
	createFileReader();
}

public void createFileReader() throws FileNotFoundException {
	File file = new File("/home/Documents/JavaTraining.txt");

	// creating a new FileReader can cause a FileNotFoundException
	new FileReader(file);
}