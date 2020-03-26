/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.util.AttributeSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RatingBar
/*     */   extends AbsSeekBar
/*     */ {
/*     */   public RatingBar(Context context, AttributeSet attrs, int defStyleAttr) {
/*  48 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public RatingBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  50 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public RatingBar(Context context, AttributeSet attrs) {
/*  52 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public RatingBar(Context context) {
/*  54 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnRatingBarChangeListener(OnRatingBarChangeListener listener) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OnRatingBarChangeListener getOnRatingBarChangeListener() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsIndicator(boolean isIndicator) {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isIndicator() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumStars(int numStars) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNumStars() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRating(float rating) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getRating() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStepSize(float stepSize) {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getStepSize() {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public synchronized void setMax(int max) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnRatingBarChangeListener {
/*     */     void onRatingChanged(RatingBar param1RatingBar, float param1Float, boolean param1Boolean);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\RatingBar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */