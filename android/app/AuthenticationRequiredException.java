/*    */ package android.app;
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
/*    */ public final class AuthenticationRequiredException
/*    */   extends SecurityException
/*    */   implements Parcelable
/*    */ {
/*    */   public AuthenticationRequiredException(Throwable cause, PendingIntent userAction) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public PendingIntent getUserAction() {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 64 */   public static final Parcelable.Creator<AuthenticationRequiredException> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\AuthenticationRequiredException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */