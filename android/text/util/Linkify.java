/*     */ package android.text.util;
/*     */ 
/*     */ import android.text.Spannable;
/*     */ import android.widget.TextView;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
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
/*     */ public class Linkify
/*     */ {
/*     */   public static final int ALL = 15;
/*     */   public static final int EMAIL_ADDRESSES = 2;
/*     */   @Deprecated
/*     */   public static final int MAP_ADDRESSES = 8;
/*     */   public static final int PHONE_NUMBERS = 4;
/*     */   public static final int WEB_URLS = 1;
/*     */   
/*     */   public Linkify() {
/*  51 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean addLinks(@RecentlyNonNull Spannable text, int mask) {
/*  70 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean addLinks(@RecentlyNonNull TextView text, int mask) {
/*  88 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void addLinks(@RecentlyNonNull TextView text, @RecentlyNonNull Pattern pattern, @RecentlyNullable String scheme) {
/* 108 */     throw new RuntimeException("Stub!");
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
/*     */   public static final void addLinks(@RecentlyNonNull TextView text, @RecentlyNonNull Pattern pattern, @RecentlyNullable String scheme, @RecentlyNullable MatchFilter matchFilter, @RecentlyNullable TransformFilter transformFilter) {
/* 135 */     throw new RuntimeException("Stub!");
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
/*     */   public static final void addLinks(@RecentlyNonNull TextView text, @RecentlyNonNull Pattern pattern, @RecentlyNullable String defaultScheme, @RecentlyNullable String[] schemes, @RecentlyNullable MatchFilter matchFilter, @RecentlyNullable TransformFilter transformFilter) {
/* 167 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean addLinks(@RecentlyNonNull Spannable text, @RecentlyNonNull Pattern pattern, @RecentlyNullable String scheme) {
/* 185 */     throw new RuntimeException("Stub!");
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
/*     */   public static final boolean addLinks(@RecentlyNonNull Spannable spannable, @RecentlyNonNull Pattern pattern, @RecentlyNullable String scheme, @RecentlyNullable MatchFilter matchFilter, @RecentlyNullable TransformFilter transformFilter) {
/* 208 */     throw new RuntimeException("Stub!");
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
/*     */   public static final boolean addLinks(@RecentlyNonNull Spannable spannable, @RecentlyNonNull Pattern pattern, @RecentlyNullable String defaultScheme, @RecentlyNullable String[] schemes, @RecentlyNullable MatchFilter matchFilter, @RecentlyNullable TransformFilter transformFilter) {
/* 233 */     throw new RuntimeException("Stub!");
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
/* 285 */   public static final MatchFilter sPhoneNumberMatchFilter = null;
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
/* 296 */   public static final TransformFilter sPhoneNumberTransformFilter = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 304 */   public static final MatchFilter sUrlMatchFilter = null;
/*     */   
/*     */   public static interface TransformFilter {
/*     */     String transformUrl(Matcher param1Matcher, String param1String);
/*     */   }
/*     */   
/*     */   public static interface MatchFilter {
/*     */     boolean acceptMatch(CharSequence param1CharSequence, int param1Int1, int param1Int2);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\tex\\util\Linkify.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */