package com.ksb.openapi.em;

public enum ShipperType {

    /**小O2O公司 */
	O2O {public String getName(){return "2";}},
    /** 电商(京东、亚马逊) */
    OL_RETAILERS {public String getName(){return "1";}},
    /** 餐饮 */
    CATERING {public String getName(){return "3";}},
    /** 超市 */
    SUPERMARKET {public String getName(){return "4";}},
    /** 连锁店 */
    MULTIPLE_SHOP {public String getName(){return "5";}};
    
    public abstract String getName();
    
}
