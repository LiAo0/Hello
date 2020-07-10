package com.liao.test02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * TODO: 油价计算器
 *
 * @author LiAo
 * @date 2020/7/9 15:30
 */
public class OilPrice extends JFrame implements ActionListener {

    // 文本框长度
    private final int TEXT_SIZE = 3;
    // 上次加油数据
    public JTextField lastTimeText = new JTextField(TEXT_SIZE);
    // 汽车跑的公里数数据
    public JTextField kilometersText = new JTextField(TEXT_SIZE);
    // 汽油价格数据
    public JTextField gasolinePriceText = new JTextField(TEXT_SIZE);
    // 标签文本数组
    public String[] labels = {"上次加油钱数（元）", "汽车跑公里数", "汽油的价格"};
    // 文本框数组
    private JTextField[] texts = {lastTimeText, kilometersText, gasolinePriceText};
    // 油耗
    public JLabel fuelConsumption = new JLabel("百公里油耗（升）");
    // 窗口
    FlowLayout windows;
    // 计算按钮
    public JButton calculation = new JButton("计算");

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
        // 循环创建组件
        for (int i = 0; i < labels.length; i++) {
            JLabel lastTime = new JLabel(labels[i]);
            add(lastTime);
            add(texts[i]);
            texts[i].setText("10");
            texts[i].addActionListener(this);
        }
        // 油耗显示
        add(fuelConsumption);
        // 按钮
        add(calculation);
        // 确定按钮监听
        calculation.addActionListener(this);
        // 允许创建
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fuelConsumption.setText("百公里油耗（升）：" +
                Float.parseFloat(lastTimeText.getText()) / Float.parseFloat(kilometersText.getText()) / Float.parseFloat(gasolinePriceText.getText()) * 10);
    }

    public static void main(String[] args) {
        OilPrice oilPrice = new OilPrice();
        oilPrice.windowLoading();
    }
}