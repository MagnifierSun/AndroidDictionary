/*    */ package android.location;
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
/*    */ @Deprecated
/*    */ public final class GpsStatus
/*    */ {
/*    */   public static final int GPS_EVENT_FIRST_FIX = 3;
/*    */   public static final int GPS_EVENT_SATELLITE_STATUS = 4;
/*    */   public static final int GPS_EVENT_STARTED = 1;
/*    */   public static final int GPS_EVENT_STOPPED = 2;
/*    */   
/*    */   GpsStatus() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getTimeToFirstFix() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Iterable<GpsSatellite> getSatellites() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getMaxSatellites() {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public static interface NmeaListener {
/*    */     void onNmeaReceived(long param1Long, String param1String);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public static interface Listener {
/*    */     void onGpsStatusChanged(int param1Int);
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\location\GpsStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */