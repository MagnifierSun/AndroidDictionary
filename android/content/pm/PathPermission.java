/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.PatternMatcher;
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
/*    */ public class PathPermission
/*    */   extends PatternMatcher
/*    */ {
/*    */   public PathPermission(String pattern, int type, String readPermission, String writePermission) {
/* 29 */     super((Parcel)null); throw new RuntimeException("Stub!");
/*    */   } public PathPermission(Parcel src) {
/* 31 */     super((Parcel)null); throw new RuntimeException("Stub!");
/*    */   } public String getReadPermission() {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public String getWritePermission() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 40 */   public static final Parcelable.Creator<PathPermission> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\PathPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */