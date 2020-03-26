/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.util.Printer;
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
/*    */ public class ServiceInfo
/*    */   extends ComponentInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public ServiceInfo() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   } public ServiceInfo(ServiceInfo orig) {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   } public void dump(Printer pw, String prefix) {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 43 */   public static final Parcelable.Creator<ServiceInfo> CREATOR = null;
/*    */   public static final int FLAG_EXTERNAL_SERVICE = 4;
/*    */   public static final int FLAG_ISOLATED_PROCESS = 2;
/*    */   public static final int FLAG_SINGLE_USER = 1073741824;
/*    */   public static final int FLAG_STOP_WITH_TASK = 1;
/*    */   public int flags;
/*    */   public String permission;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\ServiceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */