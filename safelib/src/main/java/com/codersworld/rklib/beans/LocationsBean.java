package com.codersworld.rklib.beans;

import java.io.Serializable;

public class LocationsBean implements Serializable {
String CodeDescription;
String CatCodeID;

    public String getCodeDescription() {
        return CodeDescription;
    }

    public void setCodeDescription(String codeDescription) {
        CodeDescription = codeDescription;
    }

    public String getCatCodeID() {
        return CatCodeID;
    }

    public void setCatCodeID(String catCodeID) {
        CatCodeID = catCodeID;
    }
}
