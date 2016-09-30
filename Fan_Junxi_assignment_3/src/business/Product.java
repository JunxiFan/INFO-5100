/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author fjx19
 */
public class Product {
    private String productName;
    private String modelNum;
    private String vendor;
    private String description;
    private String basePrice;
    private String ceilingPrice;
    private String floorPrice;
    private String features;
    private String productType;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(String ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public String getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(String floorPrice) {
        this.floorPrice = floorPrice;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
    
    
    @Override
    public String toString(){
        return this.productName;
    }

    
}
