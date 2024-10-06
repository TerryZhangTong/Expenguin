package com.example.expenguin;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.util.Log;

public class SomeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    public void handleText(View v) {
        TextView t = findViewById(R.id.source);
        String input = t.getText().toString();

        Log.d("info", input);
    }

}
