/*     */ package android.preference;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.res.TypedArray;
/*     */ import android.net.Uri;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RingtonePreference
/*     */   extends Preference
/*     */   implements PreferenceManager.OnActivityResultListener
/*     */ {
/*     */   public RingtonePreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  43 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public RingtonePreference(Context context, AttributeSet attrs, int defStyleAttr) {
/*  45 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public RingtonePreference(Context context, AttributeSet attrs) {
/*  47 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public RingtonePreference(Context context) {
/*  49 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getRingtoneType() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRingtoneType(int type) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getShowDefault() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShowDefault(boolean showDefault) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getShowSilent() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShowSilent(boolean showSilent) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } protected void onClick() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onPrepareRingtonePickerIntent(Intent ringtonePickerIntent) {
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
/*     */   protected void onSaveRingtone(Uri ringtoneUri) {
/* 125 */     throw new RuntimeException("Stub!");
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
/*     */   protected Uri onRestoreRingtone() {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   } protected Object onGetDefaultValue(TypedArray a, int index) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   } protected void onSetInitialValue(boolean restorePersistedValue, Object defaultValueObj) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   } protected void onAttachedToHierarchy(PreferenceManager preferenceManager) {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\preference\RingtonePreference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */