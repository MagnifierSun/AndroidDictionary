/*    */ package android.service.voice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
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
/*    */ public abstract class VoiceInteractionSessionService
/*    */   extends Service
/*    */ {
/*    */   public VoiceInteractionSessionService() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   } public void onCreate() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   public abstract VoiceInteractionSession onNewSession(Bundle paramBundle);
/*    */   public IBinder onBind(Intent intent) {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public void onConfigurationChanged(Configuration newConfig) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   } public void onLowMemory() {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   } public void onTrimMemory(int level) {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   } protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\service\voice\VoiceInteractionSessionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */