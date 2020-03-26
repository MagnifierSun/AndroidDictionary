/*    */ package android.media.midi;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class MidiDeviceService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.media.midi.MidiDeviceService";
/*    */   
/*    */   public MidiDeviceService() {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   } public void onCreate() {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract MidiReceiver[] onGetInputPortReceivers();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final MidiReceiver[] getOutputPortReceivers() {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final MidiDeviceInfo getDeviceInfo() {
/* 74 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onDeviceStatusChanged(MidiDeviceStatus status) {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onClose() {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   } public IBinder onBind(Intent intent) {
/* 89 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\midi\MidiDeviceService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */