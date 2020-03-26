/*     */ package android.appwidget;
/*     */ 
/*     */ import android.app.PendingIntent;
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.os.Bundle;
/*     */ import android.os.UserHandle;
/*     */ import android.widget.RemoteViews;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AppWidgetManager
/*     */ {
/*     */   public static final String ACTION_APPWIDGET_BIND = "android.appwidget.action.APPWIDGET_BIND";
/*     */   public static final String ACTION_APPWIDGET_CONFIGURE = "android.appwidget.action.APPWIDGET_CONFIGURE";
/*     */   public static final String ACTION_APPWIDGET_DELETED = "android.appwidget.action.APPWIDGET_DELETED";
/*     */   public static final String ACTION_APPWIDGET_DISABLED = "android.appwidget.action.APPWIDGET_DISABLED";
/*     */   public static final String ACTION_APPWIDGET_ENABLED = "android.appwidget.action.APPWIDGET_ENABLED";
/*     */   public static final String ACTION_APPWIDGET_HOST_RESTORED = "android.appwidget.action.APPWIDGET_HOST_RESTORED";
/*     */   public static final String ACTION_APPWIDGET_OPTIONS_CHANGED = "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS";
/*     */   public static final String ACTION_APPWIDGET_PICK = "android.appwidget.action.APPWIDGET_PICK";
/*     */   public static final String ACTION_APPWIDGET_RESTORED = "android.appwidget.action.APPWIDGET_RESTORED";
/*     */   public static final String ACTION_APPWIDGET_UPDATE = "android.appwidget.action.APPWIDGET_UPDATE";
/*     */   public static final String EXTRA_APPWIDGET_ID = "appWidgetId";
/*     */   public static final String EXTRA_APPWIDGET_IDS = "appWidgetIds";
/*     */   public static final String EXTRA_APPWIDGET_OLD_IDS = "appWidgetOldIds";
/*     */   public static final String EXTRA_APPWIDGET_OPTIONS = "appWidgetOptions";
/*     */   public static final String EXTRA_APPWIDGET_PREVIEW = "appWidgetPreview";
/*     */   public static final String EXTRA_APPWIDGET_PROVIDER = "appWidgetProvider";
/*     */   public static final String EXTRA_APPWIDGET_PROVIDER_PROFILE = "appWidgetProviderProfile";
/*     */   public static final String EXTRA_CUSTOM_EXTRAS = "customExtras";
/*     */   public static final String EXTRA_CUSTOM_INFO = "customInfo";
/*     */   public static final String EXTRA_HOST_ID = "hostId";
/*     */   public static final int INVALID_APPWIDGET_ID = 0;
/*     */   public static final String META_DATA_APPWIDGET_PROVIDER = "android.appwidget.provider";
/*     */   public static final String OPTION_APPWIDGET_HOST_CATEGORY = "appWidgetCategory";
/*     */   public static final String OPTION_APPWIDGET_MAX_HEIGHT = "appWidgetMaxHeight";
/*     */   public static final String OPTION_APPWIDGET_MAX_WIDTH = "appWidgetMaxWidth";
/*     */   public static final String OPTION_APPWIDGET_MIN_HEIGHT = "appWidgetMinHeight";
/*     */   public static final String OPTION_APPWIDGET_MIN_WIDTH = "appWidgetMinWidth";
/*     */   
/*     */   AppWidgetManager() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AppWidgetManager getInstance(Context context) {
/*  57 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */   
/*     */   public void updateAppWidget(int[] appWidgetIds, RemoteViews views) {
/*  79 */     throw new RuntimeException("Stub!");
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
/*     */   public void updateAppWidgetOptions(int appWidgetId, Bundle options) {
/*  93 */     throw new RuntimeException("Stub!");
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
/*     */   public Bundle getAppWidgetOptions(int appWidgetId) {
/* 107 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */   
/*     */   public void updateAppWidget(int appWidgetId, RemoteViews views) {
/* 129 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void partiallyUpdateAppWidget(int[] appWidgetIds, RemoteViews views) {
/* 156 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void partiallyUpdateAppWidget(int appWidgetId, RemoteViews views) {
/* 183 */     throw new RuntimeException("Stub!");
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
/*     */   public void updateAppWidget(ComponentName provider, RemoteViews views) {
/* 199 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateAppWidgetProviderInfo(ComponentName provider, @RecentlyNullable String metaDataKey) {
/* 223 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void notifyAppWidgetViewDataChanged(int[] appWidgetIds, int viewId) {
/* 233 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void notifyAppWidgetViewDataChanged(int appWidgetId, int viewId) {
/* 243 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public List<AppWidgetProviderInfo> getInstalledProvidersForProfile(@RecentlyNullable UserHandle profile) {
/* 260 */     throw new RuntimeException("Stub!");
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
/*     */   
/*     */   @RecentlyNonNull
/*     */   public List<AppWidgetProviderInfo> getInstalledProvidersForPackage(@RecentlyNonNull String packageName, @RecentlyNullable UserHandle profile) {
/* 282 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<AppWidgetProviderInfo> getInstalledProviders() {
/* 288 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AppWidgetProviderInfo getAppWidgetInfo(int appWidgetId) {
/* 297 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean bindAppWidgetIdIfAllowed(int appWidgetId, ComponentName provider) {
/* 313 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean bindAppWidgetIdIfAllowed(int appWidgetId, ComponentName provider, Bundle options) {
/* 332 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean bindAppWidgetIdIfAllowed(int appWidgetId, UserHandle user, ComponentName provider, Bundle options) {
/* 351 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getAppWidgetIds(ComponentName provider) {
/* 361 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRequestPinAppWidgetSupported() {
/* 368 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean requestPinAppWidget(@RecentlyNonNull ComponentName provider, @RecentlyNullable Bundle extras, @RecentlyNullable PendingIntent successCallback) {
/* 410 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\appwidget\AppWidgetManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */