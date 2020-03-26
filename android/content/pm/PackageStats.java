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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class PackageStats
/*    */   implements Parcelable
/*    */ {
/*    */   public PackageStats(String pkgName) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public PackageStats(Parcel source) {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public PackageStats(PackageStats pStats) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object obj) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 50 */   public static final Parcelable.Creator<PackageStats> CREATOR = null;
/*    */   public long cacheSize;
/*    */   public long codeSize;
/*    */   public long dataSize;
/*    */   public long externalCacheSize;
/*    */   public long externalCodeSize;
/*    */   public long externalDataSize;
/*    */   public long externalMediaSize;
/*    */   public long externalObbSize;
/*    */   public String packageName;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\PackageStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */