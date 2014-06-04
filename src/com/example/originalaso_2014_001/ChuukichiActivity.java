package com.example.originalaso_2014_001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChuukichiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chuuki_activity);

		//渡ってきたintentを取得
		Intent intent = getIntent();
		//intentに混入していたEtraから、キーワードを策に値を取得
		String name = intent.getStringExtra( "name" );

		TextView tv = (TextView)findViewById(R.id.txvMsg);
		tv.setText( name + "さんの今日の運勢は…");
	}

}
