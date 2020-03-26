/*     */ package android.hardware.fingerprint;
/*     */ 
/*     */ import android.os.CancellationSignal;
/*     */ import android.os.Handler;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.security.Signature;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.Mac;
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
/*     */ @Deprecated
/*     */ public class FingerprintManager
/*     */ {
/*     */   public static final int FINGERPRINT_ACQUIRED_GOOD = 0;
/*     */   public static final int FINGERPRINT_ACQUIRED_IMAGER_DIRTY = 3;
/*     */   public static final int FINGERPRINT_ACQUIRED_INSUFFICIENT = 2;
/*     */   public static final int FINGERPRINT_ACQUIRED_PARTIAL = 1;
/*     */   public static final int FINGERPRINT_ACQUIRED_TOO_FAST = 5;
/*     */   public static final int FINGERPRINT_ACQUIRED_TOO_SLOW = 4;
/*     */   public static final int FINGERPRINT_ERROR_CANCELED = 5;
/*     */   public static final int FINGERPRINT_ERROR_HW_NOT_PRESENT = 12;
/*     */   public static final int FINGERPRINT_ERROR_HW_UNAVAILABLE = 1;
/*     */   public static final int FINGERPRINT_ERROR_LOCKOUT = 7;
/*     */   public static final int FINGERPRINT_ERROR_LOCKOUT_PERMANENT = 9;
/*     */   public static final int FINGERPRINT_ERROR_NO_FINGERPRINTS = 11;
/*     */   public static final int FINGERPRINT_ERROR_NO_SPACE = 4;
/*     */   public static final int FINGERPRINT_ERROR_TIMEOUT = 3;
/*     */   public static final int FINGERPRINT_ERROR_UNABLE_TO_PROCESS = 2;
/*     */   public static final int FINGERPRINT_ERROR_USER_CANCELED = 10;
/*     */   public static final int FINGERPRINT_ERROR_VENDOR = 8;
/*     */   
/*     */   FingerprintManager() {
/*  42 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public void authenticate(@RecentlyNullable CryptoObject crypto, @RecentlyNullable CancellationSignal cancel, int flags, @RecentlyNonNull AuthenticationCallback callback, @RecentlyNullable Handler handler) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public boolean hasEnrolledFingerprints() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public boolean isHardwareDetected() {
/*  95 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public static abstract class AuthenticationCallback
/*     */   {
/*     */     public AuthenticationCallback() {
/* 235 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onAuthenticationError(int errorCode, CharSequence errString) {
/* 244 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onAuthenticationHelp(int helpCode, CharSequence helpString) {
/* 254 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
/* 261 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void onAuthenticationFailed() {
/* 267 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static class AuthenticationResult
/*     */   {
/*     */     AuthenticationResult() {
/* 279 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public FingerprintManager.CryptoObject getCryptoObject() {
/* 287 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   @Deprecated
/*     */   public static final class CryptoObject
/*     */   {
/*     */     public CryptoObject(@RecentlyNonNull Signature signature) {
/* 303 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public CryptoObject(@RecentlyNonNull Cipher cipher) {
/* 309 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public CryptoObject(@RecentlyNonNull Mac mac) {
/* 315 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Signature getSignature() {
/* 322 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Cipher getCipher() {
/* 329 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Mac getMac() {
/* 336 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\hardware\fingerprint\FingerprintManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */