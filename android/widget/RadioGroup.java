/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.TypedArray;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
/*     */ import android.view.ViewStructure;
/*     */ import android.view.autofill.AutofillValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RadioGroup
/*     */   extends LinearLayout
/*     */ {
/*     */   public RadioGroup(Context context) {
/*  55 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public RadioGroup(Context context, AttributeSet attrs) {
/*  61 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onFinishInflate() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public void addView(View child, int index, ViewGroup.LayoutParams params) {
/*  75 */     throw new RuntimeException("Stub!");
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
/*     */   public void check(int id) {
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
/*     */   
/*     */   public int getCheckedRadioButtonId() {
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
/*     */   public void clearCheck() {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnCheckedChangeListener(OnCheckedChangeListener listener) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public LayoutParams generateLayoutParams(AttributeSet attrs) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   } protected LinearLayout.LayoutParams generateDefaultLayoutParams() {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } public void onProvideAutofillStructure(ViewStructure structure, int flags) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public void autofill(AutofillValue value) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAutofillType() {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   } public AutofillValue getAutofillValue() {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnCheckedChangeListener
/*     */   {
/*     */     void onCheckedChanged(RadioGroup param1RadioGroup, int param1Int);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class LayoutParams
/*     */     extends LinearLayout.LayoutParams
/*     */   {
/*     */     public LayoutParams(Context c, AttributeSet attrs) {
/* 169 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(int w, int h) {
/* 175 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(int w, int h, float initWeight) {
/* 181 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(ViewGroup.LayoutParams p) {
/* 187 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutParams(ViewGroup.MarginLayoutParams source) {
/* 193 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
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
/*     */     protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) {
/* 206 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\RadioGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */