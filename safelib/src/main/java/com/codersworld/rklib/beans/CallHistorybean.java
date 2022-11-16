package com.codersworld.rklib.beans;

import java.io.Serializable;

public class CallHistorybean implements Serializable {


    String RMasterID;
    String CallPickTitle;
    String Supervisor;
    String Calltime;
    String NextCalltime;
    String Comment;
    String StatusID;
    String Action;
    String Reason;

    public String getRMasterID() {
        return RMasterID;
    }

    public void setRMasterID(String RMasterID) {
        this.RMasterID = RMasterID;
    }

    public String getCallPickTitle() {
        return CallPickTitle;
    }

    public void setCallPickTitle(String callPickTitle) {
        CallPickTitle = callPickTitle;
    }

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String supervisor) {
        Supervisor = supervisor;
    }

    public String getCalltime() {
        return Calltime;
    }

    public void setCalltime(String calltime) {
        Calltime = calltime;
    }

    public String getNextCalltime() {
        return NextCalltime;
    }

    public void setNextCalltime(String nextCalltime) {
        NextCalltime = nextCalltime;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getStatusID() {
        return StatusID;
    }

    public void setStatusID(String statusID) {
        StatusID = statusID;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }
}
