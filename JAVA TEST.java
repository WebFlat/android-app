package com.example.android.yes_no;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.yes_no.R.id.displayMessage;

public class MainActivity extends AppCompatActivity {
    int androidLevel;
    String message;

    public void yes(View view) {
        androidLevel = androidLevel + 1;
        message = "You current android level is " + androidLevel;
        display(message);
    }

    public void sometime(View view) {
        message = "You current android level is " + androidLevel;
        display(message);
    }

    public void no(View view) {
        androidLevel = androidLevel - 1;
        message = "You current android level is " + androidLevel;
        display(message);
    }

    private void display(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.displayMessage);
        priceTextView.setText(message);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
