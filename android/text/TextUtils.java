/*     */ package android.text;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.util.Printer;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
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
/*     */ public class TextUtils
/*     */ {
/*     */   public static final int CAP_MODE_CHARACTERS = 4096;
/*     */   public static final int CAP_MODE_SENTENCES = 16384;
/*     */   public static final int CAP_MODE_WORDS = 8192;
/*     */   
/*     */   TextUtils() {
/*  29 */     throw new RuntimeException("Stub!");
/*     */   } public static void getChars(CharSequence s, int start, int end, char[] dest, int destoff) {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   } public static int indexOf(CharSequence s, char ch) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   } public static int indexOf(CharSequence s, char ch, int start) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public static int indexOf(CharSequence s, char ch, int start, int end) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   } public static int lastIndexOf(CharSequence s, char ch) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   } public static int lastIndexOf(CharSequence s, char ch, int last) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   } public static int lastIndexOf(CharSequence s, char ch, int start, int last) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public static int indexOf(CharSequence s, CharSequence needle) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   } public static int indexOf(CharSequence s, CharSequence needle, int start) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   } public static int indexOf(CharSequence s, CharSequence needle, int start, int end) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean regionMatches(CharSequence one, int toffset, CharSequence two, int ooffset, int len) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String substring(CharSequence source, int start, int end) {
/*  61 */     throw new RuntimeException("Stub!");
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
/*     */   public static String join(@RecentlyNonNull CharSequence delimiter, @RecentlyNonNull Object[] tokens) {
/*  76 */     throw new RuntimeException("Stub!");
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
/*     */   public static String join(@RecentlyNonNull CharSequence delimiter, @RecentlyNonNull Iterable tokens) {
/*  91 */     throw new RuntimeException("Stub!");
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
/*     */   public static String[] split(String text, String expression) {
/* 104 */     throw new RuntimeException("Stub!");
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
/*     */   public static String[] split(String text, Pattern pattern) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } public static CharSequence stringOrSpannedString(CharSequence source) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isEmpty(@RecentlyNullable CharSequence str) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getTrimmedLength(CharSequence s) {
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
/*     */   public static boolean equals(CharSequence a, CharSequence b) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static CharSequence getReverse(CharSequence source, int start, int end) {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void writeToParcel(CharSequence cs, Parcel p, int parcelableFlags) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void dumpSpans(CharSequence cs, Printer printer, String prefix) {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CharSequence replace(CharSequence template, String[] sources, CharSequence[] destinations) {
/* 177 */     throw new RuntimeException("Stub!");
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
/*     */   public static CharSequence expandTemplate(CharSequence template, CharSequence... values) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   } public static int getOffsetBefore(CharSequence text, int offset) {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   } public static int getOffsetAfter(CharSequence text, int offset) {
/* 205 */     throw new RuntimeException("Stub!");
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
/*     */   public static void copySpansFrom(Spanned source, int start, int end, Class kind, Spannable dest, int destoff) {
/* 219 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CharSequence ellipsize(CharSequence text, TextPaint p, float avail, TruncateAt where) {
/* 228 */     throw new RuntimeException("Stub!");
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
/*     */   public static CharSequence ellipsize(CharSequence text, TextPaint paint, float avail, TruncateAt where, boolean preserveLength, @RecentlyNullable EllipsizeCallback callback) {
/* 245 */     throw new RuntimeException("Stub!");
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
/*     */   public static CharSequence listEllipsize(@RecentlyNullable Context context, @RecentlyNullable List<CharSequence> elements, @RecentlyNonNull String separator, @RecentlyNonNull TextPaint paint, float avail, int moreId) {
/* 280 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public static CharSequence commaEllipsize(CharSequence text, TextPaint p, float avail, String oneMore, String more) {
/* 299 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String htmlEncode(String s) {
/* 307 */     throw new RuntimeException("Stub!");
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
/*     */   public static CharSequence concat(CharSequence... text) {
/* 326 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isGraphic(CharSequence str) {
/* 332 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static boolean isGraphic(char c) {
/* 342 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isDigitsOnly(CharSequence str) {
/* 348 */     throw new RuntimeException("Stub!");
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
/*     */   public static int getCapsMode(CharSequence cs, int off, int reqModes) {
/* 368 */     throw new RuntimeException("Stub!");
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
/*     */   public static int getLayoutDirectionFromLocale(Locale locale) {
/* 381 */     throw new RuntimeException("Stub!");
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
/* 408 */   public static final Parcelable.Creator<CharSequence> CHAR_SEQUENCE_CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface EllipsizeCallback
/*     */   {
/*     */     void ellipsized(int param1Int1, int param1Int2);
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
/*     */   public static class SimpleStringSplitter
/*     */     implements StringSplitter, Iterator<String>
/*     */   {
/*     */     public SimpleStringSplitter(char delimiter) {
/* 436 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setString(String string) {
/* 443 */       throw new RuntimeException("Stub!");
/*     */     } public Iterator<String> iterator() {
/* 445 */       throw new RuntimeException("Stub!");
/*     */     } public boolean hasNext() {
/* 447 */       throw new RuntimeException("Stub!");
/*     */     } public String next() {
/* 449 */       throw new RuntimeException("Stub!");
/*     */     } public void remove() {
/* 451 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public static interface StringSplitter
/*     */     extends Iterable<String>
/*     */   {
/*     */     void setString(String param1String);
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
/*     */   public enum TruncateAt
/*     */   {
/* 481 */     START, MIDDLE, END, MARQUEE, END_SMALL;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\TextUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */