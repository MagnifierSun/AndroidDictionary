/*     */ package android.appwidget;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.content.pm.PackageManager;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.UserHandle;
/*     */ import androidx.annotation.RecentlyNonNull;
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
/*     */ public class AppWidgetProviderInfo
/*     */   implements Parcelable
/*     */ {
/*     */   public AppWidgetProviderInfo() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public AppWidgetProviderInfo(Parcel in) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final String loadLabel(PackageManager packageManager) {
/*  52 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final Drawable loadIcon(@RecentlyNonNull Context context, int density) {
/*  72 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final Drawable loadPreviewImage(@RecentlyNonNull Context context, int density) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final UserHandle getProfile() {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public AppWidgetProviderInfo clone() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 115 */   public static final Parcelable.Creator<AppWidgetProviderInfo> CREATOR = null;
/*     */   public static final int RESIZE_BOTH = 3;
/*     */   public static final int RESIZE_HORIZONTAL = 1;
/*     */   public static final int RESIZE_NONE = 0;
/*     */   public static final int RESIZE_VERTICAL = 2;
/*     */   public static final int WIDGET_CATEGORY_HOME_SCREEN = 1;
/*     */   public static final int WIDGET_CATEGORY_KEYGUARD = 2;
/*     */   public static final int WIDGET_CATEGORY_SEARCHBOX = 4;
/*     */   public static final int WIDGET_FEATURE_HIDE_FROM_PICKER = 2;
/*     */   public static final int WIDGET_FEATURE_RECONFIGURABLE = 1;
/*     */   public int autoAdvanceViewId;
/*     */   public ComponentName configure;
/*     */   public int icon;
/*     */   public int initialKeyguardLayout;
/*     */   public int initialLayout;
/*     */   @Deprecated
/*     */   public String label;
/*     */   public int minHeight;
/*     */   public int minResizeHeight;
/*     */   public int minResizeWidth;
/*     */   public int minWidth;
/*     */   public int previewImage;
/*     */   public ComponentName provider;
/*     */   public int resizeMode;
/*     */   public int updatePeriodMillis;
/*     */   public int widgetCategory;
/*     */   public int widgetFeatures;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\appwidget\AppWidgetProviderInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */