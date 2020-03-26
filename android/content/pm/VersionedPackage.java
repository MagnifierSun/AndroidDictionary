/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNonNull;
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
/*    */ public final class VersionedPackage
/*    */   implements Parcelable
/*    */ {
/*    */   public VersionedPackage(@RecentlyNonNull String packageName, int versionCode) {
/* 37 */     throw new RuntimeException("Stub!");
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
/*    */   public VersionedPackage(@RecentlyNonNull String packageName, long versionCode) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public String getPackageName() {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   public int getVersionCode() {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getLongVersionCode() {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel parcel, int flags) {
/* 83 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 86 */   public static final Parcelable.Creator<VersionedPackage> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\VersionedPackage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */