package com.nlabs.tables;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Table extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.table);
		
		ListView ll=(ListView) findViewById(R.id.tab);
		
		Bundle b=getIntent().getExtras();
		String ss=b.getString("number");
		int nu=Integer.parseInt(ss);

		ArrayList ar=new ArrayList();
		
		for(int i=1;i<=30;i++)
		{
			int j=i*nu;
			ar.add(nu+ " * "+i+" = "+j);
		}
		
		ll.setAdapter(new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, ar));
		

	}
}
