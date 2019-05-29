package com.bingo.customer_tracking.enums;

import sun.security.util.Password;

public enum UserStateEnum {
    SUCESS(1,"用户名密码正确!"),NULL_USER(0,"用户不存在!"),PASSWOERD_ERROR(2,"密码错误!");

    private int State;
    private String stateInfo;

    private UserStateEnum(int state,String stateInfo){
        this.State = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return State;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
