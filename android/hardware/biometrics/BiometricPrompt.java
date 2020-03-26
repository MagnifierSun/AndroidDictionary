/*     */ package android.hardware.biometrics;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.DialogInterface;
/*     */ import android.os.CancellationSignal;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.security.Signature;
/*     */ import java.util.concurrent.Executor;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.Mac;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BiometricPrompt
/*     */ {
/*     */   public static final int BIOMETRIC_ACQUIRED_GOOD = 0;
/*     */   public static final int BIOMETRIC_ACQUIRED_IMAGER_DIRTY = 3;
/*     */   public static final int BIOMETRIC_ACQUIRED_INSUFFICIENT = 2;
/*     */   public static final int BIOMETRIC_ACQUIRED_PARTIAL = 1;
/*     */   public static final int BIOMETRIC_ACQUIRED_TOO_FAST = 5;
/*     */   public static final int BIOMETRIC_ACQUIRED_TOO_SLOW = 4;
/*     */   public static final int BIOMETRIC_ERROR_CANCELED = 5;
/*     */   public static final int BIOMETRIC_ERROR_HW_NOT_PRESENT = 12;
/*     */   public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
/*     */   public static final int BIOMETRIC_ERROR_LOCKOUT = 7;
/*     */   public static final int BIOMETRIC_ERROR_LOCKOUT_PERMANENT = 9;
/*     */   public static final int BIOMETRIC_ERROR_NO_BIOMETRICS = 11;
/*     */   public static final int BIOMETRIC_ERROR_NO_SPACE = 4;
/*     */   public static final int BIOMETRIC_ERROR_TIMEOUT = 3;
/*     */   public static final int BIOMETRIC_ERROR_UNABLE_TO_PROCESS = 2;
/*     */   public static final int BIOMETRIC_ERROR_USER_CANCELED = 10;
/*     */   public static final int BIOMETRIC_ERROR_VENDOR = 8;
/*     */   
/*     */   BiometricPrompt() {
/*  35 */     throw new RuntimeException("Stub!");
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
/*     */   public void authenticate(@RecentlyNonNull CryptoObject crypto, @RecentlyNonNull CancellationSignal cancel, @RecentlyNonNull Executor executor, @RecentlyNonNull AuthenticationCallback callback) {
/*  73 */     throw new RuntimeException("Stub!");
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
/*     */   public void authenticate(@RecentlyNonNull CancellationSignal cancel, @RecentlyNonNull Executor executor, @RecentlyNonNull AuthenticationCallback callback) {
/* 108 */     throw new RuntimeException("Stub!");
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
/*     */   public static abstract class AuthenticationCallback
/*     */   {
/*     */     public AuthenticationCallback() {
/* 244 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onAuthenticationError(int errorCode, CharSequence errString) {
/* 253 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onAuthenticationHelp(int helpCode, CharSequence helpString) {
/* 263 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {
/* 270 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void onAuthenticationFailed() {
/* 276 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class AuthenticationResult
/*     */   {
/*     */     AuthenticationResult() {
/* 288 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public BiometricPrompt.CryptoObject getCryptoObject() {
/* 296 */       throw new RuntimeException("Stub!");
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
/*     */   public static class Builder
/*     */   {
/*     */     public Builder(Context context) {
/* 311 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setTitle(@RecentlyNonNull CharSequence title) {
/* 320 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setSubtitle(@RecentlyNonNull CharSequence subtitle) {
/* 329 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setDescription(@RecentlyNonNull CharSequence description) {
/* 338 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setNegativeButton(@RecentlyNonNull CharSequence text, @RecentlyNonNull Executor executor, @RecentlyNonNull DialogInterface.OnClickListener listener) {
/* 357 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public BiometricPrompt build() {
/* 365 */       throw new RuntimeException("Stub!");
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
/*     */   public static final class CryptoObject
/*     */   {
/*     */     public CryptoObject(@RecentlyNonNull Signature signature) {
/* 380 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public CryptoObject(@RecentlyNonNull Cipher cipher) {
/* 386 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public CryptoObject(@RecentlyNonNull Mac mac) {
/* 392 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Signature getSignature() {
/* 399 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Cipher getCipher() {
/* 406 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Mac getMac() {
/* 413 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\hardware\biometrics\BiometricPrompt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */