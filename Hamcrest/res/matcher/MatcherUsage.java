assertThat(Long.valueOf(1), instanceOf(Integer.class));
// shortcut for instanceOf
assertThat(Long.valueOf(1), isA(Integer.class));