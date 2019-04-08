package com.example.test;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class LooperPagerAdapt extends PagerAdapter {
    private List<Integer> sPic =null;

    @Override
    //返回图片循环个数
    public int getCount() {
        if (sPic != null) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        int realPosition=position%sPic.size();
        //初始化图片
        ImageView imageView=new ImageView(container.getContext());
        imageView.setImageResource(sPic.get(realPosition));
        //设置完数据添加到容器中
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }//销毁，使文件能够循环使用，内存不会溢出

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    public void setData(List<Integer> colos) {
        this.sPic =colos;
    }
    public int getDataRealSize(){
        if (sPic != null) {
            return sPic.size();
        }
        return 0;
    }
}
