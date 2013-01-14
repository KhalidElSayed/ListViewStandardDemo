package com.michael.listview.standard;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseCompatableAdapter<Map<String, String>> {

	public MainAdapter(Context context, List<Map<String, String>> data) {
		super(context, data);
		
	}

	class ViewHolder {

		ImageView ivPic;
		TextView tvName;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		final ViewHolder viewHolder;
		if (convertView == null) {

			convertView = super.layoutInflater
					.inflate(R.layout.list_item, null);
			viewHolder = new ViewHolder();
			viewHolder.ivPic = (ImageView) convertView
					.findViewById(R.id.iv_pic);
			viewHolder.tvName = (TextView) convertView
					.findViewById(R.id.tv_name);

			convertView.setTag(viewHolder);
		} else {

			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		//TODO 接下去对数据进行绑定...

		return convertView;
	}

}
