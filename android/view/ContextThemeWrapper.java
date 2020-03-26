/*     */ package android.view;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.ContextWrapper;
/*     */ import android.content.res.AssetManager;
/*     */ import android.content.res.Configuration;
/*     */ import android.content.res.Resources;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ContextThemeWrapper
/*     */   extends ContextWrapper
/*     */ {
/*     */   public ContextThemeWrapper() {
/*  40 */     super(null); throw new RuntimeException("Stub!");
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
/*     */   public ContextThemeWrapper(Context base, int themeResId) {
/*  54 */     super(null); throw new RuntimeException("Stub!");
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
/*     */   public ContextThemeWrapper(Context base, Resources.Theme theme) {
/*  66 */     super(null); throw new RuntimeException("Stub!");
/*     */   } protected void attachBaseContext(Context newBase) {
/*  68 */     throw new RuntimeException("Stub!");
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
/*     */   public void applyOverrideConfiguration(Configuration overrideConfiguration) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   } public AssetManager getAssets() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   } public Resources getResources() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   } public void setTheme(int resid) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   } public Resources.Theme getTheme() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public Object getSystemService(String name) {
/*  91 */     throw new RuntimeException("Stub!");
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
/*     */   protected void onApplyThemeResource(Resources.Theme theme, int resId, boolean first) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\ContextThemeWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */