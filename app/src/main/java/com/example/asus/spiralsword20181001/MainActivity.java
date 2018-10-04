package com.example.asus.spiralsword20181001;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Button btn1=findViewById(R.id.btn);
    //不知道为什么上面这行代码一加程序就停止运行
  //  private my my;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // int i=1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // my myapp=(my)getApplication();
        //myapp.seti(0);
        Button btn1=findViewById(R.id.button1);
        Button btn2=findViewById(R.id.button2);
        Button btn3=findViewById(R.id.button3);

      //  Button btn1=findViewById(R.id.btn);
        btn1.setText("手里剑");
        btn2.setText("螺旋丸");
        btn3.setText("千鸟");
        btn1.setOnClickListener(new MyClickListener());
        btn2.setOnClickListener(new MyClickListener());
        btn3.setOnClickListener(new MyClickListener());
    }
    //Button btn1=findViewById(R.id.btn);
    //加在这里也一样
    class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
           Button btn=findViewById(R.id.btn);
           if(btn.getVisibility()==View.INVISIBLE) {
               btn.setVisibility(View.VISIBLE);
           } else{
               btn.setVisibility(View.INVISIBLE);
           }
        }
    }


  // final int[] imageId2 = new int[] { R.drawable.spiralpill_one, R.drawable.spiralpill_two,R.drawable.spiralpill_three,R.drawable.spiralpill_four};
    public void changeBg(){
        final Handler handler=new Handler();
        Runnable runnable=new Runnable() {

            @Override
            public void run() {
                Button btn=findViewById(R.id.btn);

                final my myapp=(my)getApplication();
                Button btn1=findViewById(R.id.button1);
                Button btn2=findViewById(R.id.button2);
                // Button btn3=findViewById(R.id.button3);
//                btn1.setOnClickListener(new View.OnClickListener(){
//                                            public void onClick(View v){
//                                                myapp.setid(imageId1);
//                                            }
//                                        }
//                );
//                btn2.setOnClickListener(new View.OnClickListener(){
//                                            public void onClick(View v){
//                                                myapp.setid(imageId2);
//                                            }
//                                        }
//                );
                final int[] imageId1 = new int[] { R.drawable.first, R.drawable.second,R.drawable.third,R.drawable.forth};
                int i= myapp.geti();
                if(i>=3) i=0;
                i++;
                Resources res=getResources();
              //  int[] image=myapp.getid();

                Drawable btnDrawable = res.getDrawable(imageId1[i]);
                btn.setBackground(btnDrawable);
                handler.postDelayed(this, 2000);
                myapp.seti(i);
            }
        };
        // 启动计时器

        handler.postDelayed(runnable, 2000);//每两秒执行一次runnable.
        // 停止计时器

     // handler.removeCallbacks(runnable);


    }
    public  boolean onTouchEvent(MotionEvent event){
        Button btn1=findViewById(R.id.btn);
        btn1.setX(event.getX());
        btn1.setY(event.getY());
        this.changeBg();
        return  true;
    }

}
