/*     */ package android.view;
/*     */ 
/*     */ import android.content.Context;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ViewTreeObserver
/*     */ {
/*     */   ViewTreeObserver(Context context) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOnWindowAttachListener(OnWindowAttachListener listener) {
/*  49 */     throw new RuntimeException("Stub!");
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
/*     */   public void removeOnWindowAttachListener(OnWindowAttachListener victim) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOnWindowFocusChangeListener(OnWindowFocusChangeListener listener) {
/*  71 */     throw new RuntimeException("Stub!");
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
/*     */   public void removeOnWindowFocusChangeListener(OnWindowFocusChangeListener victim) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOnGlobalFocusChangeListener(OnGlobalFocusChangeListener listener) {
/*  93 */     throw new RuntimeException("Stub!");
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
/*     */   public void removeOnGlobalFocusChangeListener(OnGlobalFocusChangeListener victim) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOnGlobalLayoutListener(OnGlobalLayoutListener listener) {
/* 116 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public void removeGlobalOnLayoutListener(OnGlobalLayoutListener victim) {
/* 130 */     throw new RuntimeException("Stub!");
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
/*     */   public void removeOnGlobalLayoutListener(OnGlobalLayoutListener victim) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOnPreDrawListener(OnPreDrawListener listener) {
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
/*     */   public void removeOnPreDrawListener(OnPreDrawListener victim) {
/* 164 */     throw new RuntimeException("Stub!");
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
/*     */   public void addOnDrawListener(OnDrawListener listener) {
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
/*     */   public void removeOnDrawListener(OnDrawListener victim) {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOnScrollChangedListener(OnScrollChangedListener listener) {
/* 200 */     throw new RuntimeException("Stub!");
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
/*     */   public void removeOnScrollChangedListener(OnScrollChangedListener victim) {
/* 212 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOnTouchModeChangeListener(OnTouchModeChangeListener listener) {
/* 222 */     throw new RuntimeException("Stub!");
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
/*     */   public void removeOnTouchModeChangeListener(OnTouchModeChangeListener victim) {
/* 234 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean isAlive() {
/* 246 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispatchOnGlobalLayout() {
/* 254 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean dispatchOnPreDraw() {
/* 265 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispatchOnDraw() {
/* 271 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnWindowFocusChangeListener {
/*     */     void onWindowFocusChanged(boolean param1Boolean);
/*     */   }
/*     */   
/*     */   public static interface OnWindowAttachListener {
/*     */     void onWindowAttached();
/*     */     
/*     */     void onWindowDetached();
/*     */   }
/*     */   
/*     */   public static interface OnTouchModeChangeListener {
/*     */     void onTouchModeChanged(boolean param1Boolean);
/*     */   }
/*     */   
/*     */   public static interface OnScrollChangedListener {
/*     */     void onScrollChanged();
/*     */   }
/*     */   
/*     */   public static interface OnPreDrawListener {
/*     */     boolean onPreDraw();
/*     */   }
/*     */   
/*     */   public static interface OnGlobalLayoutListener {
/*     */     void onGlobalLayout();
/*     */   }
/*     */   
/*     */   public static interface OnGlobalFocusChangeListener {
/*     */     void onGlobalFocusChanged(View param1View1, View param1View2);
/*     */   }
/*     */   
/*     */   public static interface OnDrawListener {
/*     */     void onDraw();
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\ViewTreeObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */