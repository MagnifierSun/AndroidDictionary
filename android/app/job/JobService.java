/*    */ package android.app.job;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class JobService
/*    */   extends Service
/*    */ {
/*    */   public static final String PERMISSION_BIND = "android.permission.BIND_JOB_SERVICE";
/*    */   
/*    */   public JobService() {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public final IBinder onBind(Intent intent) {
/* 42 */     throw new RuntimeException("Stub!");
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
/*    */   public final void jobFinished(JobParameters params, boolean wantsReschedule) {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract boolean onStartJob(JobParameters paramJobParameters);
/*    */   
/*    */   public abstract boolean onStopJob(JobParameters paramJobParameters);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\job\JobService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */