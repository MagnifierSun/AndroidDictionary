/*     */ package android.app.usage;
/*     */ 
/*     */ import android.content.res.Configuration;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class UsageEvents
/*     */   implements Parcelable
/*     */ {
/*     */   UsageEvents() {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasNextEvent() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getNextEvent(Event eventOut) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  61 */   public static final Parcelable.Creator<UsageEvents> CREATOR = null;
/*     */   public static final class Event { public static final int CONFIGURATION_CHANGE = 5;
/*     */     public static final int KEYGUARD_HIDDEN = 18;
/*     */     public static final int KEYGUARD_SHOWN = 17;
/*     */     public static final int MOVE_TO_BACKGROUND = 2;
/*     */     public static final int MOVE_TO_FOREGROUND = 1;
/*     */     
/*     */     public Event() {
/*  69 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     public static final int NONE = 0; public static final int SCREEN_INTERACTIVE = 15;
/*     */     public static final int SCREEN_NON_INTERACTIVE = 16;
/*     */     
/*     */     public String getPackageName() {
/*  75 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     public static final int SHORTCUT_INVOCATION = 8;
/*     */     public static final int STANDBY_BUCKET_CHANGED = 11;
/*     */     public static final int USER_INTERACTION = 7;
/*     */     
/*     */     public String getClassName() {
/*  82 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public long getTimeStamp() {
/*  90 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getEventType() {
/* 102 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Configuration getConfiguration() {
/* 109 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getShortcutId() {
/* 118 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getAppStandbyBucket() {
/* 127 */       throw new RuntimeException("Stub!");
/*     */     } }
/*     */ 
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\ap\\usage\UsageEvents.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */