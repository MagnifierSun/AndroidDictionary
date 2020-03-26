/*     */ package android.inputmethodservice;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Canvas;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.MotionEvent;
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
/*     */ public class KeyboardView
/*     */   extends View
/*     */   implements View.OnClickListener
/*     */ {
/*     */   public KeyboardView(Context context, AttributeSet attrs) {
/*  42 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public KeyboardView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  44 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public KeyboardView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  46 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } protected void onAttachedToWindow() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   } public void setOnKeyboardActionListener(OnKeyboardActionListener listener) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected OnKeyboardActionListener getOnKeyboardActionListener() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKeyboard(Keyboard keyboard) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Keyboard getKeyboard() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setShifted(boolean shifted) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isShifted() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPreviewEnabled(boolean previewEnabled) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPreviewEnabled() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public void setVerticalCorrection(int verticalOffset) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public void setPopupParent(View v) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public void setPopupOffset(int x, int y) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProximityCorrectionEnabled(boolean enabled) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isProximityCorrectionEnabled() {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onClick(View v) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public void onSizeChanged(int w, int h, int oldw, int oldh) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } public void onDraw(Canvas canvas) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void invalidateAllKeys() {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void invalidateKey(int keyIndex) {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean onLongPress(Keyboard.Key popupKey) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onHoverEvent(MotionEvent event) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent me) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   } protected void swipeRight() {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   } protected void swipeLeft() {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   } protected void swipeUp() {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   } protected void swipeDown() {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   } public void closing() {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   } public void onDetachedFromWindow() {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   } public boolean handleBack() {
/* 191 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnKeyboardActionListener {
/*     */     void onPress(int param1Int);
/*     */     
/*     */     void onRelease(int param1Int);
/*     */     
/*     */     void onKey(int param1Int, int[] param1ArrayOfint);
/*     */     
/*     */     void onText(CharSequence param1CharSequence);
/*     */     
/*     */     void swipeLeft();
/*     */     
/*     */     void swipeRight();
/*     */     
/*     */     void swipeDown();
/*     */     
/*     */     void swipeUp();
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\inputmethodservice\KeyboardView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */