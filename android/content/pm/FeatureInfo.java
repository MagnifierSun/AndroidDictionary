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
/*    */ public class FeatureInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public FeatureInfo() {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   } public FeatureInfo(FeatureInfo orig) {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getGlEsVersion() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 59 */   public static final Parcelable.Creator<FeatureInfo> CREATOR = null;
/*    */   public static final int FLAG_REQUIRED = 1;
/*    */   public static final int GL_ES_VERSION_UNDEFINED = 0;
/*    */   public int flags;
/*    */   public String name;
/*    */   public int reqGlEsVersion;
/*    */   public int version;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\FeatureInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */