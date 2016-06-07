package com.vogella.android.testing.mockitocontextmock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TextIntentCreation {

    @Test
    public void testIntentShouldBeCreated() {
        Context context = Mockito.mock(Context.class);
        Intent intent = MainActivity.createQuery(context, "query", "value");
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("query", extras.getString("QUERY"));
        assertEquals("value", extras.getString("VALUE"));
    }
}
