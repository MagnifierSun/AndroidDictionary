/*    */ package android.media;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MediaCrypto
/*    */ {
/*    */   public MediaCrypto(@RecentlyNonNull UUID uuid, @RecentlyNonNull byte[] initData) throws MediaCryptoException {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isCryptoSchemeSupported(@RecentlyNonNull UUID uuid) {
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
/*    */   public native boolean requiresSecureDecoderComponent(@RecentlyNonNull String paramString);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public native void setMediaDrmSession(@RecentlyNonNull byte[] paramArrayOfbyte) throws MediaCryptoException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void finalize() {
/* 83 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public native void release();
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\MediaCrypto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */