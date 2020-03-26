/*     */ package android.net;
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
/*     */ public final class MacAddress
/*     */   implements Parcelable
/*     */ {
/*     */   MacAddress(long addr) {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAddressType() {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isLocallyAssigned() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public byte[] toByteArray() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public String toString() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public String toOuiString() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  79 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public static MacAddress fromString(@RecentlyNonNull String addr) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public static MacAddress fromBytes(@RecentlyNonNull byte[] addr) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 112 */   public static final MacAddress BROADCAST_ADDRESS = null;
/*     */ 
/*     */   
/* 115 */   public static final Parcelable.Creator<MacAddress> CREATOR = null;
/*     */   public static final int TYPE_BROADCAST = 3;
/*     */   public static final int TYPE_MULTICAST = 2;
/*     */   public static final int TYPE_UNICAST = 1;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\MacAddress.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */