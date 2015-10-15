package com.example.textview;

import java.lang.reflect.Field;

import com.example.firstproject.R;
import com.example.firstproject.TextviewSubAct;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class TextviewAct extends Activity {

	//声明
	TextView txt1;
	TextView txt2;
	TextView txt3;
	TextView txt4;
	TextView txt5;
	TextView txt6;
	TextView txt7;
	TextView txt8;
	TextView txt9;
	TextView txt10;
	TextView txt11;
	TextView txt12;
	TextView txt13;
	TextView txt14;
	TextView txt15;
	TextView txt16;
	TextView txt17;
	TextView txt18;
	TextView txt19;
	TextView txt20;
	TextView txt21;
	TextView txt22;
	TextView txt23;
	TextView txt24;
	TextView txt25;
	TextView txt26;
	TextView txt27;
	TextView txt28;
	TextView txt29;
	TextView txt30;
	TextView txt31;
	TextView txt32;
	TextView txt33;
	TextView txt34;
	TextView txt35;
	TextView txt36;
	TextView txt37;
	TextView txt38;
	TextView txt39;
	TextView txt40;
	TextView txt41;
	TextView txt42;
	TextView txt43;
	TextView txt44;
	TextView txt45;
	TextView txt46;
	TextView txt47;
	TextView txt48;
	TextView txt49;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_textview);

		txt1 = (TextView)findViewById(R.id.txt1);
		txt2 = (TextView)findViewById(R.id.txt2);
		txt3 = (TextView)findViewById(R.id.txt3);
		txt4 = (TextView)findViewById(R.id.txt4);
		txt5 = (TextView)findViewById(R.id.txt5);
		txt6 = (TextView)findViewById(R.id.txt6);
		txt7 = (TextView)findViewById(R.id.txt7);
		txt8 = (TextView)findViewById(R.id.txt8);
		txt9 = (TextView)findViewById(R.id.txt9);
		txt10 = (TextView)findViewById(R.id.txt10);
		txt11 = (TextView)findViewById(R.id.txt11);
		txt12 = (TextView)findViewById(R.id.txt12);
		txt13 = (TextView)findViewById(R.id.txt13);
		txt14 = (TextView)findViewById(R.id.txt14);
		txt15 = (TextView)findViewById(R.id.txt15);
		txt16 = (TextView)findViewById(R.id.txt16);
		txt17 = (TextView)findViewById(R.id.txt17);
		txt18 = (TextView)findViewById(R.id.txt18);
		txt19 = (TextView)findViewById(R.id.txt19);
		txt20 = (TextView)findViewById(R.id.txt20);
		txt21 = (TextView)findViewById(R.id.txt21);
		txt22 = (TextView)findViewById(R.id.txt22);
		txt23 = (TextView)findViewById(R.id.txt23);
		txt24 = (TextView)findViewById(R.id.txt24);
		txt25 = (TextView)findViewById(R.id.txt25);
		txt26 = (TextView)findViewById(R.id.txt26);
		txt27 = (TextView)findViewById(R.id.txt27);
		txt28 = (TextView)findViewById(R.id.txt28);
		txt29 = (TextView)findViewById(R.id.txt29);
		txt30 = (TextView)findViewById(R.id.txt30);
		txt31 = (TextView)findViewById(R.id.txt31);
		txt32 = (TextView)findViewById(R.id.txt32);
		txt33 = (TextView)findViewById(R.id.txt33);
		txt34 = (TextView)findViewById(R.id.txt34);
		txt35 = (TextView)findViewById(R.id.txt35);
		txt36 = (TextView)findViewById(R.id.txt36);
		txt37 = (TextView)findViewById(R.id.txt37);
		txt38 = (TextView)findViewById(R.id.txt38);
		txt39 = (TextView)findViewById(R.id.txt39);
		txt40 = (TextView)findViewById(R.id.txt40);
		txt41 = (TextView)findViewById(R.id.txt41);
		txt42 = (TextView)findViewById(R.id.txt42);
		txt43 = (TextView)findViewById(R.id.txt43);
		txt44 = (TextView)findViewById(R.id.txt44);
		txt45 = (TextView)findViewById(R.id.txt45);
		txt46 = (TextView)findViewById(R.id.txt46);
		txt47 = (TextView)findViewById(R.id.txt47);
		txt48 = (TextView)findViewById(R.id.txt48);
		txt49 = (TextView)findViewById(R.id.txt49);
		
		txt1.setAutoLinkMask(Linkify.ALL);	//Linkify包括邮箱，网址，电话号这三种 支持html格式
		txt1.setText("<a href=\"http://www.baidu.com\">百度</>");
		
		//请看xml文件android:autoLink="all" 这样效果跟上面一样
		txt2.setText("<a href=\"http://www.baidu.com\">百度</>");
		
		//html格式拓展
		String html = "<font color=\"red\">enjoy life</font><br>";
        html+= "<font color=\"#0000FF\"><big><i>enjoy life</i></big></font><br><p>";
        html+="<big>百度www.baidu.com</big>";
        CharSequence charSequence = Html.fromHtml(html);
        txt3.setText(charSequence);
        txt3.setMovementMethod(LinkMovementMethod.getInstance());//超级链接

        //只email超级链接
        txt4.setAutoLinkMask(Linkify.EMAIL_ADDRESSES);	//这句必须要写在下句前
        txt4.setText("aa@aa.com 13912345678 www.baidu.com");

        //只手机号超级链接
        txt5.setAutoLinkMask(Linkify.PHONE_NUMBERS);
        txt5.setText("aa@aa.com 13912345678 www.baidu.com");

        //只网址超级链接
        txt6.setAutoLinkMask(Linkify.WEB_URLS);
        txt6.setText("aa@aa.com 13912345678 www.baidu.com");

        //所有超级链接
        txt7.setAutoLinkMask(Linkify.ALL);
        txt7.setText("aa@aa.com 13912345678 www.baidu.com");
        
        //xml里修改属性
        txt8.setText("aa@aa.com 13912345678 www.baidu.com");	//邮箱
        txt9.setText("aa@aa.com 13912345678 www.baidu.com");	//手机号
        txt10.setText("aa@aa.com 13912345678 www.baidu.com");	//网址
        txt11.setText("aa@aa.com 13912345678 www.baidu.com");	//所有
        
        String html2 = "图像1<img src=\"image1\" style=\"display: none;\"><p>";
         
//        CharSequence charSequence2 = Html.fromHtml(html2);
        CharSequence charSequence2= Html.fromHtml(html2,new ImageGetter() {

            public Drawable getDrawable(String source) {
                 Log.i("sss","source:"+source);
//                 return null;
                //获得系统资源的信息，比如图片信息
                Drawable drawable = getResources().getDrawable(getResourceId(source));
                // 第三个图片 按50%压缩
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                
                return drawable;
            }
             
        }, null);
         
         
        txt12.setText(charSequence2);
        txt12.setMovementMethod(LinkMovementMethod.getInstance());
        

        String str13 = "hello this is lovely world";
        txt13.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableString ss = new SpannableString(str13);
        ClickableSpan cs = new ClickableSpan() {
			public void onClick(View widget) {
                Log.i("sss","clicked1 ");
                Intent intent = new Intent(TextviewAct.this,TextviewSubAct.class);
                startActivity(intent);
			}
		};
        ss.setSpan(cs, 6, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt13.setText(ss);
        
        String str14 = "hello this is new world hello this is new world hello this is new world "; 
        txt14.setMovementMethod(LinkMovementMethod.getInstance());
        txt14.setText(str14);
        
        //txt19 xml-修改背景颜色
        
        //txt20 xml-密码形式显示
        
        //txt21 xml-斜体显示

        //txt22 xml-粗体显示

        //txt23 xml-普通模式显示

        //txt24 xml-阴影显示

        //txt25 xml-自宽设置

        //txt26 xml-字体颜色
        
        //txt27 xml-字数超限时用。。。表示
        txt27.setText("hello world hello world hello world hello world hello world hello world");

        //txt28 xml-设置字体大小
        
        //txt29 xml-翻转180度
        
        //txt30 xml-Y翻转180度
        
        //txt31 xml-翻转180度+Y翻转180度
        
        //txt32 xml-翻转90度

        //txt33 字符串部分颜色-背景颜色 BackgroundColorSpan //第二三个变量分别是开始索引和结束索引
        SpannableString ss33 = new SpannableString("hello this is lovely world");  
        ss33.setSpan(new BackgroundColorSpan(Color.YELLOW), 1, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss33.setSpan(new BackgroundColorSpan(Color.YELLOW), 6, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt33.setText(ss33);

        //txt34 字符串部分颜色-文字颜色 ForegroundColorSpan //第二三个变量分别是开始索引和结束索引
        SpannableString ss34 = new SpannableString("hello this is lovely world");  
        ss34.setSpan(new ForegroundColorSpan(Color.BLUE), 6, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss34.setSpan(new ForegroundColorSpan(Color.BLUE), 14, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt34.setText(ss34);

        //txt35 字符串部分颜色-字体大小 AbsoluteSizeSpan //第二三个变量分别是开始索引和结束索引
        SpannableString ss35 = new SpannableString("hello this is lovely world");  
        ss35.setSpan(new AbsoluteSizeSpan(40), 3, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss35.setSpan(new AbsoluteSizeSpan(40), 21, 26, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt35.setText(ss35);

        //txt36 字符串部分颜色-文字风格斜体粗体 StyleSpan //第二三个变量分别是开始索引和结束索引
        SpannableString ss36 = new SpannableString("hello this is lovely world");  
        ss36.setSpan(new StyleSpan(Typeface.BOLD), 1, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss36.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), 6, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss36.setSpan(new StyleSpan(Typeface.ITALIC), 14, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt36.setText(ss36);

        //txt37 字符串部分颜色-删除线 StrikethroughSpan //第二三个变量分别是开始索引和结束索引
        SpannableString ss37 = new SpannableString("hello this is lovely world");  
        ss37.setSpan(new StrikethroughSpan(), 6, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss37.setSpan(new StrikethroughSpan(), 14, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt37.setText(ss37);

        //txt38 字符串部分颜色-下划线 UnderlineSpan //第二三个变量分别是开始索引和结束索引
        SpannableString ss38 = new SpannableString("hello this is lovely world");  
        ss38.setSpan(new UnderlineSpan(), 6, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss38.setSpan(new UnderlineSpan(), 14, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt38.setText(ss38);

        //txt39 字符串部分颜色-图片 ImageSpan //第二三个变量分别是开始索引和结束索引
        SpannableString ss39 = new SpannableString("hello this is lovely world");
        Drawable d = getResources().getDrawable(R.drawable.ic_launcher);  //获取图片
        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());  //设置大小
        ss39.setSpan(new ImageSpan(d, ImageSpan.ALIGN_BASELINE), 1, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);	//取代当前字
        ss39.setSpan(new ImageSpan(d, ImageSpan.ALIGN_BASELINE), 5, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt39.setText(ss39);
        
        //txt40 xml-居左
        
        //txt41 xml-居中
        
        //txt42 xml-居右
        
        //txt43 自定义点击事件MyClickSpan 去掉下划线 //第二三个变量分别是开始索引和结束索引
        txt43.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableString ss43 = new SpannableString("hello this is lovely world");  
        ClickableSpan mcs = new MyClickSpan() {
			public void onClick(View widget) {
                Log.i("sss","clicked1 ");
                Intent intent = new Intent(TextviewAct.this,TextviewSubAct.class);
                startActivity(intent);
			}
		};
        ss43.setSpan(mcs, 6, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt43.setText(ss43);
        
        //代码-阴影效果  1-模糊半径,越大越模糊 2-阴影离开文字的x横向距离 3-阴影离开文字的Y横向距离 4-阴影颜色
        txt44.setShadowLayer(1F, 11F,5F, Color.RED);
        
        //txt45 xml-利用res/values/styles.xml里的框架进行对文字的修改
	}
	
	private class MyClickSpan extends ClickableSpan {
	    @Override
	    public void updateDrawState(TextPaint ds) {
	        ds.setColor(ds.linkColor);
	        ds.setUnderlineText(false);
	    }

	    @Override
	    public void onClick(View widget) { 
	    }
	}
	
    public int getResourceId(String name){
        try {
            //根据资源ID的变量名获取Field对象 ，使用java反射寄宿制来实现的。
            Field field = R.drawable.class.getField(name);
            // 获取并返回资源的 id的字段(静态变量)的值，使用反射机制。
            return Integer.parseInt((field.get(null).toString()));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
         
        return 0;
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.textview, menu);
		return true; 
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
