package com.nexio.model.checkuser.request;

public class WSLogin {
    String error;
    String msg;
    int rt;

    public WSLogin(String error, String msg, int rt) {
        this.error = error;
        this.msg = msg;
        this.rt = rt;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }
}
