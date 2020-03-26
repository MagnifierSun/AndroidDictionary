/*     */ package android.text.method;
/*     */ 
/*     */ import android.text.Spanned;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DigitsKeyListener
/*     */   extends NumberKeyListener
/*     */ {
/*     */   @Deprecated
/*     */   public DigitsKeyListener() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public DigitsKeyListener(boolean sign, boolean decimal) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public DigitsKeyListener(@RecentlyNullable Locale locale) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public DigitsKeyListener(@RecentlyNullable Locale locale, boolean sign, boolean decimal) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } protected char[] getAcceptedChars() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   @RecentlyNonNull
/*     */   public static DigitsKeyListener getInstance() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   @RecentlyNonNull
/*     */   public static DigitsKeyListener getInstance(boolean sign, boolean decimal) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public static DigitsKeyListener getInstance(@RecentlyNullable Locale locale) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public static DigitsKeyListener getInstance(@RecentlyNullable Locale locale, boolean sign, boolean decimal) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public static DigitsKeyListener getInstance(@RecentlyNonNull String accepted) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInputType() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\method\DigitsKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */