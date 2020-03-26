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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScrollView
/*     */   extends FrameLayout
/*     */ {
/*     */   public ScrollView(Context context) {
/*  54 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ScrollView(Context context, AttributeSet attrs) {
/*  56 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  58 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ScrollView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  60 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public boolean shouldDelayChildPressedState() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } protected float getTopFadingEdgeStrength() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } protected float getBottomFadingEdgeStrength() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxScrollAmount() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child, int index) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child, ViewGroup.LayoutParams params) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child, int index, ViewGroup.LayoutParams params) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFillViewport() {
/*  91 */     throw new RuntimeException("Stub!");
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
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSmoothScrollingEnabled() {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchKeyEvent(KeyEvent event) {
/* 120 */     throw new RuntimeException("Stub!");
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
/* 131 */     throw new RuntimeException("Stub!");
/*     */   } public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onInterceptTouchEvent(MotionEvent ev) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent ev) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onGenericMotionEvent(MotionEvent event) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   } protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 143 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean fullScroll(int direction) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean arrowScroll(int direction) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void smoothScrollBy(int dx, int dy) {
/* 192 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void smoothScrollTo(int x, int y) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int computeVerticalScrollRange() {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollOffset() {
/* 210 */     throw new RuntimeException("Stub!");
/*     */   } protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
/* 212 */     throw new RuntimeException("Stub!");
/*     */   } protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
/* 214 */     throw new RuntimeException("Stub!");
/*     */   } public void computeScroll() {
/* 216 */     throw new RuntimeException("Stub!");
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
/* 227 */     throw new RuntimeException("Stub!");
/*     */   } public void requestChildFocus(View child, View focused) {
/* 229 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   } public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
/* 241 */     throw new RuntimeException("Stub!");
/*     */   } public void requestLayout() {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDetachedFromWindow() {
/* 245 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int l, int t, int r, int b) {
/* 247 */     throw new RuntimeException("Stub!");
/*     */   } protected void onSizeChanged(int w, int h, int oldw, int oldh) {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fling(int velocityY) {
/* 259 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void scrollTo(int x, int y) {
/* 267 */     throw new RuntimeException("Stub!");
/*     */   } public void setOverScrollMode(int mode) {
/* 269 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
/* 271 */     throw new RuntimeException("Stub!");
/*     */   } public void onNestedScrollAccepted(View child, View target, int axes) {
/* 273 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onStopNestedScroll(View target) {
/* 279 */     throw new RuntimeException("Stub!");
/*     */   } public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
/* 281 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
/* 287 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/* 289 */     throw new RuntimeException("Stub!");
/*     */   } protected void onRestoreInstanceState(Parcelable state) {
/* 291 */     throw new RuntimeException("Stub!");
/*     */   } protected Parcelable onSaveInstanceState() {
/* 293 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\ScrollView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */