package com.example.mainactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.util.Log;

public class MainActivity extends Activity {

	private static final String Tag = "�炢�ӂ�������";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(Tag,"�I���N���G�C�g�C�x���g");
		setContentView(R.layout.activity_main);
	}
	@Override
	protected void onStart(){
		super.onStart();
		Log.v(Tag,"�I���X�^�[�g���ׂ��");
	}

	@Override
	protected void onRestart(){
		super.onRestart();
		Log.v(Tag,"�I�����X�^�[�g�C�x���g");
	}

	@Override
	protected void onResume(){
		super.onResume();
		Log.v(Tag,"�I���肶��[�ރC�x���g");
	}

	@Override
	protected void onPause(){
		super.onResume();
		Log.v(Tag,"�I��po-zu�C�x���g");
	}

	@Override
	protected void onStop(){
		super.onResume();
		Log.v(Tag,"�I��Stop�C�x���g");
	}

	@Override
	protected void onDestroy(){
		super.onResume();
		Log.v(Tag,"�I���ł��Ƃ낢�C�x���g");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}