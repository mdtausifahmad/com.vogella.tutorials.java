package com.vogella.android.testing.applicationtest;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestCustomMatcher {

    @Test
    public void testRegularExpressionMatcher() throws Exception {
        String s ="aaabbbaaaa";
        assertThat(s, RegexMatcher.matchesRegex("a*b*a*"));
    }

}