/*    */ package android.view;
/*    */ 
/*    */ import android.os.IBinder;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNullable;
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
/*    */ public class WindowId
/*    */   implements Parcelable
/*    */ {
/*    */   WindowId(IBinder target) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFocused() {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void registerFocusObserver(FocusObserver observer) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void unregisterFocusObserver(FocusObserver observer) {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(@RecentlyNullable Object otherObj) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 70 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 72 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel out, int flags) {
/* 74 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 77 */   public static final Parcelable.Creator<WindowId> CREATOR = null;
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
/*    */   public static abstract class FocusObserver
/*    */   {
/*    */     public FocusObserver() {
/* 94 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */     
/*    */     public abstract void onFocusGained(WindowId param1WindowId);
/*    */     
/*    */     public abstract void onFocusLost(WindowId param1WindowId);
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\WindowId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */