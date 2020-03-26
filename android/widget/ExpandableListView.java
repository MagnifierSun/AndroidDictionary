/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ContextMenu;
/*     */ import android.view.View;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ExpandableListView
/*     */   extends ListView
/*     */ {
/*     */   public static final int CHILD_INDICATOR_INHERIT = -1;
/*     */   public static final int PACKED_POSITION_TYPE_CHILD = 1;
/*     */   public static final int PACKED_POSITION_TYPE_GROUP = 0;
/*     */   public static final int PACKED_POSITION_TYPE_NULL = 2;
/*     */   public static final long PACKED_POSITION_VALUE_NULL = 4294967295L;
/*     */   
/*     */   public ExpandableListView(Context context) {
/*  75 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ExpandableListView(Context context, AttributeSet attrs) {
/*  77 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ExpandableListView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  79 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ExpandableListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  81 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public void onRtlPropertiesChanged(int layoutDirection) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchDraw(Canvas canvas) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChildDivider(Drawable childDivider) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAdapter(ListAdapter adapter) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ListAdapter getAdapter() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnItemClickListener(AdapterView.OnItemClickListener l) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAdapter(ExpandableListAdapter adapter) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ExpandableListAdapter getExpandableListAdapter() {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public boolean performItemClick(View v, int position, long id) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean expandGroup(int groupPos) {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean expandGroup(int groupPos, boolean animate) {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean collapseGroup(int groupPos) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   } public void setOnGroupCollapseListener(OnGroupCollapseListener onGroupCollapseListener) {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   } public void setOnGroupExpandListener(OnGroupExpandListener onGroupExpandListener) {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   } public void setOnGroupClickListener(OnGroupClickListener onGroupClickListener) {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public void setOnChildClickListener(OnChildClickListener onChildClickListener) {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getExpandableListPosition(int flatListPosition) {
/* 193 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFlatListPosition(long packedPosition) {
/* 207 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getSelectedPosition() {
/* 218 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getSelectedId() {
/* 228 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelectedGroup(int groupPosition) {
/* 235 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setSelectedChild(int groupPosition, int childPosition, boolean shouldExpandGroup) {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isGroupExpanded(int groupPosition) {
/* 258 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getPackedPositionType(long packedPosition) {
/* 270 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getPackedPositionGroup(long packedPosition) {
/* 282 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getPackedPositionChild(long packedPosition) {
/* 297 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getPackedPositionForChild(int groupPosition, int childPosition) {
/* 316 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getPackedPositionForGroup(int groupPosition) {
/* 326 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChildIndicator(Drawable childIndicator) {
/* 336 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChildIndicatorBounds(int left, int right) {
/* 350 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChildIndicatorBoundsRelative(int start, int end) {
/* 364 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGroupIndicator(Drawable groupIndicator) {
/* 375 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndicatorBounds(int left, int right) {
/* 389 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndicatorBoundsRelative(int start, int end) {
/* 403 */     throw new RuntimeException("Stub!");
/*     */   } public Parcelable onSaveInstanceState() {
/* 405 */     throw new RuntimeException("Stub!");
/*     */   } public void onRestoreInstanceState(Parcelable state) {
/* 407 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 409 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnGroupExpandListener
/*     */   {
/*     */     void onGroupExpand(int param1Int);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnGroupCollapseListener
/*     */   {
/*     */     void onGroupCollapse(int param1Int);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnGroupClickListener
/*     */   {
/*     */     boolean onGroupClick(ExpandableListView param1ExpandableListView, View param1View, int param1Int, long param1Long);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnChildClickListener
/*     */   {
/*     */     boolean onChildClick(ExpandableListView param1ExpandableListView, View param1View, int param1Int1, int param1Int2, long param1Long);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class ExpandableListContextMenuInfo
/*     */     implements ContextMenu.ContextMenuInfo
/*     */   {
/*     */     public long id;
/*     */     
/*     */     public long packedPosition;
/*     */     
/*     */     public View targetView;
/*     */ 
/*     */     
/*     */     public ExpandableListContextMenuInfo(View targetView, long packedPosition, long id) {
/* 453 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\ExpandableListView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */