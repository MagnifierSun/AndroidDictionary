/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.PatternMatcher;
/*    */ import android.util.Printer;
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
/*    */ public final class ProviderInfo
/*    */   extends ComponentInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public ProviderInfo() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   } public ProviderInfo(ProviderInfo orig) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public void dump(Printer pw, String prefix) {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel out, int parcelableFlags) {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 44 */   public static final Parcelable.Creator<ProviderInfo> CREATOR = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int FLAG_SINGLE_USER = 1073741824;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String authority;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 64 */   public int flags = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean grantUriPermissions = false;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 77 */   public int initOrder = 0;
/*    */   @Deprecated
/*    */   public boolean isSyncable = false;
/*    */   public boolean multiprocess = false;
/*    */   public PathPermission[] pathPermissions;
/*    */   public String readPermission;
/*    */   public PatternMatcher[] uriPermissionPatterns;
/*    */   public String writePermission;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\ProviderInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */