package android.text.method;

import android.graphics.Rect;
import android.view.View;

public interface TransformationMethod {
  CharSequence getTransformation(CharSequence paramCharSequence, View paramView);
  
  void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect);
}


/* Location:              M:\learn_android\android.jar!\android\text\method\TransformationMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */