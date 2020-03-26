/*    */ package android.companion;
/*    */ 
/*    */ import android.bluetooth.BluetoothDevice;
/*    */ import android.os.Parcel;
/*    */ import android.os.ParcelUuid;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import androidx.annotation.RecentlyNullable;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class BluetoothDeviceFilter
/*    */   implements DeviceFilter<BluetoothDevice>
/*    */ {
/*    */   BluetoothDeviceFilter(Parcel in) {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object o) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 40 */   public static final Parcelable.Creator<BluetoothDeviceFilter> CREATOR = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class Builder
/*    */   {
/*    */     public Builder() {
/* 48 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public Builder setNamePattern(@RecentlyNullable Pattern regex) {
/* 57 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @RecentlyNonNull
/*    */     public Builder setAddress(@RecentlyNullable String address) {
/* 67 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @RecentlyNonNull
/*    */     public Builder addServiceUuid(@RecentlyNullable ParcelUuid serviceUuid, @RecentlyNullable ParcelUuid serviceUuidMask) {
/* 82 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @RecentlyNonNull
/*    */     public BluetoothDeviceFilter build() {
/* 89 */       throw new RuntimeException("Stub!");
/*    */     } protected void markUsed() {
/* 91 */       throw new RuntimeException("Stub!");
/*    */     } protected void checkNotUsed() {
/* 93 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\companion\BluetoothDeviceFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */