package com.codersworld.rklib.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class UnitsBean implements Serializable {
    int success;
    ArrayList<infoBean> returnds;

    public ArrayList<infoBean> getReturnds() {
        return returnds;
    }

    public void setReturnds(ArrayList<infoBean> returnds) {
        this.returnds = returnds;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public class infoBean implements Serializable {
        String unitid;
        String SocietyName;
        String ClusterName;
        String BuilingName;
        String floorName;
        String UnitName;
        String SocietyId;
        String clusterid;
        String Builingid;
        String floorid;
        String SubUnitCount;
        String filename;
        String filepath;


        public String getUnitid() {
            return unitid;
        }

        public void setUnitid(String unitid) {
            this.unitid = unitid;
        }

        public String getSocietyName() {
            return SocietyName;
        }

        public void setSocietyName(String societyName) {
            SocietyName = societyName;
        }

        public String getClusterName() {
            return ClusterName;
        }

        public void setClusterName(String clusterName) {
            ClusterName = clusterName;
        }

        public String getBuilingName() {
            return BuilingName;
        }

        public void setBuilingName(String builingName) {
            BuilingName = builingName;
        }

        public String getFloorName() {
            return floorName;
        }

        public void setFloorName(String floorName) {
            this.floorName = floorName;
        }

        public String getUnitName() {
            return UnitName;
        }

        public void setUnitName(String unitName) {
            UnitName = unitName;
        }

        public String getSocietyId() {
            return SocietyId;
        }

        public void setSocietyId(String societyId) {
            SocietyId = societyId;
        }

        public String getClusterid() {
            return clusterid;
        }

        public void setClusterid(String clusterid) {
            this.clusterid = clusterid;
        }

        public String getBuilingid() {
            return Builingid;
        }

        public void setBuilingid(String builingid) {
            Builingid = builingid;
        }

        public String getFloorid() {
            return floorid;
        }

        public void setFloorid(String floorid) {
            this.floorid = floorid;
        }

        public String getSubUnitCount() {
            return SubUnitCount;
        }

        public void setSubUnitCount(String subUnitCount) {
            SubUnitCount = subUnitCount;
        }

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getFilepath() {
            return filepath;
        }

        public void setFilepath(String filepath) {
            this.filepath = filepath;
        }
    }


}
