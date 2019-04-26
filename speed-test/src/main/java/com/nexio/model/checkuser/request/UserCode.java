package com.nexio.model.checkuser.request;

public class UserCode {
    private String user;
    private String code;
    private String ut;
    private String url;
    private String type;

    public String getUt() {
        return ut;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUt(String ut) {
        this.ut = ut;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserCode(String user, String code,String ut, String url,String type){
        this.user = user;
        this.code = code;
        this.ut = ut;
        this.url = url;
        this.type = type.toUpperCase();
    }


}
