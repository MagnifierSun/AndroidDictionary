/*     */ package android.telecom;
/*     */ 
/*     */ import android.app.Service;
/*     */ import android.content.Intent;
/*     */ import android.os.IBinder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class CallScreeningService
/*     */   extends Service
/*     */ {
/*     */   public static final String SERVICE_INTERFACE = "android.telecom.CallScreeningService";
/*     */   
/*     */   public CallScreeningService() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public IBinder onBind(Intent intent) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onUnbind(Intent intent) {
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
/*     */   public abstract void onScreenCall(Call.Details paramDetails);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void respondToCall(Call.Details callDetails, CallResponse response) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class CallResponse
/*     */   {
/*     */     CallResponse(boolean shouldDisallowCall, boolean shouldRejectCall, boolean shouldSkipCallLog, boolean shouldSkipNotification) {
/*  78 */       throw new RuntimeException("Stub!");
/*     */     } public boolean getDisallowCall() {
/*  80 */       throw new RuntimeException("Stub!");
/*     */     } public boolean getRejectCall() {
/*  82 */       throw new RuntimeException("Stub!");
/*     */     } public boolean getSkipCallLog() {
/*  84 */       throw new RuntimeException("Stub!");
/*     */     } public boolean getSkipNotification() {
/*  86 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static class Builder { public Builder() {
/*  90 */         throw new RuntimeException("Stub!");
/*     */       } public Builder setDisallowCall(boolean shouldDisallowCall) {
/*  92 */         throw new RuntimeException("Stub!");
/*     */       } public Builder setRejectCall(boolean shouldRejectCall) {
/*  94 */         throw new RuntimeException("Stub!");
/*     */       } public Builder setSkipCallLog(boolean shouldSkipCallLog) {
/*  96 */         throw new RuntimeException("Stub!");
/*     */       } public Builder setSkipNotification(boolean shouldSkipNotification) {
/*  98 */         throw new RuntimeException("Stub!");
/*     */       } public CallScreeningService.CallResponse build() {
/* 100 */         throw new RuntimeException("Stub!");
/*     */       } }
/*     */   
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telecom\CallScreeningService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */