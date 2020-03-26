/*     */ package android.bluetooth.le;
/*     */ 
/*     */ import android.bluetooth.BluetoothDevice;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNullable;
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
/*     */ public final class ScanResult
/*     */   implements Parcelable
/*     */ {
/*     */   @Deprecated
/*     */   public ScanResult(BluetoothDevice device, ScanRecord scanRecord, int rssi, long timestampNanos) {
/*  40 */     throw new RuntimeException("Stub!");
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
/*     */   public ScanResult(BluetoothDevice device, int eventType, int primaryPhy, int secondaryPhy, int advertisingSid, int txPower, int rssi, int periodicAdvertisingInterval, ScanRecord scanRecord, long timestampNanos) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BluetoothDevice getDevice() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public ScanRecord getScanRecord() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getRssi() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getTimestampNanos() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isLegacy() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isConnectable() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDataStatus() {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPrimaryPhy() {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSecondaryPhy() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAdvertisingSid() {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTxPower() {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPeriodicAdvertisingInterval() {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 163 */   public static final Parcelable.Creator<ScanResult> CREATOR = null;
/*     */   public static final int DATA_COMPLETE = 0;
/*     */   public static final int DATA_TRUNCATED = 2;
/*     */   public static final int PERIODIC_INTERVAL_NOT_PRESENT = 0;
/*     */   public static final int PHY_UNUSED = 0;
/*     */   public static final int SID_NOT_PRESENT = 255;
/*     */   public static final int TX_POWER_NOT_PRESENT = 127;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\le\ScanResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */