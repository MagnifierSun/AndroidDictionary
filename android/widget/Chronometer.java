/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.util.AttributeSet;
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
/*     */ @RemoteView
/*     */ public class Chronometer
/*     */   extends TextView
/*     */ {
/*     */   public Chronometer(Context context) {
/*  48 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Chronometer(Context context, AttributeSet attrs) {
/*  55 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Chronometer(Context context, AttributeSet attrs, int defStyleAttr) {
/*  62 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public Chronometer(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  64 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCountDown(boolean countDown) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCountDown() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isTheFinalCountDown() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBase(long base) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getBase() {
/* 102 */     throw new RuntimeException("Stub!");
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
/*     */   public void setFormat(String format) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFormat() {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnChronometerTickListener(OnChronometerTickListener listener) {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OnChronometerTickListener getOnChronometerTickListener() {
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
/*     */   public void start() {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stop() {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDetachedFromWindow() {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   } protected void onWindowVisibilityChanged(int visibility) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   } protected void onVisibilityChanged(View changedView, int visibility) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getContentDescription() {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnChronometerTickListener {
/*     */     void onChronometerTick(Chronometer param1Chronometer);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\Chronometer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */