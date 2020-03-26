/*     */ package android.os;
/*     */ 
/*     */ import android.os.strictmode.Violation;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.util.HashMap;
/*     */ import java.util.concurrent.Executor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class StrictMode
/*     */ {
/*     */   StrictMode() {
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
/*     */   public static void setThreadPolicy(ThreadPolicy policy) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static ThreadPolicy getThreadPolicy() {
/* 111 */     throw new RuntimeException("Stub!");
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
/*     */   public static ThreadPolicy allowThreadDiskWrites() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ThreadPolicy allowThreadDiskReads() {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setVmPolicy(VmPolicy policy) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static VmPolicy getVmPolicy() {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void enableDefaults() {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void noteSlowCall(String name) {
/* 166 */     throw new RuntimeException("Stub!");
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
/*     */   public static interface OnThreadViolationListener
/*     */   {
/*     */     void onThreadViolation(Violation param1Violation);
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
/*     */   public static interface OnVmViolationListener
/*     */   {
/*     */     void onVmViolation(Violation param1Violation);
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
/*     */   public static final class ThreadPolicy
/*     */   {
/*     */     ThreadPolicy(int mask, StrictMode.OnThreadViolationListener listener, Executor executor) {
/* 207 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 209 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 214 */     public static final ThreadPolicy LAX = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Builder
/*     */     {
/*     */       public Builder() {
/* 243 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder(StrictMode.ThreadPolicy policy) {
/* 247 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectAll() {
/* 256 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder permitAll() {
/* 260 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder detectNetwork() {
/* 264 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder permitNetwork() {
/* 268 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder detectDiskReads() {
/* 272 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder permitDiskReads() {
/* 276 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder detectCustomSlowCalls() {
/* 280 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder permitCustomSlowCalls() {
/* 284 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder permitResourceMismatches() {
/* 288 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder detectUnbufferedIo() {
/* 292 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder permitUnbufferedIo() {
/* 296 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectResourceMismatches() {
/* 311 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder detectDiskWrites() {
/* 315 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder permitDiskWrites() {
/* 319 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyDialog() {
/* 326 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyDeath() {
/* 337 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyDeathOnNetwork() {
/* 347 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder penaltyFlashScreen() {
/* 351 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder penaltyLog() {
/* 355 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyDropBox() {
/* 363 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyListener(@RecentlyNonNull Executor executor, @RecentlyNonNull StrictMode.OnThreadViolationListener listener) {
/* 374 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public StrictMode.ThreadPolicy build() {
/* 383 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class VmPolicy
/*     */   {
/*     */     VmPolicy(int mask, HashMap<Class<?>, Integer> classInstanceLimit, StrictMode.OnVmViolationListener listener, Executor executor) {
/* 397 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 399 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 404 */     public static final VmPolicy LAX = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Builder
/*     */     {
/*     */       public Builder() {
/* 427 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder(StrictMode.VmPolicy base) {
/* 431 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder setClassInstanceLimit(Class klass, int instanceLimit) {
/* 438 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder detectActivityLeaks() {
/* 442 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectNonSdkApiUsage() {
/* 452 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder permitNonSdkApiUsage() {
/* 461 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectAll() {
/* 470 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectLeakedSqlLiteObjects() {
/* 480 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectLeakedClosableObjects() {
/* 490 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectLeakedRegistrationObjects() {
/* 497 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectFileUriExposure() {
/* 515 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectCleartextNetwork() {
/* 533 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectContentUriWithoutPermission() {
/* 548 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder detectUntaggedSockets() {
/* 562 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyDeath() {
/* 570 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyDeathOnCleartextNetwork() {
/* 578 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyDeathOnFileUriExposure() {
/* 587 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */       public Builder penaltyLog() {
/* 591 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyDropBox() {
/* 599 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder penaltyListener(@RecentlyNonNull Executor executor, @RecentlyNonNull StrictMode.OnVmViolationListener listener) {
/* 609 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public StrictMode.VmPolicy build() {
/* 618 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\os\StrictMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */