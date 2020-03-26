/*     */ package android.content.pm;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PackageInfo
/*     */   implements Parcelable
/*     */ {
/*     */   public PackageInfo() {
/*  29 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getLongVersionCode() {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLongVersionCode(long longVersionCode) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  56 */   public static final Parcelable.Creator<PackageInfo> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int INSTALL_LOCATION_AUTO = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int INSTALL_LOCATION_INTERNAL_ONLY = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int INSTALL_LOCATION_PREFER_EXTERNAL = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int REQUESTED_PERMISSION_GRANTED = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ActivityInfo[] activities;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApplicationInfo applicationInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int baseRevisionCode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ConfigurationInfo[] configPreferences;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FeatureGroupInfo[] featureGroups;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long firstInstallTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] gids;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 153 */   public int installLocation = 1;
/*     */   public InstrumentationInfo[] instrumentation;
/*     */   public long lastUpdateTime;
/*     */   public String packageName;
/*     */   public PermissionInfo[] permissions;
/*     */   public ProviderInfo[] providers;
/*     */   public ActivityInfo[] receivers;
/*     */   public FeatureInfo[] reqFeatures;
/*     */   public String[] requestedPermissions;
/*     */   public int[] requestedPermissionsFlags;
/*     */   public ServiceInfo[] services;
/*     */   public String sharedUserId;
/*     */   public int sharedUserLabel;
/*     */   @Deprecated
/*     */   public Signature[] signatures;
/*     */   public SigningInfo signingInfo;
/*     */   public String[] splitNames;
/*     */   public int[] splitRevisionCodes;
/*     */   @Deprecated
/*     */   public int versionCode;
/*     */   public String versionName;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\PackageInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */