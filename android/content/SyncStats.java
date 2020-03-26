/*    */ package android.content;
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
/*    */ public class SyncStats
/*    */   implements Parcelable
/*    */ {
/*    */   public SyncStats() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   } public SyncStats(Parcel in) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void clear() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 48 */   public static final Parcelable.Creator<SyncStats> CREATOR = null;
/*    */   public long numAuthExceptions;
/*    */   public long numConflictDetectedExceptions;
/*    */   public long numDeletes;
/*    */   public long numEntries;
/*    */   public long numInserts;
/*    */   public long numIoExceptions;
/*    */   public long numParseExceptions;
/*    */   public long numSkippedEntries;
/*    */   public long numUpdates;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\SyncStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */