package android.view;

import android.graphics.drawable.Drawable;

public interface SubMenu extends Menu {
  SubMenu setHeaderTitle(int paramInt);
  
  SubMenu setHeaderTitle(CharSequence paramCharSequence);
  
  SubMenu setHeaderIcon(int paramInt);
  
  SubMenu setHeaderIcon(Drawable paramDrawable);
  
  SubMenu setHeaderView(View paramView);
  
  void clearHeader();
  
  SubMenu setIcon(int paramInt);
  
  SubMenu setIcon(Drawable paramDrawable);
  
  MenuItem getItem();
}


/* Location:              M:\learn_android\android.jar!\android\view\SubMenu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */