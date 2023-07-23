package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class CommonBean implements Serializable {

    @SerializedName("success")
    private String success;
    @SerializedName("returnds")
    private ArrayList<InfoBean> returnds;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public ArrayList<InfoBean> getReturnds() {
        return returnds;
    }

    public void setReturnds(ArrayList<InfoBean> returnds) {
        this.returnds = returnds;
    }

    public class InfoBean implements Serializable {
        @SerializedName("Success")
        private String Success;
        @SerializedName("returnval")
        private String returnval;
        @SerializedName("retruncid")
        private String retruncid;
        @SerializedName("sim")
        private String sim;

        public String getSuccess() {
            return Success;
        }

        public void setSuccess(String success) {
            Success = success;
        }

        public String getReturnval() {
            return returnval;
        }

        public void setReturnval(String returnval) {
            this.returnval = returnval;
        }

        public String getRetruncid() {
            return retruncid;
        }

        public void setRetruncid(String retruncid) {
            this.retruncid = retruncid;
        }

        public String getSim() {
            return sim;
        }

        public void setSim(String sim) {
            this.sim = sim;
        }
    }
}
