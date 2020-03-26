/*     */ package android.preference;
/*     */ 
/*     */ import android.app.AlertDialog;
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
/*     */ 
/*     */ 
/*     */ public class ListPreference
/*     */   extends DialogPreference
/*     */ {
/*     */   public ListPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  35 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ListPreference(Context context, AttributeSet attrs, int defStyleAttr) {
/*  37 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ListPreference(Context context, AttributeSet attrs) {
/*  39 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ListPreference(Context context) {
/*  41 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*     */   public void setEntries(CharSequence[] entries) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEntries(int entriesResId) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence[] getEntries() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEntryValues(CharSequence[] entryValues) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEntryValues(int entryValuesResId) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence[] getEntryValues() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(String value) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getSummary() {
/* 114 */     throw new RuntimeException("Stub!");
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
/*     */   public void setSummary(CharSequence summary) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValueIndex(int index) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValue() {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getEntry() {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int findIndexOfValue(String value) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   } protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDialogClosed(boolean positiveResult) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } protected Object onGetDefaultValue(TypedArray a, int index) {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   } protected void onSetInitialValue(boolean restoreValue, Object defaultValue) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   } protected Parcelable onSaveInstanceState() {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   } protected void onRestoreInstanceState(Parcelable state) {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\preference\ListPreference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */