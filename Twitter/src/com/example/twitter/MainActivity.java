package com.example.twitter;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText ed1,ed2;
	Button b1;
	String setUsername="user";
	String setPassword="123";
	String entUsername;
	String entPassword;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    ed1=(EditText) findViewById(R.id.editText1);
    ed2=(EditText) findViewById(R.id.editText2);
    b1=(Button) findViewById(R.id.button1);
    
    b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			entUsername =ed1.getText().toString();
			entPassword =ed2.getText().toString();
			if(setUsername.equalsIgnoreCase(entUsername)&& setPassword.equals(entPassword))
			    {
				  Toast.makeText(MainActivity.this,"Login successfull",Toast.LENGTH_SHORT).show();
				  Log.d("[DEBUG]","Login successfull");
				}
				else
				{
				  Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
				  Log.d("[DEBUG]","Login failed");
		        }
			}	
		});
    
    }
    
}
