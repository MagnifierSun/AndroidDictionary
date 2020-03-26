package android.widget;

import android.content.res.Resources;
import androidx.annotation.RecentlyNullable;

public interface ThemedSpinnerAdapter extends SpinnerAdapter {
  void setDropDownViewTheme(@RecentlyNullable Resources.Theme paramTheme);
  
  @RecentlyNullable
  Resources.Theme getDropDownViewTheme();
}


/* Location:              M:\learn_android\android.jar!\android\widget\ThemedSpinnerAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */