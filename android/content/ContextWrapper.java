/*     */ package android.content;
/*     */ 
/*     */ import android.content.pm.ApplicationInfo;
/*     */ import android.content.pm.PackageManager;
/*     */ import android.content.res.AssetManager;
/*     */ import android.content.res.Configuration;
/*     */ import android.content.res.Resources;
/*     */ import android.database.DatabaseErrorHandler;
/*     */ import android.database.sqlite.SQLiteDatabase;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import android.os.Handler;
/*     */ import android.os.Looper;
/*     */ import android.os.UserHandle;
/*     */ import android.view.Display;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.concurrent.Executor;
/*     */ 
/*     */ public class ContextWrapper
/*     */   extends Context
/*     */ {
/*     */   public ContextWrapper(Context base) {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void attachBaseContext(Context base) {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Context getBaseContext() {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public AssetManager getAssets() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   } public Resources getResources() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public PackageManager getPackageManager() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public ContentResolver getContentResolver() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public Looper getMainLooper() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public Executor getMainExecutor() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } public Context getApplicationContext() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   } public void setTheme(int resid) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public Resources.Theme getTheme() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public ClassLoader getClassLoader() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public String getPackageName() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public ApplicationInfo getApplicationInfo() {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   } public String getPackageResourcePath() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public String getPackageCodePath() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   } public SharedPreferences getSharedPreferences(String name, int mode) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public boolean moveSharedPreferencesFrom(Context sourceContext, String name) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   } public boolean deleteSharedPreferences(String name) {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   } public FileInputStream openFileInput(String name) throws FileNotFoundException {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public boolean deleteFile(String name) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public File getFileStreamPath(String name) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public String[] fileList() {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public File getDataDir() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public File getFilesDir() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public File getNoBackupFilesDir() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public File getExternalFilesDir(String type) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public File[] getExternalFilesDirs(String type) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public File getObbDir() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public File[] getObbDirs() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public File getCacheDir() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public File getCodeCacheDir() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public File getExternalCacheDir() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public File[] getExternalCacheDirs() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public File[] getExternalMediaDirs() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public File getDir(String name, int mode) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory, DatabaseErrorHandler errorHandler) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public boolean moveDatabaseFrom(Context sourceContext, String name) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } public boolean deleteDatabase(String name) {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   } public File getDatabasePath(String name) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/* 128 */   public String[] databaseList() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 130 */   public Drawable getWallpaper() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 132 */   public Drawable peekWallpaper() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 134 */   public int getWallpaperDesiredMinimumWidth() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 136 */   public int getWallpaperDesiredMinimumHeight() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 138 */   public void setWallpaper(Bitmap bitmap) throws IOException { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 140 */   public void setWallpaper(InputStream data) throws IOException { throw new RuntimeException("Stub!"); } @Deprecated
/*     */   public void clearWallpaper() throws IOException {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } public void startActivity(Intent intent) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   } public void startActivity(Intent intent, Bundle options) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   } public void startActivities(Intent[] intents) {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   } public void startActivities(Intent[] intents, Bundle options) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   } public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   } public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   } public void sendBroadcast(Intent intent) {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   } public void sendBroadcast(Intent intent, String receiverPermission) {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   } public void sendOrderedBroadcast(Intent intent, String receiverPermission) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   } public void sendOrderedBroadcast(Intent intent, String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   } public void sendBroadcastAsUser(Intent intent, UserHandle user) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } public void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission) {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   }
/* 168 */   public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 170 */   public void sendStickyBroadcast(Intent intent) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 172 */   public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 174 */   public void removeStickyBroadcast(Intent intent) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 176 */   public void sendStickyBroadcastAsUser(Intent intent, UserHandle user) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 178 */   public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) { throw new RuntimeException("Stub!"); } @Deprecated
/*     */   public void removeStickyBroadcastAsUser(Intent intent, UserHandle user) {
/* 180 */     throw new RuntimeException("Stub!");
/*     */   } public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   } public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, int flags) {
/* 184 */     throw new RuntimeException("Stub!");
/*     */   } public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler) {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   } public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler, int flags) {
/* 188 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterReceiver(BroadcastReceiver receiver) {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   } public ComponentName startService(Intent service) {
/* 192 */     throw new RuntimeException("Stub!");
/*     */   } public ComponentName startForegroundService(Intent service) {
/* 194 */     throw new RuntimeException("Stub!");
/*     */   } public boolean stopService(Intent name) {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   } public boolean bindService(Intent service, ServiceConnection conn, int flags) {
/* 198 */     throw new RuntimeException("Stub!");
/*     */   } public void unbindService(ServiceConnection conn) {
/* 200 */     throw new RuntimeException("Stub!");
/*     */   } public boolean startInstrumentation(ComponentName className, String profileFile, Bundle arguments) {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   } public Object getSystemService(String name) {
/* 204 */     throw new RuntimeException("Stub!");
/*     */   } public String getSystemServiceName(Class<?> serviceClass) {
/* 206 */     throw new RuntimeException("Stub!");
/*     */   } public int checkPermission(String permission, int pid, int uid) {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   } public int checkCallingPermission(String permission) {
/* 210 */     throw new RuntimeException("Stub!");
/*     */   } public int checkCallingOrSelfPermission(String permission) {
/* 212 */     throw new RuntimeException("Stub!");
/*     */   } public int checkSelfPermission(String permission) {
/* 214 */     throw new RuntimeException("Stub!");
/*     */   } public void enforcePermission(String permission, int pid, int uid, String message) {
/* 216 */     throw new RuntimeException("Stub!");
/*     */   } public void enforceCallingPermission(String permission, String message) {
/* 218 */     throw new RuntimeException("Stub!");
/*     */   } public void enforceCallingOrSelfPermission(String permission, String message) {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   } public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {
/* 222 */     throw new RuntimeException("Stub!");
/*     */   } public void revokeUriPermission(Uri uri, int modeFlags) {
/* 224 */     throw new RuntimeException("Stub!");
/*     */   } public void revokeUriPermission(String targetPackage, Uri uri, int modeFlags) {
/* 226 */     throw new RuntimeException("Stub!");
/*     */   } public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
/* 228 */     throw new RuntimeException("Stub!");
/*     */   } public int checkCallingUriPermission(Uri uri, int modeFlags) {
/* 230 */     throw new RuntimeException("Stub!");
/*     */   } public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
/* 232 */     throw new RuntimeException("Stub!");
/*     */   } public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags) {
/* 234 */     throw new RuntimeException("Stub!");
/*     */   } public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) {
/* 236 */     throw new RuntimeException("Stub!");
/*     */   } public void enforceCallingUriPermission(Uri uri, int modeFlags, String message) {
/* 238 */     throw new RuntimeException("Stub!");
/*     */   } public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) {
/* 240 */     throw new RuntimeException("Stub!");
/*     */   } public void enforceUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags, String message) {
/* 242 */     throw new RuntimeException("Stub!");
/*     */   } public Context createPackageContext(String packageName, int flags) throws PackageManager.NameNotFoundException {
/* 244 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public Context createContextForSplit(String splitName) throws PackageManager.NameNotFoundException {
/* 248 */     throw new RuntimeException("Stub!");
/*     */   } public Context createConfigurationContext(Configuration overrideConfiguration) {
/* 250 */     throw new RuntimeException("Stub!");
/*     */   } public Context createDisplayContext(Display display) {
/* 252 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isRestricted() {
/* 254 */     throw new RuntimeException("Stub!");
/*     */   } public Context createDeviceProtectedStorageContext() {
/* 256 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isDeviceProtectedStorage() {
/* 258 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\ContextWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */