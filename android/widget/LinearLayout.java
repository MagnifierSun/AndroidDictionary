/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ViewDebug.ExportedProperty;
/*     */ import android.view.ViewDebug.IntToString;
/*     */ import android.view.ViewGroup;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class LinearLayout
/*     */   extends ViewGroup
/*     */ {
/*     */   public static final int HORIZONTAL = 0;
/*     */   public static final int SHOW_DIVIDER_BEGINNING = 1;
/*     */   public static final int SHOW_DIVIDER_END = 4;
/*     */   public static final int SHOW_DIVIDER_MIDDLE = 2;
/*     */   public static final int SHOW_DIVIDER_NONE = 0;
/*     */   public static final int VERTICAL = 1;
/*     */   
/*     */   public LinearLayout(Context context) {
/*  75 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public LinearLayout(Context context, @RecentlyNullable AttributeSet attrs) {
/*  81 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public LinearLayout(Context context, @RecentlyNullable AttributeSet attrs, int defStyleAttr) {
/*  87 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public LinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  89 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*     */   public void setShowDividers(int showDividers) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public boolean shouldDelayChildPressedState() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getShowDividers() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable getDividerDrawable() {
/* 121 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDividerDrawable(Drawable divider) {
/* 133 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDividerPadding(int padding) {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDividerPadding() {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDraw(Canvas canvas) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBaselineAligned() {
/* 168 */     throw new RuntimeException("Stub!");
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
/*     */   public void setBaselineAligned(boolean baselineAligned) {
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
/*     */   public boolean isMeasureWithLargestChildEnabled() {
/* 193 */     throw new RuntimeException("Stub!");
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
/*     */   public void setMeasureWithLargestChildEnabled(boolean enabled) {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   } public int getBaseline() {
/* 210 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBaselineAlignedChildIndex() {
/* 218 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBaselineAlignedChildIndex(int i) {
/* 227 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getWeightSum() {
/* 237 */     throw new RuntimeException("Stub!");
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
/*     */   public void setWeightSum(float weightSum) {
/* 252 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 254 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int l, int t, int r, int b) {
/* 256 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRtlPropertiesChanged(int layoutDirection) {
/* 262 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrientation(int orientation) {
/* 273 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrientation() {
/* 283 */     throw new RuntimeException("Stub!");
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
/*     */   public void setGravity(int gravity) {
/* 296 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGravity() {
/* 305 */     throw new RuntimeException("Stub!");
/*     */   } public void setHorizontalGravity(int horizontalGravity) {
/* 307 */     throw new RuntimeException("Stub!");
/*     */   } public void setVerticalGravity(int verticalGravity) {
/* 309 */     throw new RuntimeException("Stub!");
/*     */   } public LayoutParams generateLayoutParams(AttributeSet attrs) {
/* 311 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected LayoutParams generateDefaultLayoutParams() {
/* 322 */     throw new RuntimeException("Stub!");
/*     */   } protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
/* 324 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
/* 326 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 328 */     throw new RuntimeException("Stub!");
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
/*     */   public static class LayoutParams
/*     */     extends ViewGroup.MarginLayoutParams
/*     */   {
/*     */     @ExportedProperty(category = "layout", mapping = {@IntToString(from = -1, to = "NONE"), @IntToString(from = 0, to = "NONE"), @IntToString(from = 48, to = "TOP"), @IntToString(from = 80, to = "BOTTOM"), @IntToString(from = 3, to = "LEFT"), @IntToString(from = 5, to = "RIGHT"), @IntToString(from = 8388611, to = "START"), @IntToString(from = 8388613, to = "END"), @IntToString(from = 16, to = "CENTER_VERTICAL"), @IntToString(from = 112, to = "FILL_VERTICAL"), @IntToString(from = 1, to = "CENTER_HORIZONTAL"), @IntToString(from = 7, to = "FILL_HORIZONTAL"), @IntToString(from = 17, to = "CENTER"), @IntToString(from = 119, to = "FILL")})
/*     */     public int gravity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @ExportedProperty(category = "layout")
/*     */     public float weight;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(Context c, AttributeSet attrs) {
/* 371 */       super((ViewGroup.MarginLayoutParams)null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 421 */       this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(int width, int height) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(int width, int height, float weight) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(ViewGroup.LayoutParams p) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(ViewGroup.MarginLayoutParams source) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1; throw new RuntimeException("Stub!"); } public LayoutParams(LayoutParams source) { super((ViewGroup.MarginLayoutParams)null); this.gravity = -1;
/*     */       throw new RuntimeException("Stub!"); }
/*     */ 
/*     */     
/*     */     public String debug(String output) {
/*     */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\LinearLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */