@Test
public void everyItemGreaterThan1() {
	List<Integer> list = Arrays.asList(5, 2, 4);
	
	assertThat(list, everyItem(greaterThan(1)));
}