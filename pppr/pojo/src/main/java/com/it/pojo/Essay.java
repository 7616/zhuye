package com.it.pojo;

import java.io.Serializable;
import java.util.Date;

public class Essay implements Serializable {
    private Integer eId;
    private String eTitle;
    private String ePic;
    private String eContent;
    private String eSpe;
    private Date eTime;

    private static final long serialVersionUID = 1L;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteTitle() {
        return eTitle;
    }

    public void seteTitle(String eTitle) {
        this.eTitle = eTitle;
    }

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    public String getePic() {
        return ePic;
    }

    public void setePic(String ePic) {
        this.ePic = ePic;
    }

    public String geteContent() {
        return eContent;
    }

    public void seteContent(String eContent) {
        this.eContent = eContent;
    }

    public String geteSpe() {
        return eSpe;
    }

    public void seteSpe(String eSpe) {
        this.eSpe = eSpe;
    }

    @Override
    public String toString() {
        return "Essay{" +
                "eId=" + eId +
                ", eTitle='" + eTitle + '\'' +
                ", ePic='" + ePic + '\'' +
                ", eContent='" + eContent + '\'' +
                ", eSpe='" + eSpe + '\'' +
                ", eTime=" + eTime +
                '}';
    }
}