/*    */ package android.media;
/*    */ 
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class DrmInitData
/*    */ {
/*    */   DrmInitData() {
/* 33 */     throw new RuntimeException("Stub!");
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
/*    */   public abstract SchemeInitData get(UUID paramUUID);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class SchemeInitData
/*    */   {
/*    */     SchemeInitData(String mimeType, byte[] data) {
/* 57 */       throw new RuntimeException("Stub!");
/*    */     } public boolean equals(Object obj) {
/* 59 */       throw new RuntimeException("Stub!");
/*    */     } public int hashCode() {
/* 61 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 68 */     public final byte[] data = new byte[0];
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 75 */     public final String mimeType = null;
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\DrmInitData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */