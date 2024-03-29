package com.example.thenewboston;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{
	
	String classes[] = {"MainActivity", "TextPlay", "example2", "example3", "example4", "example5", "example6"};
	
	

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		super.onListItemClick(l, v, position, id);
		String cheese = classes[position];
		try {
			Class ourClass = Class.forName("com.example.thenewboston.MainActivity." + cheese);
			Intent intent = new Intent(Menu.this, ourClass);
			startActivity(intent);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
	}
	

}
