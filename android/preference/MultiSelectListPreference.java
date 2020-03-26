/*     */ package android.preference;
/*     */ 
/*     */ import android.app.AlertDialog;
/*     */ import android.content.Context;
/*     */ import android.content.res.TypedArray;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MultiSelectListPreference
/*     */   extends DialogPreference
/*     */ {
/*     */   public MultiSelectListPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  37 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public MultiSelectListPreference(Context context, AttributeSet attrs, int defStyleAttr) {
/*  39 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public MultiSelectListPreference(Context context, AttributeSet attrs) {
/*  41 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public MultiSelectListPreference(Context context) {
/*  43 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEntries(int entriesResId) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence[] getEntries() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEntryValues(CharSequence[] entryValues) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEntryValues(int entryValuesResId) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence[] getEntryValues() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValues(Set<String> values) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getValues() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int findIndexOfValue(String value) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDialogClosed(boolean positiveResult) {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   } protected Object onGetDefaultValue(TypedArray a, int index) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   } protected void onSetInitialValue(boolean restoreValue, Object defaultValue) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   } protected Parcelable onSaveInstanceState() {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\preference\MultiSelectListPreference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */