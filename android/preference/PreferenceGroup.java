/*     */ package android.preference;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Bundle;
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
/*     */ public abstract class PreferenceGroup
/*     */   extends Preference
/*     */ {
/*     */   public PreferenceGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  39 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public PreferenceGroup(Context context, AttributeSet attrs, int defStyleAttr) {
/*  41 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public PreferenceGroup(Context context, AttributeSet attrs) {
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
/*     */   
/*     */   public void setOrderingAsAdded(boolean orderingAsAdded) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOrderingAsAdded() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addItemFromInflater(Preference preference) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPreferenceCount() {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Preference getPreference(int index) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean addPreference(Preference preference) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removePreference(Preference preference) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeAll() {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean onPrepareAddPreference(Preference preference) {
/* 122 */     throw new RuntimeException("Stub!");
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
/*     */   public Preference findPreference(CharSequence key) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isOnSameScreenAsChildren() {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   } protected void onAttachedToActivity() {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   } protected void onPrepareForRemoval() {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   } public void notifyDependencyChange(boolean disableDependents) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchSaveInstanceState(Bundle container) {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchRestoreInstanceState(Bundle container) {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\preference\PreferenceGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */