/*     */ package android.bluetooth.le;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AdvertisingSetCallback
/*     */ {
/*     */   public static final int ADVERTISE_FAILED_ALREADY_STARTED = 3;
/*     */   public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = 1;
/*     */   public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = 5;
/*     */   public static final int ADVERTISE_FAILED_INTERNAL_ERROR = 4;
/*     */   public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = 2;
/*     */   public static final int ADVERTISE_SUCCESS = 0;
/*     */   
/*     */   public AdvertisingSetCallback() {
/*  29 */     throw new RuntimeException("Stub!");
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
/*     */   public void onAdvertisingSetStarted(AdvertisingSet advertisingSet, int txPower, int status) {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onAdvertisingSetStopped(AdvertisingSet advertisingSet) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onAdvertisingEnabled(AdvertisingSet advertisingSet, boolean enable, int status) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onAdvertisingDataSet(AdvertisingSet advertisingSet, int status) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onScanResponseDataSet(AdvertisingSet advertisingSet, int status) {
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
/*     */   public void onAdvertisingParametersUpdated(AdvertisingSet advertisingSet, int txPower, int status) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onPeriodicAdvertisingParametersUpdated(AdvertisingSet advertisingSet, int status) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onPeriodicAdvertisingDataSet(AdvertisingSet advertisingSet, int status) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onPeriodicAdvertisingEnabled(AdvertisingSet advertisingSet, boolean enable, int status) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\le\AdvertisingSetCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */