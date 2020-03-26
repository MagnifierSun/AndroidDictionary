/*     */ package android.media;
/*     */ 
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.nio.ByteBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class MediaDescrambler
/*     */   implements AutoCloseable
/*     */ {
/*     */   public static final byte SCRAMBLE_CONTROL_EVEN_KEY = 2;
/*     */   public static final byte SCRAMBLE_CONTROL_ODD_KEY = 3;
/*     */   public static final byte SCRAMBLE_CONTROL_RESERVED = 1;
/*     */   public static final byte SCRAMBLE_CONTROL_UNSCRAMBLED = 0;
/*     */   public static final byte SCRAMBLE_FLAG_PES_HEADER = 1;
/*     */   
/*     */   public MediaDescrambler(int CA_system_id) throws MediaCasException.UnsupportedCasException {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean requiresSecureDecoderComponent(@RecentlyNonNull String mime) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMediaCasSession(@RecentlyNonNull MediaCas.Session session) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int descramble(@RecentlyNonNull ByteBuffer srcBuf, @RecentlyNonNull ByteBuffer dstBuf, @RecentlyNonNull MediaCodec.CryptoInfo cryptoInfo) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public void close() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\MediaDescrambler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */