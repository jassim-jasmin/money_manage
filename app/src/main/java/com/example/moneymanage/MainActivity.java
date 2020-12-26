package com.example.moneymanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView welcomTextView = (TextView) findViewById(R.id.welcome_text);
        welcomTextView.setOnClickListener(this);
        System.out.println("hello sir");
    }
    private void openMoneyActivity() {
        Intent INT = new Intent(MainActivity.this, MoneyActivity.class);
        INT.putExtra("hi", "Hai");
        startActivity(INT);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.welcome_text) {
            System.out.println("clicked");
            openMoneyActivity();
        }
        else{
            System.out.println("Cannot find the id");
        }
    }
}