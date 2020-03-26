/*     */ package android.telephony.mbms;
/*     */ 
/*     */ import android.content.Intent;
/*     */ import android.net.Uri;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
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
/*     */ public final class DownloadRequest
/*     */   implements Parcelable
/*     */ {
/*     */   DownloadRequest(Parcel in) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFileServiceId() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Uri getSourceUri() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Uri getDestinationUri() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSubscriptionId() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] toByteArray() {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getMaxAppIntentSize() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getMaxDestinationUriSize() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  91 */   public static final Parcelable.Creator<DownloadRequest> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     public Builder(@RecentlyNonNull Uri sourceUri, @RecentlyNonNull Uri destinationUri) {
/* 109 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static Builder fromDownloadRequest(DownloadRequest other) {
/* 119 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static Builder fromSerializedRequest(byte[] data) {
/* 128 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setServiceInfo(FileServiceInfo serviceInfo) {
/* 136 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setSubscriptionId(int subscriptionId) {
/* 143 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setAppIntent(Intent intent) {
/* 154 */       throw new RuntimeException("Stub!");
/*     */     } public DownloadRequest build() {
/* 156 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\mbms\DownloadRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */