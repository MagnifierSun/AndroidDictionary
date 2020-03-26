/*    */ package android.os;
/*    */ 
/*    */ import java.io.PrintWriter;
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
/*    */ public abstract class TokenWatcher
/*    */ {
/*    */   public TokenWatcher(Handler h, String tag) {
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
/*    */   public abstract void acquired();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract void released();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void acquire(IBinder token, String tag) {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   } public void cleanup(IBinder token, boolean unlink) {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   } public void release(IBinder token) {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   } public boolean isAcquired() {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   } public void dump() {
/* 83 */     throw new RuntimeException("Stub!");
/*    */   } public void dump(PrintWriter pw) {
/* 85 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\os\TokenWatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */