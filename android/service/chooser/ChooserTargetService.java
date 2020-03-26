/*    */ package android.service.chooser;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.ComponentName;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentFilter;
/*    */ import android.os.IBinder;
/*    */ import java.util.List;
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
/*    */ public abstract class ChooserTargetService
/*    */   extends Service
/*    */ {
/*    */   public static final String BIND_PERMISSION = "android.permission.BIND_CHOOSER_TARGET_SERVICE";
/*    */   public static final String META_DATA_NAME = "android.service.chooser.chooser_target_service";
/*    */   public static final String SERVICE_INTERFACE = "android.service.chooser.ChooserTargetService";
/*    */   
/*    */   public ChooserTargetService() {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract List<ChooserTarget> onGetChooserTargets(ComponentName paramComponentName, IntentFilter paramIntentFilter);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public IBinder onBind(Intent intent) {
/* 97 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\service\chooser\ChooserTargetService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */