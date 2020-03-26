/*     */ package android.telephony.gsm;
/*     */ 
/*     */ import android.app.PendingIntent;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated
/*     */ public final class SmsManager
/*     */ {
/*     */   @Deprecated
/*     */   public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
/*     */   @Deprecated
/*     */   public static final int RESULT_ERROR_NO_SERVICE = 4;
/*     */   @Deprecated
/*     */   public static final int RESULT_ERROR_NULL_PDU = 3;
/*     */   @Deprecated
/*     */   public static final int RESULT_ERROR_RADIO_OFF = 2;
/*     */   @Deprecated
/*     */   public static final int STATUS_ON_SIM_FREE = 0;
/*     */   @Deprecated
/*     */   public static final int STATUS_ON_SIM_READ = 1;
/*     */   @Deprecated
/*     */   public static final int STATUS_ON_SIM_SENT = 5;
/*     */   @Deprecated
/*     */   public static final int STATUS_ON_SIM_UNREAD = 3;
/*     */   @Deprecated
/*     */   public static final int STATUS_ON_SIM_UNSENT = 7;
/*     */   
/*     */   @Deprecated
/*     */   SmsManager() {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static SmsManager getDefault() {
/*  40 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public void sendTextMessage(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent) {
/*  67 */     throw new RuntimeException("Stub!");
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
/*     */   public ArrayList<String> divideMessage(String text) {
/*  79 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public void sendMultipartTextMessage(String destinationAddress, String scAddress, ArrayList<String> parts, ArrayList<PendingIntent> sentIntents, ArrayList<PendingIntent> deliveryIntents) {
/* 112 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public void sendDataMessage(String destinationAddress, String scAddress, short destinationPort, byte[] data, PendingIntent sentIntent, PendingIntent deliveryIntent) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\gsm\SmsManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */