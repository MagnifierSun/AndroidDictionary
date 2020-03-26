/*    */ package android.telephony.mbms;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import androidx.annotation.RecentlyNullable;
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
/*    */ public class StreamingService
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static final int BROADCAST_METHOD = 1;
/*    */   public static final int REASON_BY_USER_REQUEST = 1;
/*    */   public static final int REASON_END_OF_SESSION = 2;
/*    */   public static final int REASON_FREQUENCY_CONFLICT = 3;
/*    */   public static final int REASON_LEFT_MBMS_BROADCAST_AREA = 6;
/*    */   public static final int REASON_NONE = 0;
/*    */   public static final int REASON_NOT_CONNECTED_TO_HOMECARRIER_LTE = 5;
/*    */   public static final int REASON_OUT_OF_MEMORY = 4;
/*    */   public static final int STATE_STALLED = 3;
/*    */   public static final int STATE_STARTED = 2;
/*    */   public static final int STATE_STOPPED = 1;
/*    */   public static final int UNICAST_METHOD = 2;
/*    */   
/*    */   StreamingService() {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNullable
/*    */   public Uri getPlaybackUri() {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public StreamingServiceInfo getInfo() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void close() {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\mbms\StreamingService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */