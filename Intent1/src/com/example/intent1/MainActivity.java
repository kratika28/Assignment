package com.example.intent1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	EditText edittextname;
	EditText edittextvalue;
	
	Button button;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    edittextname=(EditText) findViewById(R.id.edittextname);
    edittextvalue=(EditText) findViewById(R.id.edittextvalue);
    button=(Button) findViewById(R.id.buttonsubmit);
    
    button.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
if(edittextname.getText().toString().length()==0 && edittextvalue.getText().toString().length()==0)	
{
	Toast.makeText(MainActivity.this, "Enter the fields", Toast.LENGTH_SHORT).show();
}
else if(edittextname.getText().toString().length()!=0 && edittextvalue.getText().toString().length()!=0)			
{
	String s1=edittextname.getText().toString();
	String s2=edittextvalue.getText().toString();
	
	Intent intent=new Intent(MainActivity.this,Second_Activity.class);
	intent.putExtra("key1", s1);
	intent.putExtra("key2", s2);
	startActivity(intent);
}

else if(edittextname.getText().toString().length()!=0 && edittextvalue.getText().toString().length()==0)			
{
	String s1=edittextname.getText().toString();
	String s2=edittextvalue.getText().toString();
	
	Intent intent=new Intent(MainActivity.this,Second_Activity.class);
	intent.putExtra("key1", s1);
	intent.putExtra("key2", s2);
	startActivity(intent);
}		
		
else if(edittextname.getText().toString().length()==0 && edittextvalue.getText().toString().length()!=0)			
{
	String s1=edittextname.getText().toString();
	String s2=edittextvalue.getText().toString();
	
	Intent intent=new Intent(MainActivity.this,Second_Activity.class);
	intent.putExtra("key1", s1);
	intent.putExtra("key2", s2);
	startActivity(intent);
}		
		}
	});
    
    }


    
    
}
