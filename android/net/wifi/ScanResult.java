/*    */ package android.net.wifi;
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
/*    */ public class ScanResult
/*    */   implements Parcelable
/*    */ {
/*    */   public String BSSID;
/*    */   public static final int CHANNEL_WIDTH_160MHZ = 3;
/*    */   public static final int CHANNEL_WIDTH_20MHZ = 0;
/*    */   public static final int CHANNEL_WIDTH_40MHZ = 1;
/*    */   public static final int CHANNEL_WIDTH_80MHZ = 2;
/*    */   public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 4;
/*    */   public String SSID;
/*    */   public String capabilities;
/*    */   public int centerFreq0;
/*    */   public int centerFreq1;
/*    */   public int channelWidth;
/*    */   public int frequency;
/*    */   public int level;
/*    */   public CharSequence operatorFriendlyName;
/*    */   public long timestamp;
/*    */   public CharSequence venueName;
/*    */   
/*    */   ScanResult() {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } public boolean is80211mcResponder() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   } public boolean isPasspointNetwork() {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public int describeContents() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public void writeToParcel(Parcel dest, int flags) {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\ScanResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */