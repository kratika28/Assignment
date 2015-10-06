package com.example.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	       Spinner spinnerunits;
    static EditText edittext1,edittext2;
	static TextView textviewresult;
	       Button buttonconvert;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	spinnerunits=(Spinner) findViewById(R.id.spinnerunits);
	edittext1=(EditText) findViewById(R.id.edittext1);
	edittext2=(EditText) findViewById(R.id.edittext2);
	buttonconvert=(Button) findViewById(R.id.buttonconvert);
	textviewresult=(TextView)findViewById(R.id.textviewresult);
	
final String[] converted={"Selection","Temprature","Length","Currency"};
ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,converted);
    spinnerunits.setAdapter(adapter);
    
    spinnerunits.setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
				long arg3) {
			// TODO Auto-generated method stub
			
	switch (pos) {
	case 1:
				edittext1.setHint("celcius");
				edittext2.setHint("Fahrenheit");
				buttonconvert.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
	/*if(edittext1.getText().toString().length()!=0 && edittext2.getText().toString().length()!=0) 
	{
		Toast.makeText(MainActivity.this,"Enter any field", Toast.LENGTH_SHORT).show();
	}*/
	 if(edittext1.getText().toString().length()==0 && edittext2.getText().toString().length()==0)
	{
		Toast.makeText(MainActivity.this, "Enter wny field", Toast.LENGTH_SHORT).show();
	}
	else if(edittext1.getText().toString().length()!=0 && edittext2.getText().toString().length()==0)
	{
		String s1=edittext1.getText().toString();
		double i=Double.parseDouble(s1);
		
		double j=tempctof(i);
		String s2=Double.toString(j); 
		textviewresult.setText(s2);
	}
	else if(edittext2.getText().toString().length()!=0 && edittext1.getText().toString().length()==0)
	{
		String s1=edittext2.getText().toString();
		double i=Double.parseDouble(s1);
		
		double j=tempftoc(i);
		String s2=Double.toString(j);
		textviewresult.setText(s2);
	
	}
   }

					private double tempftoc(double i) {
						// TODO Auto-generated method stub
						return  i*9/5 + 32;
					}

					private double tempctof(double i) {
						// TODO Auto-generated method stub
						return 5*(i-32)/9;
					}
});
	break;
	
	case 2:	
		edittext1.setHint("cm");
		edittext2.setHint("meter");
		
		buttonconvert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
/*if(edittext1.getText().toString().length()!=0 && edittext2.getText().toString().length()!=0) 
}*/
if(edittext1.getText().toString().length()==0 && edittext2.getText().toString().length()==0)
{
Toast.makeText(MainActivity.this, "Enter wny field", Toast.LENGTH_SHORT).show();
}
else if(edittext1.getText().toString().length()!=0 && edittext2.getText().toString().length()==0)
{
					String s1=edittext1.getText().toString();
					double i=Double.parseDouble(s1);
					
					double j=lengthcmtom(i);
					String s2=Double.toString(j); 
					textviewresult.setText(s2);
}
else if(edittext2.getText().toString().length()!=0&& edittext1.getText().toString().length()==0)
{
					String s1=edittext2.getText().toString();
					double i=Double.parseDouble(s1);
					
					double j=lengthmtocm(i);
					String s2=Double.toString(j);
					textviewresult.setText(s2);
				
				}
			}

			private double lengthmtocm(double i) {
				// TODO Auto-generated method stub
				return i*100;
			}

			private double lengthcmtom(double i) {
				// TODO Auto-generated method stub
				return i/100;
			}
		});
		break;		
	case 3:
		edittext1.setHint("Rs.");
		edittext2.setHint("$$");
		
		buttonconvert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
/*if(edittext1.getText().toString().length()!=0 && edittext2.getText().toString().length()!=0) 
			}*/
 if(edittext1.getText().toString().length()==0 && edittext2.getText().toString().length()==0)
{
Toast.makeText(MainActivity.this, "Enter wny field", Toast.LENGTH_SHORT).show();
}
else if(edittext1.getText().toString().length()!=0 && edittext2.getText().toString().length()==0)
{
					String s1=edittext1.getText().toString();
					double i=Double.parseDouble(s1);
					
					double j=CurrencyRsto$$(i);
					String s2=Double.toString(j); 
					textviewresult.setText(s2);
				}
				else if(edittext2.getText().toString().length()!=0&& edittext1.getText().toString().length()==0)
				{
					String s1=edittext2.getText().toString();
					double i=Double.parseDouble(s1);
					
					double j=Currency$$toRs(i);
					String s2=Double.toString(j);
					textviewresult.setText(s2);
				
				}
			}

			private double Currency$$toRs(double i) {
				// TODO Auto-generated method stub
				 return i*65;
			}

			private double CurrencyRsto$$(double i) {
				// TODO Auto-generated method stub
				return i/65;
			}
		});
		break;
			default:
	Toast.makeText(MainActivity.this, "Select Temperature or Length or Currency", Toast.LENGTH_SHORT).show();
				break;
			}
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
	});
    
	}
	
public void clear(){
	edittext1.setHint(""); 
	edittext2.setHint("");
}


}
