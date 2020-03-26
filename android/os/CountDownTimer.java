/*    */ package android.os;
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
/*    */ public abstract class CountDownTimer
/*    */ {
/*    */   public CountDownTimer(long millisInFuture, long countDownInterval) {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final synchronized void cancel() {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final synchronized CountDownTimer start() {
/* 70 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onTick(long paramLong);
/*    */   
/*    */   public abstract void onFinish();
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\os\CountDownTimer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */