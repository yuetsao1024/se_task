package com.example.dell.a1705010321;

import android.content.Context;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class FragmentCost extends Fragment implements View.OnClickListener{

    private Context context;
    private View view;
    private TextView tv_cost_result,tv_cost,tv_16_cost;
    private EditText et_cost_year,et_cost_bit,et_cost_number,et_cost_money;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        context = getActivity();
        view = LayoutInflater.from(context).inflate(R.layout.frag_cost,container,false);
        init();
        return view;
    }

    private void init(){
        tv_cost = view.findViewById(R.id.tv_cost);
        tv_cost_result = view.findViewById(R.id.tv_cost_result);
        tv_16_cost = view.findViewById(R.id.tv_16_cost);

        SpannableString m2 = new SpannableString("M = 4080e0.28(Y-1960)");
        m2.setSpan(new RelativeSizeSpan(0.7f), 9, m2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小
        m2.setSpan(new SuperscriptSpan(), 9, m2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);   //上标

        SpannableString m3 = new SpannableString("P2=0.048 * 0.72Y-1974（美元/字）");
        m3.setSpan(new RelativeSizeSpan(0.7f), 15, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小
        m3.setSpan(new SuperscriptSpan(), 15, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);   //上标
        m3.setSpan(new RelativeSizeSpan(0.7f), 1, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小
        m3.setSpan(new SubscriptSpan(), 1, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);   //下标
        m3.setSpan(new RelativeSizeSpan(0.7f), 21, m3.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小

        tv_cost.setText(m2);
        tv_16_cost.setText(m3);

        et_cost_year = view.findViewById(R.id.et_cost_year);
        et_cost_bit = view.findViewById(R.id.et_cost_bit);
        et_cost_number = view.findViewById(R.id.et_cost_number);
        et_cost_money = view.findViewById(R.id.et_cost_money);
        //清空
        Button btn_clear = view.findViewById(R.id.btn_cost_clear);
        btn_clear.setOnClickListener(this);
        //计算
        Button btn_sure = view.findViewById(R.id.btn_cost_sure);
        btn_sure.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_cost_sure){
            String year = et_cost_year.getText().toString();
            String bits = et_cost_bit.getText().toString();
            String number = et_cost_number.getText().toString();
            String money = et_cost_money.getText().toString();
            if(year.equals("")){
                Toast.makeText(context,"请先输入年份！",Toast.LENGTH_SHORT).show();
            }else if(bits.equals("")){
                Toast.makeText(context,"请先输入字长数！",Toast.LENGTH_SHORT).show();
            }else if(number.equals("")){
                Toast.makeText(context,"请先输入每天可开发指令数！",Toast.LENGTH_SHORT).show();
            }else if(money.equals("")){
                Toast.makeText(context,"请先输入每月平均工资！",Toast.LENGTH_SHORT).show();
            }else{
                //当前年份存储器容量
                Double capacityResult = 4080 * Math.pow(Math.E ,0.28 * (Integer.valueOf(year)-1960));

                DecimalFormat fnum = new DecimalFormat("#0.0000");
                Double result = (capacityResult / (10*24)) * Integer.valueOf(money);
                tv_cost_result.setText(fnum.format(result)+"（美元）");
            }
        }else if(v.getId() == R.id.btn_cost_clear){
            et_cost_year.setText("");
            et_cost_bit.setText("");
            tv_cost_result.setText("");
            et_cost_number.setText("");
            et_cost_money.setText("");
        }
    }
}
