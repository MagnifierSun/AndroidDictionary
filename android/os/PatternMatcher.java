/*    */ package android.os;
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
/*    */ public class PatternMatcher
/*    */   implements Parcelable
/*    */ {
/*    */   public PatternMatcher(String pattern, int type) {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   } public PatternMatcher(Parcel src) {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   } public final String getPath() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   } public final int getType() {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public boolean match(String str) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 47 */   public static final Parcelable.Creator<PatternMatcher> CREATOR = null;
/*    */   public static final int PATTERN_ADVANCED_GLOB = 3;
/*    */   public static final int PATTERN_LITERAL = 0;
/*    */   public static final int PATTERN_PREFIX = 1;
/*    */   public static final int PATTERN_SIMPLE_GLOB = 2;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\os\PatternMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */