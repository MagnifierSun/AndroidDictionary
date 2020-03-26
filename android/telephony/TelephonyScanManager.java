/*    */ package android.telephony;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class TelephonyScanManager
/*    */ {
/*    */   public TelephonyScanManager() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static abstract class NetworkScanCallback
/*    */   {
/*    */     public NetworkScanCallback() {
/* 41 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */     
/*    */     public void onResults(List<CellInfo> results) {
/* 45 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void onComplete() {
/* 54 */       throw new RuntimeException("Stub!");
/*    */     }
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
/*    */     public void onError(int error) {
/* 67 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\TelephonyScanManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */