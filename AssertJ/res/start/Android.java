// check visibility of view with JUnit
assertEquals(View.GONE, view.getVisibility());

// AssertJ Androids version is much shorter
assertThat(view).isGone();

// AssertJ Android allows to combine checks
assertThat(layout).isVisible()
	.isVertical()
	.hasChildCount(4)
	.hasShowDividers(SHOW_DIVIDERS_MIDDLE);