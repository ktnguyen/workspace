package com.example.thenewboston;
import android.app.Activity;
import android.os.Bundle;
import android.content.*;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run() {
				try{
					sleep(5000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				finally{
					//switch page
					Intent intent = new Intent("android.intent.action.MENU");
					startActivity(intent);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	

}
