package com.hph.biz;

import com.hph.bean.Wine;

/**
 * Created by Administrator on 2016/6/6.
 */
public interface IWineBiz {
    void show(Wine wine,OnShowListener onShowListener);
}
