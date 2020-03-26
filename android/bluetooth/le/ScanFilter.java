/*     */ package android.bluetooth.le;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.ParcelUuid;
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
/*     */ 
/*     */ 
/*     */ public final class ScanFilter
/*     */   implements Parcelable
/*     */ {
/*     */   ScanFilter(String name, String deviceAddress, ParcelUuid uuid, ParcelUuid uuidMask, ParcelUuid serviceDataUuid, byte[] serviceData, byte[] serviceDataMask, int manufacturerId, byte[] manufacturerData, byte[] manufacturerDataMask) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getDeviceName() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public ParcelUuid getServiceUuid() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public ParcelUuid getServiceUuidMask() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getDeviceAddress() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public byte[] getServiceData() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public byte[] getServiceDataMask() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public ParcelUuid getServiceDataUuid() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getManufacturerId() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public byte[] getManufacturerData() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public byte[] getManufacturerDataMask() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean matches(ScanResult scanResult) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 131 */   public static final Parcelable.Creator<ScanFilter> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Builder
/*     */   {
/*     */     public Builder() {
/* 139 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setDeviceName(String deviceName) {
/* 145 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setDeviceAddress(String deviceAddress) {
/* 156 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setServiceUuid(ParcelUuid serviceUuid) {
/* 162 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setServiceUuid(ParcelUuid serviceUuid, ParcelUuid uuidMask) {
/* 173 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setServiceData(ParcelUuid serviceDataUuid, byte[] serviceData) {
/* 181 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setServiceData(ParcelUuid serviceDataUuid, byte[] serviceData, byte[] serviceDataMask) {
/* 194 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setManufacturerData(int manufacturerId, byte[] manufacturerData) {
/* 204 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setManufacturerData(int manufacturerId, byte[] manufacturerData, byte[] manufacturerDataMask) {
/* 217 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public ScanFilter build() {
/* 225 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\le\ScanFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */