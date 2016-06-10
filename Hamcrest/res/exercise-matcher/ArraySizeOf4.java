@Test
public void arrayHasSizeOf4() {
	Integer[] ints = new Integer[] { 7, 5, 12, 16 };

	assertThat(ints, arrayWithSize(4));
}