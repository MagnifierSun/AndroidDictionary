package android.view;

import android.graphics.drawable.Drawable;

public interface ContextMenu extends Menu {
  ContextMenu setHeaderTitle(int paramInt);
  
  ContextMenu setHeaderTitle(CharSequence paramCharSequence);
  
  ContextMenu setHeaderIcon(int paramInt);
  
  ContextMenu setHeaderIcon(Drawable paramDrawable);
  
  ContextMenu setHeaderView(View paramView);
  
  void clearHeader();
  
  public static interface ContextMenuInfo {}
}


/* Location:              M:\learn_android\android.jar!\android\view\ContextMenu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */