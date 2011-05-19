/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.webx.easyreport.classTypes;

import java.util.Date;

/**
 *
 * @author webcloud
 */
public enum Classes {
    STRING (String.class.getName()),
    DATE (Date.class.getName()),
    INTEGER (Integer.class.getName()),
    FLOAT (Float.class.getName()),
    LONG (Long.class.getName());

    
    private final String className;
    
    public String className() {
        return this.className;
    }

    
    private Classes(String className) {
        this.className = className;
    }
}
