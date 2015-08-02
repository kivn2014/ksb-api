package com.ksb.openapi.em;

public enum WaybillType {

    /**O2O运单*/
	O2O {public String getName(){return "2";}},
    /** 电商(京东、亚马逊) */
    OL_RETAILERS {public String getName(){return "1";}};
    
    public abstract String getName();
    
}
