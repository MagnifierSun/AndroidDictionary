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
/*    */ public class SyncAdapterType
/*    */   implements Parcelable
/*    */ {
/*    */   public SyncAdapterType(String authority, String accountType, boolean userVisible, boolean supportsUploading) {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   } public SyncAdapterType(Parcel source) {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   } public boolean supportsUploading() {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public boolean isUserVisible() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean allowParallelSyncs() {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isAlwaysSyncable() {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getSettingsActivity() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   } public static SyncAdapterType newKey(String authority, String accountType) {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object o) {
/* 65 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 69 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 76 */   public static final Parcelable.Creator<SyncAdapterType> CREATOR = null;
/*    */ 
/*    */   
/* 79 */   public final String accountType = null;
/*    */ 
/*    */   
/* 82 */   public final String authority = null;
/*    */   public final boolean isKey = false;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\SyncAdapterType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */