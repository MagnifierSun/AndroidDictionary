/*    */ package android.media.midi;
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
/*    */ public abstract class MidiSender
/*    */ {
/*    */   public MidiSender() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void connect(MidiReceiver receiver) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void disconnect(MidiReceiver receiver) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onConnect(MidiReceiver paramMidiReceiver);
/*    */   
/*    */   public abstract void onDisconnect(MidiReceiver paramMidiReceiver);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\midi\MidiSender.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */