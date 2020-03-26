/*     */ package android.view;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Handler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GestureDetector
/*     */ {
/*     */   @Deprecated
/*     */   public GestureDetector(OnGestureListener listener, Handler handler) {
/*  60 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public GestureDetector(OnGestureListener listener) {
/*  76 */     throw new RuntimeException("Stub!");
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
/*     */   public GestureDetector(Context context, OnGestureListener listener) {
/*  90 */     throw new RuntimeException("Stub!");
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
/*     */   public GestureDetector(Context context, OnGestureListener listener, Handler handler) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GestureDetector(Context context, OnGestureListener listener, Handler handler, boolean unused) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContextClickListener(OnContextClickListener onContextClickListener) {
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
/*     */   public void setIsLongpressEnabled(boolean isLongpressEnabled) {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isLongpressEnabled() {
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
/*     */   public boolean onTouchEvent(MotionEvent ev) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onGenericMotionEvent(MotionEvent ev) {
/* 180 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class SimpleOnGestureListener
/*     */     implements OnGestureListener, OnDoubleTapListener, OnContextClickListener
/*     */   {
/*     */     public SimpleOnGestureListener() {
/* 337 */       throw new RuntimeException("Stub!");
/*     */     } public boolean onSingleTapUp(MotionEvent e) {
/* 339 */       throw new RuntimeException("Stub!");
/*     */     } public void onLongPress(MotionEvent e) {
/* 341 */       throw new RuntimeException("Stub!");
/*     */     } public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
/* 343 */       throw new RuntimeException("Stub!");
/*     */     } public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
/* 345 */       throw new RuntimeException("Stub!");
/*     */     } public void onShowPress(MotionEvent e) {
/* 347 */       throw new RuntimeException("Stub!");
/*     */     } public boolean onDown(MotionEvent e) {
/* 349 */       throw new RuntimeException("Stub!");
/*     */     } public boolean onDoubleTap(MotionEvent e) {
/* 351 */       throw new RuntimeException("Stub!");
/*     */     } public boolean onDoubleTapEvent(MotionEvent e) {
/* 353 */       throw new RuntimeException("Stub!");
/*     */     } public boolean onSingleTapConfirmed(MotionEvent e) {
/* 355 */       throw new RuntimeException("Stub!");
/*     */     } public boolean onContextClick(MotionEvent e) {
/* 357 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface OnGestureListener {
/*     */     boolean onDown(MotionEvent param1MotionEvent);
/*     */     
/*     */     void onShowPress(MotionEvent param1MotionEvent);
/*     */     
/*     */     boolean onSingleTapUp(MotionEvent param1MotionEvent);
/*     */     
/*     */     boolean onScroll(MotionEvent param1MotionEvent1, MotionEvent param1MotionEvent2, float param1Float1, float param1Float2);
/*     */     
/*     */     void onLongPress(MotionEvent param1MotionEvent);
/*     */     
/*     */     boolean onFling(MotionEvent param1MotionEvent1, MotionEvent param1MotionEvent2, float param1Float1, float param1Float2);
/*     */   }
/*     */   
/*     */   public static interface OnDoubleTapListener {
/*     */     boolean onSingleTapConfirmed(MotionEvent param1MotionEvent);
/*     */     
/*     */     boolean onDoubleTap(MotionEvent param1MotionEvent);
/*     */     
/*     */     boolean onDoubleTapEvent(MotionEvent param1MotionEvent);
/*     */   }
/*     */   
/*     */   public static interface OnContextClickListener {
/*     */     boolean onContextClick(MotionEvent param1MotionEvent);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\GestureDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */