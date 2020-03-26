/*    */ package android.app.job;
/*    */ 
/*    */ import android.app.Service;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class JobServiceEngine
/*    */ {
/*    */   public JobServiceEngine(Service service) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final IBinder getBinder() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract boolean onStartJob(JobParameters paramJobParameters);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract boolean onStopJob(JobParameters paramJobParameters);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void jobFinished(JobParameters params, boolean needsReschedule) {
/* 72 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\job\JobServiceEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */