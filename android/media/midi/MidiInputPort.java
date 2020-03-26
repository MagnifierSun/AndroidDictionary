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
/*    */ public final class MidiInputPort
/*    */   extends MidiReceiver
/*    */   implements Closeable
/*    */ {
/*    */   MidiInputPort(FileDescriptor fd, int portNumber) {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getPortNumber() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public void onSend(byte[] msg, int offset, int count, long timestamp) throws IOException {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } public void onFlush() throws IOException {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   } public void close() throws IOException {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } protected void finalize() throws Throwable {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\midi\MidiInputPort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */