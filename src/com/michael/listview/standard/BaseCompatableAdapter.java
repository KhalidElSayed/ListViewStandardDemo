package com.michael.listview.standard;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;


/** 通用adapter  所有adapter  继承该类
 * 
 * @author Administrator
 *
 */
public abstract class BaseCompatableAdapter<T> extends BaseAdapter {

	 
	protected Context context;
	private List<T> data;
	protected LayoutInflater layoutInflater;

	public BaseCompatableAdapter(Context context, List<T> data) {
		this.context = context;
		this.data = data;
		layoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		if (data == null)
			return 0;
		return data.size();
	}

	@Override
	public T getItem(int position) {
		// TODO Auto-generated method stub
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

}
