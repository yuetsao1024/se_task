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


public class FragmentCapacity extends Fragment implements View.OnClickListener{

    private Context context;
    private View view;
    private TextView tv_result,tv_capactity;
    private EditText et_year;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        context = getActivity();
        view = LayoutInflater.from(context).inflate(R.layout.frag_capacity,container,false);
        init();
        return view;
    }


    private void init(){
        tv_capactity = view.findViewById(R.id.tv_capacity);
        tv_result = view.findViewById(R.id.tv_result);
        SpannableString m2 = new SpannableString("M = 4080e0.28(Y-1960)");
        m2.setSpan(new RelativeSizeSpan(0.7f), 9, m2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小
        m2.setSpan(new SuperscriptSpan(), 9, m2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);   //上标

        tv_capactity.setText(m2);

        et_year = view.findViewById(R.id.et_year);
        //清空
        Button btn_clear = view.findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);
        //计算
        Button btn_sure = view.findViewById(R.id.btn_sure);
        btn_sure.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_sure){
            String year = et_year.getText().toString();
            Log.i("FragmentCapacity","计算");
            if(year.equals("")){
                Toast.makeText(context,"请先输入年份！",Toast.LENGTH_SHORT).show();
            }else{
                DecimalFormat fnum = new DecimalFormat("#0.00");
                Double result = 4080 * Math.pow(Math.E ,0.28 * (Integer.valueOf(year)-1960));
                tv_result.setText(fnum.format(result));
            }
        }else if(v.getId() == R.id.btn_clear){
            Log.i("FragmentCapacity","清空");
            et_year.setText("");
            tv_result.setText("");
        }
    }
}
