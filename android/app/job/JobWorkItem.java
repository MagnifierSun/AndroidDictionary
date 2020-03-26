/*     */ package android.app.job;
/*     */ 
/*     */ import android.content.Intent;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class JobWorkItem
/*     */   implements Parcelable
/*     */ {
/*     */   public JobWorkItem(Intent intent) {
/*  38 */     throw new RuntimeException("Stub!");
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
/*     */   public JobWorkItem(Intent intent, long downloadBytes, long uploadBytes) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Intent getIntent() {
/*  63 */     throw new RuntimeException("Stub!");
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
/*     */   public long getEstimatedNetworkDownloadBytes() {
/*  76 */     throw new RuntimeException("Stub!");
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
/*     */   public long getEstimatedNetworkUploadBytes() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDeliveryCount() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 107 */   public static final Parcelable.Creator<JobWorkItem> CREATOR = null;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\job\JobWorkItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */