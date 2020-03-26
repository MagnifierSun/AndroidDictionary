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
/*    */ public class PermissionInfo
/*    */   extends PackageItemInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public PermissionInfo() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   } public PermissionInfo(PermissionInfo orig) {
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
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getProtection() {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getProtectionFlags() {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 71 */   public static final Parcelable.Creator<PermissionInfo> CREATOR = null;
/*    */   public static final int FLAG_COSTS_MONEY = 1;
/*    */   public static final int FLAG_INSTALLED = 1073741824;
/*    */   public static final int PROTECTION_DANGEROUS = 1;
/*    */   public static final int PROTECTION_FLAG_APPOP = 64;
/*    */   public static final int PROTECTION_FLAG_DEVELOPMENT = 32;
/*    */   public static final int PROTECTION_FLAG_INSTALLER = 256;
/*    */   public static final int PROTECTION_FLAG_INSTANT = 4096;
/*    */   public static final int PROTECTION_FLAG_PRE23 = 128;
/*    */   public static final int PROTECTION_FLAG_PREINSTALLED = 1024;
/*    */   public static final int PROTECTION_FLAG_PRIVILEGED = 16;
/*    */   public static final int PROTECTION_FLAG_RUNTIME_ONLY = 8192;
/*    */   public static final int PROTECTION_FLAG_SETUP = 2048;
/*    */   @Deprecated
/*    */   public static final int PROTECTION_FLAG_SYSTEM = 16;
/*    */   public static final int PROTECTION_FLAG_VERIFIER = 512;
/*    */   @Deprecated
/*    */   public static final int PROTECTION_MASK_BASE = 15;
/*    */   @Deprecated
/*    */   public static final int PROTECTION_MASK_FLAGS = 65520;
/*    */   public static final int PROTECTION_NORMAL = 0;
/*    */   public static final int PROTECTION_SIGNATURE = 2;
/*    */   @Deprecated
/*    */   public static final int PROTECTION_SIGNATURE_OR_SYSTEM = 3;
/*    */   public int descriptionRes;
/*    */   public int flags;
/*    */   public String group;
/*    */   public CharSequence nonLocalizedDescription;
/*    */   @Deprecated
/*    */   public int protectionLevel;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\PermissionInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */