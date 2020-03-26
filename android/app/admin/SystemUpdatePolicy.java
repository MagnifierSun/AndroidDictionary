/*     */ package android.app.admin;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class SystemUpdatePolicy
/*     */   implements Parcelable
/*     */ {
/*     */   SystemUpdatePolicy() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SystemUpdatePolicy createAutomaticInstallPolicy() {
/*  71 */     throw new RuntimeException("Stub!");
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
/*     */   public static SystemUpdatePolicy createWindowedInstallPolicy(int startTime, int endTime) {
/*  94 */     throw new RuntimeException("Stub!");
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
/*     */   public static SystemUpdatePolicy createPostponeInstallPolicy() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPolicyType() {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInstallWindowStart() {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInstallWindowEnd() {
/* 134 */     throw new RuntimeException("Stub!");
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
/*     */   public SystemUpdatePolicy setFreezePeriods(List<FreezePeriod> freezePeriods) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<FreezePeriod> getFreezePeriods() {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 181 */   public static final Parcelable.Creator<SystemUpdatePolicy> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_INSTALL_AUTOMATIC = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_INSTALL_WINDOWED = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_POSTPONE = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class ValidationFailedException
/*     */     extends IllegalArgumentException
/*     */     implements Parcelable
/*     */   {
/*     */     ValidationFailedException(int errorCode, String message) {
/* 229 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getErrorCode() {
/* 237 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 239 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 241 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 244 */     public static final Parcelable.Creator<ValidationFailedException> CREATOR = null;
/*     */     public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_CLOSE = 6;
/*     */     public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_LONG = 5;
/*     */     public static final int ERROR_DUPLICATE_OR_OVERLAP = 2;
/*     */     public static final int ERROR_NEW_FREEZE_PERIOD_TOO_CLOSE = 4;
/*     */     public static final int ERROR_NEW_FREEZE_PERIOD_TOO_LONG = 3;
/*     */     public static final int ERROR_UNKNOWN = 1;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\admin\SystemUpdatePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */