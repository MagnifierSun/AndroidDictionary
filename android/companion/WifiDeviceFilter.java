/*    */ package android.companion;
/*    */ 
/*    */ import android.net.wifi.ScanResult;
/*    */ import android.os.Parcel;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class WifiDeviceFilter
/*    */   implements DeviceFilter<ScanResult>
/*    */ {
/*    */   WifiDeviceFilter(Pattern namePattern) {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object o) {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 43 */   public static final Parcelable.Creator<WifiDeviceFilter> CREATOR = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class Builder
/*    */   {
/*    */     public Builder() {
/* 51 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public Builder setNamePattern(@RecentlyNullable Pattern regex) {
/* 60 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @RecentlyNonNull
/*    */     public WifiDeviceFilter build() {
/* 67 */       throw new RuntimeException("Stub!");
/*    */     } protected void markUsed() {
/* 69 */       throw new RuntimeException("Stub!");
/*    */     } protected void checkNotUsed() {
/* 71 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\companion\WifiDeviceFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */