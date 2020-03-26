/*     */ package android.provider;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.net.Uri;
/*     */ import java.util.Locale;
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
/*     */ public class UserDictionary
/*     */ {
/*     */   public static final String AUTHORITY = "user_dictionary";
/*     */   
/*     */   public UserDictionary() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   public static final Uri CONTENT_URI = null;
/*     */   
/*     */   public static class Words implements BaseColumns {
/*     */     public static final String APP_ID = "appid";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.userword";
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.userword";
/*     */     
/*     */     public Words() {
/*  54 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     @Deprecated
/*     */     public static void addWord(Context context, String word, int frequency, int localeType) {
/*  69 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public static void addWord(Context context, String word, int frequency, String shortcut, Locale locale) {
/*  83 */       throw new RuntimeException("Stub!");
/*     */     }
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
/* 109 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String DEFAULT_SORT_ORDER = "frequency DESC";
/*     */     public static final String FREQUENCY = "frequency";
/*     */     public static final String LOCALE = "locale";
/*     */     @Deprecated
/*     */     public static final int LOCALE_TYPE_ALL = 0;
/*     */     @Deprecated
/*     */     public static final int LOCALE_TYPE_CURRENT = 1;
/*     */     public static final String SHORTCUT = "shortcut";
/*     */     public static final String WORD = "word";
/*     */     public static final String _ID = "_id";
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\provider\UserDictionary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */