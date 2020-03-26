/*     */ package android.hardware;
/*     */ 
/*     */ import java.nio.channels.Channel;
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
/*     */ public final class SensorDirectChannel
/*     */   implements Channel
/*     */ {
/*     */   public static final int RATE_FAST = 2;
/*     */   public static final int RATE_NORMAL = 1;
/*     */   public static final int RATE_STOP = 0;
/*     */   public static final int RATE_VERY_FAST = 3;
/*     */   public static final int TYPE_HARDWARE_BUFFER = 2;
/*     */   public static final int TYPE_MEMORY_FILE = 1;
/*     */   
/*     */   SensorDirectChannel(SensorManager manager, int id, int type, long size) {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOpen() {
/*  45 */     throw new RuntimeException("Stub!");
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
/*     */   public void close() {
/*  57 */     throw new RuntimeException("Stub!");
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
/*     */   public int configure(Sensor sensor, int rateLevel) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\hardware\SensorDirectChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */