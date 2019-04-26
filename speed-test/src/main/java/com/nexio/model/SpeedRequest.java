package com.nexio.model;

public class SpeedRequest {
    int txnid=1;
    int nodetype= 1;
    int num = 1;
    String Url="http://www.1356668.com";
    String TestType= "HTTP";
    String Host= "";
    int TimeOut= 10;
    String Request= "GET";
    boolean NoCache= false;
    int Speed= 0;
    String Cookie= "";
    boolean Trace=false;
    String Referer= "";
    String UserAgent="";
    int FollowLocation= 3;
    boolean GetMD5= true;
    boolean GetResponseHeader= true;
    int MaxDown = 1048576;
    boolean AutoDecompress=true;
    int type=1;
    int[] isps={0,1,2,6,7,8,17,18,19,3,4};
    int[] pro_ids={12,49,79,80,180,183,184,188,189,190,192,193,194,195,196,221,227,235,236,238,241,243,250,346,349,350,351,353,354,355,356,357,239,352,3,5,8,18,27,42,43,46,47,51,56,85};
    int[] areas={0,1,2,3};
    boolean SnapShot= true;
    String postfield="";
    int PingCount= 10;
    int PingSize= 32;
    String SrcIP= "";

    public SpeedRequest(String url, String testType){
        this.Url = url.startsWith("http")?url:"http://"+url;
        this.TestType = testType;
    }

    public boolean isAutoDecompress() {
        return AutoDecompress;
    }

    public void setAutoDecompress(boolean autoDecompress) {
        AutoDecompress = autoDecompress;
    }

    public String getCookie() {
        return Cookie;
    }

    public void setCookie(String cookie) {
        Cookie = cookie;
    }

    public int getFollowLocation() {
        return FollowLocation;
    }

    public void setFollowLocation(int followLocation) {
        FollowLocation = followLocation;
    }

    public boolean isGetMD5() {
        return GetMD5;
    }

    public void setGetMD5(boolean getMD5) {
        GetMD5 = getMD5;
    }

    public boolean isGetResponseHeader() {
        return GetResponseHeader;
    }

    public void setGetResponseHeader(boolean getResponseHeader) {
        GetResponseHeader = getResponseHeader;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public int getMaxDown() {
        return MaxDown;
    }

    public void setMaxDown(int maxDown) {
        MaxDown = maxDown;
    }

    public boolean isNoCache() {
        return NoCache;
    }

    public void setNoCache(boolean noCache) {
        NoCache = noCache;
    }

    public int getPingCount() {
        return PingCount;
    }

    public void setPingCount(int pingCount) {
        PingCount = pingCount;
    }

    public int getPingSize() {
        return PingSize;
    }

    public void setPingSize(int pingSize) {
        PingSize = pingSize;
    }

    public String getReferer() {
        return Referer;
    }

    public void setReferer(String referer) {
        Referer = referer;
    }

    public String getRequest() {
        return Request;
    }

    public void setRequest(String request) {
        Request = request;
    }

    public boolean isSnapShot() {
        return SnapShot;
    }

    public void setSnapShot(boolean snapShot) {
        SnapShot = snapShot;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public String getSrcIP() {
        return SrcIP;
    }

    public void setSrcIP(String srcIP) {
        SrcIP = srcIP;
    }

    public String getTestType() {
        return TestType;
    }

    public void setTestType(String testType) {
        TestType = testType;
    }

    public int getTimeOut() {
        return TimeOut;
    }

    public void setTimeOut(int timeOut) {
        TimeOut = timeOut;
    }

    public boolean isTrace() {
        return Trace;
    }

    public void setTrace(boolean trace) {
        Trace = trace;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public void setUserAgent(String userAgent) {
        UserAgent = userAgent;
    }

    public int[] getAreas() {
        return areas;
    }

    public void setAreas(int[] areas) {
        this.areas = areas;
    }

    public int[] getIsps() {
        return isps;
    }

    public void setIsps(int[] isps) {
        this.isps = isps;
    }

    public int getNodetype() {
        return nodetype;
    }

    public void setNodetype(int nodetype) {
        this.nodetype = nodetype;
    }

    public String getPostfield() {
        return postfield;
    }

    public void setPostfield(String postfield) {
        this.postfield = postfield;
    }

    public int[] getPro_ids() {
        return pro_ids;
    }

    public void setPro_ids(int[] pro_ids) {
        this.pro_ids = pro_ids;
    }

    public int getTxnid() {
        return txnid;
    }

    public void setTxnid(int txnid) {
        this.txnid = txnid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
