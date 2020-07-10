package com.liao.test01;

public abstract class SpeedMeter {
    // 转速
    private double turnRate;

    public SpeedMeter() {
    }

    // 车轮半径
    public abstract double getRate();

    // 转速
    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }

    // 计算速度
    public double getSpeed(){
        // 速度等于 半径 * 2 * 3.14 * 转速
        return Math.PI * 2 * getRate() * turnRate;
    }
}