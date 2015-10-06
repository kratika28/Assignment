package com.example.camera;



import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
 
	Button buttoncamera;
	public static final int CAMERA=1313;
	ImageView captureimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        
    buttoncamera=(Button) findViewById(R.id.buttoncamera);
    buttoncamera.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
			//startActivity(intent);
			startActivityForResult(intent,CAMERA);	
			
		}
	});
}
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	// TODO Auto-generated method stub
	super.onActivityResult(requestCode, resultCode, data);
if(requestCode==CAMERA)
{
  if(resultCode==RESULT_OK){
Bitmap bm=(Bitmap) data.getExtras().get("data");
Intent intent=new Intent(MainActivity.this,SecondActivity.class);
intent.putExtra("key1",bm );
startActivity(intent);
}
  else if(resultCode==RESULT_CANCELED){
Toast.makeText(MainActivity.this, "ERROR WITH CAMERA", Toast.LENGTH_SHORT).show();
 }
	   }
    

}
}

