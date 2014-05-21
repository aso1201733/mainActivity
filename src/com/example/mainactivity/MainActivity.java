package com.example.mainactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.util.Log;

public class MainActivity extends Activity {

	private static final String Tag = "らいふさいくる";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(Tag,"オンクリエイトイベント");
		setContentView(R.layout.activity_main);
	}
	@Override
	protected void onStart(){
		super.onStart();
		Log.v(Tag,"オンスタートいべんと");
	}

	@Override
	protected void onRestart(){
		super.onRestart();
		Log.v(Tag,"オンリスタートイベント");
	}

	@Override
	protected void onResume(){
		super.onResume();
		Log.v(Tag,"オンりじゅーむイベント");
	}

	@Override
	protected void onPause(){
		super.onResume();
		Log.v(Tag,"オンpo-zuイベント");
	}

	@Override
	protected void onStop(){
		super.onResume();
		Log.v(Tag,"オンStopイベント");
	}

	@Override
	protected void onDestroy(){
		super.onResume();
		Log.v(Tag,"オンですとろいイベント");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}