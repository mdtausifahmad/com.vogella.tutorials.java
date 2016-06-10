@Test
public void hasSizeOf3() {
	List<Integer> list = Arrays.asList(5, 2, 4);
	
	assertThat(list, hasSize(3));
}