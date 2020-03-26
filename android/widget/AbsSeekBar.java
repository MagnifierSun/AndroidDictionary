/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.ColorStateList;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import androidx.annotation.RecentlyNonNull;
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
/*     */ public abstract class AbsSeekBar
/*     */   extends ProgressBar
/*     */ {
/*     */   public AbsSeekBar(Context context) {
/*  31 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AbsSeekBar(Context context, AttributeSet attrs) {
/*  33 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AbsSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
/*  35 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AbsSeekBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  37 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setThumb(Drawable thumb) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable getThumb() {
/*  57 */     throw new RuntimeException("Stub!");
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
/*     */   public void setThumbTintList(@RecentlyNullable ColorStateList tint) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public ColorStateList getThumbTintList() {
/*  86 */     throw new RuntimeException("Stub!");
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
/*     */   public void setThumbTintMode(@RecentlyNullable PorterDuff.Mode tintMode) {
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
/*     */   @RecentlyNullable
/*     */   public PorterDuff.Mode getThumbTintMode() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getThumbOffset() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setThumbOffset(int thumbOffset) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSplitTrack(boolean splitTrack) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getSplitTrack() {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTickMark(Drawable tickMark) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable getTickMark() {
/* 160 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTickMarkTintList(@RecentlyNullable ColorStateList tint) {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public ColorStateList getTickMarkTintList() {
/* 189 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTickMarkTintMode(@RecentlyNullable PorterDuff.Mode tintMode) {
/* 205 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public PorterDuff.Mode getTickMarkTintMode() {
/* 217 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKeyProgressIncrement(int increment) {
/* 226 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getKeyProgressIncrement() {
/* 237 */     throw new RuntimeException("Stub!");
/*     */   } public synchronized void setMin(int min) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   } public synchronized void setMax(int max) {
/* 241 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean verifyDrawable(@RecentlyNonNull Drawable who) {
/* 247 */     throw new RuntimeException("Stub!");
/*     */   } public void jumpDrawablesToCurrentState() {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   } protected void drawableStateChanged() {
/* 251 */     throw new RuntimeException("Stub!");
/*     */   } public void drawableHotspotChanged(float x, float y) {
/* 253 */     throw new RuntimeException("Stub!");
/*     */   } protected void onSizeChanged(int w, int h, int oldw, int oldh) {
/* 255 */     throw new RuntimeException("Stub!");
/*     */   } protected synchronized void onDraw(Canvas canvas) {
/* 257 */     throw new RuntimeException("Stub!");
/*     */   } protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 259 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent event) {
/* 261 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyDown(int keyCode, KeyEvent event) {
/* 263 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 265 */     throw new RuntimeException("Stub!");
/*     */   } public void onRtlPropertiesChanged(int layoutDirection) {
/* 267 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\AbsSeekBar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */