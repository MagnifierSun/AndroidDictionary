/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ViewGroup;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class FrameLayout
/*     */   extends ViewGroup
/*     */ {
/*     */   public FrameLayout(@RecentlyNonNull Context context) {
/*  49 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FrameLayout(@RecentlyNonNull Context context, @RecentlyNullable AttributeSet attrs) {
/*  57 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FrameLayout(@RecentlyNonNull Context context, @RecentlyNullable AttributeSet attrs, int defStyleAttr) {
/*  65 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FrameLayout(@RecentlyNonNull Context context, @RecentlyNullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  73 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*     */   public void setForegroundGravity(int foregroundGravity) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected LayoutParams generateDefaultLayoutParams() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
/*  97 */     throw new RuntimeException("Stub!");
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
/*     */   public void setMeasureAllChildren(boolean measureAll) {
/* 109 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean getConsiderGoneChildrenWhenMeasuring() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getMeasureAllChildren() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   } public LayoutParams generateLayoutParams(AttributeSet attrs) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   } public boolean shouldDelayChildPressedState() {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class LayoutParams
/*     */     extends ViewGroup.MarginLayoutParams
/*     */   {
/*     */     public static final int UNSPECIFIED_GRAVITY = -1;
/*     */ 
/*     */ 
/*     */     
/*     */     public int gravity;
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(@RecentlyNonNull Context c, @RecentlyNullable AttributeSet attrs) {
/* 160 */       super((ViewGroup.MarginLayoutParams)null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 220 */       this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(int width, int height) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(int width, int height, int gravity) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(@RecentlyNonNull ViewGroup.LayoutParams source) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(@RecentlyNonNull ViewGroup.MarginLayoutParams source) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(@RecentlyNonNull LayoutParams source) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1;
/*     */       throw new RuntimeException("Stub!"); }
/*     */   
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\FrameLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */