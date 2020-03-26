/*    */ package android.content;
/*    */ 
/*    */ import android.accounts.Account;
/*    */ import android.os.Bundle;
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
/*    */ public class PeriodicSync
/*    */   implements Parcelable
/*    */ {
/*    */   public PeriodicSync(Account account, String authority, Bundle extras, long periodInSeconds) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object o) {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 44 */   public static final Parcelable.Creator<PeriodicSync> CREATOR = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   public final Account account = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 54 */   public final String authority = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 59 */   public final Bundle extras = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 64 */   public final long period = 0L;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\PeriodicSync.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */