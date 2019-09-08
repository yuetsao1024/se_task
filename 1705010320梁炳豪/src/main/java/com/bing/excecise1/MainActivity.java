package com.bing.excecise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        Button subButton;
        EditText input_year,input_salary,input_instructions;
        RadioGroup radioGroup;
        RadioButton m,p1,p2,cost;
        String option="";
        String result="";
        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化控件
        subButton = findViewById(R.id.submit);
        input_year = findViewById(R.id.input_year);
        input_instructions = findViewById(R.id.input_instruct);
        input_salary = findViewById(R.id.inputs_salary);
        radioGroup = findViewById(R.id.radio_group);
        m =findViewById(R.id.memory);
        p1 =findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        cost =findViewById(R.id.cost);
        textView = findViewById(R.id.result);

        //单选改变时
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.memory: option=m.getText().toString(); break;
                    case R.id.p1:      option=p1.getText().toString();break;
                    case R.id.p2:       option=p2.getText().toString();break;
                    case R.id.cost:        option = cost.getText().toString();break;
                }
            }
        });

        //提交按钮点击时
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year = input_year.getText().toString();
                switch (option){
                    case "计算该年对计算机存储容量的需求":
                        result = year+"年对计算机存储容量的需求估计是"+Math.round(memory(Integer.parseInt(year)))+"字";
                        textView.setText(result);
                    break;
                    case "计算32位计算机该年价格":
                        result = "字长为32位，存储器价格是"+price1(Integer.parseInt(year))+"（美分/位）";
                        textView.setText(result);
                    break;
                    case "计算16位计算机该年价格":
                        result = "字长为16位，存储器价格是"+price2(Integer.parseInt(year))+"（美元/字）";
                        textView.setText(result);
                        break;
                    case "计算装满存储器的成本" :
                        int instrutions,salary;
                        instrutions = Integer.parseInt(input_instructions.getText().toString());
                        salary = Integer.parseInt(input_salary.getText().toString());
                        double temp2 = Math.round((salary/(instrutions*30))*memory(Integer.parseInt(year)));
                        textView.setText("成本为"+temp2+"美元");
                }

            }
        });

    }

    private double memory(int year) {
        return 4080 *(Math.pow(Math.E,0.28*(year-1960)));
    }

    private double price1(int year){
        return 0.3*(Math.pow(0.72,year-1974));
    }

    private double price2(int year){
        return 0.048*(Math.pow(0.72,year-1974));
    }
}
