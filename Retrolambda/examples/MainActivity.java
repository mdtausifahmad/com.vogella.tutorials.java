package com.vogella.android.retrolambda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button view = (Button) findViewById(R.id.button);
        view.setOnClickListener(e-> Toast.makeText(this,"Hello", Toast.LENGTH_LONG).show());
    }
}
