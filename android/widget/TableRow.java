/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.TypedArray;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.View;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TableRow
/*     */   extends LinearLayout
/*     */ {
/*     */   public TableRow(Context context) {
/*  49 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TableRow(Context context, AttributeSet attrs) {
/*  59 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onLayout(boolean changed, int l, int t, int r, int b) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public View getVirtualChildAt(int i) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getVirtualChildCount() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public LayoutParams generateLayoutParams(AttributeSet attrs) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected LinearLayout.LayoutParams generateDefaultLayoutParams() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class LayoutParams
/*     */     extends LinearLayout.LayoutParams
/*     */   {
/*     */     @ExportedProperty(category = "layout")
/*     */     public int column;
/*     */ 
/*     */     
/*     */     @ExportedProperty(category = "layout")
/*     */     public int span;
/*     */ 
/*     */     
/*     */     public LayoutParams(Context c, AttributeSet attrs) {
/* 134 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(int w, int h) {
/* 143 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(int w, int h, float initWeight) {
/* 153 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams() {
/* 161 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
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
/*     */     public LayoutParams(int column) {
/* 173 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(ViewGroup.LayoutParams p) {
/* 179 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(ViewGroup.MarginLayoutParams source) {
/* 185 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) {
/* 187 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\TableRow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */