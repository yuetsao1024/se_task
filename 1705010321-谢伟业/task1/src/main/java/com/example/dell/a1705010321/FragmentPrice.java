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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class FragmentPrice extends Fragment implements View.OnClickListener{
    private Context context;
    private View view;
    private TextView tv_price_result,tv_price,tv_16_price;
    private EditText et_price_year,et_price_bit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        context = getActivity();
        view = LayoutInflater.from(context).inflate(R.layout.frag_price,container,false);
        init();
        return view;
    }

    private void init(){
        tv_price = view.findViewById(R.id.tv_price);
        tv_price_result = view.findViewById(R.id.tv_price_result);
        tv_16_price = view.findViewById(R.id.tv_16_price);

        SpannableString m2 = new SpannableString("P1 = 0.3 * 0.72Y-1974（美分/位）");
        m2.setSpan(new RelativeSizeSpan(0.7f), 15, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小
        m2.setSpan(new SuperscriptSpan(), 15, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);   //上标
        m2.setSpan(new RelativeSizeSpan(0.7f), 1, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小
        m2.setSpan(new SubscriptSpan(), 1, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);   //下标
        m2.setSpan(new RelativeSizeSpan(0.7f), 21, m2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小

        SpannableString m3 = new SpannableString("P2=0.048 * 0.72Y-1974（美元/字）");
        m3.setSpan(new RelativeSizeSpan(0.7f), 15, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小
        m3.setSpan(new SuperscriptSpan(), 15, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);   //上标
        m3.setSpan(new RelativeSizeSpan(0.7f), 1, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小
        m3.setSpan(new SubscriptSpan(), 1, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);   //下标
        m3.setSpan(new RelativeSizeSpan(0.7f), 21, m3.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//一半大小

        tv_price.setText(m2);
        tv_16_price.setText(m3);

        et_price_year = view.findViewById(R.id.et_price_year);
        et_price_bit = view.findViewById(R.id.et_price_bit);
        //清空
        Button btn_clear = view.findViewById(R.id.btn_price_clear);
        btn_clear.setOnClickListener(this);
        //计算
        Button btn_sure = view.findViewById(R.id.btn_price_sure);
        btn_sure.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_price_sure){
            String year = et_price_year.getText().toString();
            String bits = et_price_bit.getText().toString();
            if(year.equals("")){
                Toast.makeText(context,"请先输入年份！",Toast.LENGTH_SHORT).show();
            }else if(bits.equals("")){
                Toast.makeText(context,"请先输入字长数！",Toast.LENGTH_SHORT).show();
            }else{
                DecimalFormat fnum = new DecimalFormat("#0.0000");
                Double result = Integer.valueOf(bits) * 0.3 * 0.01 * Math.pow(0.72 ,Integer.valueOf(year)-1974);
                tv_price_result.setText(fnum.format(result)+"（美元/字）");
            }
        }else if(v.getId() == R.id.btn_price_clear){
            et_price_year.setText("");
            et_price_bit.setText("");
            tv_price_result.setText("");
        }
    }
}
