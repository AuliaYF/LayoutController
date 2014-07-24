package ucup.tech.ui;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class LayoutApi {
	private LayoutParams mParam;

	public int getViewHeight(View v){
		return v.getHeight();
	}

	public int getViewWidth(View v){
		return v.getWidth();
	}

	public void makeToRightOf(View v, int of){
		mParam = new LayoutParams(getViewWidth(v), getViewHeight(v));
		mParam.addRule(RelativeLayout.RIGHT_OF, of);

		v.setLayoutParams(mParam);
	}

	public void makeToLeftOf(View v, int of){
		mParam = new LayoutParams(getViewWidth(v), getViewHeight(v));
		mParam.addRule(RelativeLayout.LEFT_OF, of);

		v.setLayoutParams(mParam);
	}

	public void makeAlignLeft(View v){
		mParam = new LayoutParams(getViewWidth(v), getViewHeight(v));
		mParam.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);

		v.setLayoutParams(mParam);
	}

	public void makeAlignCenter(View v){
		mParam = new LayoutParams(getViewWidth(v), getViewHeight(v));
		mParam.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);

		v.setLayoutParams(mParam);
	}

	public void makeAlignRight(View v){
		mParam = new LayoutParams(getViewWidth(v), getViewHeight(v));
		mParam.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);

		v.setLayoutParams(mParam);
	}
}
