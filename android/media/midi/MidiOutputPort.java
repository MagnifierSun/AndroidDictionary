/*    */ package android.media.midi;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
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
/*    */ public final class MidiOutputPort
/*    */   extends MidiSender
/*    */   implements Closeable
/*    */ {
/*    */   MidiOutputPort(FileDescriptor fd, int portNumber) {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getPortNumber() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public void onConnect(MidiReceiver receiver) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } public void onDisconnect(MidiReceiver receiver) {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   } public void close() throws IOException {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } protected void finalize() throws Throwable {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\midi\MidiOutputPort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */