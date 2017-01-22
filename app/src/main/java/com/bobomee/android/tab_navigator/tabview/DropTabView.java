package com.bobomee.android.tab_navigator.tabview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bobomee.android.navigator.view.TabView;
import com.bobomee.android.tab_navigator.R;

/**
 * Created on 2016/11/16.下午3:26.
 *
 * @author bobomee.
 * @description
 */

public class DropTabView extends TabView {
  TextView textView;
  View bottomLine;

  public DropTabView(Context context) {
    this(context, null);
  }

  public DropTabView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public DropTabView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  private void init() {
    View view =  LayoutInflater.from(getContext()).inflate(R.layout.layout_tab_drop_down,this, true);
    textView = (TextView) view.findViewById(R.id.textView);
    bottomLine = view.findViewById(R.id.bottomLine);
  }


  public void setText(CharSequence text) {
    textView.setText(text);
  }

  public void setChecked(boolean checked) {
    super.setChecked(checked);
    Drawable icon;
    if (checked) {
      icon = getResources().getDrawable(R.drawable.ic_dropdown_actived);
      bottomLine.setVisibility(VISIBLE);
    } else {
      icon = getResources().getDrawable(R.drawable.ic_dropdown_normal);
      bottomLine.setVisibility(GONE);
    }
    textView.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null);
  }


}
