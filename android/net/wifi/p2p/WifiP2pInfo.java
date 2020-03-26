/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import java.net.InetAddress;
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
/*    */ public class WifiP2pInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public WifiP2pInfo() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public WifiP2pInfo(WifiP2pInfo source) {
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
/* 51 */   public static final Parcelable.Creator<WifiP2pInfo> CREATOR = null;
/*    */   public boolean groupFormed;
/*    */   public InetAddress groupOwnerAddress;
/*    */   public boolean isGroupOwner;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\p2p\WifiP2pInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */