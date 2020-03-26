/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Rect;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ContextMenu;
/*     */ import android.view.GestureDetector;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
/*     */ import android.view.animation.Transformation;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated
/*     */ public class Gallery
/*     */   extends AbsSpinner
/*     */   implements GestureDetector.OnGestureListener
/*     */ {
/*     */   public Gallery(Context context) {
/*  48 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public Gallery(Context context, AttributeSet attrs) {
/*  50 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public Gallery(Context context, AttributeSet attrs, int defStyleAttr) {
/*  52 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public Gallery(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  54 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } protected void onAttachedToWindow() {
/*  56 */     throw new RuntimeException("Stub!");
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
/*     */   public void setCallbackDuringFling(boolean shouldCallback) {
/*  68 */     throw new RuntimeException("Stub!");
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
/*     */   public void setAnimationDuration(int animationDurationMillis) {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSpacing(int spacing) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUnselectedAlpha(float unselectedAlpha) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean getChildStaticTransformation(View child, Transformation t) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeHorizontalScrollExtent() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeHorizontalScrollOffset() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeHorizontalScrollRange() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int l, int t, int r, int b) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent event) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onSingleTapUp(MotionEvent e) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onDown(MotionEvent e) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLongPress(@RecentlyNonNull MotionEvent e) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   } public void onShowPress(MotionEvent e) {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   } public void dispatchSetSelected(boolean selected) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchSetPressed(boolean pressed) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } public boolean showContextMenuForChild(View originalView) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   } public boolean showContextMenuForChild(View originalView, float x, float y) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   } public boolean showContextMenu() {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   } public boolean showContextMenu(float x, float y) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchKeyEvent(KeyEvent event) {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onKeyDown(int keyCode, KeyEvent event) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyUp(int keyCode, KeyEvent event) {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGravity(int gravity) {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   } protected int getChildDrawingOrder(int childCount, int i) {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   } protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class LayoutParams
/*     */     extends ViewGroup.LayoutParams
/*     */   {
/*     */     public LayoutParams(Context c, AttributeSet attrs) {
/* 186 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public LayoutParams(int w, int h) {
/* 188 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public LayoutParams(ViewGroup.LayoutParams source) {
/* 190 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\Gallery.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */