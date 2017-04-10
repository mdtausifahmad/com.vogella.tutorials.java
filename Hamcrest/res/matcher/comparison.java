// JUnit 4 for equals check
assertEquals(expected, actual);
// Hamcrest for equals check
assertThat(actual, is(equalTo(expected)));

// JUnit 4 for not equals check
assertNotEquals(expected, actual)
// Hamcrest for not equals check
assertThat(actual, is(not(equalTo(expected))));