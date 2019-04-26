package com.nexio.model.getresp.newdata;

public class NodeInfo {
    private String area;

    private String pro_id;

    private String ip;

    private String isp;

    private String city_id;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPro_id() {
        return pro_id;
    }

    public void setPro_id(String pro_id) {
        this.pro_id = pro_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    @Override
    public String toString() {
        return "ClassPojo [area = " + area + ", pro_id = " + pro_id + ", ip = " + ip + ", isp = " + isp + ", city_id = " + city_id + "]";
    }
}