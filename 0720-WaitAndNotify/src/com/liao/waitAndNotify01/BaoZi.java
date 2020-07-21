package com.liao.waitAndNotify01;

/**
 *
 * TODO: 包子类
 * @author LiAo
 * @date 2020/7/20 10:52
 */
public class BaoZi {
    private String pi;

    private String xian;

    private boolean flag = false;

    public BaoZi() {
    }

    public BaoZi(String pi, String xian, boolean flag) {
        this.pi = pi;
        this.xian = xian;
        this.flag = flag;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "BaoZi{" +
                "pi='" + pi + '\'' +
                ", xian='" + xian + '\'' +
                ", flag=" + flag +
                '}';
    }
}