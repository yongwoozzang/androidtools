package com.example.firstproject;

import java.util.ArrayList;
import java.util.List;

import com.example.button.ButtonAct;
import com.example.textview.TextviewAct;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
        listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData()));
        setContentView(listView);
        listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Log.i("ss","pos:"+position);
				makeData(position);
			}
		});
	}

    private List<String> getData(){
         
        List<String> data = new ArrayList<String>();
        data.add("1.textview");
        data.add("2.button");
        data.add("3.键盘");
        data.add("4.触摸屏");
        data.add("5.页面跳转");
        data.add("6.菜单");
        data.add("7.对话框");
        data.add("8.图像ImageView");
        data.add("9.图像按钮");
        data.add("10.进度条");
        data.add("11.自定义视图");
        data.add("12.ViewGroup");
        data.add("13.文本切换器");
        data.add("14.图像切换器");
        data.add("15.单选按钮组");
        data.add("16.滚动条");
        data.add("17.布局_线性布局");
        data.add("18.布局_相对布局");
        data.add("19.布局_表单布局");
        data.add("20.布局_网格视图组");
        data.add("21.烈表视图组");
        data.add("22.Tab组织UI");
        data.add("23.2D_图像图形文本的基本绘制");
        data.add("24.文本的对齐方式");
        data.add("25.使用路径效果");
        data.add("26.裁剪效果");
        data.add("27.记录绘制的过程");
        data.add("28.动画效果");
        data.add("30.3D_基本的绘制");
        data.add("31.渲染器的实现");
        data.add("32.动画效果实现");
         
        return data;
    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

    private void makeData(int pos){
    	switch(pos){
    	case 0: 
    		click_1();	//1.textview
    		break;
    	case 1: 
    		click_2();	//2.button
    		break;
    	default:
    		break;
    	}
    }
    
    //1.textview
    private void click_1(){
    	startActivity(new Intent(this, TextviewAct.class));
    }
    
    //2.button
    private void click_2(){
    	startActivity(new Intent(this, ButtonAct.class));
    }
}
