/*    */ package android.app.usage;
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
/*    */ public final class UsageStats
/*    */   implements Parcelable
/*    */ {
/*    */   public UsageStats(UsageStats stats) {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   } public String getPackageName() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getFirstTimeStamp() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getLastTimeStamp() {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getLastTimeUsed() {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public long getTotalTimeInForeground() {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void add(UsageStats right) {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 80 */   public static final Parcelable.Creator<UsageStats> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\ap\\usage\UsageStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */