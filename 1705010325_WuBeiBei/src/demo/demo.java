package demo;

import java.awt.Font;
import java.math.BigInteger;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class demo extends JFrame implements ActionListener {
    JButton Price_1 = new JButton("计算");
    JButton quit = new JButton("退出");
    JButton jBWork = new JButton("成本");

    JLabel Addend = new JLabel("年份（Y）：");
    JLabel Bites = new JLabel("字长位数");
    JLabel Result = new JLabel("容量需求（字）：");
    JLabel Result1 = new JLabel("价格（美元）：");

    TextField fieldAdd = new TextField();
    TextField fieldB = new TextField();

    TextField areaResult = new TextField();
    TextField areaResult1 = new TextField();
    public demo() {
        setTitle("容量需求及价格");

        setLayout(null);
        setBounds(500, 400, 500, 400);
        Addend.setBounds(20, 70, 110, 30);
        add(Addend);
        fieldAdd.setBounds(180, 70, 140, 30);
        add(fieldAdd);
        Bites.setBounds(20, 120, 110, 30);
        add(Bites);
        fieldB.setBounds(180, 120, 140, 30);
        add(fieldB);
        Result.setBounds(20, 170, 100, 30);
        add(Result);
        Result1.setBounds(20, 220, 100, 30);
        add(Result1);
        areaResult.setBounds(180, 170, 140, 30);
        add(areaResult);
        areaResult1.setBounds(180, 220, 140, 30);
        add(areaResult1);

        Price_1.setBounds(350, 90, 100, 30);
        add(Price_1);
        Price_1.addActionListener(this);
        jBWork.setBounds(350, 170, 100, 30);
        add(jBWork);
        jBWork.addActionListener(this);
//退出
        quit.setBounds(350, 250, 100, 30);
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
            new demo1();
        }
        double x, y, M;
        int a, b;
        if(!fieldAdd.getText().isEmpty() && !fieldB.getText().isEmpty()){
            a = Integer.parseInt(fieldAdd.getText());
            b = Integer.parseInt(fieldB.getText());
            x = 0.28 * (a - 1960);
            y = a - 1974;
            M = 4080.0 * Math.exp(x);
            if (e.getSource() == Price_1) {
                areaResult.setText(String.valueOf((int)M));
                areaResult1.setText(String.valueOf((int)(0.003 * b *Math.pow(0.72, y) * M)));
            }
        }else{
            a = Integer.parseInt(fieldAdd.getText());
            x = 0.28 * (a - 1960);
            y = a - 1974;
            M = 4080.0 * Math.exp(x);
            if (e.getSource() == Price_1) {
                areaResult.setText(String.valueOf((int)M));
            }
        }
    }
    public static void main(String args[]) {
        new demo();
    }
}