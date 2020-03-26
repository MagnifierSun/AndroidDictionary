/*    */ package android.app.admin;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import java.net.InetAddress;
/*    */ import java.util.List;
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
/*    */ public final class DnsEvent
/*    */   extends NetworkEvent
/*    */   implements Parcelable
/*    */ {
/*    */   DnsEvent(Parcel in) {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public String getHostname() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public List<InetAddress> getInetAddresses() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getTotalResolvedAddressCount() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel out, int flags) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 57 */   public static final Parcelable.Creator<DnsEvent> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\admin\DnsEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */