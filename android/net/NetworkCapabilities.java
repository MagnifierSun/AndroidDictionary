/*    */ package android.net;
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
/*    */ public final class NetworkCapabilities
/*    */   implements Parcelable
/*    */ {
/*    */   public NetworkCapabilities(NetworkCapabilities nc) {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean hasCapability(int capability) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean hasTransport(int transportType) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getLinkUpstreamBandwidthKbps() {
/* 70 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getLinkDownstreamBandwidthKbps() {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object obj) {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 83 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 85 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 89 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 92 */   public static final Parcelable.Creator<NetworkCapabilities> CREATOR = null;
/*    */   public static final int NET_CAPABILITY_CAPTIVE_PORTAL = 17;
/*    */   public static final int NET_CAPABILITY_CBS = 5;
/*    */   public static final int NET_CAPABILITY_DUN = 2;
/*    */   public static final int NET_CAPABILITY_EIMS = 10;
/*    */   public static final int NET_CAPABILITY_FOREGROUND = 19;
/*    */   public static final int NET_CAPABILITY_FOTA = 3;
/*    */   public static final int NET_CAPABILITY_IA = 7;
/*    */   public static final int NET_CAPABILITY_IMS = 4;
/*    */   public static final int NET_CAPABILITY_INTERNET = 12;
/*    */   public static final int NET_CAPABILITY_MMS = 0;
/*    */   public static final int NET_CAPABILITY_NOT_CONGESTED = 20;
/*    */   public static final int NET_CAPABILITY_NOT_METERED = 11;
/*    */   public static final int NET_CAPABILITY_NOT_RESTRICTED = 13;
/*    */   public static final int NET_CAPABILITY_NOT_ROAMING = 18;
/*    */   public static final int NET_CAPABILITY_NOT_SUSPENDED = 21;
/*    */   public static final int NET_CAPABILITY_NOT_VPN = 15;
/*    */   public static final int NET_CAPABILITY_RCS = 8;
/*    */   public static final int NET_CAPABILITY_SUPL = 1;
/*    */   public static final int NET_CAPABILITY_TRUSTED = 14;
/*    */   public static final int NET_CAPABILITY_VALIDATED = 16;
/*    */   public static final int NET_CAPABILITY_WIFI_P2P = 6;
/*    */   public static final int NET_CAPABILITY_XCAP = 9;
/*    */   public static final int TRANSPORT_BLUETOOTH = 2;
/*    */   public static final int TRANSPORT_CELLULAR = 0;
/*    */   public static final int TRANSPORT_ETHERNET = 3;
/*    */   public static final int TRANSPORT_LOWPAN = 6;
/*    */   public static final int TRANSPORT_VPN = 4;
/*    */   public static final int TRANSPORT_WIFI = 1;
/*    */   public static final int TRANSPORT_WIFI_AWARE = 5;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\net\NetworkCapabilities.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */