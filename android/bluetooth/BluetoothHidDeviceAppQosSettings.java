/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
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
/*    */ public final class BluetoothHidDeviceAppQosSettings
/*    */   implements Parcelable
/*    */ {
/*    */   public BluetoothHidDeviceAppQosSettings(int serviceType, int tokenRate, int tokenBucketSize, int peakBandwidth, int latency, int delayVariation) {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   } public int getServiceType() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   } public int getTokenRate() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public int getTokenBucketSize() {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   } public int getPeakBandwidth() {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   } public int getLatency() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   } public int getDelayVariation() {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel out, int flags) {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 65 */   public static final Parcelable.Creator<BluetoothHidDeviceAppQosSettings> CREATOR = null;
/*    */   public static final int MAX = -1;
/*    */   public static final int SERVICE_BEST_EFFORT = 1;
/*    */   public static final int SERVICE_GUARANTEED = 2;
/*    */   public static final int SERVICE_NO_TRAFFIC = 0;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\BluetoothHidDeviceAppQosSettings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */