/*     */ package android.speech;
/*     */ 
/*     */ import android.app.Service;
/*     */ import android.content.Intent;
/*     */ import android.os.Bundle;
/*     */ import android.os.IBinder;
/*     */ import android.os.RemoteException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class RecognitionService
/*     */   extends Service
/*     */ {
/*     */   public static final String SERVICE_INTERFACE = "android.speech.RecognitionService";
/*     */   public static final String SERVICE_META_DATA = "android.speech";
/*     */   
/*     */   public RecognitionService() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract void onStartListening(Intent paramIntent, Callback paramCallback);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract void onCancel(Callback paramCallback);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract void onStopListening(Callback paramCallback);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final IBinder onBind(Intent intent) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public void onDestroy() {
/*  64 */     throw new RuntimeException("Stub!");
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
/*     */   public class Callback
/*     */   {
/*     */     Callback() {
/*  89 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void beginningOfSpeech() throws RemoteException {
/*  95 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void bufferReceived(byte[] buffer) throws RemoteException {
/* 105 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void endOfSpeech() throws RemoteException {
/* 111 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void error(int error) throws RemoteException {
/* 119 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void partialResults(Bundle partialResults) throws RemoteException {
/* 133 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void readyForSpeech(Bundle params) throws RemoteException {
/* 142 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void results(Bundle results) throws RemoteException {
/* 152 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void rmsChanged(float rmsdB) throws RemoteException {
/* 161 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getCallingUid() {
/* 168 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\speech\RecognitionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */