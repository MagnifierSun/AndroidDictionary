/*     */ package android.net.wifi.rtt;
/*     */ 
/*     */ import android.net.MacAddress;
/*     */ import android.net.wifi.ScanResult;
/*     */ import android.net.wifi.aware.PeerHandle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.util.List;
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
/*     */ public final class RangingRequest
/*     */   implements Parcelable
/*     */ {
/*     */   RangingRequest() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getMaxPeers() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public String toString() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  70 */   public static final Parcelable.Creator<RangingRequest> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Builder
/*     */   {
/*     */     public Builder() {
/*  78 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */     
/*     */     public Builder addAccessPoint(@RecentlyNonNull ScanResult apInfo) {
/*  96 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */     
/*     */     public Builder addAccessPoints(@RecentlyNonNull List<ScanResult> apInfos) {
/* 114 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder addWifiAwarePeer(@RecentlyNonNull MacAddress peerMacAddress) {
/* 137 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder addWifiAwarePeer(@RecentlyNonNull PeerHandle peerHandle) {
/* 158 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public RangingRequest build() {
/* 165 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\rtt\RangingRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */