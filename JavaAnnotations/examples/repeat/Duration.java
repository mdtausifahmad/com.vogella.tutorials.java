package com.vogella.java.annotations.repeatable;

import java.lang.annotation.Repeatable;

@Repeatable(TimeEstimate.class)
public @interface Duration {
	int hour() default 1;
}
