/*     */ package android.telephony;
/*     */ 
/*     */ import android.app.PendingIntent;
/*     */ import android.content.Context;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public final class SmsManager {
/*     */   public static final String EXTRA_MMS_DATA = "android.telephony.extra.MMS_DATA";
/*     */   public static final String EXTRA_MMS_HTTP_STATUS = "android.telephony.extra.MMS_HTTP_STATUS";
/*     */   public static final String MMS_CONFIG_ALIAS_ENABLED = "aliasEnabled";
/*     */   public static final String MMS_CONFIG_ALIAS_MAX_CHARS = "aliasMaxChars";
/*     */   public static final String MMS_CONFIG_ALIAS_MIN_CHARS = "aliasMinChars";
/*     */   public static final String MMS_CONFIG_ALLOW_ATTACH_AUDIO = "allowAttachAudio";
/*     */   public static final String MMS_CONFIG_APPEND_TRANSACTION_ID = "enabledTransID";
/*     */   public static final String MMS_CONFIG_EMAIL_GATEWAY_NUMBER = "emailGatewayNumber";
/*     */   public static final String MMS_CONFIG_GROUP_MMS_ENABLED = "enableGroupMms";
/*     */   public static final String MMS_CONFIG_HTTP_PARAMS = "httpParams";
/*     */   public static final String MMS_CONFIG_HTTP_SOCKET_TIMEOUT = "httpSocketTimeout";
/*     */   public static final String MMS_CONFIG_MAX_IMAGE_HEIGHT = "maxImageHeight";
/*     */   public static final String MMS_CONFIG_MAX_IMAGE_WIDTH = "maxImageWidth";
/*     */   public static final String MMS_CONFIG_MAX_MESSAGE_SIZE = "maxMessageSize";
/*     */   public static final String MMS_CONFIG_MESSAGE_TEXT_MAX_SIZE = "maxMessageTextSize";
/*     */   public static final String MMS_CONFIG_MMS_DELIVERY_REPORT_ENABLED = "enableMMSDeliveryReports";
/*     */   public static final String MMS_CONFIG_MMS_ENABLED = "enabledMMS";
/*     */   public static final String MMS_CONFIG_MMS_READ_REPORT_ENABLED = "enableMMSReadReports";
/*     */   public static final String MMS_CONFIG_MULTIPART_SMS_ENABLED = "enableMultipartSMS";
/*     */   public static final String MMS_CONFIG_NAI_SUFFIX = "naiSuffix";
/*     */   public static final String MMS_CONFIG_NOTIFY_WAP_MMSC_ENABLED = "enabledNotifyWapMMSC";
/*     */   public static final String MMS_CONFIG_RECIPIENT_LIMIT = "recipientLimit";
/*     */   public static final String MMS_CONFIG_SEND_MULTIPART_SMS_AS_SEPARATE_MESSAGES = "sendMultipartSmsAsSeparateMessages";
/*     */   public static final String MMS_CONFIG_SHOW_CELL_BROADCAST_APP_LINKS = "config_cellBroadcastAppLinks";
/*     */   public static final String MMS_CONFIG_SMS_DELIVERY_REPORT_ENABLED = "enableSMSDeliveryReports";
/*     */   public static final String MMS_CONFIG_SMS_TO_MMS_TEXT_LENGTH_THRESHOLD = "smsToMmsTextLengthThreshold";
/*     */   
/*     */   SmsManager(int subId) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public static final String MMS_CONFIG_SMS_TO_MMS_TEXT_THRESHOLD = "smsToMmsTextThreshold";
/*     */   
/*     */   public static final String MMS_CONFIG_SUBJECT_MAX_LENGTH = "maxSubjectLength";
/*     */   
/*     */   public static final String MMS_CONFIG_SUPPORT_HTTP_CHARSET_HEADER = "supportHttpCharsetHeader";
/*     */   
/*     */   public static final String MMS_CONFIG_SUPPORT_MMS_CONTENT_DISPOSITION = "supportMmsContentDisposition";
/*     */   
/*     */   public static final String MMS_CONFIG_UA_PROF_TAG_NAME = "uaProfTagName";
/*     */   
/*     */   public static final String MMS_CONFIG_UA_PROF_URL = "uaProfUrl";
/*     */   
/*     */   public static final String MMS_CONFIG_USER_AGENT = "userAgent";
/*     */   public static final int MMS_ERROR_CONFIGURATION_ERROR = 7;
/*     */   public static final int MMS_ERROR_HTTP_FAILURE = 4;
/*     */   public static final int MMS_ERROR_INVALID_APN = 2;
/*     */   public static final int MMS_ERROR_IO_ERROR = 5;
/*     */   public static final int MMS_ERROR_NO_DATA_NETWORK = 8;
/*     */   public static final int MMS_ERROR_RETRY = 6;
/*     */   public static final int MMS_ERROR_UNABLE_CONNECT_MMS = 3;
/*     */   public static final int MMS_ERROR_UNSPECIFIED = 1;
/*     */   public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
/*     */   public static final int RESULT_ERROR_LIMIT_EXCEEDED = 5;
/*     */   public static final int RESULT_ERROR_NO_SERVICE = 4;
/*     */   public static final int RESULT_ERROR_NULL_PDU = 3;
/*     */   public static final int RESULT_ERROR_RADIO_OFF = 2;
/*     */   public static final int RESULT_ERROR_SHORT_CODE_NEVER_ALLOWED = 8;
/*     */   public static final int RESULT_ERROR_SHORT_CODE_NOT_ALLOWED = 7;
/*     */   public static final int STATUS_ON_ICC_FREE = 0;
/*     */   public static final int STATUS_ON_ICC_READ = 1;
/*     */   public static final int STATUS_ON_ICC_SENT = 5;
/*     */   public static final int STATUS_ON_ICC_UNREAD = 3;
/*     */   public static final int STATUS_ON_ICC_UNSENT = 7;
/*     */   
/*     */   public void sendTextMessage(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent) {
/*  77 */     throw new RuntimeException("Stub!");
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
/*     */   public void sendTextMessageWithoutPersisting(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent) {
/*  97 */     throw new RuntimeException("Stub!");
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
/*     */   public void injectSmsPdu(byte[] pdu, String format, PendingIntent receivedIntent) {
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
/*     */   
/*     */   public ArrayList<String> divideMessage(String text) {
/* 134 */     throw new RuntimeException("Stub!");
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
/*     */   public void sendMultipartTextMessage(String destinationAddress, String scAddress, ArrayList<String> parts, ArrayList<PendingIntent> sentIntents, ArrayList<PendingIntent> deliveryIntents) {
/* 178 */     throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public void sendDataMessage(String destinationAddress, String scAddress, short destinationPort, byte[] data, PendingIntent sentIntent, PendingIntent deliveryIntent) {
/* 211 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SmsManager getDefault() {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SmsManager getSmsManagerForSubscriptionId(int subId) {
/* 230 */     throw new RuntimeException("Stub!");
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
/*     */   public int getSubscriptionId() {
/* 248 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getDefaultSmsSubscriptionId() {
/* 256 */     throw new RuntimeException("Stub!");
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
/*     */   public void sendMultimediaMessage(Context context, Uri contentUri, String locationUrl, Bundle configOverrides, PendingIntent sentIntent) {
/* 271 */     throw new RuntimeException("Stub!");
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
/*     */   public void downloadMultimediaMessage(Context context, String locationUrl, Uri contentUri, Bundle configOverrides, PendingIntent downloadedIntent) {
/* 287 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Bundle getCarrierConfigValues() {
/* 295 */     throw new RuntimeException("Stub!");
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
/*     */   public String createAppSpecificSmsToken(PendingIntent intent) {
/* 313 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\SmsManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */