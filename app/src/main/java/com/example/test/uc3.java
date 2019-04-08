package com.example.test;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class uc3 extends AppCompatActivity {
    private static final String TAG="uc3";
    private ViewPager mloopPager;
    private LooperPagerAdapt mloopPagerAdapter;
    private Handler mHandler;
    private static List<Integer> sPic=new ArrayList<>();
    static {
        sPic.add(R.drawable.first);
        sPic.add(R.drawable.second);
        sPic.add(R.drawable.third);
        sPic.add(R.drawable.forth);
        sPic.add(R.drawable.fifth);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);
        initView();
        mHandler=new Handler();
        Button re = (Button) findViewById(R.id.re3);
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }//返回

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();//当界面绑定到窗口时
        mHandler.post(mLooperTask);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG,"onDetachedFromWindow");
        mHandler.removeCallbacks(mLooperTask);
    }

    private Runnable mLooperTask=new Runnable() {
        @Override
        public void run() {
            //切换ViewPager里的图片到下一个
            int currentItem=mloopPager.getCurrentItem();
            mloopPager.setCurrentItem(++currentItem,true);
            mHandler.postDelayed(this,2000);
        }
    };

    private void initView(){
        //找到ViewPager控件
        mloopPager=(ViewPager) this.findViewById(R.id.looper_pager);
        //设置适配器
        mloopPagerAdapter =new LooperPagerAdapt();
        //给适配器准备数据
        mloopPagerAdapter.setData(sPic);
        mloopPager.setAdapter(mloopPagerAdapter);
        mloopPager.setCurrentItem(mloopPagerAdapter.getDataRealSize()*100,false);
    }
}
