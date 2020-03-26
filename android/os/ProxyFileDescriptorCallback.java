/*    */ package android.os;
/*    */ 
/*    */ import android.system.ErrnoException;
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
/*    */ public abstract class ProxyFileDescriptorCallback
/*    */ {
/*    */   public ProxyFileDescriptorCallback() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long onGetSize() throws ErrnoException {
/* 56 */     throw new RuntimeException("Stub!");
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
/*    */   public int onRead(long offset, int size, byte[] data) throws ErrnoException {
/* 70 */     throw new RuntimeException("Stub!");
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
/*    */   public int onWrite(long offset, int size, byte[] data) throws ErrnoException {
/* 83 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onFsync() throws ErrnoException {
/* 92 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onRelease();
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\os\ProxyFileDescriptorCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */