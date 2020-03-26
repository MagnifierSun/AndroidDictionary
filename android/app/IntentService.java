/*     */ package android.app;
/*     */ 
/*     */ import android.content.Intent;
/*     */ import android.os.IBinder;
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
/*     */ public abstract class IntentService
/*     */   extends Service
/*     */ {
/*     */   public IntentService(String name) {
/*  67 */     throw new RuntimeException("Stub!");
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
/*     */   public void setIntentRedelivery(boolean enabled) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public void onCreate() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onStart(@RecentlyNullable Intent intent, int startId) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int onStartCommand(@RecentlyNullable Intent intent, int flags, int startId) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public void onDestroy() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public IBinder onBind(Intent intent) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   protected abstract void onHandleIntent(@RecentlyNullable Intent paramIntent);
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\IntentService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */