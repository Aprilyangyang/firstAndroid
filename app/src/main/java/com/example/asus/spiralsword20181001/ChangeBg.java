package com.example.asus.spiralsword20181001;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.Button;
/**
 * Created by april on 2018/9/14.
 */

public class ChangeBg extends Activity{
//先找到button的id
Button btn=findViewById(R.id.btn);
//Drawable btnDrawable = .getResources().getDrawable(R.drawable.second);
//btn.setBackgroundDrawableResource(R.drawable.second);
    public void changeBg(){

        final int[] imageId = new int[] { R.drawable.first, R.drawable.second,R.drawable.third,R.drawable.forth };
       // int i=0;
        final Handler handler=new Handler();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                int i=1;
                i++;
                Resources res=getResources();
                Drawable btnDrawable = res.getDrawable(imageId[i]);
                btn.setBackground(btnDrawable);
                handler.postDelayed(this, 2000);
            }
        };
       // 启动计时器

        handler.postDelayed(runnable, 2000);//每两秒执行一次runnable.
       // 停止计时器

        handler.removeCallbacks(runnable);


    }



}
