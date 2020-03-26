/*      */ package android.app;
/*      */ 
/*      */ import android.content.ComponentName;
/*      */ import android.content.Context;
/*      */ import android.content.Intent;
/*      */ import android.content.pm.ConfigurationInfo;
/*      */ import android.graphics.Bitmap;
/*      */ import android.os.Bundle;
/*      */ import android.os.Debug;
/*      */ import android.os.Handler;
/*      */ import android.os.Parcel;
/*      */ import android.os.Parcelable;
/*      */ import android.util.Size;
/*      */ import androidx.annotation.RecentlyNonNull;
/*      */ import androidx.annotation.RecentlyNullable;
/*      */ import java.io.FileDescriptor;
/*      */ import java.util.List;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ActivityManager
/*      */ {
/*      */   public static final String ACTION_REPORT_HEAP_LIMIT = "android.app.action.REPORT_HEAP_LIMIT";
/*      */   public static final int LOCK_TASK_MODE_LOCKED = 1;
/*      */   public static final int LOCK_TASK_MODE_NONE = 0;
/*      */   public static final int LOCK_TASK_MODE_PINNED = 2;
/*      */   public static final String META_HOME_ALTERNATE = "android.app.home.alternate";
/*      */   public static final int MOVE_TASK_NO_USER_ACTION = 2;
/*      */   public static final int MOVE_TASK_WITH_HOME = 1;
/*      */   public static final int RECENT_IGNORE_UNAVAILABLE = 2;
/*      */   public static final int RECENT_WITH_EXCLUDED = 1;
/*      */   
/*      */   ActivityManager(Context context, Handler handler) {
/*   75 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMemoryClass() {
/*   86 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLargeMemoryClass() {
/*  102 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isLowRamDevice() {
/*  111 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public List<RecentTaskInfo> getRecentTasks(int maxNum, int flags) throws SecurityException {
/*  145 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List<AppTask> getAppTasks() {
/*  154 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Size getAppTaskThumbnailSize() {
/*  161 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int addAppTask(@RecentlyNonNull Activity activity, @RecentlyNonNull Intent intent, @RecentlyNullable TaskDescription description, @RecentlyNonNull Bitmap thumbnail) {
/*  190 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public List<RunningTaskInfo> getRunningTasks(int maxNum) throws SecurityException {
/*  225 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void moveTaskToFront(int taskId, int flags) {
/*  239 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void moveTaskToFront(int taskId, int flags, Bundle options) {
/*  255 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public List<RunningServiceInfo> getRunningServices(int maxNum) throws SecurityException {
/*  275 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PendingIntent getRunningServiceControlPanel(ComponentName service) throws SecurityException {
/*  283 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void getMemoryInfo(MemoryInfo outInfo) {
/*  296 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean clearApplicationUserData() {
/*  310 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List<ProcessErrorStateInfo> getProcessesInErrorState() {
/*  321 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBackgroundRestricted() {
/*  338 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List<RunningAppProcessInfo> getRunningAppProcesses() {
/*  351 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void getMyMemoryState(RunningAppProcessInfo outState) {
/*  365 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Debug.MemoryInfo[] getProcessMemoryInfo(int[] pids) {
/*  379 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void restartPackage(String packageName) {
/*  389 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void killBackgroundProcesses(String packageName) {
/*  402 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ConfigurationInfo getDeviceConfigurationInfo() {
/*  408 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLauncherLargeIconDensity() {
/*  417 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLauncherLargeIconSize() {
/*  426 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUserAMonkey() {
/*  433 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isRunningInTestHarness() {
/*  439 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void dumpPackageState(FileDescriptor fd, String packageName) {
/*  453 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setWatchHeapLimit(long pssSize) {
/*  473 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearWatchHeapLimit() {
/*  479 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean isInLockTaskMode() {
/*  490 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLockTaskModeState() {
/*  500 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setVrThread(int tid) {
/*  517 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class AppTask
/*      */   {
/*      */     AppTask() {
/*  593 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void finishAndRemoveTask() {
/*  599 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ActivityManager.RecentTaskInfo getTaskInfo() {
/*  607 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void moveToFront() {
/*  616 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void startActivity(Context context, Intent intent, Bundle options) {
/*  640 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setExcludeFromRecents(boolean exclude) {
/*  650 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class MemoryInfo
/*      */     implements Parcelable
/*      */   {
/*      */     public MemoryInfo() {
/*  661 */       throw new RuntimeException("Stub!");
/*      */     } public int describeContents() {
/*  663 */       throw new RuntimeException("Stub!");
/*      */     } public void writeToParcel(Parcel dest, int flags) {
/*  665 */       throw new RuntimeException("Stub!");
/*      */     } public void readFromParcel(Parcel source) {
/*  667 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*  670 */     public static final Parcelable.Creator<MemoryInfo> CREATOR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public long availMem;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean lowMemory;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public long threshold;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public long totalMem;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class ProcessErrorStateInfo
/*      */     implements Parcelable
/*      */   {
/*      */     public static final int CRASHED = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ProcessErrorStateInfo() {
/*  712 */       throw new RuntimeException("Stub!");
/*      */     } public int describeContents() {
/*  714 */       throw new RuntimeException("Stub!");
/*      */     } public void writeToParcel(Parcel dest, int flags) {
/*  716 */       throw new RuntimeException("Stub!");
/*      */     } public void readFromParcel(Parcel source) {
/*  718 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  723 */     public static final Parcelable.Creator<ProcessErrorStateInfo> CREATOR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NOT_RESPONDING = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NO_ERROR = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int condition;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public byte[] crashData;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String longMsg;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int pid;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String processName;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String shortMsg;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String stackTrace;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String tag;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int uid;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class RecentTaskInfo
/*      */     implements Parcelable
/*      */   {
/*      */     public RecentTaskInfo() {
/*  798 */       throw new RuntimeException("Stub!");
/*      */     } public int describeContents() {
/*  800 */       throw new RuntimeException("Stub!");
/*      */     } public void writeToParcel(Parcel dest, int flags) {
/*  802 */       throw new RuntimeException("Stub!");
/*      */     } public void readFromParcel(Parcel source) {
/*  804 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*  807 */     public static final Parcelable.Creator<RecentTaskInfo> CREATOR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int affiliatedTaskId;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ComponentName baseActivity;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Intent baseIntent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CharSequence description;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int id;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int numActivities;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ComponentName origActivity;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int persistentId;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ActivityManager.TaskDescription taskDescription;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ComponentName topActivity;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class RunningAppProcessInfo
/*      */     implements Parcelable
/*      */   {
/*      */     public RunningAppProcessInfo() {
/*  886 */       throw new RuntimeException("Stub!");
/*      */     } public RunningAppProcessInfo(String pProcessName, int pPid, String[] pArr) {
/*  888 */       throw new RuntimeException("Stub!");
/*      */     } public int describeContents() {
/*  890 */       throw new RuntimeException("Stub!");
/*      */     } public void writeToParcel(Parcel dest, int flags) {
/*  892 */       throw new RuntimeException("Stub!");
/*      */     } public void readFromParcel(Parcel source) {
/*  894 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*  897 */     public static final Parcelable.Creator<RunningAppProcessInfo> CREATOR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int IMPORTANCE_BACKGROUND = 400;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_CACHED = 400;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_CANT_SAVE_STATE = 350;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int IMPORTANCE_EMPTY = 500;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_FOREGROUND = 100;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_FOREGROUND_SERVICE = 125;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_GONE = 1000;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_PERCEPTIBLE = 230;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_PERCEPTIBLE_PRE_26 = 130;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_SERVICE = 300;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_TOP_SLEEPING = 325;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int IMPORTANCE_TOP_SLEEPING_PRE_28 = 150;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPORTANCE_VISIBLE = 200;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int REASON_PROVIDER_IN_USE = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int REASON_SERVICE_IN_USE = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int REASON_UNKNOWN = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int importance;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int importanceReasonCode;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ComponentName importanceReasonComponent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int importanceReasonPid;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int lastTrimLevel;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int lru;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int pid;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String[] pkgList;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String processName;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int uid;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class RunningServiceInfo
/*      */     implements Parcelable
/*      */   {
/*      */     public RunningServiceInfo() {
/* 1127 */       throw new RuntimeException("Stub!");
/*      */     } public int describeContents() {
/* 1129 */       throw new RuntimeException("Stub!");
/*      */     } public void writeToParcel(Parcel dest, int flags) {
/* 1131 */       throw new RuntimeException("Stub!");
/*      */     } public void readFromParcel(Parcel source) {
/* 1133 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/* 1136 */     public static final Parcelable.Creator<RunningServiceInfo> CREATOR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int FLAG_FOREGROUND = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int FLAG_PERSISTENT_PROCESS = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int FLAG_STARTED = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int FLAG_SYSTEM_PROCESS = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public long activeSince;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int clientCount;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int clientLabel;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String clientPackage;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int crashCount;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int flags;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean foreground;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public long lastActivityTime;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int pid;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String process;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public long restarting;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ComponentName service;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean started;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int uid;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class RunningTaskInfo
/*      */     implements Parcelable
/*      */   {
/*      */     public RunningTaskInfo() {
/* 1272 */       throw new RuntimeException("Stub!");
/*      */     } public int describeContents() {
/* 1274 */       throw new RuntimeException("Stub!");
/*      */     } public void writeToParcel(Parcel dest, int flags) {
/* 1276 */       throw new RuntimeException("Stub!");
/*      */     } public void readFromParcel(Parcel source) {
/* 1278 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/* 1281 */     public static final Parcelable.Creator<RunningTaskInfo> CREATOR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ComponentName baseActivity;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CharSequence description;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int id;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int numActivities;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int numRunning;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Bitmap thumbnail;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ComponentName topActivity;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class TaskDescription
/*      */     implements Parcelable
/*      */   {
/*      */     @Deprecated
/*      */     public TaskDescription(String label, Bitmap icon, int colorPrimary) {
/* 1347 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TaskDescription(String label, int iconRes, int colorPrimary) {
/* 1359 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public TaskDescription(String label, Bitmap icon) {
/* 1369 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TaskDescription(String label, int iconRes) {
/* 1379 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TaskDescription(String label) {
/* 1387 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public TaskDescription() {
/* 1393 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public TaskDescription(TaskDescription td) {
/* 1399 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public String getLabel() {
/* 1405 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public Bitmap getIcon() {
/* 1411 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public int getPrimaryColor() {
/* 1417 */       throw new RuntimeException("Stub!");
/*      */     } public int describeContents() {
/* 1419 */       throw new RuntimeException("Stub!");
/*      */     } public void writeToParcel(Parcel dest, int flags) {
/* 1421 */       throw new RuntimeException("Stub!");
/*      */     } public void readFromParcel(Parcel source) {
/* 1423 */       throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/* 1425 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/* 1428 */     public static final Parcelable.Creator<TaskDescription> CREATOR = null;
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\app\ActivityManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */