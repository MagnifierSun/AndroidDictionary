/*     */ package android.companion;
/*     */ 
/*     */ import android.bluetooth.le.ScanFilter;
/*     */ import android.bluetooth.le.ScanResult;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.nio.ByteOrder;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class BluetoothLeDeviceFilter
/*     */   implements DeviceFilter<ScanResult>
/*     */ {
/*     */   BluetoothLeDeviceFilter(Pattern namePattern, ScanFilter scanFilter, byte[] rawDataFilter, byte[] rawDataFilterMask, String renamePrefix, String renameSuffix, int renameBytesFrom, int renameBytesLength, int renameNameFrom, int renameNameLength, boolean renameBytesReverseOrder) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public static int getRenamePrefixLengthLimit() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  48 */   public static final Parcelable.Creator<BluetoothLeDeviceFilter> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Builder
/*     */   {
/*     */     public Builder() {
/*  56 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setNamePattern(@RecentlyNullable Pattern regex) {
/*  65 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setScanFilter(@RecentlyNullable ScanFilter scanFilter) {
/*  76 */       throw new RuntimeException("Stub!");
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
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setRawDataFilter(@RecentlyNonNull byte[] rawDataFilter, @RecentlyNullable byte[] rawDataFilterMask) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setRenameFromBytes(@RecentlyNonNull String prefix, @RecentlyNonNull String suffix, int bytesFrom, int bytesLength, ByteOrder byteOrder) {
/* 115 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setRenameFromName(@RecentlyNonNull String prefix, @RecentlyNonNull String suffix, int nameFrom, int nameLength) {
/* 137 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public BluetoothLeDeviceFilter build() {
/* 144 */       throw new RuntimeException("Stub!");
/*     */     } protected void markUsed() {
/* 146 */       throw new RuntimeException("Stub!");
/*     */     } protected void checkNotUsed() {
/* 148 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\companion\BluetoothLeDeviceFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */