package com.example.midsquestion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_salary, edt_exp, edt_des;
    Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_salary = findViewById(R.id.edt_salary);
        edt_exp = findViewById(R.id.edt_exp);
        edt_des = findViewById(R.id.edt_des);
        btn_calculate = findViewById(R.id.btn_clculate);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exp = edt_exp.getText().toString();

                if (!edt_exp.getText().toString().equals("") && !edt_salary.getText().toString().equals("")) {
                    if (Integer.parseInt(exp) >= 2) {
                        Intent intent = new Intent(MainActivity.this, NewSalary.class);
                        intent.putExtra("salary", edt_salary.getText().toString());
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "You are not Eligible for Increment", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please fill all the fields", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
