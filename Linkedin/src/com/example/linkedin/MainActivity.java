package com.example.linkedin;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText ed1,ed2;
	Button b1,b2;
	TextView tx;
	String setUsername = "user1";
	String setPassword = "1234";
	String entUsername;
	String entpassword;
		

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    ed1=(EditText) findViewById(R.id.editText1);
    ed2=(EditText) findViewById(R.id.editText2);
    tx=(TextView) findViewById(R.id.textView);
    b1=(Button) findViewById(R.id.button1);
    b2=(Button) findViewById(R.id.button2);
    
   b1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		entUsername =ed1.getText().toString();
		entpassword =ed2.getText().toString();
		if(setUsername.equalsIgnoreCase(entUsername)&& setPassword.equals(entpassword))
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
    	
    
    


   
    

