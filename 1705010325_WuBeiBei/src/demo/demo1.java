package demo;

import java.awt.Font;
import java.math.*;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class demo1 extends JFrame implements ActionListener {

    JButton quit = new JButton("退出");
    JButton Work_Day = new JButton("计算");
    JButton jBWork = new JButton("需求及价格");

    JLabel Addend = new JLabel("年份（Y）：");
    JLabel Augend = new JLabel("每天开发指令数：");
    JLabel Month_Money = new JLabel("平均工资（美元）：");
    JLabel Result = new JLabel("输出工作量（月）");
    JLabel Result1 = new JLabel("输出成本（美元）：");

    TextField fieldAdd = new TextField();
    TextField fieldCount = new TextField();
    TextField Count = new TextField();

    TextField areaResult = new TextField();
    TextField areaResult1 = new TextField();
    Font Ft = new Font("宋体", Font.BOLD, 18);

    public demo1() {
        setTitle("工作量及成本");
        setLayout(null);
        setBounds(500, 400, 600, 500);
        Addend.setBounds(20, 70, 110, 30);
        add(Addend);
        Addend.setFont(Ft);
        fieldAdd.setBounds(210, 70, 140, 30);
        add(fieldAdd);
        fieldAdd.setFont(Ft);

        Augend.setBounds(20, 120, 155, 30);
        add(Augend);
        Augend.setFont(Ft);
        fieldCount.setBounds(210, 120, 140, 30);
        add(fieldCount);
        fieldCount.setFont(Ft);

        Month_Money.setBounds(20, 170, 180, 30);
        add(Month_Money);
        Month_Money.setFont(Ft);
        Count.setBounds(210, 170, 140, 30);
        add(Count);
        Count.setFont(Ft);

        Result.setBounds(20, 220, 170, 30);
        add(Result);
        Result.setFont(Ft);
        areaResult.setBounds(210, 220, 140, 30);
        add(areaResult);
        areaResult.setFont(Ft);

        Result1.setBounds(20, 270, 180, 30);
        add(Result1);
        Result1.setFont(Ft);
        areaResult1.setBounds(210, 270, 140, 30);
        add(areaResult1);
        areaResult1.setFont(Ft);

        Work_Day.setBounds(400, 90, 100, 30);
        add(Work_Day);
        Work_Day.addActionListener(this);
        jBWork.setBounds(400, 170, 100, 30);
        add(jBWork);
        jBWork.addActionListener(this);
//退出
        quit.setBounds(400, 250, 100, 30);
        add(quit);
        quit.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quit) {
            System.exit(0);
        }else if (e.getSource() == jBWork) {
            setVisible(false);
            new demo();
        }
        double  c, x, M, Price;
        int a,b, Work_Time;
        //years
        a = Integer.parseInt(fieldAdd.getText());
        // 一天指令数
        b = Integer.parseInt(fieldCount.getText());
        //平均工资
        c = Double.parseDouble(Count.getText());
        x = 0.28 * (a - 1960);
        M = 4080.0 * Math.exp(x);
        Work_Time = ((int)M) / (b*20);
        Price = Work_Time * c;

        if(e.getSource() == Work_Day) {
            areaResult.setText(String.valueOf((int)Work_Time));
            areaResult1.setText(String.valueOf((int)Price));
        }
    }
}