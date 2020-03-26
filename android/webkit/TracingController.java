/*    */ package android.webkit;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import androidx.annotation.RecentlyNullable;
/*    */ import java.io.OutputStream;
/*    */ import java.util.concurrent.Executor;
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
/*    */ public abstract class TracingController
/*    */ {
/*    */   public TracingController() {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public static TracingController getInstance() {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void start(@RecentlyNonNull TracingConfig paramTracingConfig);
/*    */   
/*    */   public abstract boolean stop(@RecentlyNullable OutputStream paramOutputStream, @RecentlyNonNull Executor paramExecutor);
/*    */   
/*    */   public abstract boolean isTracing();
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\webkit\TracingController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */