/*    */ package android.os;
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
/*    */ public class BatteryManager
/*    */ {
/*    */   public static final String ACTION_CHARGING = "android.os.action.CHARGING";
/*    */   public static final String ACTION_DISCHARGING = "android.os.action.DISCHARGING";
/*    */   public static final int BATTERY_HEALTH_COLD = 7;
/*    */   public static final int BATTERY_HEALTH_DEAD = 4;
/*    */   public static final int BATTERY_HEALTH_GOOD = 2;
/*    */   public static final int BATTERY_HEALTH_OVERHEAT = 3;
/*    */   public static final int BATTERY_HEALTH_OVER_VOLTAGE = 5;
/*    */   public static final int BATTERY_HEALTH_UNKNOWN = 1;
/*    */   public static final int BATTERY_HEALTH_UNSPECIFIED_FAILURE = 6;
/*    */   public static final int BATTERY_PLUGGED_AC = 1;
/*    */   public static final int BATTERY_PLUGGED_USB = 2;
/*    */   public static final int BATTERY_PLUGGED_WIRELESS = 4;
/*    */   public static final int BATTERY_PROPERTY_CAPACITY = 4;
/*    */   public static final int BATTERY_PROPERTY_CHARGE_COUNTER = 1;
/*    */   public static final int BATTERY_PROPERTY_CURRENT_AVERAGE = 3;
/*    */   public static final int BATTERY_PROPERTY_CURRENT_NOW = 2;
/*    */   public static final int BATTERY_PROPERTY_ENERGY_COUNTER = 5;
/*    */   
/*    */   BatteryManager() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   public static final int BATTERY_PROPERTY_STATUS = 6; public static final int BATTERY_STATUS_CHARGING = 2; public static final int BATTERY_STATUS_DISCHARGING = 3; public static final int BATTERY_STATUS_FULL = 5; public static final int BATTERY_STATUS_NOT_CHARGING = 4; public static final int BATTERY_STATUS_UNKNOWN = 1; public static final String EXTRA_BATTERY_LOW = "battery_low"; public static final String EXTRA_HEALTH = "health"; public static final String EXTRA_ICON_SMALL = "icon-small"; public static final String EXTRA_LEVEL = "level"; public static final String EXTRA_PLUGGED = "plugged"; public static final String EXTRA_PRESENT = "present"; public static final String EXTRA_SCALE = "scale";
/*    */   public static final String EXTRA_STATUS = "status";
/*    */   public static final String EXTRA_TECHNOLOGY = "technology";
/*    */   public static final String EXTRA_TEMPERATURE = "temperature";
/*    */   public static final String EXTRA_VOLTAGE = "voltage";
/*    */   
/*    */   public boolean isCharging() {
/* 44 */     throw new RuntimeException("Stub!");
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
/*    */   public int getIntProperty(int id) {
/* 56 */     throw new RuntimeException("Stub!");
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
/*    */   public long getLongProperty(int id) {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long computeChargeTimeRemaining() {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\os\BatteryManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */