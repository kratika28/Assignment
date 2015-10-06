package com.example.camera;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends Activity {
ImageView imageView;
Button buttonback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	
	imageView=(ImageView) findViewById(R.id.imageView);
	Bitmap bitmap=(Bitmap) getIntent().getExtras().get("key1");
	    imageView.setImageBitmap(bitmap);
	
	buttonback=(Button) findViewById(R.id.buttonback);
	buttonback.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		
			Intent intent=new Intent(SecondActivity.this,MainActivity.class);
			startActivity(intent);
		}
	});
	}

	


}
