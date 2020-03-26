/*    */ package android.service.autofill;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import androidx.annotation.RecentlyNullable;
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
/*    */ public final class FillRequest
/*    */   implements Parcelable
/*    */ {
/*    */   FillRequest(Parcel parcel) {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getId() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getFlags() {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public List<FillContext> getFillContexts() {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 61 */     throw new RuntimeException("Stub!");
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
/*    */   @RecentlyNullable
/*    */   public Bundle getClientState() {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel parcel, int flags) {
/* 83 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 86 */   public static final Parcelable.Creator<FillRequest> CREATOR = null;
/*    */   public static final int FLAG_MANUAL_REQUEST = 1;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\service\autofill\FillRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */