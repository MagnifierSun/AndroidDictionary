package android.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public interface ExpandableListAdapter {
  void registerDataSetObserver(DataSetObserver paramDataSetObserver);
  
  void unregisterDataSetObserver(DataSetObserver paramDataSetObserver);
  
  int getGroupCount();
  
  int getChildrenCount(int paramInt);
  
  Object getGroup(int paramInt);
  
  Object getChild(int paramInt1, int paramInt2);
  
  long getGroupId(int paramInt);
  
  long getChildId(int paramInt1, int paramInt2);
  
  boolean hasStableIds();
  
  View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup);
  
  View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup);
  
  boolean isChildSelectable(int paramInt1, int paramInt2);
  
  boolean areAllItemsEnabled();
  
  boolean isEmpty();
  
  void onGroupExpanded(int paramInt);
  
  void onGroupCollapsed(int paramInt);
  
  long getCombinedChildId(long paramLong1, long paramLong2);
  
  long getCombinedGroupId(long paramLong);
}


/* Location:              M:\learn_android\android.jar!\android\widget\ExpandableListAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */