package com.example.administrator.mvpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hph.bean.Wine;
import com.hph.presenter.WinePresenter;
import com.hph.wineview.WineView;

public class MainActivity extends AppCompatActivity implements WineView{
    private  EditText et1,et2;
    private Button bt1;
    private TextView msg;
    private WinePresenter winePresenter=new WinePresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        et1= (EditText) findViewById(R.id.winename);
        et2= (EditText) findViewById(R.id.winenameEn);
        bt1= (Button) findViewById(R.id.qury);
        msg= (TextView) findViewById(R.id.showmsg);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                winePresenter.show();
            }
        });
    }

    @Override
    public Wine getWine() {
        Wine wine=new Wine();
        wine.setProductName(et1.getText().toString());
        wine.setProductName_en(et2.getText().toString());
        return wine;
    }

    @Override
    public void show(Wine wine) {
       msg.setText("酒名:"+wine.getProductName()+"\n"+wine.getProductName_en());
    }
}
