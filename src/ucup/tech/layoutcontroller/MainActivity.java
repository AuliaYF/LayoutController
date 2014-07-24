package ucup.tech.layoutcontroller;

import ucup.tech.ui.LayoutApi;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener, OnItemSelectedListener {
	RelativeLayout mRelative;
	ImageView img1, img2, img3;
	Button btn1, btn2, btn3;
	TextView txt;
	Spinner spinner;

	View mCurrent;

	LayoutApi API;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		API = new LayoutApi();

		mRelative = (RelativeLayout)findViewById(R.id.main);
		img1 = (ImageView)mRelative.findViewById(R.id.img1);
		img2 = (ImageView)mRelative.findViewById(R.id.img2);
		img3 = (ImageView)mRelative.findViewById(R.id.img3);

		btn1 = (Button)findViewById(R.id.btn1);
		btn2 = (Button)findViewById(R.id.btn2);
		btn3 = (Button)findViewById(R.id.btn3);

		txt = (TextView)findViewById(R.id.txtCurrent);

		spinner = (Spinner)findViewById(R.id.spn);
		spinner.setOnItemSelectedListener(this);

		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);

		img1.setOnClickListener(this);
		img2.setOnClickListener(this);
		img3.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		if(arg0==btn1){
			API.makeAlignLeft(mCurrent);
		}else if(arg0==btn2){
			API.makeAlignCenter(mCurrent);
		}else if(arg0==btn3){
			API.makeAlignRight(mCurrent);
		}
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		switch (arg2) {
		case 0:
			mCurrent = img1;
			break;
		case 1:
			mCurrent = img2;
			break;
		case 2:
			mCurrent = img3;
			break;
		}

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}
}
