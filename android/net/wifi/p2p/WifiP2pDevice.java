/*     */ package android.net.wifi.p2p;
/*     */ 
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
/*     */ public class WifiP2pDevice
/*     */   implements Parcelable
/*     */ {
/*     */   public static final int AVAILABLE = 3;
/*     */   public static final int CONNECTED = 0;
/*     */   
/*     */   public WifiP2pDevice() {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public WifiP2pDevice(WifiP2pDevice source) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean wpsPbcSupported() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean wpsKeypadSupported() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean wpsDisplaySupported() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean isServiceDiscoveryCapable() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean isGroupOwner() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int describeContents() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void writeToParcel(Parcel dest, int flags) {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  78 */   public static final Parcelable.Creator<WifiP2pDevice> CREATOR = null;
/*     */ 
/*     */   
/*     */   public static final int FAILED = 2;
/*     */ 
/*     */   
/*     */   public static final int INVITED = 1;
/*     */ 
/*     */   
/*     */   public static final int UNAVAILABLE = 4;
/*     */ 
/*     */   
/*  90 */   public String deviceAddress = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   public String deviceName = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String primaryDeviceType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String secondaryDeviceType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   public int status = 4;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\p2p\WifiP2pDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */