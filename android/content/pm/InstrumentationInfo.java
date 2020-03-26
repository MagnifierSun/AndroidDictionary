/*    */ package android.content.pm;
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
/*    */ public class InstrumentationInfo
/*    */   extends PackageItemInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public InstrumentationInfo() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   } public InstrumentationInfo(InstrumentationInfo orig) {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 41 */   public static final Parcelable.Creator<InstrumentationInfo> CREATOR = null;
/*    */   public String dataDir;
/*    */   public boolean functionalTest;
/*    */   public boolean handleProfiling;
/*    */   public String publicSourceDir;
/*    */   public String sourceDir;
/*    */   public String[] splitNames;
/*    */   public String[] splitPublicSourceDirs;
/*    */   public String[] splitSourceDirs;
/*    */   public String targetPackage;
/*    */   public String targetProcesses;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\InstrumentationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */