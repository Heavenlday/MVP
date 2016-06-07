package com.hph.biz;

import com.hph.bean.Wine;

/**
 * Created by Administrator on 2016/6/6.
 */
public class WineBiz implements IWineBiz{
    @Override
    public void show(Wine wine, OnShowListener onShowListener) {
        Wine wine1=new Wine();
        wine1.setProductName(wine.getProductName());
        wine1.setProductName_en(wine.getProductName_en());
        wine1.setAlcohol_Concentration(wine.getAlcohol_Concentration());
        wine1.setProductImage(wine.getProductImage());
        onShowListener.show(wine1);
    }

}
