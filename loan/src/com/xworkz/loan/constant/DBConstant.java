package com.xworkz.loan.constant;

public enum DBConstant {

    URL("jdbc:mysql://localhost:3306/loandb"),
    USERNAME("root"),
    SECRET("Xworkzodc@123");

    DBConstant(String prop) {
        this.prop = prop;
    }

    private String prop;

    public String getProp() {
        return prop;
    }
}
