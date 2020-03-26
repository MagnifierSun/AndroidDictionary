/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.hardware.SensorListener;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class OrientationListener
/*    */   implements SensorListener
/*    */ {
/*    */   public static final int ORIENTATION_UNKNOWN = -1;
/*    */   
/*    */   public OrientationListener(Context context) {
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
/*    */   public OrientationListener(Context context, int rate) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void enable() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void disable() {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   } public void onAccuracyChanged(int sensor, int accuracy) {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   } public void onSensorChanged(int sensor, float[] values) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onOrientationChanged(int paramInt);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\OrientationListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */