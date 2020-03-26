/*     */ package android.service.notification;
/*     */ 
/*     */ import android.app.Notification;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.UserHandle;
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
/*     */ public class StatusBarNotification
/*     */   implements Parcelable
/*     */ {
/*     */   @Deprecated
/*     */   public StatusBarNotification(String pkg, String opPkg, int id, String tag, int uid, int initialPid, int score, Notification notification, UserHandle user, long postTime) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public StatusBarNotification(Parcel in) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isGroup() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   } public StatusBarNotification clone() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOngoing() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isClearable() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public int getUserId() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public String getPackageName() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int getId() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTag() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public Notification getNotification() {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public UserHandle getUser() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getPostTime() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getKey() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGroupKey() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOverrideGroupKey(String overrideGroupKey) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getOverrideGroupKey() {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 129 */   public static final Parcelable.Creator<StatusBarNotification> CREATOR = null;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\notification\StatusBarNotification.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */