/*     */ package android.app;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.util.Printer;
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
/*     */ public class ApplicationErrorReport
/*     */   implements Parcelable
/*     */ {
/*     */   public ApplicationErrorReport() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public static ComponentName getErrorReportReceiver(Context context, String packageName, int appFlags) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public void readFromParcel(Parcel in) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void dump(Printer pw, String prefix) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  67 */   public static final Parcelable.Creator<ApplicationErrorReport> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_ANR = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_BATTERY = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_CRASH = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_NONE = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_RUNNING_SERVICE = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AnrInfo anrInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BatteryInfo batteryInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CrashInfo crashInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String installerPackageName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String packageName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String processName;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RunningServiceInfo runningServiceInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean systemApp;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long time;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int type;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class AnrInfo
/*     */   {
/*     */     public String activity;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String cause;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String info;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AnrInfo() {
/* 178 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public AnrInfo(Parcel in) {
/* 184 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void writeToParcel(Parcel dest, int flags) {
/* 190 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void dump(Printer pw, String prefix) {
/* 196 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class BatteryInfo
/*     */   {
/*     */     public String checkinDetails;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long durationMicros;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String usageDetails;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int usagePercent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public BatteryInfo() {
/* 228 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public BatteryInfo(Parcel in) {
/* 234 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void writeToParcel(Parcel dest, int flags) {
/* 240 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void dump(Printer pw, String prefix) {
/* 246 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class CrashInfo
/*     */   {
/*     */     public String exceptionClassName;
/*     */ 
/*     */ 
/*     */     
/*     */     public String exceptionMessage;
/*     */ 
/*     */ 
/*     */     
/*     */     public String stackTrace;
/*     */ 
/*     */ 
/*     */     
/*     */     public String throwClassName;
/*     */ 
/*     */ 
/*     */     
/*     */     public String throwFileName;
/*     */ 
/*     */ 
/*     */     
/*     */     public int throwLineNumber;
/*     */ 
/*     */ 
/*     */     
/*     */     public String throwMethodName;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public CrashInfo() {
/* 285 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public CrashInfo(Throwable tr) {
/* 291 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public CrashInfo(Parcel in) {
/* 297 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void writeToParcel(Parcel dest, int flags) {
/* 303 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void dump(Printer pw, String prefix) {
/* 309 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public static class RunningServiceInfo
/*     */   {
/*     */     public long durationMillis;
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
/*     */     public String serviceDetails;
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
/*     */     public RunningServiceInfo() {
/* 365 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public RunningServiceInfo(Parcel in) {
/* 371 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void writeToParcel(Parcel dest, int flags) {
/* 377 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void dump(Printer pw, String prefix) {
/* 383 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\ApplicationErrorReport.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */