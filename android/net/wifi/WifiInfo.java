/*     */ package android.net.wifi;
/*     */ 
/*     */ import android.net.NetworkInfo;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
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
/*     */ public class WifiInfo
/*     */   implements Parcelable
/*     */ {
/*     */   public static final String FREQUENCY_UNITS = "MHz";
/*     */   public static final String LINK_SPEED_UNITS = "Mbps";
/*     */   
/*     */   WifiInfo() {
/*  34 */     throw new RuntimeException("Stub!");
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
/*     */   public String getSSID() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getBSSID() {
/*  56 */     throw new RuntimeException("Stub!");
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
/*     */   public int getRssi() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLinkSpeed() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFrequency() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public String getMacAddress() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNetworkId() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SupplicantState getSupplicantState() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public int getIpAddress() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getHiddenSSID() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static NetworkInfo.DetailedState getDetailedStateOf(SupplicantState suppState) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int describeContents() {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void writeToParcel(Parcel dest, int flags) {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\WifiInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */