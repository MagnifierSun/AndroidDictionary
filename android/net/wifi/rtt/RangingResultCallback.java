/*    */ package android.net.wifi.rtt;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
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
/*    */ 
/*    */ 
/*    */ public abstract class RangingResultCallback
/*    */ {
/*    */   public static final int STATUS_CODE_FAIL = 1;
/*    */   public static final int STATUS_CODE_FAIL_RTT_NOT_AVAILABLE = 2;
/*    */   
/*    */   public RangingResultCallback() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onRangingFailure(int paramInt);
/*    */   
/*    */   public abstract void onRangingResults(@RecentlyNonNull List<RangingResult> paramList);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\rtt\RangingResultCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */