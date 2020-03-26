/*    */ package android.view.textservice;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class SentenceSuggestionsInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public SentenceSuggestionsInfo(SuggestionsInfo[] suggestionsInfos, int[] offsets, int[] lengths) {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } public SentenceSuggestionsInfo(Parcel source) {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel dest, int flags) {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getSuggestionsCount() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public SuggestionsInfo getSuggestionsInfoAt(int i) {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getOffsetAt(int i) {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getLengthAt(int i) {
/* 82 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 89 */   public static final Parcelable.Creator<SentenceSuggestionsInfo> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\textservice\SentenceSuggestionsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */