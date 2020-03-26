/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.SparseArray;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
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
/*     */ public abstract class AbsSpinner
/*     */   extends AdapterView<SpinnerAdapter>
/*     */ {
/*     */   public AbsSpinner(Context context) {
/*  32 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AbsSpinner(Context context, AttributeSet attrs) {
/*  34 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AbsSpinner(Context context, AttributeSet attrs, int defStyleAttr) {
/*  36 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AbsSpinner(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  38 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAdapter(SpinnerAdapter adapter) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelection(int position, boolean animate) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public void setSelection(int position) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public View getSelectedView() {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void requestLayout() {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   } public SpinnerAdapter getAdapter() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   } public int getCount() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int pointToPosition(int x, int y) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public Parcelable onSaveInstanceState() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public void onRestoreInstanceState(Parcelable state) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public void autofill(AutofillValue value) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAutofillType() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public AutofillValue getAutofillValue() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\AbsSpinner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */