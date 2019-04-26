package com.nexio.model.getresp.newdata;

public class Srcip
{
    private String srcip;

    private String srcip_from;

    public String getSrcip ()
    {
        return srcip;
    }

    public void setSrcip (String srcip)
    {
        this.srcip = srcip;
    }

    public String getSrcip_from ()
    {
        return srcip_from;
    }

    public void setSrcip_from (String srcip_from)
    {
        this.srcip_from = srcip_from;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [srcip = "+srcip+", srcip_from = "+srcip_from+"]";
    }
}