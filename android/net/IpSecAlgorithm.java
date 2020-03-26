/*     */ package android.net;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
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
/*     */ public final class IpSecAlgorithm
/*     */   implements Parcelable
/*     */ {
/*     */   public static final String AUTH_CRYPT_AES_GCM = "rfc4106(gcm(aes))";
/*     */   public static final String AUTH_HMAC_MD5 = "hmac(md5)";
/*     */   public static final String AUTH_HMAC_SHA1 = "hmac(sha1)";
/*     */   public static final String AUTH_HMAC_SHA256 = "hmac(sha256)";
/*     */   public static final String AUTH_HMAC_SHA384 = "hmac(sha384)";
/*     */   public static final String AUTH_HMAC_SHA512 = "hmac(sha512)";
/*     */   
/*     */   public IpSecAlgorithm(@RecentlyNonNull String algorithm, @RecentlyNonNull byte[] key) {
/*  47 */     throw new RuntimeException("Stub!");
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
/*     */   public IpSecAlgorithm(@RecentlyNonNull String algorithm, @RecentlyNonNull byte[] key, int truncLenBits) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public String getName() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public byte[] getKey() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int getTruncationLengthBits() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public String toString() {
/*  94 */     throw new RuntimeException("Stub!");
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
/* 165 */   public static final Parcelable.Creator<IpSecAlgorithm> CREATOR = null;
/*     */   public static final String CRYPT_AES_CBC = "cbc(aes)";
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\IpSecAlgorithm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */