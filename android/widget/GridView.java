/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.graphics.Rect;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.View;
/*     */ import android.view.ViewDebug.ExportedProperty;
/*     */ import android.view.ViewGroup;
/*     */ import android.view.accessibility.AccessibilityNodeInfo;
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
/*     */ public class GridView
/*     */   extends AbsListView
/*     */ {
/*     */   public static final int AUTO_FIT = -1;
/*     */   public static final int NO_STRETCH = 0;
/*     */   public static final int STRETCH_COLUMN_WIDTH = 2;
/*     */   public static final int STRETCH_SPACING = 1;
/*     */   public static final int STRETCH_SPACING_UNIFORM = 3;
/*     */   
/*     */   public GridView(Context context) {
/*  42 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public GridView(Context context, AttributeSet attrs) {
/*  44 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public GridView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  46 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public GridView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  48 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ListAdapter getAdapter() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRemoteViewsAdapter(Intent intent) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAdapter(ListAdapter adapter) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void smoothScrollToPosition(int position) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void smoothScrollByOffset(int offset) {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } protected void attachLayoutAnimationParameters(View child, ViewGroup.LayoutParams params, int index, int count) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } protected void layoutChildren() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelection(int position) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyDown(int keyCode, KeyEvent event) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyUp(int keyCode, KeyEvent event) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGravity(int gravity) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGravity() {
/* 128 */     throw new RuntimeException("Stub!");
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
/*     */   public void setHorizontalSpacing(int horizontalSpacing) {
/* 140 */     throw new RuntimeException("Stub!");
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
/*     */   public int getHorizontalSpacing() {
/* 158 */     throw new RuntimeException("Stub!");
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
/*     */   public int getRequestedHorizontalSpacing() {
/* 177 */     throw new RuntimeException("Stub!");
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
/*     */   public void setVerticalSpacing(int verticalSpacing) {
/* 191 */     throw new RuntimeException("Stub!");
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
/*     */   public int getVerticalSpacing() {
/* 203 */     throw new RuntimeException("Stub!");
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
/*     */   public void setStretchMode(int stretchMode) {
/* 215 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStretchMode() {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColumnWidth(int columnWidth) {
/* 231 */     throw new RuntimeException("Stub!");
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
/*     */   public int getColumnWidth() {
/* 246 */     throw new RuntimeException("Stub!");
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
/*     */   public int getRequestedColumnWidth() {
/* 262 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumColumns(int numColumns) {
/* 272 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExportedProperty
/*     */   public int getNumColumns() {
/* 283 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollExtent() {
/* 285 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollOffset() {
/* 287 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollRange() {
/* 289 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 291 */     throw new RuntimeException("Stub!");
/*     */   } public void onInitializeAccessibilityNodeInfoForItem(View view, int position, AccessibilityNodeInfo info) {
/* 293 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\GridView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */