/*     */ package android.icu.util;
/*     */ 
/*     */ import android.icu.math.BigDecimal;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class UniversalTimeScale
/*     */ {
/*     */   public static final int DB2_TIME = 8;
/*     */   public static final int DOTNET_DATE_TIME = 4;
/*     */   public static final int EPOCH_OFFSET_PLUS_1_VALUE = 6;
/*     */   public static final int EPOCH_OFFSET_VALUE = 1;
/*     */   public static final int EXCEL_TIME = 7;
/*     */   public static final int FROM_MAX_VALUE = 3;
/*     */   public static final int FROM_MIN_VALUE = 2;
/*     */   public static final int ICU4C_TIME = 2;
/*     */   public static final int JAVA_TIME = 0;
/*     */   public static final int MAC_OLD_TIME = 5;
/*     */   public static final int MAC_TIME = 6;
/*     */   @Deprecated
/*     */   public static final int MAX_SCALE = 10;
/*     */   public static final int TO_MAX_VALUE = 5;
/*     */   public static final int TO_MIN_VALUE = 4;
/*     */   public static final int UNITS_VALUE = 0;
/*     */   public static final int UNIX_MICROSECONDS_TIME = 9;
/*     */   public static final int UNIX_TIME = 1;
/*     */   public static final int WINDOWS_FILE_TIME = 3;
/*     */   
/*     */   UniversalTimeScale() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long from(long otherTime, int timeScale) {
/*  69 */     throw new RuntimeException("Stub!");
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
/*     */   public static BigDecimal bigDecimalFrom(double otherTime, int timeScale) {
/*  82 */     throw new RuntimeException("Stub!");
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
/*     */   public static BigDecimal bigDecimalFrom(long otherTime, int timeScale) {
/*  95 */     throw new RuntimeException("Stub!");
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
/*     */   public static BigDecimal bigDecimalFrom(BigDecimal otherTime, int timeScale) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long toLong(long universalTime, int timeScale) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BigDecimal toBigDecimal(long universalTime, int timeScale) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BigDecimal toBigDecimal(BigDecimal universalTime, int timeScale) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getTimeScaleValue(int scale, int value) {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\ic\\util\UniversalTimeScale.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */