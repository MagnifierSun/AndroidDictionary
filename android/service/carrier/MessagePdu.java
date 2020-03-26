/*    */ package android.service.carrier;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNonNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MessagePdu
/*    */   implements Parcelable
/*    */ {
/*    */   public MessagePdu(@RecentlyNonNull List<byte[]> pduList) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public List<byte[]> getPdus() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 59 */   public static final Parcelable.Creator<MessagePdu> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\service\carrier\MessagePdu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */