/*     */ package android.app.usage;
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
/*     */ public final class NetworkStats
/*     */   implements AutoCloseable
/*     */ {
/*     */   NetworkStats() {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getNextBucket(Bucket bucketOut) {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasNextBucket() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static class Bucket { public static final int DEFAULT_NETWORK_ALL = -1;
/*     */     public static final int DEFAULT_NETWORK_NO = 1;
/*     */     public static final int DEFAULT_NETWORK_YES = 2;
/*     */     public static final int METERED_ALL = -1;
/*     */     
/*     */     public Bucket() {
/*  62 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     public static final int METERED_NO = 1; public static final int METERED_YES = 2; public static final int ROAMING_ALL = -1; public static final int ROAMING_NO = 1; public static final int ROAMING_YES = 2;
/*     */     public static final int STATE_ALL = -1;
/*     */     public static final int STATE_DEFAULT = 1;
/*     */     public static final int STATE_FOREGROUND = 2;
/*     */     public static final int TAG_NONE = 0;
/*     */     public static final int UID_ALL = -1;
/*     */     public static final int UID_REMOVED = -4;
/*     */     public static final int UID_TETHERING = -5;
/*     */     
/*     */     public int getUid() {
/*  74 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getTag() {
/*  81 */       throw new RuntimeException("Stub!");
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
/*     */     public int getState() {
/*  95 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */     
/*     */     public int getMetered() {
/* 111 */       throw new RuntimeException("Stub!");
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
/*     */     public int getRoaming() {
/* 124 */       throw new RuntimeException("Stub!");
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
/*     */     public int getDefaultNetworkStatus() {
/* 137 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long getStartTimeStamp() {
/* 145 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long getEndTimeStamp() {
/* 153 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long getRxBytes() {
/* 161 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long getTxBytes() {
/* 169 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long getRxPackets() {
/* 177 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long getTxPackets() {
/* 185 */       throw new RuntimeException("Stub!");
/*     */     } }
/*     */ 
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\ap\\usage\NetworkStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */