/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.PointerIcon;
/*     */ import android.view.View;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TabWidget
/*     */   extends LinearLayout
/*     */   implements View.OnFocusChangeListener
/*     */ {
/*     */   public TabWidget(Context context) {
/*  45 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TabWidget(Context context, AttributeSet attrs) {
/*  47 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TabWidget(Context context, AttributeSet attrs, int defStyleAttr) {
/*  49 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TabWidget(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  51 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } protected void onSizeChanged(int w, int h, int oldw, int oldh) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } protected int getChildDrawingOrder(int childCount, int i) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public View getChildTabViewAt(int index) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTabCount() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDividerDrawable(@RecentlyNullable Drawable drawable) {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDividerDrawable(int resId) {
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
/*     */   public void setLeftStripDrawable(@RecentlyNullable Drawable drawable) {
/* 103 */     throw new RuntimeException("Stub!");
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
/*     */   public void setLeftStripDrawable(int resId) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Drawable getLeftStripDrawable() {
/* 125 */     throw new RuntimeException("Stub!");
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
/*     */   public void setRightStripDrawable(@RecentlyNullable Drawable drawable) {
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
/*     */   public void setRightStripDrawable(int resId) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Drawable getRightStripDrawable() {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStripEnabled(boolean stripEnabled) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isStripEnabled() {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   } public void childDrawableStateChanged(View child) {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   } public void dispatchDraw(Canvas canvas) {
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
/*     */   public void setCurrentTab(int index) {
/* 210 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 212 */     throw new RuntimeException("Stub!");
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
/*     */   public void focusCurrentTab(int index) {
/* 229 */     throw new RuntimeException("Stub!");
/*     */   } public void setEnabled(boolean enabled) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child) {
/* 233 */     throw new RuntimeException("Stub!");
/*     */   } public void removeAllViews() {
/* 235 */     throw new RuntimeException("Stub!");
/*     */   } public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
/* 237 */     throw new RuntimeException("Stub!");
/*     */   } public void onFocusChange(View v, boolean hasFocus) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\TabWidget.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */