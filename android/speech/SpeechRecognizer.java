/*     */ package android.speech;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SpeechRecognizer
/*     */ {
/*     */   public static final String CONFIDENCE_SCORES = "confidence_scores";
/*     */   public static final int ERROR_AUDIO = 3;
/*     */   public static final int ERROR_CLIENT = 5;
/*     */   public static final int ERROR_INSUFFICIENT_PERMISSIONS = 9;
/*     */   public static final int ERROR_NETWORK = 2;
/*     */   public static final int ERROR_NETWORK_TIMEOUT = 1;
/*     */   public static final int ERROR_NO_MATCH = 7;
/*     */   public static final int ERROR_RECOGNIZER_BUSY = 8;
/*     */   public static final int ERROR_SERVER = 4;
/*     */   public static final int ERROR_SPEECH_TIMEOUT = 6;
/*     */   public static final String RESULTS_RECOGNITION = "results_recognition";
/*     */   
/*     */   SpeechRecognizer(Context context, ComponentName serviceComponent) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isRecognitionAvailable(Context context) {
/*  62 */     throw new RuntimeException("Stub!");
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
/*     */   public static SpeechRecognizer createSpeechRecognizer(Context context) {
/*  74 */     throw new RuntimeException("Stub!");
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
/*     */   public static SpeechRecognizer createSpeechRecognizer(Context context, ComponentName serviceComponent) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRecognitionListener(RecognitionListener listener) {
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
/*     */   
/*     */   public void startListening(Intent recognizerIntent) {
/* 116 */     throw new RuntimeException("Stub!");
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
/*     */   public void stopListening() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void cancel() {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void destroy() {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\speech\SpeechRecognizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */