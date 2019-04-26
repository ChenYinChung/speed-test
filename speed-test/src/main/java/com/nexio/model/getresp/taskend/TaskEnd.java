package com.nexio.model.getresp.taskend;


public class TaskEnd {
    private String rt;

    private Data data;

    private String error;

    private String type;

    private String txnid;

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTxnid() {
        return txnid;
    }

    public void setTxnid(String txnid) {
        this.txnid = txnid;
    }

    @Override
    public String toString() {
        return "ClassPojo [rt = " + rt + ", data = " + data + ", error = " + error + ", type = " + type + ", txnid = " + txnid + "]";
    }
}