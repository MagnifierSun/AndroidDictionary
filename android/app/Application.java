/*     */ package android.app;
/*     */ 
/*     */ import android.content.ComponentCallbacks;
/*     */ import android.content.ComponentCallbacks2;
/*     */ import android.content.ContextWrapper;
/*     */ import android.content.res.Configuration;
/*     */ import android.os.Bundle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Application
/*     */   extends ContextWrapper
/*     */   implements ComponentCallbacks2
/*     */ {
/*     */   public Application() {
/*  44 */     super(null); throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCreate() {
/*  69 */     throw new RuntimeException("Stub!");
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
/*     */   public void onTerminate() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public void onConfigurationChanged(Configuration newConfig) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public void onLowMemory() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public void onTrimMemory(int level) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public void registerComponentCallbacks(ComponentCallbacks callback) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterComponentCallbacks(ComponentCallbacks callback) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public void registerOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getProcessName() {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnProvideAssistDataListener {
/*     */     void onProvideAssistData(Activity param1Activity, Bundle param1Bundle);
/*     */   }
/*     */   
/*     */   public static interface ActivityLifecycleCallbacks {
/*     */     void onActivityCreated(Activity param1Activity, Bundle param1Bundle);
/*     */     
/*     */     void onActivityStarted(Activity param1Activity);
/*     */     
/*     */     void onActivityResumed(Activity param1Activity);
/*     */     
/*     */     void onActivityPaused(Activity param1Activity);
/*     */     
/*     */     void onActivityStopped(Activity param1Activity);
/*     */     
/*     */     void onActivitySaveInstanceState(Activity param1Activity, Bundle param1Bundle);
/*     */     
/*     */     void onActivityDestroyed(Activity param1Activity);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\Application.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */