/*     */ package android.app.admin;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.content.pm.ActivityInfo;
/*     */ import android.content.pm.PackageManager;
/*     */ import android.content.pm.ResolveInfo;
/*     */ import android.content.res.Resources;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.util.Printer;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.io.IOException;
/*     */ import org.xmlpull.v1.XmlPullParserException;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class DeviceAdminInfo
/*     */   implements Parcelable
/*     */ {
/*     */   public DeviceAdminInfo(Context context, ResolveInfo resolveInfo) throws IOException, XmlPullParserException {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPackageName() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getReceiverName() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ActivityInfo getActivityInfo() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public ComponentName getComponent() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence loadLabel(PackageManager pm) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence loadDescription(PackageManager pm) throws Resources.NotFoundException {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable loadIcon(PackageManager pm) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isVisible() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean usesPolicy(int policyIdent) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTagForPolicy(int policyIdent) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean supportsTransferOwnership() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   } public void dump(Printer pw, String prefix) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel dest, int flags) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 154 */   public static final Parcelable.Creator<DeviceAdminInfo> CREATOR = null;
/*     */   public static final int USES_ENCRYPTED_STORAGE = 7;
/*     */   public static final int USES_POLICY_DISABLE_CAMERA = 8;
/*     */   public static final int USES_POLICY_DISABLE_KEYGUARD_FEATURES = 9;
/*     */   public static final int USES_POLICY_EXPIRE_PASSWORD = 6;
/*     */   public static final int USES_POLICY_FORCE_LOCK = 3;
/*     */   public static final int USES_POLICY_LIMIT_PASSWORD = 0;
/*     */   public static final int USES_POLICY_RESET_PASSWORD = 2;
/*     */   public static final int USES_POLICY_WATCH_LOGIN = 1;
/*     */   public static final int USES_POLICY_WIPE_DATA = 4;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\admin\DeviceAdminInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */