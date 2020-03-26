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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum SupplicantState
/*    */   implements Parcelable
/*    */ {
/* 37 */   DISCONNECTED, INTERFACE_DISABLED, INACTIVE, SCANNING, AUTHENTICATING, ASSOCIATING, ASSOCIATED, FOUR_WAY_HANDSHAKE, GROUP_HANDSHAKE, COMPLETED, DORMANT, UNINITIALIZED, INVALID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isValidState(SupplicantState state) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public int describeContents() {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public void writeToParcel(Parcel dest, int flags) {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\SupplicantState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */