package org.ph.ssm.crud.model;
import java.util.ArrayList;
import java.util.List;

public class VabBaseModel {
    private String code;
    private String msg;
    private long totalCount;

    public String getCode()
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code=code;
    }
    public String getMsg()
    {
        return msg;
    }
    public void setMsg(String msg)
    {
        this.msg=msg;
    }
    public long getTotalCount()
    {
        return totalCount;
    }
    public void setTotalCount(long totalCount)
    {
        this.totalCount=totalCount;
    }
    public void setReturnMsg(String Code,String Msg,int PageSize)
    {
        this.code=Code;
        this.msg=Msg;
        this.totalCount=PageSize;
    }
}
