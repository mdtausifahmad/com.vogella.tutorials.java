@Test
public void arrayContainsNumbersInGivenOrder() {
	Integer[] ints = new Integer[] { 7, 5, 12, 16 };

	assertThat(ints, arrayContaining(7, 5, 12, 16));
}