/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Canvas;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.accessibility.AccessibilityNodeProvider;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NumberPicker
/*     */   extends LinearLayout
/*     */ {
/*     */   public NumberPicker(Context context) {
/*  65 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberPicker(Context context, AttributeSet attrs) {
/*  74 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*     */   public NumberPicker(Context context, AttributeSet attrs, int defStyleAttr) {
/*  86 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*     */   public NumberPicker(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/* 102 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onInterceptTouchEvent(MotionEvent event) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent event) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchTouchEvent(MotionEvent event) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchKeyEvent(KeyEvent event) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchTrackballEvent(MotionEvent event) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean dispatchHoverEvent(MotionEvent event) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public void computeScroll() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public void setEnabled(boolean enabled) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } public void scrollBy(int x, int y) {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollOffset() {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollRange() {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollExtent() {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   } public int getSolidColor() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnValueChangedListener(OnValueChangeListener onValueChangedListener) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnScrollListener(OnScrollListener onScrollListener) {
/* 148 */     throw new RuntimeException("Stub!");
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
/*     */   public void setFormatter(Formatter formatter) {
/* 162 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(int value) {
/* 193 */     throw new RuntimeException("Stub!");
/*     */   } public boolean performClick() {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   } public boolean performLongClick() {
/* 197 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getWrapSelectorWheel() {
/* 208 */     throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public void setWrapSelectorWheel(boolean wrapSelectorWheel) {
/* 228 */     throw new RuntimeException("Stub!");
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
/*     */   public void setOnLongPressUpdateInterval(long intervalMillis) {
/* 241 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getValue() {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMinValue() {
/* 257 */     throw new RuntimeException("Stub!");
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
/*     */   public void setMinValue(int minValue) {
/* 270 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxValue() {
/* 278 */     throw new RuntimeException("Stub!");
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
/*     */   public void setMaxValue(int maxValue) {
/* 291 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] getDisplayedValues() {
/* 299 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDisplayedValues(String[] displayedValues) {
/* 311 */     throw new RuntimeException("Stub!");
/*     */   } protected float getTopFadingEdgeStrength() {
/* 313 */     throw new RuntimeException("Stub!");
/*     */   } protected float getBottomFadingEdgeStrength() {
/* 315 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDetachedFromWindow() {
/* 317 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void drawableStateChanged() {
/* 322 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public void jumpDrawablesToCurrentState() {
/* 327 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDraw(Canvas canvas) {
/* 329 */     throw new RuntimeException("Stub!");
/*     */   } public AccessibilityNodeProvider getAccessibilityNodeProvider() {
/* 331 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnValueChangeListener {
/*     */     void onValueChange(NumberPicker param1NumberPicker, int param1Int1, int param1Int2);
/*     */   }
/*     */   
/*     */   public static interface OnScrollListener {
/*     */     public static final int SCROLL_STATE_FLING = 2;
/*     */     public static final int SCROLL_STATE_IDLE = 0;
/*     */     public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
/*     */     
/*     */     void onScrollStateChange(NumberPicker param1NumberPicker, int param1Int);
/*     */   }
/*     */   
/*     */   public static interface Formatter {
/*     */     String format(int param1Int);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\NumberPicker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */