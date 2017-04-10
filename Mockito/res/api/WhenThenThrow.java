Properties properties = mock(Properties.class);

when(properties.get(”Anddroid”)).thenThrow(new IllegalArgumentException(...));

try {
	properties.get(”Anddroid”);
	fail(”Anddroid is misspelled”);
} catch (IllegalArgumentException ex) {
	// good!
}