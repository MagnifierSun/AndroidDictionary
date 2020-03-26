/*     */ package android.view.textservice;
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
/*     */ public class SpellCheckerSession
/*     */ {
/*     */   public static final String SERVICE_META_DATA = "android.view.textservice.scs";
/*     */   
/*     */   SpellCheckerSession() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSessionDisconnected() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SpellCheckerInfo getSpellChecker() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void cancel() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getSentenceSuggestions(TextInfo[] textInfos, int suggestionsLimit) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void getSuggestions(TextInfo textInfo, int suggestionsLimit) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void getSuggestions(TextInfo[] textInfos, int suggestionsLimit, boolean sequentialWords) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface SpellCheckerSessionListener {
/*     */     void onGetSuggestions(SuggestionsInfo[] param1ArrayOfSuggestionsInfo);
/*     */     
/*     */     void onGetSentenceSuggestions(SentenceSuggestionsInfo[] param1ArrayOfSentenceSuggestionsInfo);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\textservice\SpellCheckerSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */