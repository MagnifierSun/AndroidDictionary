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
/*    */ public final class SystemUpdateInfo
/*    */   implements Parcelable
/*    */ {
/*    */   SystemUpdateInfo(Parcel in) {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getReceivedTime() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getSecurityPatchState() {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object o) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 59 */   public static final Parcelable.Creator<SystemUpdateInfo> CREATOR = null;
/*    */   public static final int SECURITY_PATCH_STATE_FALSE = 1;
/*    */   public static final int SECURITY_PATCH_STATE_TRUE = 2;
/*    */   public static final int SECURITY_PATCH_STATE_UNKNOWN = 0;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\admin\SystemUpdateInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */