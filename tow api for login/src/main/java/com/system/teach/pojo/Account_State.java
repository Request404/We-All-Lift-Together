package com.system.teach.pojo;

public enum Account_State {
    OnLine(100,"在线"),OffLine(200,"离线"),Cancellation(500,"注销");

    private Integer code;
    private String msg;

    private Account_State(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }
}
