package com.nlabs.tables;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainTable extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_table);
		
		final EditText ed=(EditText) findViewById(R.id.editText1);
		ImageButton im=(ImageButton) findViewById(R.id.imageButton1);
		ListView li=(ListView) findViewById(R.id.tab1);
		
		ArrayList ar=new ArrayList();
		for(int i=1;i<=30;i++)
		{
			ar.add(i);
		}
		
		im.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ss=ed.getText().toString();
				Intent in=new Intent(MainTable.this, Table.class);
				in.putExtra("number",ss);
				startActivity(in);
			}
		});
		
		li.setAdapter(new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, ar));
		
		li.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View arg1, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Object o=parent.getItemAtPosition(pos);
				String s=o.toString();
				Intent in=new Intent(MainTable.this, Table.class);
				in.putExtra("number",s);
				startActivity(in);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_table, menu);
		return true;
	}

}
