/*    */ package android.service.media;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class CameraPrewarmService
/*    */   extends Service
/*    */ {
/*    */   public CameraPrewarmService() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   } public IBinder onBind(Intent intent) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public boolean onUnbind(Intent intent) {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onPrewarm();
/*    */   
/*    */   public abstract void onCooldown(boolean paramBoolean);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\service\media\CameraPrewarmService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */