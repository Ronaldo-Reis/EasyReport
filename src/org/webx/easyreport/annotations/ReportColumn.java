/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.webx.easyreport.annotations;

import org.webx.easyreport.classTypes.Classes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target (ElementType.FIELD)

@Retention (RetentionPolicy.RUNTIME)

/**
 *
 * @author vinicius
 */
public @interface ReportColumn {
    public String property() default "";
    public String title() default "Title";
    public Classes colClass() default Classes.STRING;
    public boolean groupingCriteria() default false;
    public boolean sumable() default false;
}