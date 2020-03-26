/*     */ package android.widget;
/*     */ 
/*     */ import android.animation.ObjectAnimator;
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.os.Parcelable;
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
/*     */ public abstract class AdapterViewAnimator
/*     */   extends AdapterView<Adapter>
/*     */   implements Advanceable
/*     */ {
/*     */   public AdapterViewAnimator(Context context) {
/*  39 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AdapterViewAnimator(Context context, AttributeSet attrs) {
/*  41 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AdapterViewAnimator(Context context, AttributeSet attrs, int defStyleAttr) {
/*  43 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AdapterViewAnimator(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  45 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisplayedChild(int whichChild) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDisplayedChild() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void showNext() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void showPrevious() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent ev) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   } public Parcelable onSaveInstanceState() {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   } public void onRestoreInstanceState(Parcelable state) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public View getCurrentView() {
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
/*     */   public ObjectAnimator getInAnimation() {
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
/*     */   public void setInAnimation(ObjectAnimator inAnimation) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObjectAnimator getOutAnimation() {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOutAnimation(ObjectAnimator outAnimation) {
/* 135 */     throw new RuntimeException("Stub!");
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
/*     */   public void setInAnimation(Context context, int resourceID) {
/* 147 */     throw new RuntimeException("Stub!");
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
/*     */   public void setOutAnimation(Context context, int resourceID) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAnimateFirstView(boolean animate) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   } public int getBaseline() {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   } public Adapter getAdapter() {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } public void setAdapter(Adapter adapter) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRemoteViewsAdapter(Intent intent) {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   } public void setSelection(int position) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   } public View getSelectedView() {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deferNotifyDataSetChanged() {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onRemoteAdapterConnected() {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRemoteAdapterDisconnected() {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void advance() {
/* 215 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fyiWillBeAdvancedByHostKThx() {
/* 224 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 226 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\AdapterViewAnimator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */