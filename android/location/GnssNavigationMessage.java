/*     */ package android.location;
/*     */ 
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
/*     */ 
/*     */ public final class GnssNavigationMessage
/*     */   implements Parcelable
/*     */ {
/*     */   GnssNavigationMessage() {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSvid() {
/*  48 */     throw new RuntimeException("Stub!");
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
/*     */   public int getMessageId() {
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
/*     */   public int getSubmessageId() {
/*  89 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public byte[] getData() {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStatus() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel parcel, int flags) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 130 */   public static final Parcelable.Creator<GnssNavigationMessage> CREATOR = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int STATUS_PARITY_PASSED = 1;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int STATUS_PARITY_REBUILT = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int STATUS_UNKNOWN = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_BDS_D1 = 1281;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_BDS_D2 = 1282;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_GAL_F = 1538;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_GAL_I = 1537;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_GLO_L1CA = 769;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_GPS_CNAV2 = 260;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_GPS_L1CA = 257;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_GPS_L2CNAV = 258;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_GPS_L5CNAV = 259;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_UNKNOWN = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static abstract class Callback
/*     */   {
/*     */     public static final int STATUS_LOCATION_DISABLED = 2;
/*     */ 
/*     */     
/*     */     public static final int STATUS_NOT_SUPPORTED = 0;
/*     */ 
/*     */     
/*     */     public static final int STATUS_READY = 1;
/*     */ 
/*     */ 
/*     */     
/*     */     public Callback() {
/* 200 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void onGnssNavigationMessageReceived(GnssNavigationMessage event) {
/* 206 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onStatusChanged(int status) {
/* 214 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\location\GnssNavigationMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */