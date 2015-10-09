package com.example.emergencycalll;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView contactlist;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    contactlist=(ListView) findViewById(R.id.listViewcall);
    
    final Bundle b=new Bundle();
    
    b.putString("Paula", "9874542311");
    b.putString("Harry", "8987542422");
    b.putString("Roy", "9435760133");
    b.putString("Brayn", "7864535244");
    b.putString("Renee", "7643218355");
    b.putString("Stella", "6472882466");
    b.putString("Brian", "9876543277");
    b.putString("Eddie", "8989764588");
    b.putString("Pepe", "9425367499");
    b.putString("Eve", "7634614101");
    b.putString("Ray", "9764523102");
    b.putString("Licia", "9845238103");
    b.putString("Franck", "7835428104");
    b.putString("Kirstie", "9876345105");
    b.putString("Fran", "7984523106");
    
    final String[] Contacts={"Paula","Harry","Roy","Brayn","Renee","Stella","Brian","Eddie","Pepe","Eve","Ray","Licia","Franck","Kirstie","Fran"};
    
    ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, Contacts);
    
    contactlist.setAdapter(adapter);
    
    contactlist.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg3) {
			Toast.makeText(MainActivity.this, "You Selected  " +Contacts[position], Toast.LENGTH_SHORT).show();	
			emergency(b.getString(Contacts[position]));
				
		}

		public void emergency(String s) {
			
			Intent intent=new Intent(Intent.ACTION_DIAL);
			intent.setData(Uri.parse("tel:"+s));
			startActivity(intent);
		}
	});
		
		
	}


   
}
