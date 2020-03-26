/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.View;
/*     */ import android.view.accessibility.AccessibilityNodeInfo;
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
/*     */ @RemoteView
/*     */ public class ListView
/*     */   extends AbsListView
/*     */ {
/*     */   public ListView(Context context) {
/* 110 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ListView(Context context, AttributeSet attrs) {
/* 112 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ListView(Context context, AttributeSet attrs, int defStyleAttr) {
/* 114 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/* 116 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxScrollAmount() {
/* 123 */     throw new RuntimeException("Stub!");
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
/*     */   public void addHeaderView(View v, Object data, boolean isSelectable) {
/* 142 */     throw new RuntimeException("Stub!");
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
/*     */   public void addHeaderView(View v) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   } public int getHeaderViewsCount() {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeHeaderView(View v) {
/* 171 */     throw new RuntimeException("Stub!");
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
/*     */   public void addFooterView(View v, Object data, boolean isSelectable) {
/* 190 */     throw new RuntimeException("Stub!");
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
/*     */   public void addFooterView(View v) {
/* 207 */     throw new RuntimeException("Stub!");
/*     */   } public int getFooterViewsCount() {
/* 209 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeFooterView(View v) {
/* 219 */     throw new RuntimeException("Stub!");
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
/*     */   public ListAdapter getAdapter() {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRemoteViewsAdapter(Intent intent) {
/* 239 */     throw new RuntimeException("Stub!");
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
/*     */   public void setAdapter(ListAdapter adapter) {
/* 255 */     throw new RuntimeException("Stub!");
/*     */   } public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) {
/* 257 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void smoothScrollToPosition(int position) {
/* 265 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void smoothScrollByOffset(int offset) {
/* 273 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDetachedFromWindow() {
/* 275 */     throw new RuntimeException("Stub!");
/*     */   } protected void onSizeChanged(int w, int h, int oldw, int oldh) {
/* 277 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 279 */     throw new RuntimeException("Stub!");
/*     */   } protected void layoutChildren() {
/* 281 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean canAnimate() {
/* 283 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelection(int position) {
/* 293 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelectionAfterHeaderView() {
/* 300 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchKeyEvent(KeyEvent event) {
/* 302 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyDown(int keyCode, KeyEvent event) {
/* 304 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
/* 306 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyUp(int keyCode, KeyEvent event) {
/* 308 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItemsCanFocus(boolean itemsCanFocus) {
/* 317 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getItemsCanFocus() {
/* 324 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isOpaque() {
/* 326 */     throw new RuntimeException("Stub!");
/*     */   } public void setCacheColorHint(int color) {
/* 328 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchDraw(Canvas canvas) {
/* 330 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
/* 332 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Drawable getDivider() {
/* 342 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDivider(@RecentlyNullable Drawable divider) {
/* 355 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDividerHeight() {
/* 361 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDividerHeight(int height) {
/* 370 */     throw new RuntimeException("Stub!");
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
/*     */   public void setHeaderDividersEnabled(boolean headerDividersEnabled) {
/* 382 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean areHeaderDividersEnabled() {
/* 390 */     throw new RuntimeException("Stub!");
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
/*     */   public void setFooterDividersEnabled(boolean footerDividersEnabled) {
/* 402 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean areFooterDividersEnabled() {
/* 410 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOverscrollHeader(Drawable header) {
/* 419 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable getOverscrollHeader() {
/* 425 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOverscrollFooter(Drawable footer) {
/* 435 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable getOverscrollFooter() {
/* 441 */     throw new RuntimeException("Stub!");
/*     */   } protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
/* 443 */     throw new RuntimeException("Stub!");
/*     */   } protected void onFinishInflate() {
/* 445 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public long[] getCheckItemIds() {
/* 457 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 459 */     throw new RuntimeException("Stub!");
/*     */   } public void onInitializeAccessibilityNodeInfoForItem(View view, int position, AccessibilityNodeInfo info) {
/* 461 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public class FixedViewInfo {
/*     */     public Object data;
/*     */     public boolean isSelectable;
/*     */     public View view;
/*     */     
/*     */     public FixedViewInfo() {
/* 470 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\ListView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */