# firstAndroid
there is my first android project
第一步：
将四张图片全都复制到drawable文件夹里（右键该目录直接粘贴）图片命名要小写
第二步：
其中一个button背景图片设为第一张图片，不可见
第二个button设置点击时的监听事件，初始化button1不可见，点击时button出现，再次点击时button1消失
第三步：
在onTouchEvent中更新button坐标让button1跟着鼠标移动
第四步：
用drawable对象改变button1的背景图片
将所有图片的id保存在一个数组里
final int[] imageId = new int[]{ R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.forth };
第五步：
设置定时器用全局变量i当数组下标遍历所有背景图片
Button btn=findViewById(R.id.btn);
Resources res=getResources();
Drawable btnDrawable = res.getDrawable(imageId[i]);
android中全局变量的使用和java中有不同，不能直接定义一个静态标量，
即使i=0前面加了final，run函数内部也访问不了，最后的解决方法是新建了一个application,
然后在mainactivity中重写。就是在新建的application中初始化全局变量的值然后在其他的activity中操作
参考网址：http://blog.sina.com.cn/s/blog_78bb6d04010188c8.html
