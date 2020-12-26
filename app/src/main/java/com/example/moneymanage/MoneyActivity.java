package com.example.moneymanage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

public class MoneyActivity extends AppCompatActivity {
    TextView monthly_input;
    TextView yearly_calculated_view;
    TextView daily_calculated_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        monthly_input = (TextView) findViewById(R.id.monthlyIncomeInput);
        yearly_calculated_view = (TextView) findViewById(R.id.yearly_calculate_view);
        daily_calculated_view = (TextView) findViewById(R.id.daily_calculated_view);
        setYearlyIncome();
    }

    protected void setYearlyIncome(){
        monthly_input.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                System.out.println(s + "nothing");
                if(s.length() != 0) {
                    System.out.println("yahahah" + s);
                    int input_number = Integer.parseInt(s.toString());
                    int yearly_calculated = input_number * 12;
                    float daily_calculated = input_number/22;

                    yearly_calculated_view.setText(Integer.toString(yearly_calculated));
                    daily_calculated_view.setText(Float.toString(daily_calculated));
                }
                else {
                    yearly_calculated_view.setText("0");
                    daily_calculated_view.setText("0.0");
                }

            }
        });
    }
}