/*    */ package android.telephony;
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
/*    */ public abstract class CellInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int CONNECTION_NONE = 0;
/*    */   public static final int CONNECTION_PRIMARY_SERVING = 1;
/*    */   public static final int CONNECTION_SECONDARY_SERVING = 2;
/*    */   public static final int CONNECTION_UNKNOWN = 2147483647;
/*    */   
/*    */   CellInfo() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public boolean isRegistered() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public long getTimeStamp() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public int getCellConnectionStatus() {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object other) {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
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
/* 96 */   public static final Parcelable.Creator<CellInfo> CREATOR = null;
/*    */   
/*    */   public abstract void writeToParcel(Parcel paramParcel, int paramInt);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\CellInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */