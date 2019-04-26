package com.nexio.model.getresp.newdata;


public class Data {
    private String TTFBTime;

    private Srcip srcip;

    private String TaskId;

    private String ErrMsg;

    private String DownTime;

    private String SrcIP;

    private String HttpHead;

    private String HttpCode;

    private NodeInfo NodeInfo;

    private String NsLookup;

    private String NodeID;

    private String TotalTime;

    private String ConnectTime;

    public String getTTFBTime() {
        return TTFBTime;
    }

    public void setTTFBTime(String TTFBTime) {
        this.TTFBTime = TTFBTime;
    }

    public Srcip getSrcip() {
        return srcip;
    }

    public void setSrcip(Srcip srcip) {
        this.srcip = srcip;
    }

    public String getTaskId() {
        return TaskId;
    }

    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public String getErrMsg() {
        return ErrMsg;
    }

    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public String getDownTime() {
        return DownTime;
    }

    public void setDownTime(String DownTime) {
        this.DownTime = DownTime;
    }

    public String getSrcIP() {
        return SrcIP;
    }

    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    public String getHttpHead() {
        return HttpHead;
    }

    public void setHttpHead(String HttpHead) {
        this.HttpHead = HttpHead;
    }

    public String getHttpCode() {
        return HttpCode;
    }

    public void setHttpCode(String HttpCode) {
        this.HttpCode = HttpCode;
    }

    public NodeInfo getNodeInfo() {
        return NodeInfo;
    }

    public void setNodeInfo(NodeInfo NodeInfo) {
        this.NodeInfo = NodeInfo;
    }

    public String getNsLookup() {
        return NsLookup;
    }

    public void setNsLookup(String NsLookup) {
        this.NsLookup = NsLookup;
    }

    public String getNodeID() {
        return NodeID;
    }

    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    public String getTotalTime() {
        return TotalTime;
    }

    public void setTotalTime(String TotalTime) {
        this.TotalTime = TotalTime;
    }

    public String getConnectTime() {
        return ConnectTime;
    }

    public void setConnectTime(String ConnectTime) {
        this.ConnectTime = ConnectTime;
    }

    @Override
    public String toString() {
        return "ClassPojo [TTFBTime = " + TTFBTime + ", srcip = " + srcip + ", TaskId = " + TaskId + ", ErrMsg = " + ErrMsg + ", DownTime = " + DownTime + ", SrcIP = " + SrcIP + ", HttpHead = " + HttpHead + ", HttpCode = " + HttpCode + ", NodeInfo = " + NodeInfo + ", NsLookup = " + NsLookup + ", NodeID = " + NodeID + ", TotalTime = " + TotalTime + ", ConnectTime = " + ConnectTime + "]";
    }
}