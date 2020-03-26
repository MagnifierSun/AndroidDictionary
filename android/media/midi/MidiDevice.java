/*    */ package android.media.midi;
/*    */ 
/*    */ import android.os.IBinder;
/*    */ import java.io.Closeable;
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
/*    */ 
/*    */ 
/*    */ public final class MidiDevice
/*    */   implements Closeable
/*    */ {
/*    */   MidiDevice() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public MidiDeviceInfo getInfo() {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public MidiInputPort openInputPort(int portNumber) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public MidiOutputPort openOutputPort(int portNumber) {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public MidiConnection connectPorts(MidiInputPort inputPort, int outputPortNumber) {
/* 78 */     throw new RuntimeException("Stub!");
/*    */   } public void close() throws IOException {
/* 80 */     throw new RuntimeException("Stub!");
/*    */   } protected void finalize() throws Throwable {
/* 82 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 84 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public class MidiConnection
/*    */     implements Closeable
/*    */   {
/*    */     MidiConnection(IBinder outputPortToken, MidiInputPort inputPort) {
/* 94 */       throw new RuntimeException("Stub!");
/*    */     } public void close() throws IOException {
/* 96 */       throw new RuntimeException("Stub!");
/*    */     } protected void finalize() throws Throwable {
/* 98 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\midi\MidiDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */