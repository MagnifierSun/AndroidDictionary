/*    */ package android.media;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MediaCasException
/*    */   extends Exception
/*    */ {
/*    */   MediaCasException(String detailMessage) {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class DeniedByServerException
/*    */     extends MediaCasException
/*    */   {
/*    */     DeniedByServerException(String detailMessage) {
/* 39 */       super(null); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class NotProvisionedException
/*    */     extends MediaCasException
/*    */   {
/*    */     NotProvisionedException(String detailMessage) {
/* 52 */       super(null); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class ResourceBusyException
/*    */     extends MediaCasException
/*    */   {
/*    */     ResourceBusyException(String detailMessage) {
/* 65 */       super(null); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class UnsupportedCasException
/*    */     extends MediaCasException
/*    */   {
/*    */     UnsupportedCasException(String detailMessage) {
/* 78 */       super(null); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\MediaCasException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */