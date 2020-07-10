package com.liao.test02;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * TODO: 油价计算器窗口
 *
 * @author LiAo
 * @date 2020/7/9 14:54
 */
public class Printer  extends JFrame implements ActionListener {
    // 上次加油数
    public JLabel lastTime = new JLabel("上次加油钱数（元）");

    // 汽车跑的公里数
    public JLabel kilometers = new JLabel("汽车跑公里数");

    // 汽油价格
    public JLabel gasolinePrice = new JLabel("汽油的价格");

    // 油耗
    public JLabel fuelConsumption = new JLabel("百公里油耗（升）");

    // 计算按钮
    public JButton calculation = new JButton("计算");

    // 上次加油数据
    public JTextField lastTimeText = new JTextField(3);

    // 汽车跑的公里数数据
    public JTextField kilometersText = new JTextField(3);

    // 汽油价格数据
    public JTextField gasolinePriceText = new JTextField(3);

    // 窗口
    FlowLayout windows;

    public void windowLoading() {
        // 窗口大小
        setSize(300, 200);

        // 用户不可调整窗口大小
        setResizable(false);

        // 窗口标题
        setTitle("油耗计算器");
        windows = new FlowLayout();

        // 设置当前页面的布局
        setLayout(windows);

        // 上次加油数据
        lastTimeText.setText("200");

        //汽车跑的公里数数据
        kilometersText.setText("500");

        // 汽油价格数据
        gasolinePriceText.setText("7.5");

        //上次加油数
        add(lastTime);
        // 文本框
        add(lastTimeText);
        lastTimeText.addActionListener(this);

        //汽车跑的公里数
        add(kilometers);
        // 文本框
        add(kilometersText);
        kilometersText.addActionListener(this);

        //汽油价格
        add(gasolinePrice);
        // 文本框
        add(gasolinePriceText);
        gasolinePriceText.addActionListener(this);

        //油耗
        add(fuelConsumption);

        add(calculation);
        calculation.addActionListener(this);

        // 允许创建
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * 单击事件
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        float fMoney = Float.parseFloat(lastTimeText.getText());
        float fkm = Float.parseFloat(kilometersText.getText());
        float fPrice = Float.parseFloat(gasolinePriceText.getText());
        float sum = fMoney / fkm / fPrice * 100;
        fuelConsumption.setText("百公里油耗（升）：" + sum);
    }

    public static void main(String[] args) {
        Printer product = new Printer();
        product.windowLoading();
    }


}