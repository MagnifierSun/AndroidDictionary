/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ViewDebug.ExportedProperty;
/*     */ import android.view.ViewGroup;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public class RelativeLayout
/*     */   extends ViewGroup
/*     */ {
/*     */   public static final int ABOVE = 2;
/*     */   public static final int ALIGN_BASELINE = 4;
/*     */   public static final int ALIGN_BOTTOM = 8;
/*     */   public static final int ALIGN_END = 19;
/*     */   public static final int ALIGN_LEFT = 5;
/*     */   public static final int ALIGN_PARENT_BOTTOM = 12;
/*     */   public static final int ALIGN_PARENT_END = 21;
/*     */   public static final int ALIGN_PARENT_LEFT = 9;
/*     */   public static final int ALIGN_PARENT_RIGHT = 11;
/*     */   public static final int ALIGN_PARENT_START = 20;
/*     */   public static final int ALIGN_PARENT_TOP = 10;
/*     */   public static final int ALIGN_RIGHT = 7;
/*     */   public static final int ALIGN_START = 18;
/*     */   public static final int ALIGN_TOP = 6;
/*     */   public static final int BELOW = 3;
/*     */   public static final int CENTER_HORIZONTAL = 14;
/*     */   public static final int CENTER_IN_PARENT = 13;
/*     */   public static final int CENTER_VERTICAL = 15;
/*     */   public static final int END_OF = 17;
/*     */   public static final int LEFT_OF = 0;
/*     */   public static final int RIGHT_OF = 1;
/*     */   public static final int START_OF = 16;
/*     */   public static final int TRUE = -1;
/*     */   
/*     */   public RelativeLayout(Context context) {
/*  66 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public RelativeLayout(Context context, AttributeSet attrs) {
/*  68 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public RelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
/*  70 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public RelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  72 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public boolean shouldDelayChildPressedState() {
/*  74 */     throw new RuntimeException("Stub!");
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
/*     */   public void setIgnoreGravity(int viewId) {
/*  88 */     throw new RuntimeException("Stub!");
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
/*     */   public int getGravity() {
/* 101 */     throw new RuntimeException("Stub!");
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
/*     */   public void setGravity(int gravity) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public void setHorizontalGravity(int horizontalGravity) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } public void setVerticalGravity(int verticalGravity) {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   } public int getBaseline() {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   } public void requestLayout() {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int l, int t, int r, int b) {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   } public LayoutParams generateLayoutParams(AttributeSet attrs) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   } protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 148 */     throw new RuntimeException("Stub!");
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
/*     */   public static class LayoutParams
/*     */     extends ViewGroup.MarginLayoutParams
/*     */   {
/*     */     @ExportedProperty(category = "layout")
/*     */     public boolean alignWithParent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 335 */       super((ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public LayoutParams(int w, int h) {
/* 337 */       super((ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(ViewGroup.LayoutParams source) {
/* 343 */       super((ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(ViewGroup.MarginLayoutParams source) {
/* 349 */       super((ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(LayoutParams source) {
/* 358 */       super((ViewGroup.MarginLayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public String debug(String output) {
/* 360 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void addRule(int verb) {
/* 382 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void addRule(int verb, int subject) {
/* 405 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void removeRule(int verb) {
/* 424 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getRule(int verb) {
/* 439 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int[] getRules() {
/* 450 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void resolveLayoutDirection(int layoutDirection) {
/* 462 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\RelativeLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */