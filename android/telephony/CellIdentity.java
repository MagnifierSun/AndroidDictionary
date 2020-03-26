/*    */ package android.telephony;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNullable;
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
/*    */ public abstract class CellIdentity
/*    */   implements Parcelable
/*    */ {
/*    */   CellIdentity(String tag, int type, Parcel source) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public int describeContents() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNullable
/*    */   public CharSequence getOperatorAlphaLong() {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNullable
/*    */   public CharSequence getOperatorAlphaShort() {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object other) {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel dest, int type) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 71 */   public static final Parcelable.Creator<CellIdentity> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\CellIdentity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */