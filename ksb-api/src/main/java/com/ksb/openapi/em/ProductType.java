package com.ksb.openapi.em;

public enum ProductType {

    /**商家版APP*/
	SP {public String getName(){return "1";}},
	
    /** 配送员版APP */
    COURIER {public String getName(){return "2";}};
    
    public abstract String getName();
    
}
