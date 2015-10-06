package com.example.intent1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class Second_Activity extends Activity {
	
   TextView textView1;
   TextView textView2;
   TextView textView3;
   TextView textView4;
   TextView textView5;
   TextView textView6;
   TextView textView7;
   TextView textView8;
   TextView textView9;
   TextView textView10;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_);
	
	textView1=(TextView) findViewById(R.id.textView1);
	textView2=(TextView) findViewById(R.id.textView2);
	textView3=(TextView) findViewById(R.id.textView3);
	textView4=(TextView) findViewById(R.id.textView4);
	textView5=(TextView) findViewById(R.id.textView5);
	textView6=(TextView) findViewById(R.id.textView6);
	textView7=(TextView) findViewById(R.id.textView7);
	textView8=(TextView) findViewById(R.id.textView8);
	textView9=(TextView) findViewById(R.id.textView9);
	textView10=(TextView) findViewById(R.id.textView10);
	
	Intent intent=getIntent();
	Bundle b1=intent.getExtras();
	
	String s1=b1.getString("key1");
	String s2=b1.getString("key2");
	double i=Double.parseDouble(s2);
	
	if(s1==null&&s2==null)
	{
		textView2.setText(null);
		textView4.setText(null);
		textView6.setText(null);
		textView8.setText(null);
		textView10.setText(null);
	}
	else if(s1!=null&&i==0)
	{
	textView2.setText(s2);
	textView4.setText(""+add(i));
	textView6.setText(""+substract(i));
	textView8.setText(""+multiply(i));
	textView10.setText(""+divide(i));
	}
	else if(s1==null&&i!=0)
	{
		textView2.setText(s2);
		textView4.setText(""+add(i));
		textView6.setText(""+substract(i));
		textView8.setText(""+multiply(i));
		textView10.setText(""+divide(i));
	}
	else if(s1==null&& i!=0)
	{
		textView2.setText(s2);
		textView4.setText(""+add(i));
		textView6.setText(""+substract(i));
		textView8.setText(""+multiply(i));
		textView10.setText(""+divide(i));	
	}
	else if(s1!=null&& i!=0)
	{
		textView2.setText(s2);
		textView4.setText(""+add(i));
		textView6.setText(""+substract(i));
		textView8.setText(""+multiply(i));
		textView10.setText(""+divide(i));
	}
	}

	private double add(double i) {
		// TODO Auto-generated method stub
		return i+5;
	}

	private double substract(double i) {
		// TODO Auto-generated method stub
		return i-5;
	}

	private double multiply(double i) {
		// TODO Auto-generated method stub
		return i*5;
	}

	private double divide(double i) {
		// TODO Auto-generated method stub
		return i/5;
	}

	
}
