/*     */ package android.preference;
/*     */ 
/*     */ import android.app.Fragment;
/*     */ import android.content.Intent;
/*     */ import android.os.Bundle;
/*     */ import android.view.LayoutInflater;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated
/*     */ public abstract class PreferenceFragment
/*     */   extends Fragment
/*     */ {
/*     */   public PreferenceFragment() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCreate(@RecentlyNullable Bundle savedInstanceState) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public View onCreateView(LayoutInflater inflater, @RecentlyNullable ViewGroup container, @RecentlyNullable Bundle savedInstanceState) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onViewCreated(View view, @RecentlyNullable Bundle savedInstanceState) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onActivityCreated(@RecentlyNullable Bundle savedInstanceState) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } public void onStart() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   } public void onStop() {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   } public void onDestroyView() {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   } public void onDestroy() {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public void onSaveInstanceState(Bundle outState) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   } public void onActivityResult(int requestCode, int resultCode, Intent data) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PreferenceManager getPreferenceManager() {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PreferenceScreen getPreferenceScreen() {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addPreferencesFromIntent(Intent intent) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addPreferencesFromResource(int preferencesResId) {
/* 180 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Preference findPreference(CharSequence key) {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static interface OnPreferenceStartFragmentCallback {
/*     */     boolean onPreferenceStartFragment(PreferenceFragment param1PreferenceFragment, Preference param1Preference);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\preference\PreferenceFragment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */