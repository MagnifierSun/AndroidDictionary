/*    */ package android.bluetooth.le;
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
/*    */ public abstract class AdvertiseCallback
/*    */ {
/*    */   public static final int ADVERTISE_FAILED_ALREADY_STARTED = 3;
/*    */   public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = 1;
/*    */   public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = 5;
/*    */   public static final int ADVERTISE_FAILED_INTERNAL_ERROR = 4;
/*    */   public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = 2;
/*    */   
/*    */   public AdvertiseCallback() {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onStartSuccess(AdvertiseSettings settingsInEffect) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onStartFailure(int errorCode) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\le\AdvertiseCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */