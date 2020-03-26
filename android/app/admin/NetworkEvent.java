/*    */ package android.app.admin;
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
/*    */ public abstract class NetworkEvent
/*    */   implements Parcelable
/*    */ {
/*    */   NetworkEvent() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getPackageName() {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getTimestamp() {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getId() {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 59 */   public static final Parcelable.Creator<NetworkEvent> CREATOR = null;
/*    */   
/*    */   public abstract void writeToParcel(Parcel paramParcel, int paramInt);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\admin\NetworkEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */