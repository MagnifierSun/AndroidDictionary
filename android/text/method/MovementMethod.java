package android.text.method;

import android.text.Spannable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

public interface MovementMethod {
  void initialize(TextView paramTextView, Spannable paramSpannable);
  
  boolean onKeyDown(TextView paramTextView, Spannable paramSpannable, int paramInt, KeyEvent paramKeyEvent);
  
  boolean onKeyUp(TextView paramTextView, Spannable paramSpannable, int paramInt, KeyEvent paramKeyEvent);
  
  boolean onKeyOther(TextView paramTextView, Spannable paramSpannable, KeyEvent paramKeyEvent);
  
  void onTakeFocus(TextView paramTextView, Spannable paramSpannable, int paramInt);
  
  boolean onTrackballEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent);
  
  boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent);
  
  boolean onGenericMotionEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent);
  
  boolean canSelectArbitrarily();
}


/* Location:              M:\learn_android\android.jar!\android\text\method\MovementMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */