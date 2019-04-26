package com.nexio.model.checkuser.request;

import java.util.ArrayList;

public class Data {
    private String url;
    ArrayList<Object> fullips = new ArrayList<Object>();
    ArrayList<Object> adlist = new ArrayList<Object>();
    ArrayList<Object> nodelink = new ArrayList<Object>();
    private String ut;
    private String user;
    private String code;


    // Getter Methods

    public String getUrl() {
        return url;
    }

    public String getUt() {
        return ut;
    }

    public String getUser() {
        return user;
    }

    public String getCode() {
        return code;
    }

    // Setter Methods

    public void setUrl( String url ) {
        this.url = url;
    }

    public void setUt( String ut ) {
        this.ut = ut;
    }

    public void setUser( String user ) {
        this.user = user;
    }

    public void setCode( String code ) {
        this.code = code;
    }
}
