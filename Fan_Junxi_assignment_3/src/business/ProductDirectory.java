/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author fjx19
 */
public class ProductDirectory {
    private ArrayList<Product> productList;
    private String vendorID;
    private String productNameResult;

    public String getProductNameResult() {
        return productNameResult;
    }

    public void setProductNameResult(String productNameResult) {
        this.productNameResult = productNameResult;
    }



    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }
    
    public ProductDirectory(){
        this.productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }    
    
    public Product addProduct(){
        Product product = new Product();
        productList.add(product);
        return product;
    }
    public void deleteProduct(Product product){
        productList.remove(product);
    }
    
    public Product searchProductName(String productName){
        for(Product product : productList)
        {
            if(product.getProductName().equals(productName))
                return product;
        }
        return null;
    }
     public Product searchVendor(String vendor){
        for(Product product : productList)
        {
            if(product.getVendor().equals(vendor))
                return product;
        }
        return null;
    }
      public Product searchDescription(String description){
        for(Product product : productList)
        {
            if(product.getDescription().equals(description))
                return product;
        }
        return null;
    }
       public Product searchFloorPrice(String floorPrice){
        for(Product product : productList)
        {
            if(product.getFloorPrice().equals(floorPrice))
                return product;
        }
        return null;
    }
}
