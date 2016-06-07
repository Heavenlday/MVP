package com.hph.bean;

/**
 * Created by Administrator on 2016/6/6.
 */
public class Wine {
    String Alcohol_Concentration;
    String ProductName;
    String ProductName_en;
    String ProductImage;

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getAlcohol_Concentration() {
        return Alcohol_Concentration;
    }

    public void setAlcohol_Concentration(String alcohol_Concentration) {
        Alcohol_Concentration = alcohol_Concentration;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String productImage) {
        ProductImage = productImage;
    }

    public String getProductName_en() {
        return ProductName_en;
    }

    public void setProductName_en(String productName_en) {
        ProductName_en = productName_en;
    }
}
