/*     */ package android.preference;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.TypedArray;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class TwoStatePreference
/*     */   extends Preference
/*     */ {
/*     */   public TwoStatePreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  32 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TwoStatePreference(Context context, AttributeSet attrs, int defStyleAttr) {
/*  34 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TwoStatePreference(Context context, AttributeSet attrs) {
/*  36 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TwoStatePreference(Context context) {
/*  38 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } protected void onClick() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChecked(boolean checked) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isChecked() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public boolean shouldDisableDependents() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSummaryOn(CharSequence summary) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSummaryOn(int summaryResId) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getSummaryOn() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSummaryOff(CharSequence summary) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSummaryOff(int summaryResId) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getSummaryOff() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getDisableDependentsState() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisableDependentsState(boolean disableDependentsState) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } protected Object onGetDefaultValue(TypedArray a, int index) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } protected void onSetInitialValue(boolean restoreValue, Object defaultValue) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } protected Parcelable onSaveInstanceState() {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } protected void onRestoreInstanceState(Parcelable state) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\preference\TwoStatePreference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */