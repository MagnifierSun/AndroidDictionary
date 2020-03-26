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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class IccOpenLogicalChannelResponse
/*    */   implements Parcelable
/*    */ {
/*    */   IccOpenLogicalChannelResponse(Parcel in) {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getChannel() {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getStatus() {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] getSelectResponse() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel out, int flags) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 59 */   public static final Parcelable.Creator<IccOpenLogicalChannelResponse> CREATOR = null;
/*    */   public static final int INVALID_CHANNEL = -1;
/*    */   public static final int STATUS_MISSING_RESOURCE = 2;
/*    */   public static final int STATUS_NO_ERROR = 1;
/*    */   public static final int STATUS_NO_SUCH_ELEMENT = 3;
/*    */   public static final int STATUS_UNKNOWN_ERROR = 4;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\IccOpenLogicalChannelResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */