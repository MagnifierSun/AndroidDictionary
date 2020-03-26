/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.net.wifi.WpsInfo;
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
/*    */ public class WifiP2pConfig
/*    */   implements Parcelable
/*    */ {
/*    */   public WifiP2pConfig() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public WifiP2pConfig(WifiP2pConfig source) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public int describeContents() {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public void writeToParcel(Parcel dest, int flags) {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 51 */   public static final Parcelable.Creator<WifiP2pConfig> CREATOR = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 57 */   public String deviceAddress = "";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 67 */   public int groupOwnerIntent = -1;
/*    */   public WpsInfo wps;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\p2p\WifiP2pConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */