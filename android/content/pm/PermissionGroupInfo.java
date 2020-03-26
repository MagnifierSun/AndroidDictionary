/*    */ package android.content.pm;
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
/*    */ public class PermissionGroupInfo
/*    */   extends PackageItemInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public PermissionGroupInfo() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   } public PermissionGroupInfo(PermissionGroupInfo orig) {
/* 32 */     throw new RuntimeException("Stub!");
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
/*    */   public CharSequence loadDescription(PackageManager pm) {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 55 */   public static final Parcelable.Creator<PermissionGroupInfo> CREATOR = null;
/*    */   public static final int FLAG_PERSONAL_INFO = 1;
/*    */   public int descriptionRes;
/*    */   public int flags;
/*    */   public CharSequence nonLocalizedDescription;
/*    */   public int priority;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\PermissionGroupInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */