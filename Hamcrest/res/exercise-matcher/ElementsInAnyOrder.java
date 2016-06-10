@Test
public void containsNumbersInAnyOrder() {
	List<Integer> list = Arrays.asList(5, 2, 4);
	
	assertThat(list, containsInAnyOrder(2, 4, 5));
}