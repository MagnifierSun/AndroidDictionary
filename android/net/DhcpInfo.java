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
/*    */ public class DhcpInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public int dns1;
/*    */   public int dns2;
/*    */   public int gateway;
/*    */   public int ipAddress;
/*    */   public int leaseDuration;
/*    */   public int netmask;
/*    */   public int serverAddress;
/*    */   
/*    */   public DhcpInfo() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public int describeContents() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public void writeToParcel(Parcel dest, int flags) {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\net\DhcpInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */