/*    */ package android.os;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
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
/*    */ public class HardwarePropertiesManager
/*    */ {
/*    */   public static final int DEVICE_TEMPERATURE_BATTERY = 2;
/*    */   public static final int DEVICE_TEMPERATURE_CPU = 0;
/*    */   public static final int DEVICE_TEMPERATURE_GPU = 1;
/*    */   public static final int DEVICE_TEMPERATURE_SKIN = 3;
/*    */   public static final int TEMPERATURE_CURRENT = 0;
/*    */   public static final int TEMPERATURE_SHUTDOWN = 2;
/*    */   public static final int TEMPERATURE_THROTTLING = 1;
/*    */   public static final int TEMPERATURE_THROTTLING_BELOW_VR_MIN = 3;
/*    */   public static final float UNDEFINED_TEMPERATURE = -3.4028235E38F;
/*    */   
/*    */   HardwarePropertiesManager() {
/* 28 */     throw new RuntimeException("Stub!");
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public float[] getDeviceTemperatures(int type, int source) {
/* 50 */     throw new RuntimeException("Stub!");
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
/*    */   @RecentlyNonNull
/*    */   public CpuUsageInfo[] getCpuUsages() {
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
/*    */   @RecentlyNonNull
/*    */   public float[] getFanSpeeds() {
/* 76 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\os\HardwarePropertiesManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */