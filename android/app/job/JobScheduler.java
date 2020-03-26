/*    */ package android.app.job;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import androidx.annotation.RecentlyNullable;
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
/*    */ public abstract class JobScheduler
/*    */ {
/*    */   public static final int RESULT_FAILURE = 0;
/*    */   public static final int RESULT_SUCCESS = 1;
/*    */   
/*    */   public JobScheduler() {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int schedule(@RecentlyNonNull JobInfo paramJobInfo);
/*    */   
/*    */   public abstract int enqueue(@RecentlyNonNull JobInfo paramJobInfo, @RecentlyNonNull JobWorkItem paramJobWorkItem);
/*    */   
/*    */   public abstract void cancel(int paramInt);
/*    */   
/*    */   public abstract void cancelAll();
/*    */   
/*    */   @RecentlyNonNull
/*    */   public abstract List<JobInfo> getAllPendingJobs();
/*    */   
/*    */   @RecentlyNullable
/*    */   public abstract JobInfo getPendingJob(int paramInt);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\job\JobScheduler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */