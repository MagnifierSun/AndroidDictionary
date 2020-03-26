/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.ColorStateList;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ViewDebug.ExportedProperty;
/*     */ import android.view.ViewStructure;
/*     */ import android.view.autofill.AutofillValue;
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
/*     */ public abstract class CompoundButton
/*     */   extends Button
/*     */   implements Checkable
/*     */ {
/*     */   public CompoundButton(Context context) {
/*  42 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public CompoundButton(Context context, AttributeSet attrs) {
/*  44 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public CompoundButton(Context context, AttributeSet attrs, int defStyleAttr) {
/*  46 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public CompoundButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  48 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public void toggle() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*  52 */   public boolean performClick() { throw new RuntimeException("Stub!"); } @ExportedProperty
/*     */   public boolean isChecked() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChecked(boolean checked) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnCheckedChangeListener(@RecentlyNullable OnCheckedChangeListener listener) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setButtonDrawable(int resId) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setButtonDrawable(@RecentlyNullable Drawable drawable) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Drawable getButtonDrawable() {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setButtonTintList(@RecentlyNullable ColorStateList tint) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public ColorStateList getButtonTintList() {
/* 130 */     throw new RuntimeException("Stub!");
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
/*     */   public void setButtonTintMode(@RecentlyNullable PorterDuff.Mode tintMode) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public PorterDuff.Mode getButtonTintMode() {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   } public int getCompoundPaddingLeft() {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   } public int getCompoundPaddingRight() {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDraw(Canvas canvas) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   } protected int[] onCreateDrawableState(int extraSpace) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } protected void drawableStateChanged() {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   } public void drawableHotspotChanged(float x, float y) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean verifyDrawable(@RecentlyNonNull Drawable who) {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public void jumpDrawablesToCurrentState() {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   } public Parcelable onSaveInstanceState() {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   } public void onRestoreInstanceState(Parcelable state) {
/* 180 */     throw new RuntimeException("Stub!");
/*     */   } public void onProvideAutofillStructure(ViewStructure structure, int flags) {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   } public void autofill(AutofillValue value) {
/* 184 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAutofillType() {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   } public AutofillValue getAutofillValue() {
/* 192 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnCheckedChangeListener {
/*     */     void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\CompoundButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */