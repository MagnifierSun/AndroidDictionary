/*     */ package android.telephony;
/*     */ 
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PhoneStateListener
/*     */ {
/*     */   public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;
/*     */   public static final int LISTEN_CALL_STATE = 32;
/*     */   public static final int LISTEN_CELL_INFO = 1024;
/*     */   public static final int LISTEN_CELL_LOCATION = 16;
/*     */   public static final int LISTEN_DATA_ACTIVITY = 128;
/*     */   public static final int LISTEN_DATA_CONNECTION_STATE = 64;
/*     */   public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;
/*     */   public static final int LISTEN_NONE = 0;
/*     */   public static final int LISTEN_SERVICE_STATE = 1;
/*     */   @Deprecated
/*     */   public static final int LISTEN_SIGNAL_STRENGTH = 2;
/*     */   public static final int LISTEN_SIGNAL_STRENGTHS = 256;
/*     */   public static final int LISTEN_USER_MOBILE_DATA_STATE = 524288;
/*     */   
/*     */   public PhoneStateListener() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onServiceStateChanged(ServiceState serviceState) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void onSignalStrengthChanged(int asu) {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onMessageWaitingIndicatorChanged(boolean mwi) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCallForwardingIndicatorChanged(boolean cfi) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCellLocationChanged(CellLocation location) {
/*  89 */     throw new RuntimeException("Stub!");
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
/*     */   public void onCallStateChanged(int state, String phoneNumber) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDataConnectionStateChanged(int state) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDataConnectionStateChanged(int state, int networkType) {
/* 121 */     throw new RuntimeException("Stub!");
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
/*     */   public void onDataActivity(int direction) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onSignalStrengthsChanged(SignalStrength signalStrength) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCellInfoChanged(List<CellInfo> cellInfo) {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onUserMobileDataStateChanged(boolean enabled) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\PhoneStateListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */