/*    */ package android.view;
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
/*    */ public abstract class AbsSavedState
/*    */   implements Parcelable
/*    */ {
/*    */   protected AbsSavedState(Parcelable superState) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected AbsSavedState(Parcel source) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected AbsSavedState(Parcel source, ClassLoader loader) {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   } public final Parcelable getSuperState() {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 64 */   public static final Parcelable.Creator<AbsSavedState> CREATOR = null;
/*    */ 
/*    */   
/* 67 */   public static final AbsSavedState EMPTY_STATE = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\AbsSavedState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */