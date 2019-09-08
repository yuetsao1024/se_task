package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Button myButton1;
    private Button myButton2;

    private EditText editText1;

    private RadioGroup radioGroup2;
    private RadioButton radioButton2;

    private EditText editText3;
    private EditText editText4;

    private EditText editText5;
    private EditText editText6;
    private EditText editText7;

    private static int wei = 16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton1 = findViewById(R.id.button1);
        myButton2 = findViewById(R.id.button2);

        editText1 = findViewById(R.id.edit1);

        radioGroup2 = findViewById(R.id.rdg);

        editText3 = findViewById(R.id.edit3);
        editText4 = findViewById(R.id.edit4);

        editText5 = findViewById(R.id.edit5);
        editText6 = findViewById(R.id.edit6);
        editText7 = findViewById(R.id.edit7);

        myButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int year = Integer.parseInt(editText1.getText().toString());

                int number = Integer.parseInt(editText3.getText().toString());
                int salary = Integer.parseInt(editText4.getText().toString());

                long need = f(year);
                double price = f1(year, wei);
                double money = f2(year, number, salary);

                editText5.setText(String.format("%d", need));
                editText6.setText(String.format("%.2f", price));
                editText7.setText(String.format("%.2f", money));

            }
        });

        myButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText1.setText("");

                editText3.setText("");
                editText4.setText("");

                editText5.setText("");
                editText6.setText("");
                editText7.setText("");
            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rbt1: wei = 16; break;
                    case R.id.rbt2: wei = 32; break;
                    case R.id.rbt3: wei = 64; break;
                    default:break;

                }
            }
        });
    }

    public static  long f(int year){
        double m = 4080*Math.pow( Math.E, 0.28*(year - 1960) );
        return (long) m;
    }

    public static  double f1(int year, int wei){
        double p = 0.0;
        if( wei == 16 ){
            p = 0.048*Math.pow(0.72, year - 1974)*f(year);
        }
        else{
            p = 0.003*Math.pow(0.72, year - 1974)*f(year)*wei;
        }
        return p;
    }

    public static  double f2(int year, int number, int salary){
        double p = 0.0;
        p = salary*f(year) / (20.0*number);

        return p;
    }

}
