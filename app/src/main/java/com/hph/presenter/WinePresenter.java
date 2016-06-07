package com.hph.presenter;

import android.os.Handler;

import com.hph.biz.IWineBiz;
import com.hph.biz.OnShowListener;
import com.hph.biz.WineBiz;
import com.hph.bean.Wine;
import com.hph.wineview.WineView;

/**
 * Created by Administrator on 2016/6/6.
 */
public class WinePresenter {

      private IWineBiz iWineBiz;
      private  WineView wineView;
      private Handler mhandler=new Handler();
      private String a;
   public   WinePresenter(WineView wineView)
   {
       this.iWineBiz=new WineBiz();
       this.wineView=wineView;
   }
    public  void show()
    {
        iWineBiz.show(wineView.getWine(), new OnShowListener() {
            @Override
            public void show(final Wine wine) {
                mhandler.post(new Runnable() {
                    @Override
                    public void run() {
                        wineView.show(wine);
                    }
                });
            }
        });

    }

}
