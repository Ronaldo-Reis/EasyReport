/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.webx.easyreport.test.domain;

import org.webx.easyreport.annotations.ReportColumn;
import org.webx.easyreport.classTypes.Classes;

/**
 *
 * @author webcloud
 */
public class Product {


    public Long id;
    @ReportColumn(property="productLine",title="Linha do Produto", colClass=Classes.STRING)
    public String productLine;
    @ReportColumn(property="item",title="Item", colClass=Classes.STRING)
    public String item;
    @ReportColumn(property="state",title="Estado", colClass=Classes.STRING, groupingCriteria=true)
    public String state;
    @ReportColumn(property="branch",title="Lugar", colClass=Classes.STRING)
    public String branch;
    @ReportColumn(property="quantity",title="Quantidade", colClass=Classes.LONG,sumable=true)
    public Long quantity;
    @ReportColumn(property="amount",title="Valor", colClass=Classes.FLOAT,sumable=true)
    public Float amount;

    public Product(Long id, String productLine, String item, String state, String branch, Long quantity, Float amount) {
        this.id = id;
        this.productLine = productLine;
        this.item = item;
        this.state = state;
        this.branch = branch;
        this.quantity = quantity;
        this.amount = amount;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the productLine
     */
    public String getProductLine() {
        return productLine;
    }

    /**
     * @param productLine the productLine to set
     */
    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * @return the quantity
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the amount
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Float amount) {
        this.amount = amount;
    }

}
