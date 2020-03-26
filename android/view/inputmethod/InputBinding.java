/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.IBinder;
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
/*    */ public final class InputBinding
/*    */   implements Parcelable
/*    */ {
/*    */   public InputBinding(InputConnection conn, IBinder connToken, int uid, int pid) {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public InputBinding(InputConnection conn, InputBinding binding) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public InputConnection getConnection() {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public IBinder getConnectionToken() {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getUid() {
/* 69 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getPid() {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel dest, int flags) {
/* 86 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 88 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 95 */   public static final Parcelable.Creator<InputBinding> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\inputmethod\InputBinding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */