package com.example.facebook;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText edittextselection1,edittextselection2;
	TextView textview;
	Button buttonselection1,buttonselection2; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    edittextselection1=(EditText) findViewById(R.id.edittextselection1);
    edittextselection2=(EditText) findViewById(R.id.edittextselection2);
    textview=(TextView) findViewById(R.id.textview);
    buttonselection1=(Button) findViewById(R.id.buttonselection1);
    buttonselection2=(Button) findViewById(R.id.buttonselection2);
    
    buttonselection1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
if(edittextselection1.getText().toString().equals("admin")&&edittextselection2.getText().toString().equals("admin")) 
{
	Toast.makeText(getApplicationContext(), "login successfull",Toast.LENGTH_SHORT).show();
	 }
else{
    Toast.makeText(getApplicationContext(), "login failed",Toast.LENGTH_SHORT).show();
	            
	  textview.setVisibility(View.VISIBLE);
	   textview.setBackgroundColor(Color.RED);
}
		}	
	});
    
		 
    
    }


   
    
}
