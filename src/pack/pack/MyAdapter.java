package pack.pack;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseExpandableListAdapter {

	private Context context;
	String []parent= {"Hébergement","Manger","Loisirs","Services"};
	
	String [][]children= {
			
			{
				"Hotêls","Maisons d'hôtes","Campings"
			},
			{
				"Restaurants","Cafés"
			},
			{
				"Park","Station"
			},
			{
				"Bureaux de change","Agences de voyages","Pharmacies","Locations de voitures"
			}
	};
	
	public MyAdapter(Context context) {
		this.context=context;
	}

	@Override
	public Object getChild(int arg0, int arg1) {
		
		return null;
	}

	@Override
	public long getChildId(int arg0, int arg1) {
		
		return 0;
	}

	@Override
	public View getChildView(int arg0, int arg1, boolean arg2, View arg3,
			ViewGroup arg4) {
		
		TextView tv=new TextView(context);
		tv.setText(children[arg0][arg1]);
		tv.setPadding(60,10,10,10);
		tv.setTextSize(16);
		tv.setTextColor(Color.rgb(55,55,55));
		
		return tv;
	}

	@Override
	public int getChildrenCount(int arg0) {
		return children[arg0].length;
	}

	@Override
	public Object getGroup(int arg0) {
		return null;
	}

	@Override
	public int getGroupCount() {
		return parent.length;
	}

	@Override
	public long getGroupId(int arg0) {
		return 0;
	}

	@Override
	public View getGroupView(int arg0, boolean arg1, View arg2, ViewGroup arg3) {
		
		TextView tv=new TextView(context);
		tv.setText(parent[arg0]);
		tv.setPadding(50,10,10,10);
		tv.setTextSize(20);
		tv.setTextColor(Color.rgb(55,55,55));
		
		return tv;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		return true;
	}

}
