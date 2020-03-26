/*     */ package android.mtp;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MtpEvent
/*     */ {
/*     */   public static final int EVENT_CANCEL_TRANSACTION = 16385;
/*     */   public static final int EVENT_CAPTURE_COMPLETE = 16397;
/*     */   public static final int EVENT_DEVICE_INFO_CHANGED = 16392;
/*     */   public static final int EVENT_DEVICE_PROP_CHANGED = 16390;
/*     */   public static final int EVENT_DEVICE_RESET = 16395;
/*     */   public static final int EVENT_OBJECT_ADDED = 16386;
/*     */   public static final int EVENT_OBJECT_INFO_CHANGED = 16391;
/*     */   public static final int EVENT_OBJECT_PROP_CHANGED = 51201;
/*     */   public static final int EVENT_OBJECT_PROP_DESC_CHANGED = 51202;
/*     */   public static final int EVENT_OBJECT_REFERENCES_CHANGED = 51203;
/*     */   public static final int EVENT_OBJECT_REMOVED = 16387;
/*     */   public static final int EVENT_REQUEST_OBJECT_TRANSFER = 16393;
/*     */   public static final int EVENT_STORAGE_INFO_CHANGED = 16396;
/*     */   public static final int EVENT_STORE_ADDED = 16388;
/*     */   public static final int EVENT_STORE_FULL = 16394;
/*     */   public static final int EVENT_STORE_REMOVED = 16389;
/*     */   public static final int EVENT_UNDEFINED = 16384;
/*     */   public static final int EVENT_UNREPORTED_STATUS = 16398;
/*     */   
/*     */   MtpEvent() {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEventCode() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getParameter1() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getParameter2() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getParameter3() {
/*  59 */     throw new RuntimeException("Stub!");
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
/*     */   public int getObjectHandle() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStorageId() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDevicePropCode() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTransactionId() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getObjectPropCode() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getObjectFormatCode() {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\mtp\MtpEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */