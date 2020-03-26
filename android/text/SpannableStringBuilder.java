/*     */ package android.text;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SpannableStringBuilder
/*     */   implements CharSequence, GetChars, Spannable, Editable, Appendable
/*     */ {
/*     */   public SpannableStringBuilder() {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SpannableStringBuilder(CharSequence text) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SpannableStringBuilder(CharSequence text, int start, int end) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   } public static SpannableStringBuilder valueOf(CharSequence source) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public char charAt(int where) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int length() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public SpannableStringBuilder insert(int where, CharSequence tb, int start, int end) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public SpannableStringBuilder insert(int where, CharSequence tb) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public SpannableStringBuilder delete(int start, int end) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public void clear() {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   } public void clearSpans() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public SpannableStringBuilder append(CharSequence text) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SpannableStringBuilder append(CharSequence text, Object what, int flags) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   } public SpannableStringBuilder append(CharSequence text, int start, int end) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   } public SpannableStringBuilder append(char text) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public SpannableStringBuilder replace(int start, int end, CharSequence tb) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public SpannableStringBuilder replace(int start, int end, CharSequence tb, int tbstart, int tbend) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSpan(Object what, int start, int end, int flags) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeSpan(Object what) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSpanStart(Object what) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSpanEnd(Object what) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSpanFlags(Object what) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T[] getSpans(int queryStart, int queryEnd, @RecentlyNullable Class<T> kind) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int nextSpanTransition(int start, int limit, Class kind) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence subSequence(int start, int end) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getChars(int start, int end, char[] dest, int destoff) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTextWatcherDepth() {
/* 174 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public int getTextRunCursor(int contextStart, int contextEnd, int dir, int offset, int cursorOpt, Paint p) {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   } public void setFilters(InputFilter[] filters) {
/* 204 */     throw new RuntimeException("Stub!");
/*     */   } public InputFilter[] getFilters() {
/* 206 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 210 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\SpannableStringBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */