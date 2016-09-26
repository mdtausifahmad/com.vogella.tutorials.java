// check visibility of view with Junit
assertEquals(View.GONE, view.getVisibility());

// FEST version
assertThat(view.getVisibility()).isEqualTo(View.GONE);

// FEST Androids version is much shorter
assertThat(view).isGone();

# FEST Android allows to combine checks
assertThat(layout).isVisible()
.isVertical()
.hasChildCount(4)
.hasShowDividers(SHOW_DIVIDERS_MIDDLE);