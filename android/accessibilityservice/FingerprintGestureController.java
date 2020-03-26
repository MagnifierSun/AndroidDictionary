/*     */ package android.accessibilityservice;
/*     */ 
/*     */ import android.os.Handler;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class FingerprintGestureController
/*     */ {
/*     */   public static final int FINGERPRINT_GESTURE_SWIPE_DOWN = 8;
/*     */   public static final int FINGERPRINT_GESTURE_SWIPE_LEFT = 2;
/*     */   public static final int FINGERPRINT_GESTURE_SWIPE_RIGHT = 1;
/*     */   public static final int FINGERPRINT_GESTURE_SWIPE_UP = 4;
/*     */   
/*     */   FingerprintGestureController() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isGestureDetectionAvailable() {
/*  60 */     throw new RuntimeException("Stub!");
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
/*     */   public void registerFingerprintGestureCallback(@RecentlyNonNull FingerprintGestureCallback callback, @RecentlyNullable Handler handler) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unregisterFingerprintGestureCallback(FingerprintGestureCallback callback) {
/*  82 */     throw new RuntimeException("Stub!");
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
/*     */   public static abstract class FingerprintGestureCallback
/*     */   {
/*     */     public FingerprintGestureCallback() {
/* 106 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onGestureDetectionAvailabilityChanged(boolean available) {
/* 114 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onGestureDetected(int gesture) {
/* 123 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\accessibilityservice\FingerprintGestureController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */