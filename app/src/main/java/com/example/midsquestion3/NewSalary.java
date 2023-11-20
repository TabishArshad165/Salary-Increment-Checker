package com.example.midsquestion3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewSalary extends AppCompatActivity {
    TextView txt_result;
    Integer increment;
    Integer total, current_salary;
    String salary;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_salary);

        txt_result = findViewById(R.id.txt_result);
        Intent intent = getIntent();
        salary = intent.getStringExtra("salary");

        if (salary != null) {
            current_salary = Integer.parseInt(salary);
            increment = (current_salary * 5) / 100;
            total = increment + current_salary;

            txt_result.setText("Total Salary is: " + total);
        }
    }
}
