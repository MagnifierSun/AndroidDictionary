/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
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
/*    */ 
/*    */ @Deprecated
/*    */ public class WpsInfo
/*    */   implements Parcelable
/*    */ {
/*    */   @Deprecated
/*    */   public String BSSID;
/*    */   
/*    */   @Deprecated
/*    */   public WpsInfo() {
/* 34 */     throw new RuntimeException("Stub!"); } @Deprecated
/*    */   public WpsInfo(WpsInfo source) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   @Deprecated
/*    */   public String toString() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public int describeContents() {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public void writeToParcel(Parcel dest, int flags) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/* 61 */   public static final Parcelable.Creator<WpsInfo> CREATOR = null;
/*    */   @Deprecated
/*    */   public static final int DISPLAY = 1;
/*    */   @Deprecated
/*    */   public static final int INVALID = 4;
/*    */   @Deprecated
/*    */   public static final int KEYPAD = 2;
/*    */   @Deprecated
/*    */   public static final int LABEL = 3;
/*    */   @Deprecated
/*    */   public static final int PBC = 0;
/*    */   @Deprecated
/*    */   public String pin;
/*    */   @Deprecated
/*    */   public int setup;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\WpsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */