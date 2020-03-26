/*     */ package android.service.carrier;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CarrierIdentifier
/*     */   implements Parcelable
/*     */ {
/*     */   public CarrierIdentifier(String mcc, String mnc, @RecentlyNullable String spn, @RecentlyNullable String imsi, @RecentlyNullable String gid1, @RecentlyNullable String gid2) {
/*  40 */     throw new RuntimeException("Stub!");
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
/*     */   public CarrierIdentifier(byte[] mccMnc, @RecentlyNullable String gid1, @RecentlyNullable String gid2) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public String getMcc() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public String getMnc() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getSpn() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getImsi() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getGid1() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getGid2() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 104 */   public static final Parcelable.Creator<CarrierIdentifier> CREATOR = null;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\carrier\CarrierIdentifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */