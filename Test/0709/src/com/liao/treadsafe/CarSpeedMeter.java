package com.liao.treadsafe;

public class CarSpeedMeter extends SpeedMeter{

    @Override
    public double getRate() {
        return 0.28;
    }

    public static void main(String[] args) {
        CarSpeedMeter carSpeedMeter = new CarSpeedMeter();
        carSpeedMeter.setTurnRate(15);
        System.out.println(carSpeedMeter.getSpeed());
    }
}