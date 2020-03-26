/*    */ package android.bluetooth.le;
/*    */ 
/*    */ import java.util.List;
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
/*    */ public abstract class ScanCallback
/*    */ {
/*    */   public static final int SCAN_FAILED_ALREADY_STARTED = 1;
/*    */   public static final int SCAN_FAILED_APPLICATION_REGISTRATION_FAILED = 2;
/*    */   public static final int SCAN_FAILED_FEATURE_UNSUPPORTED = 4;
/*    */   public static final int SCAN_FAILED_INTERNAL_ERROR = 3;
/*    */   
/*    */   public ScanCallback() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onScanResult(int callbackType, ScanResult result) {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onBatchScanResults(List<ScanResult> results) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onScanFailed(int errorCode) {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\le\ScanCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */