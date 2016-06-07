package com.hph.wineview;

import com.hph.bean.Wine;

/**
 * Created by Administrator on 2016/6/6.
 */
public interface WineView {
    Wine getWine();
    void show(Wine wine);

}
