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
/*    */ public final class SaveRequest
/*    */   implements Parcelable
/*    */ {
/*    */   SaveRequest(Parcel parcel) {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public List<FillContext> getFillContexts() {
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
/*    */ 
/*    */   
/*    */   @RecentlyNullable
/*    */   public Bundle getClientState() {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNullable
/*    */   public List<String> getDatasetIds() {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel parcel, int flags) {
/* 70 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 73 */   public static final Parcelable.Creator<SaveRequest> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\service\autofill\SaveRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */