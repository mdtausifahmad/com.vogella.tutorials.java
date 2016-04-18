package com.vogella.java.annotations.repeatable;



public @interface TimeEstimate {
	Duration[] value();
}