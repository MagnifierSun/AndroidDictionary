/*     */ package android.telephony;
/*     */ 
/*     */ import android.app.Service;
/*     */ import android.content.Intent;
/*     */ import android.os.IBinder;
/*     */ import android.os.Messenger;
/*     */ import android.telecom.PhoneAccountHandle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class VisualVoicemailService
/*     */   extends Service
/*     */ {
/*     */   public static final String SERVICE_INTERFACE = "android.telephony.VisualVoicemailService";
/*     */   
/*     */   public VisualVoicemailService() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public IBinder onBind(Intent intent) {
/*  58 */     throw new RuntimeException("Stub!");
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
/*     */   public abstract void onCellServiceConnected(VisualVoicemailTask paramVisualVoicemailTask, PhoneAccountHandle paramPhoneAccountHandle);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onSmsReceived(VisualVoicemailTask paramVisualVoicemailTask, VisualVoicemailSms paramVisualVoicemailSms);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onSimRemoved(VisualVoicemailTask paramVisualVoicemailTask, PhoneAccountHandle paramPhoneAccountHandle);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onStopped(VisualVoicemailTask paramVisualVoicemailTask);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class VisualVoicemailTask
/*     */   {
/*     */     VisualVoicemailTask(Messenger replyTo, int taskId) {
/* 133 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final void finish() {
/* 139 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object obj) {
/* 141 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 143 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\VisualVoicemailService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */