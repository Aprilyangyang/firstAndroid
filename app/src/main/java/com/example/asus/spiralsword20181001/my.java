package com.example.asus.spiralsword20181001;


import android.app.Application;

public class my extends Application{
    private int i ;
    private  int imageId[] = new int[4];
    public int geti(){
        return i;
    }
    public void seti(int i){
        this.i = i;
    }
    public int[] getid(){
        return imageId;
    }
    public void setid(int[] imageId){

        for(int i=0;i<imageId.length;i++)
            this.imageId[i]=imageId[i];
    }


    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        seti(0); //初始化全局变量
    }
}