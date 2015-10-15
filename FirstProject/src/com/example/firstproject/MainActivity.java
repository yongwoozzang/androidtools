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
        data.add("3.����");
        data.add("4.������");
        data.add("5.ҳ����ת");
        data.add("6.�˵�");
        data.add("7.�Ի���");
        data.add("8.ͼ��ImageView");
        data.add("9.ͼ��ť");
        data.add("10.������");
        data.add("11.�Զ�����ͼ");
        data.add("12.ViewGroup");
        data.add("13.�ı��л���");
        data.add("14.ͼ���л���");
        data.add("15.��ѡ��ť��");
        data.add("16.������");
        data.add("17.����_���Բ���");
        data.add("18.����_��Բ���");
        data.add("19.����_������");
        data.add("20.����_������ͼ��");
        data.add("21.�ұ���ͼ��");
        data.add("22.Tab��֯UI");
        data.add("23.2D_ͼ��ͼ���ı��Ļ�������");
        data.add("24.�ı��Ķ��뷽ʽ");
        data.add("25.ʹ��·��Ч��");
        data.add("26.�ü�Ч��");
        data.add("27.��¼���ƵĹ���");
        data.add("28.����Ч��");
        data.add("30.3D_�����Ļ���");
        data.add("31.��Ⱦ����ʵ��");
        data.add("32.����Ч��ʵ��");
         
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
