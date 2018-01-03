package com.app.UI.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myfristapp.R;

import java.util.Locale;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
/*        super.onCreate(savedInstanceState);
        Button myButton = new Button(this);
        myButton.setText("special");
        ConstraintLayout layout = new ConstraintLayout(this);
        layout.addView(myButton);
        setContentView(layout);*/
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();


            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_display_message);

            // Get the Intent that started this activity and extract the string
            Intent intent = getIntent();
            String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

            // Capture the layout's TextView and set the string as its text
            TextView textView = findViewById(R.id.textView);
            textView.setText(message);
        }








    }
