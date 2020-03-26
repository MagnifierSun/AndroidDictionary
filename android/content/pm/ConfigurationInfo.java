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
/*    */ public class ConfigurationInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public ConfigurationInfo() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   } public ConfigurationInfo(ConfigurationInfo orig) {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getGlEsVersion() {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 50 */   public static final Parcelable.Creator<ConfigurationInfo> CREATOR = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int GL_ES_VERSION_UNDEFINED = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int INPUT_FEATURE_FIVE_WAY_NAV = 2;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final int INPUT_FEATURE_HARD_KEYBOARD = 1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int reqGlEsVersion;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 85 */   public int reqInputFeatures = 0;
/*    */   public int reqKeyboardType;
/*    */   public int reqNavigation;
/*    */   public int reqTouchScreen;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\ConfigurationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */