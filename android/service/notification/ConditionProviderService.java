/*     */ package android.service.notification;
/*     */ 
/*     */ import android.app.Service;
/*     */ import android.content.ComponentName;
/*     */ import android.content.Intent;
/*     */ import android.net.Uri;
/*     */ import android.os.IBinder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ConditionProviderService
/*     */   extends Service
/*     */ {
/*     */   public static final String EXTRA_RULE_ID = "android.service.notification.extra.RULE_ID";
/*     */   public static final String META_DATA_CONFIGURATION_ACTIVITY = "android.service.zen.automatic.configurationActivity";
/*     */   public static final String META_DATA_RULE_INSTANCE_LIMIT = "android.service.zen.automatic.ruleInstanceLimit";
/*     */   public static final String META_DATA_RULE_TYPE = "android.service.zen.automatic.ruleType";
/*     */   public static final String SERVICE_INTERFACE = "android.service.notification.ConditionProviderService";
/*     */   
/*     */   public ConditionProviderService() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract void onConnected();
/*     */ 
/*     */   
/*     */   public void onRequestConditions(int relevance) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onSubscribe(Uri paramUri);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onUnsubscribe(Uri paramUri);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void requestRebind(ComponentName componentName) {
/*  88 */     throw new RuntimeException("Stub!");
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
/*     */   public final void requestUnbind() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void notifyCondition(Condition condition) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void notifyConditions(Condition... conditions) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public IBinder onBind(Intent intent) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\notification\ConditionProviderService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */