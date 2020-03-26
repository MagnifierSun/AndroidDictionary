/*      */ package android.icu.lang;
/*      */ 
/*      */ import android.icu.text.BreakIterator;
/*      */ import android.icu.util.RangeValueIterator;
/*      */ import android.icu.util.ULocale;
/*      */ import android.icu.util.ValueIterator;
/*      */ import android.icu.util.VersionInfo;
/*      */ import java.util.Locale;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class UCharacter
/*      */   implements UCharacterEnums.ECharacterCategory, UCharacterEnums.ECharacterDirection
/*      */ {
/*      */   public static final int FOLD_CASE_DEFAULT = 0;
/*      */   public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = 1;
/*      */   public static final int MAX_CODE_POINT = 1114111;
/*      */   public static final char MAX_HIGH_SURROGATE = '?';
/*      */   public static final char MAX_LOW_SURROGATE = '?';
/*      */   public static final int MAX_RADIX = 36;
/*      */   public static final char MAX_SURROGATE = '?';
/*      */   public static final int MAX_VALUE = 1114111;
/*      */   public static final int MIN_CODE_POINT = 0;
/*      */   public static final char MIN_HIGH_SURROGATE = '?';
/*      */   public static final char MIN_LOW_SURROGATE = '?';
/*      */   public static final int MIN_RADIX = 2;
/*      */   public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
/*      */   public static final char MIN_SURROGATE = '?';
/*      */   public static final int MIN_VALUE = 0;
/*      */   public static final double NO_NUMERIC_VALUE = -1.23456789E8D;
/*      */   public static final int REPLACEMENT_CHAR = 65533;
/*      */   public static final int SUPPLEMENTARY_MIN_VALUE = 65536;
/*      */   public static final int TITLECASE_NO_BREAK_ADJUSTMENT = 512;
/*      */   public static final int TITLECASE_NO_LOWERCASE = 256;
/*      */   
/*      */   UCharacter() {
/*  137 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int digit(int ch, int radix) {
/*  162 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int digit(int ch) {
/*  177 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getNumericValue(int ch) {
/*  193 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double getUnicodeNumericValue(int ch) {
/*  212 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getType(int ch) {
/*  229 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isDefined(int ch) {
/*  242 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isDigit(int ch) {
/*  256 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isISOControl(int ch) {
/*  268 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLetter(int ch) {
/*  277 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLetterOrDigit(int ch) {
/*  287 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isJavaIdentifierStart(int cp) {
/*  296 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isJavaIdentifierPart(int cp) {
/*  305 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLowerCase(int ch) {
/*  320 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isWhitespace(int ch) {
/*  351 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSpaceChar(int ch) {
/*  361 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isTitleCase(int ch) {
/*  376 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUnicodeIdentifierPart(int ch) {
/*  405 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUnicodeIdentifierStart(int ch) {
/*  427 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isIdentifierIgnorable(int ch) {
/*  444 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUpperCase(int ch) {
/*  463 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toLowerCase(int ch) {
/*  484 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toString(int ch) {
/*  498 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toTitleCase(int ch) {
/*  520 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toUpperCase(int ch) {
/*  541 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSupplementary(int ch) {
/*  552 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isBMP(int ch) {
/*  561 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isPrintable(int ch) {
/*  570 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isBaseForm(int ch) {
/*  580 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getDirection(int ch) {
/*  592 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isMirrored(int ch) {
/*  603 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getMirror(int ch) {
/*  619 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getBidiPairedBracket(int c) {
/*  637 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCombiningClass(int ch) {
/*  645 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLegal(int ch) {
/*  659 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLegal(String str) {
/*  674 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static VersionInfo getUnicodeVersion() {
/*  681 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getName(int ch) {
/*  694 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getName(String s, String separator) {
/*  703 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getExtendedName(int ch) {
/*  723 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getNameAlias(int ch) {
/*  736 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCharFromName(String name) {
/*  748 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCharFromExtendedName(String name) {
/*  769 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCharFromNameAlias(String name) {
/*  780 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getPropertyName(int property, int nameChoice) {
/*  815 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getPropertyEnum(CharSequence propertyAlias) {
/*  839 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getPropertyValueName(int property, int value, int nameChoice) {
/*  889 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getPropertyValueEnum(int property, CharSequence valueAlias) {
/*  922 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCodePoint(char lead, char trail) {
/*  934 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCodePoint(char char16) {
/*  945 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toUpperCase(String str) {
/*  954 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toLowerCase(String str) {
/*  963 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(String str, BreakIterator breakiter) {
/*  983 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toUpperCase(Locale locale, String str) {
/*  993 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toUpperCase(ULocale locale, String str) {
/* 1003 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toLowerCase(Locale locale, String str) {
/* 1013 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toLowerCase(ULocale locale, String str) {
/* 1023 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(Locale locale, String str, BreakIterator breakiter) {
/* 1044 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(ULocale locale, String str, BreakIterator titleIter) {
/* 1065 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(ULocale locale, String str, BreakIterator titleIter, int options) {
/* 1089 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(Locale locale, String str, BreakIterator titleIter, int options) {
/* 1113 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int foldCase(int ch, boolean defaultmapping) {
/* 1139 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String foldCase(String str, boolean defaultmapping) {
/* 1158 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int foldCase(int ch, int options) {
/* 1182 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String foldCase(String str, int options) {
/* 1199 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getHanNumericValue(int ch) {
/* 1221 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RangeValueIterator getTypeIterator() {
/* 1241 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ValueIterator getNameIterator() {
/* 1263 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ValueIterator getExtendedNameIterator() {
/* 1284 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static VersionInfo getAge(int ch) {
/* 1298 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean hasBinaryProperty(int ch, int property) {
/* 1325 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUAlphabetic(int ch) {
/* 1334 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isULowercase(int ch) {
/* 1343 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUUppercase(int ch) {
/* 1352 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUWhiteSpace(int ch) {
/* 1362 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getIntPropertyValue(int ch, int type) {
/* 1403 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getIntPropertyMinValue(int type) {
/* 1423 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getIntPropertyMaxValue(int type) {
/* 1450 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static char forDigit(int digit, int radix) {
/* 1456 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isValidCodePoint(int cp) {
/* 1465 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSupplementaryCodePoint(int cp) {
/* 1474 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isHighSurrogate(char ch) {
/* 1483 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLowSurrogate(char ch) {
/* 1492 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSurrogatePair(char high, char low) {
/* 1502 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int charCount(int cp) {
/* 1513 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toCodePoint(char high, char low) {
/* 1525 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointAt(CharSequence seq, int index) {
/* 1537 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointAt(char[] text, int index) {
/* 1549 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointAt(char[] text, int index, int limit) {
/* 1562 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointBefore(CharSequence seq, int index) {
/* 1574 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointBefore(char[] text, int index) {
/* 1586 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointBefore(char[] text, int index, int limit) {
/* 1599 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toChars(int cp, char[] dst, int dstIndex) {
/* 1613 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static char[] toChars(int cp) {
/* 1624 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static byte getDirectionality(int cp) {
/* 1643 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointCount(CharSequence text, int start, int limit) {
/* 1655 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointCount(char[] text, int start, int limit) {
/* 1666 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int offsetByCodePoints(CharSequence text, int index, int codePointOffset) {
/* 1677 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int offsetByCodePoints(char[] text, int start, int count, int index, int codePointOffset) {
/* 1691 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface WordBreak
/*      */   {
/*      */     public static final int ALETTER = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CR = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DOUBLE_QUOTE = 16;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EXTEND = 9;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EXTENDNUMLET = 7;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int E_BASE = 17;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int E_BASE_GAZ = 18;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int E_MODIFIER = 19;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int FORMAT = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GLUE_AFTER_ZWJ = 20;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HEBREW_LETTER = 14;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KATAKANA = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LF = 10;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MIDLETTER = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MIDNUM = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MIDNUMLET = 11;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NEWLINE = 12;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NUMERIC = 6;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OTHER = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int REGIONAL_INDICATOR = 13;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SINGLE_QUOTE = 15;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ZWJ = 21;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class UnicodeBlock
/*      */     extends Character.Subset
/*      */   {
/*      */     UnicodeBlock(String name, int id) {
/* 3020 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static UnicodeBlock getInstance(int id) {
/* 3031 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static UnicodeBlock of(int ch) {
/* 3040 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static UnicodeBlock forName(String blockName) {
/* 3053 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getID() {
/* 3060 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 3065 */     public static final UnicodeBlock ADLAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ADLAM_ID = 263;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3075 */     public static final UnicodeBlock AEGEAN_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AEGEAN_NUMBERS_ID = 119;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3085 */     public static final UnicodeBlock AHOM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AHOM_ID = 253;
/*      */ 
/*      */ 
/*      */     
/* 3094 */     public static final UnicodeBlock ALCHEMICAL_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ALCHEMICAL_SYMBOLS_ID = 208;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3104 */     public static final UnicodeBlock ALPHABETIC_PRESENTATION_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ALPHABETIC_PRESENTATION_FORMS_ID = 80;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3114 */     public static final UnicodeBlock ANATOLIAN_HIEROGLYPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ANATOLIAN_HIEROGLYPHS_ID = 254;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3124 */     public static final UnicodeBlock ANCIENT_GREEK_MUSICAL_NOTATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ANCIENT_GREEK_MUSICAL_NOTATION_ID = 126;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3135 */     public static final UnicodeBlock ANCIENT_GREEK_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ANCIENT_GREEK_NUMBERS_ID = 127;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3146 */     public static final UnicodeBlock ANCIENT_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ANCIENT_SYMBOLS_ID = 165;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3157 */     public static final UnicodeBlock ARABIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3162 */     public static final UnicodeBlock ARABIC_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_EXTENDED_A_ID = 210;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_ID = 12;
/*      */ 
/*      */ 
/*      */     
/* 3176 */     public static final UnicodeBlock ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS_ID = 211;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3186 */     public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_PRESENTATION_FORMS_A_ID = 81;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3197 */     public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_PRESENTATION_FORMS_B_ID = 85;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3208 */     public static final UnicodeBlock ARABIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_SUPPLEMENT_ID = 128;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3219 */     public static final UnicodeBlock ARMENIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARMENIAN_ID = 10;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3230 */     public static final UnicodeBlock ARROWS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARROWS_ID = 46;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3240 */     public static final UnicodeBlock AVESTAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AVESTAN_ID = 188;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3250 */     public static final UnicodeBlock BALINESE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BALINESE_ID = 147;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3260 */     public static final UnicodeBlock BAMUM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BAMUM_ID = 177;
/*      */ 
/*      */ 
/*      */     
/* 3269 */     public static final UnicodeBlock BAMUM_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BAMUM_SUPPLEMENT_ID = 202;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3279 */     public static final UnicodeBlock BASIC_LATIN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BASIC_LATIN_ID = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3289 */     public static final UnicodeBlock BASSA_VAH = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BASSA_VAH_ID = 221;
/*      */ 
/*      */ 
/*      */     
/* 3298 */     public static final UnicodeBlock BATAK = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BATAK_ID = 199;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3308 */     public static final UnicodeBlock BENGALI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BENGALI_ID = 16;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3318 */     public static final UnicodeBlock BHAIKSUKI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BHAIKSUKI_ID = 264;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3328 */     public static final UnicodeBlock BLOCK_ELEMENTS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BLOCK_ELEMENTS_ID = 53;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3339 */     public static final UnicodeBlock BOPOMOFO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3345 */     public static final UnicodeBlock BOPOMOFO_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BOPOMOFO_EXTENDED_ID = 67;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BOPOMOFO_ID = 64;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3361 */     public static final UnicodeBlock BOX_DRAWING = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BOX_DRAWING_ID = 52;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3371 */     public static final UnicodeBlock BRAHMI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BRAHMI_ID = 201;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3381 */     public static final UnicodeBlock BRAILLE_PATTERNS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BRAILLE_PATTERNS_ID = 57;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3392 */     public static final UnicodeBlock BUGINESE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BUGINESE_ID = 129;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3403 */     public static final UnicodeBlock BUHID = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BUHID_ID = 100;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3414 */     public static final UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BYZANTINE_MUSICAL_SYMBOLS_ID = 91;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3425 */     public static final UnicodeBlock CARIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CARIAN_ID = 168;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3435 */     public static final UnicodeBlock CAUCASIAN_ALBANIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CAUCASIAN_ALBANIAN_ID = 222;
/*      */ 
/*      */ 
/*      */     
/* 3444 */     public static final UnicodeBlock CHAKMA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHAKMA_ID = 212;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3454 */     public static final UnicodeBlock CHAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHAM_ID = 164;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3465 */     public static final UnicodeBlock CHEROKEE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHEROKEE_ID = 32;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3475 */     public static final UnicodeBlock CHEROKEE_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHEROKEE_SUPPLEMENT_ID = 255;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3485 */     public static final UnicodeBlock CJK_COMPATIBILITY = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3491 */     public static final UnicodeBlock CJK_COMPATIBILITY_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_COMPATIBILITY_FORMS_ID = 83;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_COMPATIBILITY_ID = 69;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3507 */     public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_COMPATIBILITY_IDEOGRAPHS_ID = 79;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3518 */     public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT_ID = 95;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3529 */     public static final UnicodeBlock CJK_RADICALS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_RADICALS_SUPPLEMENT_ID = 58;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3540 */     public static final UnicodeBlock CJK_STROKES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_STROKES_ID = 130;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3551 */     public static final UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_SYMBOLS_AND_PUNCTUATION_ID = 61;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3562 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3568 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A_ID = 70;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3579 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B_ID = 94;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3589 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C_ID = 197;
/*      */ 
/*      */ 
/*      */     
/* 3598 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D_ID = 209;
/*      */ 
/*      */ 
/*      */     
/* 3607 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E_ID = 256;
/*      */ 
/*      */ 
/*      */     
/* 3616 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F_ID = 274;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_ID = 71;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3631 */     public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3636 */     public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_DIACRITICAL_MARKS_EXTENDED_ID = 224;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_DIACRITICAL_MARKS_ID = 7;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3651 */     public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_DIACRITICAL_MARKS_SUPPLEMENT_ID = 131;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3662 */     public static final UnicodeBlock COMBINING_HALF_MARKS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_HALF_MARKS_ID = 82;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3675 */     public static final UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_MARKS_FOR_SYMBOLS_ID = 43;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3687 */     public static final UnicodeBlock COMMON_INDIC_NUMBER_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMMON_INDIC_NUMBER_FORMS_ID = 178;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3697 */     public static final UnicodeBlock CONTROL_PICTURES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CONTROL_PICTURES_ID = 49;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3708 */     public static final UnicodeBlock COPTIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3713 */     public static final UnicodeBlock COPTIC_EPACT_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COPTIC_EPACT_NUMBERS_ID = 223;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COPTIC_ID = 132;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3728 */     public static final UnicodeBlock COUNTING_ROD_NUMERALS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COUNTING_ROD_NUMERALS_ID = 154;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3739 */     public static final UnicodeBlock CUNEIFORM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CUNEIFORM_ID = 152;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3750 */     public static final UnicodeBlock CUNEIFORM_NUMBERS_AND_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CUNEIFORM_NUMBERS_AND_PUNCTUATION_ID = 153;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3761 */     public static final UnicodeBlock CURRENCY_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CURRENCY_SYMBOLS_ID = 42;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3772 */     public static final UnicodeBlock CYPRIOT_SYLLABARY = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYPRIOT_SYLLABARY_ID = 123;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3783 */     public static final UnicodeBlock CYRILLIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3789 */     public static final UnicodeBlock CYRILLIC_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_EXTENDED_A_ID = 158;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3800 */     public static final UnicodeBlock CYRILLIC_EXTENDED_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_EXTENDED_B_ID = 160;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3810 */     public static final UnicodeBlock CYRILLIC_EXTENDED_C = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_EXTENDED_C_ID = 265;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_ID = 9;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3826 */     public static final UnicodeBlock CYRILLIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3833 */     public static final UnicodeBlock CYRILLIC_SUPPLEMENTARY = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_SUPPLEMENTARY_ID = 97;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_SUPPLEMENT_ID = 97;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3851 */     public static final UnicodeBlock DESERET = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DESERET_ID = 90;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3862 */     public static final UnicodeBlock DEVANAGARI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3867 */     public static final UnicodeBlock DEVANAGARI_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DEVANAGARI_EXTENDED_ID = 179;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DEVANAGARI_ID = 15;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3882 */     public static final UnicodeBlock DINGBATS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DINGBATS_ID = 56;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3893 */     public static final UnicodeBlock DOMINO_TILES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DOMINO_TILES_ID = 171;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3903 */     public static final UnicodeBlock DUPLOYAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DUPLOYAN_ID = 225;
/*      */ 
/*      */ 
/*      */     
/* 3912 */     public static final UnicodeBlock EARLY_DYNASTIC_CUNEIFORM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EARLY_DYNASTIC_CUNEIFORM_ID = 257;
/*      */ 
/*      */ 
/*      */     
/* 3921 */     public static final UnicodeBlock EGYPTIAN_HIEROGLYPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EGYPTIAN_HIEROGLYPHS_ID = 194;
/*      */ 
/*      */ 
/*      */     
/* 3930 */     public static final UnicodeBlock ELBASAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ELBASAN_ID = 226;
/*      */ 
/*      */ 
/*      */     
/* 3939 */     public static final UnicodeBlock EMOTICONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EMOTICONS_ID = 206;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3949 */     public static final UnicodeBlock ENCLOSED_ALPHANUMERICS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ENCLOSED_ALPHANUMERICS_ID = 51;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3959 */     public static final UnicodeBlock ENCLOSED_ALPHANUMERIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ENCLOSED_ALPHANUMERIC_SUPPLEMENT_ID = 195;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3969 */     public static final UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ENCLOSED_CJK_LETTERS_AND_MONTHS_ID = 68;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3979 */     public static final UnicodeBlock ENCLOSED_IDEOGRAPHIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ENCLOSED_IDEOGRAPHIC_SUPPLEMENT_ID = 196;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3989 */     public static final UnicodeBlock ETHIOPIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3995 */     public static final UnicodeBlock ETHIOPIC_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4000 */     public static final UnicodeBlock ETHIOPIC_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ETHIOPIC_EXTENDED_A_ID = 200;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ETHIOPIC_EXTENDED_ID = 133;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ETHIOPIC_ID = 31;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4020 */     public static final UnicodeBlock ETHIOPIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ETHIOPIC_SUPPLEMENT_ID = 134;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4031 */     public static final UnicodeBlock GENERAL_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GENERAL_PUNCTUATION_ID = 40;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4042 */     public static final UnicodeBlock GEOMETRIC_SHAPES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4047 */     public static final UnicodeBlock GEOMETRIC_SHAPES_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEOMETRIC_SHAPES_EXTENDED_ID = 227;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEOMETRIC_SHAPES_ID = 54;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4062 */     public static final UnicodeBlock GEORGIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEORGIAN_ID = 29;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4073 */     public static final UnicodeBlock GEORGIAN_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEORGIAN_SUPPLEMENT_ID = 135;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4084 */     public static final UnicodeBlock GLAGOLITIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GLAGOLITIC_ID = 136;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4094 */     public static final UnicodeBlock GLAGOLITIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GLAGOLITIC_SUPPLEMENT_ID = 266;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4104 */     public static final UnicodeBlock GOTHIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GOTHIC_ID = 89;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4114 */     public static final UnicodeBlock GRANTHA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GRANTHA_ID = 228;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4125 */     public static final UnicodeBlock GREEK = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4131 */     public static final UnicodeBlock GREEK_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GREEK_EXTENDED_ID = 39;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GREEK_ID = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4148 */     public static final UnicodeBlock GUJARATI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GUJARATI_ID = 18;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4159 */     public static final UnicodeBlock GURMUKHI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GURMUKHI_ID = 17;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4170 */     public static final UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HALFWIDTH_AND_FULLWIDTH_FORMS_ID = 87;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4181 */     public static final UnicodeBlock HANGUL_COMPATIBILITY_JAMO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_COMPATIBILITY_JAMO_ID = 65;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4192 */     public static final UnicodeBlock HANGUL_JAMO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4197 */     public static final UnicodeBlock HANGUL_JAMO_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_JAMO_EXTENDED_A_ID = 180;
/*      */ 
/*      */ 
/*      */     
/* 4206 */     public static final UnicodeBlock HANGUL_JAMO_EXTENDED_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_JAMO_EXTENDED_B_ID = 185;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_JAMO_ID = 30;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4221 */     public static final UnicodeBlock HANGUL_SYLLABLES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_SYLLABLES_ID = 74;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4232 */     public static final UnicodeBlock HANUNOO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANUNOO_ID = 99;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4242 */     public static final UnicodeBlock HATRAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HATRAN_ID = 258;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4252 */     public static final UnicodeBlock HEBREW = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HEBREW_ID = 11;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4263 */     public static final UnicodeBlock HIGH_PRIVATE_USE_SURROGATES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HIGH_PRIVATE_USE_SURROGATES_ID = 76;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4274 */     public static final UnicodeBlock HIGH_SURROGATES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HIGH_SURROGATES_ID = 75;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4285 */     public static final UnicodeBlock HIRAGANA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HIRAGANA_ID = 62;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4296 */     public static final UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IDEOGRAPHIC_DESCRIPTION_CHARACTERS_ID = 60;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4306 */     public static final UnicodeBlock IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION_ID = 267;
/*      */ 
/*      */ 
/*      */     
/* 4315 */     public static final UnicodeBlock IMPERIAL_ARAMAIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPERIAL_ARAMAIC_ID = 186;
/*      */ 
/*      */ 
/*      */     
/* 4324 */     public static final UnicodeBlock INSCRIPTIONAL_PAHLAVI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int INSCRIPTIONAL_PAHLAVI_ID = 190;
/*      */ 
/*      */ 
/*      */     
/* 4333 */     public static final UnicodeBlock INSCRIPTIONAL_PARTHIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int INSCRIPTIONAL_PARTHIAN_ID = 189;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4343 */     public static final UnicodeBlock INVALID_CODE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int INVALID_CODE_ID = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4354 */     public static final UnicodeBlock IPA_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IPA_EXTENSIONS_ID = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4364 */     public static final UnicodeBlock JAVANESE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int JAVANESE_ID = 181;
/*      */ 
/*      */ 
/*      */     
/* 4373 */     public static final UnicodeBlock KAITHI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KAITHI_ID = 193;
/*      */ 
/*      */ 
/*      */     
/* 4382 */     public static final UnicodeBlock KANA_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANA_EXTENDED_A_ID = 275;
/*      */ 
/*      */ 
/*      */     
/* 4391 */     public static final UnicodeBlock KANA_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANA_SUPPLEMENT_ID = 203;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4401 */     public static final UnicodeBlock KANBUN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANBUN_ID = 66;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4412 */     public static final UnicodeBlock KANGXI_RADICALS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANGXI_RADICALS_ID = 59;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4423 */     public static final UnicodeBlock KANNADA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANNADA_ID = 22;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4434 */     public static final UnicodeBlock KATAKANA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KATAKANA_ID = 63;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4445 */     public static final UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KATAKANA_PHONETIC_EXTENSIONS_ID = 107;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4456 */     public static final UnicodeBlock KAYAH_LI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KAYAH_LI_ID = 162;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4467 */     public static final UnicodeBlock KHAROSHTHI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHAROSHTHI_ID = 137;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4478 */     public static final UnicodeBlock KHMER = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHMER_ID = 36;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4489 */     public static final UnicodeBlock KHMER_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHMER_SYMBOLS_ID = 113;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4499 */     public static final UnicodeBlock KHOJKI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHOJKI_ID = 229;
/*      */ 
/*      */ 
/*      */     
/* 4508 */     public static final UnicodeBlock KHUDAWADI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHUDAWADI_ID = 230;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4518 */     public static final UnicodeBlock LAO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LAO_ID = 26;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4529 */     public static final UnicodeBlock LATIN_1_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_1_SUPPLEMENT_ID = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4540 */     public static final UnicodeBlock LATIN_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4546 */     public static final UnicodeBlock LATIN_EXTENDED_ADDITIONAL = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_ADDITIONAL_ID = 38;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_A_ID = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4562 */     public static final UnicodeBlock LATIN_EXTENDED_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_B_ID = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4573 */     public static final UnicodeBlock LATIN_EXTENDED_C = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_C_ID = 148;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4584 */     public static final UnicodeBlock LATIN_EXTENDED_D = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_D_ID = 149;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4594 */     public static final UnicodeBlock LATIN_EXTENDED_E = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_E_ID = 231;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4604 */     public static final UnicodeBlock LEPCHA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LEPCHA_ID = 156;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4615 */     public static final UnicodeBlock LETTERLIKE_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LETTERLIKE_SYMBOLS_ID = 44;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4626 */     public static final UnicodeBlock LIMBU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LIMBU_ID = 111;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4636 */     public static final UnicodeBlock LINEAR_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LINEAR_A_ID = 232;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4646 */     public static final UnicodeBlock LINEAR_B_IDEOGRAMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LINEAR_B_IDEOGRAMS_ID = 118;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4657 */     public static final UnicodeBlock LINEAR_B_SYLLABARY = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LINEAR_B_SYLLABARY_ID = 117;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4667 */     public static final UnicodeBlock LISU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LISU_ID = 176;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4677 */     public static final UnicodeBlock LOW_SURROGATES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LOW_SURROGATES_ID = 77;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4688 */     public static final UnicodeBlock LYCIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LYCIAN_ID = 167;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4699 */     public static final UnicodeBlock LYDIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LYDIAN_ID = 169;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4709 */     public static final UnicodeBlock MAHAJANI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MAHAJANI_ID = 233;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4719 */     public static final UnicodeBlock MAHJONG_TILES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MAHJONG_TILES_ID = 170;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4730 */     public static final UnicodeBlock MALAYALAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MALAYALAM_ID = 23;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4740 */     public static final UnicodeBlock MANDAIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MANDAIC_ID = 198;
/*      */ 
/*      */ 
/*      */     
/* 4749 */     public static final UnicodeBlock MANICHAEAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MANICHAEAN_ID = 234;
/*      */ 
/*      */ 
/*      */     
/* 4758 */     public static final UnicodeBlock MARCHEN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MARCHEN_ID = 268;
/*      */ 
/*      */ 
/*      */     
/* 4767 */     public static final UnicodeBlock MASARAM_GONDI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MASARAM_GONDI_ID = 276;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4777 */     public static final UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MATHEMATICAL_ALPHANUMERIC_SYMBOLS_ID = 93;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4788 */     public static final UnicodeBlock MATHEMATICAL_OPERATORS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MATHEMATICAL_OPERATORS_ID = 47;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4798 */     public static final UnicodeBlock MEETEI_MAYEK = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4803 */     public static final UnicodeBlock MEETEI_MAYEK_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MEETEI_MAYEK_EXTENSIONS_ID = 213;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MEETEI_MAYEK_ID = 184;
/*      */ 
/*      */ 
/*      */     
/* 4816 */     public static final UnicodeBlock MENDE_KIKAKUI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MENDE_KIKAKUI_ID = 235;
/*      */ 
/*      */ 
/*      */     
/* 4825 */     public static final UnicodeBlock MEROITIC_CURSIVE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MEROITIC_CURSIVE_ID = 214;
/*      */ 
/*      */ 
/*      */     
/* 4834 */     public static final UnicodeBlock MEROITIC_HIEROGLYPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MEROITIC_HIEROGLYPHS_ID = 215;
/*      */ 
/*      */ 
/*      */     
/* 4843 */     public static final UnicodeBlock MIAO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MIAO_ID = 216;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4853 */     public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A_ID = 102;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4864 */     public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B_ID = 105;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4875 */     public static final UnicodeBlock MISCELLANEOUS_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4881 */     public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_SYMBOLS_AND_ARROWS_ID = 115;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4891 */     public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS_ID = 205;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_SYMBOLS_ID = 55;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4906 */     public static final UnicodeBlock MISCELLANEOUS_TECHNICAL = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_TECHNICAL_ID = 48;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4916 */     public static final UnicodeBlock MODI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4922 */     public static final UnicodeBlock MODIFIER_TONE_LETTERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MODIFIER_TONE_LETTERS_ID = 138;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MODI_ID = 236;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4937 */     public static final UnicodeBlock MONGOLIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MONGOLIAN_ID = 37;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4947 */     public static final UnicodeBlock MONGOLIAN_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MONGOLIAN_SUPPLEMENT_ID = 269;
/*      */ 
/*      */ 
/*      */     
/* 4956 */     public static final UnicodeBlock MRO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MRO_ID = 237;
/*      */ 
/*      */ 
/*      */     
/* 4965 */     public static final UnicodeBlock MULTANI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MULTANI_ID = 259;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4975 */     public static final UnicodeBlock MUSICAL_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MUSICAL_SYMBOLS_ID = 92;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4986 */     public static final UnicodeBlock MYANMAR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4991 */     public static final UnicodeBlock MYANMAR_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MYANMAR_EXTENDED_A_ID = 182;
/*      */ 
/*      */ 
/*      */     
/* 5000 */     public static final UnicodeBlock MYANMAR_EXTENDED_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MYANMAR_EXTENDED_B_ID = 238;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MYANMAR_ID = 28;
/*      */ 
/*      */ 
/*      */     
/* 5014 */     public static final UnicodeBlock NABATAEAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NABATAEAN_ID = 239;
/*      */ 
/*      */ 
/*      */     
/* 5023 */     public static final UnicodeBlock NEWA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NEWA_ID = 270;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5033 */     public static final UnicodeBlock NEW_TAI_LUE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NEW_TAI_LUE_ID = 139;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5044 */     public static final UnicodeBlock NKO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NKO_ID = 146;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5055 */     public static final UnicodeBlock NO_BLOCK = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5061 */     public static final UnicodeBlock NUMBER_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NUMBER_FORMS_ID = 45;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5071 */     public static final UnicodeBlock NUSHU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NUSHU_ID = 277;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5081 */     public static final UnicodeBlock OGHAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OGHAM_ID = 34;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5091 */     public static final UnicodeBlock OLD_HUNGARIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_HUNGARIAN_ID = 260;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5101 */     public static final UnicodeBlock OLD_ITALIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_ITALIC_ID = 88;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5111 */     public static final UnicodeBlock OLD_NORTH_ARABIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_NORTH_ARABIAN_ID = 240;
/*      */ 
/*      */ 
/*      */     
/* 5120 */     public static final UnicodeBlock OLD_PERMIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_PERMIC_ID = 241;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5130 */     public static final UnicodeBlock OLD_PERSIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_PERSIAN_ID = 140;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5140 */     public static final UnicodeBlock OLD_SOUTH_ARABIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_SOUTH_ARABIAN_ID = 187;
/*      */ 
/*      */ 
/*      */     
/* 5149 */     public static final UnicodeBlock OLD_TURKIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_TURKIC_ID = 191;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5159 */     public static final UnicodeBlock OL_CHIKI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OL_CHIKI_ID = 157;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5170 */     public static final UnicodeBlock OPTICAL_CHARACTER_RECOGNITION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OPTICAL_CHARACTER_RECOGNITION_ID = 50;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5181 */     public static final UnicodeBlock ORIYA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ORIYA_ID = 19;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5191 */     public static final UnicodeBlock ORNAMENTAL_DINGBATS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ORNAMENTAL_DINGBATS_ID = 242;
/*      */ 
/*      */ 
/*      */     
/* 5200 */     public static final UnicodeBlock OSAGE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OSAGE_ID = 271;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5210 */     public static final UnicodeBlock OSMANYA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OSMANYA_ID = 122;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5220 */     public static final UnicodeBlock PAHAWH_HMONG = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PAHAWH_HMONG_ID = 243;
/*      */ 
/*      */ 
/*      */     
/* 5229 */     public static final UnicodeBlock PALMYRENE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PALMYRENE_ID = 244;
/*      */ 
/*      */ 
/*      */     
/* 5238 */     public static final UnicodeBlock PAU_CIN_HAU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PAU_CIN_HAU_ID = 245;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5248 */     public static final UnicodeBlock PHAGS_PA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHAGS_PA_ID = 150;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5259 */     public static final UnicodeBlock PHAISTOS_DISC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHAISTOS_DISC_ID = 166;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5270 */     public static final UnicodeBlock PHOENICIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHOENICIAN_ID = 151;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5281 */     public static final UnicodeBlock PHONETIC_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHONETIC_EXTENSIONS_ID = 114;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5292 */     public static final UnicodeBlock PHONETIC_EXTENSIONS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHONETIC_EXTENSIONS_SUPPLEMENT_ID = 141;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5302 */     public static final UnicodeBlock PLAYING_CARDS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PLAYING_CARDS_ID = 204;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5317 */     public static final UnicodeBlock PRIVATE_USE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5328 */     public static final UnicodeBlock PRIVATE_USE_AREA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PRIVATE_USE_AREA_ID = 78;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PRIVATE_USE_ID = 78;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5353 */     public static final UnicodeBlock PSALTER_PAHLAVI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PSALTER_PAHLAVI_ID = 246;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5363 */     public static final UnicodeBlock REJANG = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int REJANG_ID = 163;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5373 */     public static final UnicodeBlock RUMI_NUMERAL_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int RUMI_NUMERAL_SYMBOLS_ID = 192;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5383 */     public static final UnicodeBlock RUNIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int RUNIC_ID = 35;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5393 */     public static final UnicodeBlock SAMARITAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SAMARITAN_ID = 172;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5403 */     public static final UnicodeBlock SAURASHTRA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SAURASHTRA_ID = 161;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5413 */     public static final UnicodeBlock SHARADA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SHARADA_ID = 217;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5423 */     public static final UnicodeBlock SHAVIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SHAVIAN_ID = 121;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5433 */     public static final UnicodeBlock SHORTHAND_FORMAT_CONTROLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SHORTHAND_FORMAT_CONTROLS_ID = 247;
/*      */ 
/*      */ 
/*      */     
/* 5442 */     public static final UnicodeBlock SIDDHAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SIDDHAM_ID = 248;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5452 */     public static final UnicodeBlock SINHALA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5457 */     public static final UnicodeBlock SINHALA_ARCHAIC_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SINHALA_ARCHAIC_NUMBERS_ID = 249;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SINHALA_ID = 24;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5472 */     public static final UnicodeBlock SMALL_FORM_VARIANTS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SMALL_FORM_VARIANTS_ID = 84;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5482 */     public static final UnicodeBlock SORA_SOMPENG = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SORA_SOMPENG_ID = 218;
/*      */ 
/*      */ 
/*      */     
/* 5491 */     public static final UnicodeBlock SOYOMBO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SOYOMBO_ID = 278;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5501 */     public static final UnicodeBlock SPACING_MODIFIER_LETTERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SPACING_MODIFIER_LETTERS_ID = 6;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5512 */     public static final UnicodeBlock SPECIALS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SPECIALS_ID = 86;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5523 */     public static final UnicodeBlock SUNDANESE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUNDANESE_ID = 155;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5533 */     public static final UnicodeBlock SUNDANESE_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUNDANESE_SUPPLEMENT_ID = 219;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5543 */     public static final UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPERSCRIPTS_AND_SUBSCRIPTS_ID = 41;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5554 */     public static final UnicodeBlock SUPPLEMENTAL_ARROWS_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_ARROWS_A_ID = 103;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5565 */     public static final UnicodeBlock SUPPLEMENTAL_ARROWS_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_ARROWS_B_ID = 104;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5575 */     public static final UnicodeBlock SUPPLEMENTAL_ARROWS_C = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_ARROWS_C_ID = 250;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5585 */     public static final UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_MATHEMATICAL_OPERATORS_ID = 106;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5596 */     public static final UnicodeBlock SUPPLEMENTAL_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_PUNCTUATION_ID = 142;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5606 */     public static final UnicodeBlock SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS_ID = 261;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5616 */     public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_A_ID = 109;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5627 */     public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_B_ID = 110;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5637 */     public static final UnicodeBlock SUTTON_SIGNWRITING = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUTTON_SIGNWRITING_ID = 262;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5647 */     public static final UnicodeBlock SYLOTI_NAGRI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SYLOTI_NAGRI_ID = 143;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5658 */     public static final UnicodeBlock SYRIAC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SYRIAC_ID = 13;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5668 */     public static final UnicodeBlock SYRIAC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SYRIAC_SUPPLEMENT_ID = 279;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5678 */     public static final UnicodeBlock TAGALOG = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAGALOG_ID = 98;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5689 */     public static final UnicodeBlock TAGBANWA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAGBANWA_ID = 101;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5700 */     public static final UnicodeBlock TAGS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAGS_ID = 96;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5711 */     public static final UnicodeBlock TAI_LE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAI_LE_ID = 112;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5721 */     public static final UnicodeBlock TAI_THAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAI_THAM_ID = 174;
/*      */ 
/*      */ 
/*      */     
/* 5730 */     public static final UnicodeBlock TAI_VIET = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAI_VIET_ID = 183;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5740 */     public static final UnicodeBlock TAI_XUAN_JING_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAI_XUAN_JING_SYMBOLS_ID = 124;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5750 */     public static final UnicodeBlock TAKRI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAKRI_ID = 220;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5760 */     public static final UnicodeBlock TAMIL = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAMIL_ID = 20;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5770 */     public static final UnicodeBlock TANGUT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5775 */     public static final UnicodeBlock TANGUT_COMPONENTS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TANGUT_COMPONENTS_ID = 273;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TANGUT_ID = 272;
/*      */ 
/*      */ 
/*      */     
/* 5789 */     public static final UnicodeBlock TELUGU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TELUGU_ID = 21;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5800 */     public static final UnicodeBlock THAANA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int THAANA_ID = 14;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5811 */     public static final UnicodeBlock THAI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int THAI_ID = 25;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5822 */     public static final UnicodeBlock TIBETAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TIBETAN_ID = 27;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5833 */     public static final UnicodeBlock TIFINAGH = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TIFINAGH_ID = 144;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5843 */     public static final UnicodeBlock TIRHUTA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TIRHUTA_ID = 251;
/*      */ 
/*      */ 
/*      */     
/* 5852 */     public static final UnicodeBlock TRANSPORT_AND_MAP_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TRANSPORT_AND_MAP_SYMBOLS_ID = 207;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5862 */     public static final UnicodeBlock UGARITIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int UGARITIC_ID = 120;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5873 */     public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5878 */     public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_ID = 173;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_ID = 33;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5893 */     public static final UnicodeBlock VAI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VAI_ID = 159;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5904 */     public static final UnicodeBlock VARIATION_SELECTORS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VARIATION_SELECTORS_ID = 108;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5915 */     public static final UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VARIATION_SELECTORS_SUPPLEMENT_ID = 125;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5925 */     public static final UnicodeBlock VEDIC_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VEDIC_EXTENSIONS_ID = 175;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5935 */     public static final UnicodeBlock VERTICAL_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VERTICAL_FORMS_ID = 145;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5945 */     public static final UnicodeBlock WARANG_CITI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int WARANG_CITI_ID = 252;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5955 */     public static final UnicodeBlock YIJING_HEXAGRAM_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int YIJING_HEXAGRAM_SYMBOLS_ID = 116;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5966 */     public static final UnicodeBlock YI_RADICALS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int YI_RADICALS_ID = 73;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5977 */     public static final UnicodeBlock YI_SYLLABLES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int YI_SYLLABLES_ID = 72;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5987 */     public static final UnicodeBlock ZANABAZAR_SQUARE = null;
/*      */     public static final int ZANABAZAR_SQUARE_ID = 280;
/*      */   }
/*      */   
/*      */   public static interface SentenceBreak {
/*      */     public static final int ATERM = 1;
/*      */     public static final int CLOSE = 2;
/*      */     public static final int CR = 11;
/*      */     public static final int EXTEND = 12;
/*      */     public static final int FORMAT = 3;
/*      */     public static final int LF = 13;
/*      */     public static final int LOWER = 4;
/*      */     public static final int NUMERIC = 5;
/*      */     public static final int OLETTER = 6;
/*      */     public static final int OTHER = 0;
/*      */     public static final int SCONTINUE = 14;
/*      */     public static final int SEP = 7;
/*      */     public static final int SP = 8;
/*      */     public static final int STERM = 9;
/*      */     public static final int UPPER = 10;
/*      */   }
/*      */   
/*      */   public static interface NumericType {
/*      */     public static final int DECIMAL = 1;
/*      */     public static final int DIGIT = 2;
/*      */     public static final int NONE = 0;
/*      */     public static final int NUMERIC = 3;
/*      */   }
/*      */   
/*      */   public static interface LineBreak {
/*      */     public static final int ALPHABETIC = 2;
/*      */     public static final int AMBIGUOUS = 1;
/*      */     public static final int BREAK_AFTER = 4;
/*      */     public static final int BREAK_BEFORE = 5;
/*      */     public static final int BREAK_BOTH = 3;
/*      */     public static final int BREAK_SYMBOLS = 27;
/*      */     public static final int CARRIAGE_RETURN = 10;
/*      */     public static final int CLOSE_PARENTHESIS = 36;
/*      */     public static final int CLOSE_PUNCTUATION = 8;
/*      */     public static final int COMBINING_MARK = 9;
/*      */     public static final int COMPLEX_CONTEXT = 24;
/*      */     public static final int CONDITIONAL_JAPANESE_STARTER = 37;
/*      */     public static final int CONTINGENT_BREAK = 7;
/*      */     public static final int EXCLAMATION = 11;
/*      */     public static final int E_BASE = 40;
/*      */     public static final int E_MODIFIER = 41;
/*      */     public static final int GLUE = 12;
/*      */     public static final int H2 = 31;
/*      */     public static final int H3 = 32;
/*      */     public static final int HEBREW_LETTER = 38;
/*      */     public static final int HYPHEN = 13;
/*      */     public static final int IDEOGRAPHIC = 14;
/*      */     public static final int INFIX_NUMERIC = 16;
/*      */     public static final int INSEPARABLE = 15;
/*      */     public static final int INSEPERABLE = 15;
/*      */     public static final int JL = 33;
/*      */     public static final int JT = 34;
/*      */     public static final int JV = 35;
/*      */     public static final int LINE_FEED = 17;
/*      */     public static final int MANDATORY_BREAK = 6;
/*      */     public static final int NEXT_LINE = 29;
/*      */     public static final int NONSTARTER = 18;
/*      */     public static final int NUMERIC = 19;
/*      */     public static final int OPEN_PUNCTUATION = 20;
/*      */     public static final int POSTFIX_NUMERIC = 21;
/*      */     public static final int PREFIX_NUMERIC = 22;
/*      */     public static final int QUOTATION = 23;
/*      */     public static final int REGIONAL_INDICATOR = 39;
/*      */     public static final int SPACE = 26;
/*      */     public static final int SURROGATE = 25;
/*      */     public static final int UNKNOWN = 0;
/*      */     public static final int WORD_JOINER = 30;
/*      */     public static final int ZWJ = 42;
/*      */     public static final int ZWSPACE = 28;
/*      */   }
/*      */   
/*      */   public static interface JoiningType {
/*      */     public static final int DUAL_JOINING = 2;
/*      */     public static final int JOIN_CAUSING = 1;
/*      */     public static final int LEFT_JOINING = 3;
/*      */     public static final int NON_JOINING = 0;
/*      */     public static final int RIGHT_JOINING = 4;
/*      */     public static final int TRANSPARENT = 5;
/*      */   }
/*      */   
/*      */   public static interface JoiningGroup {
/*      */     public static final int AFRICAN_FEH = 86;
/*      */     public static final int AFRICAN_NOON = 87;
/*      */     public static final int AFRICAN_QAF = 88;
/*      */     public static final int AIN = 1;
/*      */     public static final int ALAPH = 2;
/*      */     public static final int ALEF = 3;
/*      */     public static final int BEH = 4;
/*      */     public static final int BETH = 5;
/*      */     public static final int BURUSHASKI_YEH_BARREE = 54;
/*      */     public static final int DAL = 6;
/*      */     public static final int DALATH_RISH = 7;
/*      */     public static final int E = 8;
/*      */     public static final int FARSI_YEH = 55;
/*      */     public static final int FE = 51;
/*      */     public static final int FEH = 9;
/*      */     public static final int FINAL_SEMKATH = 10;
/*      */     public static final int GAF = 11;
/*      */     public static final int GAMAL = 12;
/*      */     public static final int HAH = 13;
/*      */     public static final int HAMZA_ON_HEH_GOAL = 14;
/*      */     public static final int HE = 15;
/*      */     public static final int HEH = 16;
/*      */     public static final int HEH_GOAL = 17;
/*      */     public static final int HETH = 18;
/*      */     public static final int KAF = 19;
/*      */     public static final int KAPH = 20;
/*      */     public static final int KHAPH = 52;
/*      */     public static final int KNOTTED_HEH = 21;
/*      */     public static final int LAM = 22;
/*      */     public static final int LAMADH = 23;
/*      */     public static final int MALAYALAM_BHA = 89;
/*      */     public static final int MALAYALAM_JA = 90;
/*      */     public static final int MALAYALAM_LLA = 91;
/*      */     public static final int MALAYALAM_LLLA = 92;
/*      */     public static final int MALAYALAM_NGA = 93;
/*      */     public static final int MALAYALAM_NNA = 94;
/*      */     public static final int MALAYALAM_NNNA = 95;
/*      */     public static final int MALAYALAM_NYA = 96;
/*      */     public static final int MALAYALAM_RA = 97;
/*      */     public static final int MALAYALAM_SSA = 98;
/*      */     public static final int MALAYALAM_TTA = 99;
/*      */     public static final int MANICHAEAN_ALEPH = 58;
/*      */     public static final int MANICHAEAN_AYIN = 59;
/*      */     public static final int MANICHAEAN_BETH = 60;
/*      */     public static final int MANICHAEAN_DALETH = 61;
/*      */     public static final int MANICHAEAN_DHAMEDH = 62;
/*      */     public static final int MANICHAEAN_FIVE = 63;
/*      */     public static final int MANICHAEAN_GIMEL = 64;
/*      */     public static final int MANICHAEAN_HETH = 65;
/*      */     public static final int MANICHAEAN_HUNDRED = 66;
/*      */     public static final int MANICHAEAN_KAPH = 67;
/*      */     public static final int MANICHAEAN_LAMEDH = 68;
/*      */     public static final int MANICHAEAN_MEM = 69;
/*      */     public static final int MANICHAEAN_NUN = 70;
/*      */     public static final int MANICHAEAN_ONE = 71;
/*      */     public static final int MANICHAEAN_PE = 72;
/*      */     public static final int MANICHAEAN_QOPH = 73;
/*      */     public static final int MANICHAEAN_RESH = 74;
/*      */     public static final int MANICHAEAN_SADHE = 75;
/*      */     public static final int MANICHAEAN_SAMEKH = 76;
/*      */     public static final int MANICHAEAN_TAW = 77;
/*      */     public static final int MANICHAEAN_TEN = 78;
/*      */     public static final int MANICHAEAN_TETH = 79;
/*      */     public static final int MANICHAEAN_THAMEDH = 80;
/*      */     public static final int MANICHAEAN_TWENTY = 81;
/*      */     public static final int MANICHAEAN_WAW = 82;
/*      */     public static final int MANICHAEAN_YODH = 83;
/*      */     public static final int MANICHAEAN_ZAYIN = 84;
/*      */     public static final int MEEM = 24;
/*      */     public static final int MIM = 25;
/*      */     public static final int NOON = 26;
/*      */     public static final int NO_JOINING_GROUP = 0;
/*      */     public static final int NUN = 27;
/*      */     public static final int NYA = 56;
/*      */     public static final int PE = 28;
/*      */     public static final int QAF = 29;
/*      */     public static final int QAPH = 30;
/*      */     public static final int REH = 31;
/*      */     public static final int REVERSED_PE = 32;
/*      */     public static final int ROHINGYA_YEH = 57;
/*      */     public static final int SAD = 33;
/*      */     public static final int SADHE = 34;
/*      */     public static final int SEEN = 35;
/*      */     public static final int SEMKATH = 36;
/*      */     public static final int SHIN = 37;
/*      */     public static final int STRAIGHT_WAW = 85;
/*      */     public static final int SWASH_KAF = 38;
/*      */     public static final int SYRIAC_WAW = 39;
/*      */     public static final int TAH = 40;
/*      */     public static final int TAW = 41;
/*      */     public static final int TEH_MARBUTA = 42;
/*      */     public static final int TEH_MARBUTA_GOAL = 14;
/*      */     public static final int TETH = 43;
/*      */     public static final int WAW = 44;
/*      */     public static final int YEH = 45;
/*      */     public static final int YEH_BARREE = 46;
/*      */     public static final int YEH_WITH_TAIL = 47;
/*      */     public static final int YUDH = 48;
/*      */     public static final int YUDH_HE = 49;
/*      */     public static final int ZAIN = 50;
/*      */     public static final int ZHAIN = 53;
/*      */   }
/*      */   
/*      */   public static interface HangulSyllableType {
/*      */     public static final int LEADING_JAMO = 1;
/*      */     public static final int LVT_SYLLABLE = 5;
/*      */     public static final int LV_SYLLABLE = 4;
/*      */     public static final int NOT_APPLICABLE = 0;
/*      */     public static final int TRAILING_JAMO = 3;
/*      */     public static final int VOWEL_JAMO = 2;
/*      */   }
/*      */   
/*      */   public static interface GraphemeClusterBreak {
/*      */     public static final int CONTROL = 1;
/*      */     public static final int CR = 2;
/*      */     public static final int EXTEND = 3;
/*      */     public static final int E_BASE = 13;
/*      */     public static final int E_BASE_GAZ = 14;
/*      */     public static final int E_MODIFIER = 15;
/*      */     public static final int GLUE_AFTER_ZWJ = 16;
/*      */     public static final int L = 4;
/*      */     public static final int LF = 5;
/*      */     public static final int LV = 6;
/*      */     public static final int LVT = 7;
/*      */     public static final int OTHER = 0;
/*      */     public static final int PREPEND = 11;
/*      */     public static final int REGIONAL_INDICATOR = 12;
/*      */     public static final int SPACING_MARK = 10;
/*      */     public static final int T = 8;
/*      */     public static final int V = 9;
/*      */     public static final int ZWJ = 17;
/*      */   }
/*      */   
/*      */   public static interface EastAsianWidth {
/*      */     public static final int AMBIGUOUS = 1;
/*      */     public static final int FULLWIDTH = 3;
/*      */     public static final int HALFWIDTH = 2;
/*      */     public static final int NARROW = 4;
/*      */     public static final int NEUTRAL = 0;
/*      */     public static final int WIDE = 5;
/*      */   }
/*      */   
/*      */   public static interface DecompositionType {
/*      */     public static final int CANONICAL = 1;
/*      */     public static final int CIRCLE = 3;
/*      */     public static final int COMPAT = 2;
/*      */     public static final int FINAL = 4;
/*      */     public static final int FONT = 5;
/*      */     public static final int FRACTION = 6;
/*      */     public static final int INITIAL = 7;
/*      */     public static final int ISOLATED = 8;
/*      */     public static final int MEDIAL = 9;
/*      */     public static final int NARROW = 10;
/*      */     public static final int NOBREAK = 11;
/*      */     public static final int NONE = 0;
/*      */     public static final int SMALL = 12;
/*      */     public static final int SQUARE = 13;
/*      */     public static final int SUB = 14;
/*      */     public static final int SUPER = 15;
/*      */     public static final int VERTICAL = 16;
/*      */     public static final int WIDE = 17;
/*      */   }
/*      */   
/*      */   public static interface BidiPairedBracketType {
/*      */     public static final int CLOSE = 2;
/*      */     public static final int NONE = 0;
/*      */     public static final int OPEN = 1;
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\icu\lang\UCharacter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */