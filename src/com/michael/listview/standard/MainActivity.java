package com.michael.listview.standard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lvData;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lvData = (ListView)findViewById(R.id.lv_data);
		
		List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
		
		Map<String, String> map;
		for(int i = 0; i < 50; i++){//模拟数据量，当并没有加入真实的数据源
			
			map = new HashMap<String, String>();
			dataList.add(map);
		}
		
		lvData.setAdapter(new MainAdapter(this, dataList));
	}

}
