/*     */ package android.service.carrier;
/*     */ 
/*     */ import android.app.Service;
/*     */ import android.content.Intent;
/*     */ import android.net.Uri;
/*     */ import android.os.IBinder;
/*     */ import android.os.RemoteException;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
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
/*     */ public abstract class CarrierMessagingService
/*     */   extends Service
/*     */ {
/*     */   public static final int DOWNLOAD_STATUS_ERROR = 2;
/*     */   public static final int DOWNLOAD_STATUS_OK = 0;
/*     */   public static final int DOWNLOAD_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
/*     */   public static final int RECEIVE_OPTIONS_DEFAULT = 0;
/*     */   public static final int RECEIVE_OPTIONS_DROP = 1;
/*     */   public static final int RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE = 2;
/*     */   public static final int SEND_FLAG_REQUEST_DELIVERY_STATUS = 1;
/*     */   public static final int SEND_STATUS_ERROR = 2;
/*     */   public static final int SEND_STATUS_OK = 0;
/*     */   public static final int SEND_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
/*     */   public static final String SERVICE_INTERFACE = "android.service.carrier.CarrierMessagingService";
/*     */   
/*     */   public CarrierMessagingService() {
/*  44 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public void onFilterSms(@RecentlyNonNull MessagePdu pdu, @RecentlyNonNull String format, int destPort, int subId, @RecentlyNonNull ResultCallback<Boolean> callback) {
/*  61 */     throw new RuntimeException("Stub!");
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
/*     */   public void onReceiveTextSms(@RecentlyNonNull MessagePdu pdu, @RecentlyNonNull String format, int destPort, int subId, @RecentlyNonNull ResultCallback<Integer> callback) {
/*  87 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public void onSendTextSms(@RecentlyNonNull String text, int subId, @RecentlyNonNull String destAddress, @RecentlyNonNull ResultCallback<SendSmsResult> callback) {
/* 103 */     throw new RuntimeException("Stub!");
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
/*     */   public void onSendTextSms(@RecentlyNonNull String text, int subId, @RecentlyNonNull String destAddress, int sendSmsFlag, @RecentlyNonNull ResultCallback<SendSmsResult> callback) {
/* 120 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public void onSendDataSms(@RecentlyNonNull byte[] data, int subId, @RecentlyNonNull String destAddress, int destPort, @RecentlyNonNull ResultCallback<SendSmsResult> callback) {
/* 137 */     throw new RuntimeException("Stub!");
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
/*     */   public void onSendDataSms(@RecentlyNonNull byte[] data, int subId, @RecentlyNonNull String destAddress, int destPort, int sendSmsFlag, @RecentlyNonNull ResultCallback<SendSmsResult> callback) {
/* 155 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public void onSendMultipartTextSms(@RecentlyNonNull List<String> parts, int subId, @RecentlyNonNull String destAddress, @RecentlyNonNull ResultCallback<SendMultipartSmsResult> callback) {
/* 171 */     throw new RuntimeException("Stub!");
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
/*     */   public void onSendMultipartTextSms(@RecentlyNonNull List<String> parts, int subId, @RecentlyNonNull String destAddress, int sendSmsFlag, @RecentlyNonNull ResultCallback<SendMultipartSmsResult> callback) {
/* 188 */     throw new RuntimeException("Stub!");
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
/*     */   public void onSendMms(@RecentlyNonNull Uri pduUri, int subId, @RecentlyNullable Uri location, @RecentlyNonNull ResultCallback<SendMmsResult> callback) {
/* 204 */     throw new RuntimeException("Stub!");
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
/*     */   public void onDownloadMms(@RecentlyNonNull Uri contentUri, int subId, @RecentlyNonNull Uri location, @RecentlyNonNull ResultCallback<Integer> callback) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public IBinder onBind(@RecentlyNonNull Intent intent) {
/* 228 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface ResultCallback<T>
/*     */   {
/*     */     void onReceiveResult(@RecentlyNonNull T param1T) throws RemoteException;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class SendMmsResult
/*     */   {
/*     */     public SendMmsResult(int sendStatus, @RecentlyNullable byte[] sendConfPdu) {
/* 342 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getSendStatus() {
/* 351 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNullable
/*     */     public byte[] getSendConfPdu() {
/* 361 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public static final class SendMultipartSmsResult
/*     */   {
/*     */     public SendMultipartSmsResult(int sendStatus, @RecentlyNullable int[] messageRefs) {
/* 384 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNullable
/*     */     public int[] getMessageRefs() {
/* 394 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getSendStatus() {
/* 402 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public static final class SendSmsResult
/*     */   {
/*     */     public SendSmsResult(int sendStatus, int messageRef) {
/* 422 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getMessageRef() {
/* 430 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getSendStatus() {
/* 438 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\carrier\CarrierMessagingService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */