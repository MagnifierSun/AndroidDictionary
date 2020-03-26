package android.text.method;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;

public interface KeyListener {
  int getInputType();
  
  boolean onKeyDown(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent);
  
  boolean onKeyUp(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent);
  
  boolean onKeyOther(View paramView, Editable paramEditable, KeyEvent paramKeyEvent);
  
  void clearMetaKeyState(View paramView, Editable paramEditable, int paramInt);
}


/* Location:              M:\learn_android\android.jar!\android\text\method\KeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */