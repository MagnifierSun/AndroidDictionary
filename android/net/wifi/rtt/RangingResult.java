/*     */ package android.net.wifi.rtt;
/*     */ 
/*     */ import android.net.MacAddress;
/*     */ import android.net.wifi.aware.PeerHandle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
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
/*     */ public final class RangingResult
/*     */   implements Parcelable
/*     */ {
/*     */   RangingResult(int status, @RecentlyNonNull MacAddress mac, int distanceMm, int distanceStdDevMm, int rssi, int numAttemptedMeasurements, int numSuccessfulMeasurements, byte[] lci, byte[] lcr, long timestamp) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStatus() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public MacAddress getMacAddress() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public PeerHandle getPeerHandle() {
/*  67 */     throw new RuntimeException("Stub!");
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
/*     */   public int getDistanceMm() {
/*  79 */     throw new RuntimeException("Stub!");
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
/*     */   public int getDistanceStdDevMm() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getRssi() {
/* 101 */     throw new RuntimeException("Stub!");
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
/*     */   public int getNumAttemptedMeasurements() {
/* 113 */     throw new RuntimeException("Stub!");
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
/*     */   public int getNumSuccessfulMeasurements() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getRangingTimestampMillis() {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public String toString() {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 155 */   public static final Parcelable.Creator<RangingResult> CREATOR = null;
/*     */   public static final int STATUS_FAIL = 1;
/*     */   public static final int STATUS_RESPONDER_DOES_NOT_SUPPORT_IEEE80211MC = 2;
/*     */   public static final int STATUS_SUCCESS = 0;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\rtt\RangingResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */