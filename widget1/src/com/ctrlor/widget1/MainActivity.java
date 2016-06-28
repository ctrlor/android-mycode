package com.ctrlor.widget1;

import com.ctrlor.widget1.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	// display a textview and button
	// ************************************************
	//TextView show = (TextView)findViewById(R.id.show_text);
	//Button press = (Button)findViewById(R.id.Click_Button);
	// ***********************************************

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		// display a textview and button
		// ************************************************
		Button press = (Button)findViewById(R.id.Click_Button);
		press.setOnClickListener(new Button.OnClickListener() {
			//@Override
			TextView show = (TextView)findViewById(R.id.show_text);
			public void onClick(View v) {
				show.setText("you click me");
			}
		});
		
		// *******************************************

		//two text view
		// *******************************************
		String str1 = "Welecome to the Android world! this is textview 1";
		TextView mTextView1 = (TextView)findViewById(R.id.text_view01);
		mTextView1.setText(str1);
		//********************************************

		
		// show colorful textview
		
		Button bShowTV = (Button)findViewById(R.id.show_TV);
		bShowTV.setText("show colorful textview");
		bShowTV.setOnClickListener( new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent0 = new Intent(MainActivity.this, ColorfulTextViewActivity.class);
				startActivity(intent0);
			}
		});
		
		// show TypefaceText Activity
/*		LinearLayout mainLayout = (LinearLayout)findViewById(R.layout.activity_main);
		Button btShowTF =  Button(this); */
		Button btShowTF = (Button)findViewById(R.id.button_showTypeface);
		btShowTF.setText(R.string.button_showTypeface);
		/*
		btShowTF.setLayoutParams(new ViewGroup.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT));
				*/
		btShowTF.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent0 = new Intent(MainActivity.this, TypefaceTextActivity.class);
				startActivity(intent0);
			}
		});
	//	mainLayout.addView(btShowTF);
		
		
		
		
		//setContentView(R.layout.activity_main);
//		setContentView(btShowTF);
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
	
}
