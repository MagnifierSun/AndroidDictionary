/*     */ package android.os;
/*     */ 
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.io.FileDescriptor;
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
/*     */ public final class MessageQueue
/*     */ {
/*     */   MessageQueue(boolean quitAllowed) {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isIdle() {
/*  46 */     throw new RuntimeException("Stub!");
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
/*     */   public void addIdleHandler(@RecentlyNonNull IdleHandler handler) {
/*  61 */     throw new RuntimeException("Stub!");
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
/*     */   public void removeIdleHandler(@RecentlyNonNull IdleHandler handler) {
/*  75 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addOnFileDescriptorEventListener(@RecentlyNonNull FileDescriptor fd, int events, @RecentlyNonNull OnFileDescriptorEventListener listener) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeOnFileDescriptorEventListener(@RecentlyNonNull FileDescriptor fd) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnFileDescriptorEventListener {
/*     */     public static final int EVENT_ERROR = 4;
/*     */     public static final int EVENT_INPUT = 1;
/*     */     public static final int EVENT_OUTPUT = 2;
/*     */     
/*     */     int onFileDescriptorEvents(@RecentlyNonNull FileDescriptor param1FileDescriptor, int param1Int);
/*     */   }
/*     */   
/*     */   public static interface IdleHandler {
/*     */     boolean queueIdle();
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\os\MessageQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */