package com.therionroOS.simplestresstools;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.TextView;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Vibrator;
import android.content.ClipData;
import android.media.MediaPlayer;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;
import android.Manifest;
import android.content.pm.PackageManager;

public class ToolspageActivity extends Activity {
	
	public final int REQ_CD_DEX_DATA_INJECTOR = 101;
	
	private TextView mainlaber;
	private ScrollView scrollcontainer1;
	private LinearLayout Container1;
	private Button button_1;
	private EditText edittext_1;
	private Button button_2;
	private TextView textview_data1;
	private Button button_3;
	private TextView gggg;
	private TextView updatebutnotupdate;
	private Button button_4;
	private TextView gg;
	
	private Intent containersplus = new Intent();
	private SharedPreferences spsinject;
	private Vibrator vbon;
	private Intent DEX_DATA_INJECTOR = new Intent(Intent.ACTION_GET_CONTENT);
	private MediaPlayer MP_____DATA;
	private SharedPreferences deprecatedDATA;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toolspage);
		initialize(_savedInstanceState);
		
		if (Build.VERSION.SDK_INT >= 23) {
			if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
			||checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
				requestPermissions(new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
			} else {
				initializeLogic();
			}
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		mainlaber = findViewById(R.id.mainlaber);
		scrollcontainer1 = findViewById(R.id.scrollcontainer1);
		Container1 = findViewById(R.id.Container1);
		button_1 = findViewById(R.id.button_1);
		edittext_1 = findViewById(R.id.edittext_1);
		button_2 = findViewById(R.id.button_2);
		textview_data1 = findViewById(R.id.textview_data1);
		button_3 = findViewById(R.id.button_3);
		gggg = findViewById(R.id.gggg);
		updatebutnotupdate = findViewById(R.id.updatebutnotupdate);
		button_4 = findViewById(R.id.button_4);
		gg = findViewById(R.id.gg);
		spsinject = getSharedPreferences("sps", Activity.MODE_PRIVATE);
		vbon = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		DEX_DATA_INJECTOR.setType("*/*");
		DEX_DATA_INJECTOR.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		deprecatedDATA = getSharedPreferences("dps", Activity.MODE_PRIVATE);
		
		button_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), edittext_1.getText().toString());
			}
		});
		
		button_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiwi5wsi5");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiwi5wsi57whsj2828");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiuxrwi5wsi5");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdjtxjtxjtxykxgtiwi5wsi57whsj2828");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiwiktxxkgktx5wsi5");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiwi5wsi57whsj2828tjxhr647pg");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiwi5xjrhrzwsi5");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtii5fj5cj5xwi5wsi57whsj2828");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiwii5fu4xxu5i5d5wsi5");
				FileUtil.makeDir("/sdcard/Android/data/u5w85xdsirdttd95tdykxgtiwi5y4z4yzu4xu4xi5xi5xwsi57whsj2828");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsij5xu4x5dis7rdttd95tdykxgtiwi5wsi5.\n.i5ud5ud");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiwi5wsi57whsj2828..");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykw6ozddi5udtxxgtiwi5wsi5");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiwi5wsi57whsj2828gicifgugdufdtudutdutd");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirdttd95tdykxgtiwzzzzzzzi5wsi5");
				FileUtil.makeDir("/sdcard/Android/data/u5w8dsirAmogussusdttd95tdykxgtiwi5wsi57whsj2828");
			}
		});
		
		button_3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				containersplus.setClass(getApplicationContext(), CputhreaderActivity.class);
				startActivity(containersplus);
			}
		});
		
		button_4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}