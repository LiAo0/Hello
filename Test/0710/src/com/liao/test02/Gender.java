package com.liao.test02;

public enum Gender {
    MALE, FEMALE;
    public String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        switch (this) {
            case MALE:
                if (name.equals("男")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
            case FEMALE:
                if (name.equals("女")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
        }
    }


}