/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.SparseArray;
/*     */ import android.view.ContextMenu;
/*     */ import android.view.View;
/*     */ import android.view.ViewDebug.CapturedViewProperty;
/*     */ import android.view.ViewGroup;
/*     */ import android.view.ViewStructure;
/*     */ import androidx.annotation.RecentlyNullable;
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
/*     */ public abstract class AdapterView<T extends Adapter>
/*     */   extends ViewGroup
/*     */ {
/*     */   public static final int INVALID_POSITION = -1;
/*     */   public static final long INVALID_ROW_ID = -9223372036854775808L;
/*     */   public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;
/*     */   public static final int ITEM_VIEW_TYPE_IGNORE = -1;
/*     */   
/*     */   public AdapterView(Context context) {
/*  43 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AdapterView(Context context, AttributeSet attrs) {
/*  45 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AdapterView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  47 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AdapterView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  49 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnItemClickListener(@RecentlyNullable OnItemClickListener listener) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public final OnItemClickListener getOnItemClickListener() {
/*  67 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean performItemClick(View view, int position, long id) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnItemLongClickListener(OnItemLongClickListener listener) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final OnItemLongClickListener getOnItemLongClickListener() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnItemSelectedListener(@RecentlyNullable OnItemSelectedListener listener) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public final OnItemSelectedListener getOnItemSelectedListener() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract T getAdapter();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void setAdapter(T paramT);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addView(View child) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addView(View child, int index) {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addView(View child, ViewGroup.LayoutParams params) {
/* 163 */     throw new RuntimeException("Stub!");
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
/*     */   public void addView(View child, int index, ViewGroup.LayoutParams params) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeView(View child) {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeViewAt(int index) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAllViews() {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
/* 205 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @CapturedViewProperty
/*     */   public int getSelectedItemPosition() {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @CapturedViewProperty
/*     */   public long getSelectedItemId() {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract View getSelectedView();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getSelectedItem() {
/* 234 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @CapturedViewProperty
/*     */   public int getCount() {
/* 242 */     throw new RuntimeException("Stub!");
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
/*     */   public int getPositionForView(View view) {
/* 261 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFirstVisiblePosition() {
/* 270 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLastVisiblePosition() {
/* 279 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void setSelection(int paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmptyView(View emptyView) {
/* 294 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public View getEmptyView() {
/* 304 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFocusable(int focusable) {
/* 310 */     throw new RuntimeException("Stub!");
/*     */   } public void setFocusableInTouchMode(boolean focusable) {
/* 312 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getItemAtPosition(int position) {
/* 321 */     throw new RuntimeException("Stub!");
/*     */   } public long getItemIdAtPosition(int position) {
/* 323 */     throw new RuntimeException("Stub!");
/*     */   } public void setOnClickListener(View.OnClickListener l) {
/* 325 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
/* 331 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
/* 337 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDetachedFromWindow() {
/* 339 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 341 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean canAnimate() {
/* 343 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onProvideAutofillStructure(ViewStructure structure, int flags) {
/* 353 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnItemSelectedListener
/*     */   {
/*     */     void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long);
/*     */ 
/*     */ 
/*     */     
/*     */     void onNothingSelected(AdapterView<?> param1AdapterView);
/*     */   }
/*     */ 
/*     */   
/*     */   public static interface OnItemLongClickListener
/*     */   {
/*     */     boolean onItemLongClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long);
/*     */   }
/*     */ 
/*     */   
/*     */   public static interface OnItemClickListener
/*     */   {
/*     */     void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long);
/*     */   }
/*     */ 
/*     */   
/*     */   public static class AdapterContextMenuInfo
/*     */     implements ContextMenu.ContextMenuInfo
/*     */   {
/*     */     public long id;
/*     */     
/*     */     public int position;
/*     */     
/*     */     public View targetView;
/*     */ 
/*     */     
/*     */     public AdapterContextMenuInfo(View targetView, int position, long id) {
/* 391 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\AdapterView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */