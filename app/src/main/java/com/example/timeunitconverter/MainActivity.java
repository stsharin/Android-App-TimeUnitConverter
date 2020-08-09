package com.example.timeunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView showResult;
    RadioButton r1, r2,r3, r4,r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.edit_input);
        showResult = findViewById(R.id.edit_show);
        r1 = findViewById(R.id.rd1);
        r2 = findViewById(R.id.rd2);
        r3 = findViewById(R.id.rd3);
        r4 = findViewById(R.id.rd4);
        r5 = findViewById(R.id.rd5);
        r6 = findViewById(R.id.rd6);
        r7 = findViewById(R.id.rd7);
        r8 = findViewById(R.id.rd8);
        r9 = findViewById(R.id.rd9);
        r10 = findViewById(R.id.rd10);
        r11 = findViewById(R.id.rd11);
        r12 = findViewById(R.id.rd12);
        r13 = findViewById(R.id.rd13);
        r14 = findViewById(R.id.rd14);
        r15 = findViewById(R.id.rd15);
        r16 = findViewById(R.id.rd16);
        r17 = findViewById(R.id.rd17);
        r18 = findViewById(R.id.rd18);
        r19 = findViewById(R.id.rd19);
        reset = findViewById(R.id.btn_reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                showResult.setText("");
            }
        });
    }

    public void con(View v){
        try {
            Double value = new Double(input.getText().toString()); // convert to double

            if(r1.isChecked()){
                double result = TimeConverter.sectTomilli(value);
                showResult.setText(new Double(result).toString());
            }

            else if (r2.isChecked()){
                double result = TimeConverter.milliTosec(value);
                showResult.setText(new Double(result).toString());
            }

            else if (r3.isChecked()){
                double result = TimeConverter.micTonano(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r4.isChecked()){
                double result = TimeConverter.nanoTomic(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r5.isChecked()){
                double result = TimeConverter.milliTomint(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r6.isChecked()){
                double result = TimeConverter.mintTomilli(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r7.isChecked()){
                double result = TimeConverter.secTomint(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r8.isChecked()){
                double result = TimeConverter.minTosec(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r9.isChecked()){
                double result = TimeConverter.dayTohour(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r10.isChecked()){
                double result = TimeConverter.dayTomonth(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r11.isChecked()){
                double result = TimeConverter.dayToyear(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r12.isChecked()){
                double result = TimeConverter.monthToday(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r13.isChecked()){
                double result = TimeConverter.monthTohour(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r14.isChecked()){
                double result = TimeConverter.yearTohour(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r15.isChecked()){
                double result = TimeConverter.yearToday(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r16.isChecked()){
                double result = TimeConverter.hourTosec(value);
                showResult.setText(new Double(result).toString());
            }else if (r17.isChecked()){
                double result = TimeConverter.secTohour(value);
                showResult.setText(new Double(result).toString());
            }else if (r18.isChecked()){
                double result = TimeConverter.cenToyear(value);
                showResult.setText(new Double(result).toString());
            }
            else if (r19.isChecked()){
                double result = TimeConverter.yearTocen(value);
                showResult.setText(new Double(result).toString());
            }

        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), "Empty Input", Toast.LENGTH_LONG).show();
        }
    }
}
