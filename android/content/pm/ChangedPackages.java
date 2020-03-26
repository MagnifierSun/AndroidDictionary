/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import java.util.List;
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
/*    */ public final class ChangedPackages
/*    */   implements Parcelable
/*    */ {
/*    */   public ChangedPackages(int sequenceNumber, @RecentlyNonNull List<String> packageNames) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getSequenceNumber() {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public List<String> getPackageNames() {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 54 */   public static final Parcelable.Creator<ChangedPackages> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\ChangedPackages.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */