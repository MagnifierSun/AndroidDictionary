/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Rect;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
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
/*     */ public class HorizontalScrollView
/*     */   extends FrameLayout
/*     */ {
/*     */   public HorizontalScrollView(Context context) {
/*  47 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public HorizontalScrollView(Context context, AttributeSet attrs) {
/*  49 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public HorizontalScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  51 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public HorizontalScrollView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  53 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } protected float getLeftFadingEdgeStrength() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } protected float getRightFadingEdgeStrength() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxScrollAmount() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child, int index) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child, ViewGroup.LayoutParams params) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child, int index, ViewGroup.LayoutParams params) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFillViewport() {
/*  83 */     throw new RuntimeException("Stub!");
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
/*     */   public void setFillViewport(boolean fillViewport) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSmoothScrollingEnabled() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchKeyEvent(KeyEvent event) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean executeKeyEvent(KeyEvent event) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onInterceptTouchEvent(MotionEvent ev) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent ev) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onGenericMotionEvent(MotionEvent event) {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   } public boolean shouldDelayChildPressedState() {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   } protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 137 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean pageScroll(int direction) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean fullScroll(int direction) {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean arrowScroll(int direction) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void smoothScrollBy(int dx, int dy) {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void smoothScrollTo(int x, int y) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int computeHorizontalScrollRange() {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeHorizontalScrollOffset() {
/* 204 */     throw new RuntimeException("Stub!");
/*     */   } protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
/* 206 */     throw new RuntimeException("Stub!");
/*     */   } protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   } public void computeScroll() {
/* 210 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   } public void requestChildFocus(View child, View focused) {
/* 223 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
/* 233 */     throw new RuntimeException("Stub!");
/*     */   } public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
/* 235 */     throw new RuntimeException("Stub!");
/*     */   } public void requestLayout() {
/* 237 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int l, int t, int r, int b) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   } protected void onSizeChanged(int w, int h, int oldw, int oldh) {
/* 241 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fling(int velocityX) {
/* 251 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void scrollTo(int x, int y) {
/* 259 */     throw new RuntimeException("Stub!");
/*     */   } public void setOverScrollMode(int mode) {
/* 261 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/* 263 */     throw new RuntimeException("Stub!");
/*     */   } protected void onRestoreInstanceState(Parcelable state) {
/* 265 */     throw new RuntimeException("Stub!");
/*     */   } protected Parcelable onSaveInstanceState() {
/* 267 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\HorizontalScrollView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */