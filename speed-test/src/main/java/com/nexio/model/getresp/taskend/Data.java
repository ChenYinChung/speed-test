package com.nexio.model.getresp.taskend;


public class Data {
    private String TotalCountOK;

    private String TotalCount;

    private String TotalCountTimeout;

    private String TotalCountErr;

    public String getTotalCountOK() {
        return TotalCountOK;
    }

    public void setTotalCountOK(String TotalCountOK) {
        this.TotalCountOK = TotalCountOK;
    }

    public String getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    public String getTotalCountTimeout() {
        return TotalCountTimeout;
    }

    public void setTotalCountTimeout(String TotalCountTimeout) {
        this.TotalCountTimeout = TotalCountTimeout;
    }

    public String getTotalCountErr() {
        return TotalCountErr;
    }

    public void setTotalCountErr(String TotalCountErr) {
        this.TotalCountErr = TotalCountErr;
    }

    @Override
    public String toString() {
        return "ClassPojo [TotalCountOK = " + TotalCountOK + ", TotalCount = " + TotalCount + ", TotalCountTimeout = " + TotalCountTimeout + ", TotalCountErr = " + TotalCountErr + "]";
    }
}
