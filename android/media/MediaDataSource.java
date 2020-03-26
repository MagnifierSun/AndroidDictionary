/*    */ package android.media;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class MediaDataSource
/*    */   implements Closeable
/*    */ {
/*    */   public MediaDataSource() {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int readAt(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
/*    */   
/*    */   public abstract long getSize() throws IOException;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\MediaDataSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */