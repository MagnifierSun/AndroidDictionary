/*     */ package android.view.textservice;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class SuggestionsInfo
/*     */   implements Parcelable
/*     */ {
/*     */   public SuggestionsInfo(int suggestionsAttributes, String[] suggestions) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SuggestionsInfo(int suggestionsAttributes, String[] suggestions, int cookie, int sequence) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   } public SuggestionsInfo(Parcel source) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel dest, int flags) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCookieAndSequence(int cookie, int sequence) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCookie() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSequence() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSuggestionsAttributes() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSuggestionsCount() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSuggestionAt(int i) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   public static final Parcelable.Creator<SuggestionsInfo> CREATOR = null;
/*     */   public static final int RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS = 4;
/*     */   public static final int RESULT_ATTR_IN_THE_DICTIONARY = 1;
/*     */   public static final int RESULT_ATTR_LOOKS_LIKE_TYPO = 2;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\textservice\SuggestionsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */