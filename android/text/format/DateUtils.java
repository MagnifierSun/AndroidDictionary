/*     */ package android.text.format;public class DateUtils {
/*     */   @Deprecated
/*     */   public static final String ABBREV_MONTH_FORMAT = "%b";
/*     */   public static final String ABBREV_WEEKDAY_FORMAT = "%a";
/*     */   public static final long DAY_IN_MILLIS = 86400000L;
/*     */   @Deprecated
/*     */   public static final int FORMAT_12HOUR = 64;
/*     */   @Deprecated
/*     */   public static final int FORMAT_24HOUR = 128;
/*     */   public static final int FORMAT_ABBREV_ALL = 524288;
/*     */   public static final int FORMAT_ABBREV_MONTH = 65536;
/*     */   public static final int FORMAT_ABBREV_RELATIVE = 262144;
/*     */   public static final int FORMAT_ABBREV_TIME = 16384;
/*     */   public static final int FORMAT_ABBREV_WEEKDAY = 32768;
/*     */   @Deprecated
/*     */   public static final int FORMAT_CAP_AMPM = 256;
/*     */   @Deprecated
/*     */   public static final int FORMAT_CAP_MIDNIGHT = 4096;
/*     */   @Deprecated
/*     */   public static final int FORMAT_CAP_NOON = 1024;
/*     */   @Deprecated
/*     */   public static final int FORMAT_CAP_NOON_MIDNIGHT = 5120;
/*     */   public static final int FORMAT_NO_MIDNIGHT = 2048;
/*     */   public static final int FORMAT_NO_MONTH_DAY = 32;
/*     */   public static final int FORMAT_NO_NOON = 512;
/*     */   @Deprecated
/*     */   public static final int FORMAT_NO_NOON_MIDNIGHT = 2560;
/*     */   public static final int FORMAT_NO_YEAR = 8;
/*     */   public static final int FORMAT_NUMERIC_DATE = 131072;
/*     */   public static final int FORMAT_SHOW_DATE = 16;
/*     */   
/*     */   public DateUtils() {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public static final int FORMAT_SHOW_TIME = 1;
/*     */   
/*     */   public static final int FORMAT_SHOW_WEEKDAY = 2;
/*     */   
/*     */   public static final int FORMAT_SHOW_YEAR = 4;
/*     */   
/*     */   @Deprecated
/*     */   public static final int FORMAT_UTC = 8192;
/*     */   public static final long HOUR_IN_MILLIS = 3600000L;
/*     */   
/*     */   @Deprecated
/*     */   public static String getDayOfWeekString(int dayOfWeek, int abbrev) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } @Deprecated
/*     */   public static final String HOUR_MINUTE_24 = "%H:%M"; @Deprecated
/*     */   public static final int LENGTH_LONG = 10; @Deprecated
/*     */   public static final int LENGTH_MEDIUM = 20; @Deprecated
/*     */   public static final int LENGTH_SHORT = 30; @Deprecated
/*     */   public static final int LENGTH_SHORTER = 40; @Deprecated
/*     */   public static final int LENGTH_SHORTEST = 50; public static final long MINUTE_IN_MILLIS = 60000L; public static final String MONTH_DAY_FORMAT = "%-d"; public static final String MONTH_FORMAT = "%B"; public static final String NUMERIC_MONTH_FORMAT = "%m";
/*     */   @Deprecated
/*     */   public static String getAMPMString(int ampm) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public static final long SECOND_IN_MILLIS = 1000L;
/*     */   
/*     */   public static final String WEEKDAY_FORMAT = "%A";
/*     */   public static final long WEEK_IN_MILLIS = 604800000L;
/*     */   public static final String YEAR_FORMAT = "%Y";
/*     */   public static final String YEAR_FORMAT_TWO_DIGITS = "%g";
/*     */   public static final long YEAR_IN_MILLIS = 31449600000L;
/*     */   
/*     */   @Deprecated
/*     */   public static String getMonthString(int month, int abbrev) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CharSequence getRelativeTimeSpanString(long startTime) {
/*  84 */     throw new RuntimeException("Stub!");
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
/*     */   public static CharSequence getRelativeTimeSpanString(long time, long now, long minResolution) {
/*  99 */     throw new RuntimeException("Stub!");
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
/*     */   public static CharSequence getRelativeTimeSpanString(long time, long now, long minResolution, int flags) {
/* 122 */     throw new RuntimeException("Stub!");
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
/*     */   public static CharSequence getRelativeDateTimeString(Context c, long time, long minResolution, long transitionResolution, int flags) {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String formatElapsedTime(long elapsedSeconds) {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String formatElapsedTime(StringBuilder recycle, long elapsedSeconds) {
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
/*     */ 
/*     */   
/*     */   public static final CharSequence formatSameDayTime(long then, long now, int dateStyle, int timeStyle) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isToday(long when) {
/* 193 */     throw new RuntimeException("Stub!");
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
/*     */   public static String formatDateRange(Context context, long startMillis, long endMillis, int flags) {
/* 215 */     throw new RuntimeException("Stub!");
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
/*     */   public static Formatter formatDateRange(Context context, Formatter formatter, long startMillis, long endMillis, int flags) {
/* 236 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Formatter formatDateRange(Context context, Formatter formatter, long startMillis, long endMillis, int flags, String timeZone) {
/* 402 */     throw new RuntimeException("Stub!");
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
/*     */   public static String formatDateTime(Context context, long millis, int flags) {
/* 447 */     throw new RuntimeException("Stub!");
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
/*     */   public static CharSequence getRelativeTimeSpanString(Context c, long millis, boolean withPreposition) {
/* 464 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CharSequence getRelativeTimeSpanString(Context c, long millis) {
/* 474 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 628 */   public static final int[] sameMonthTable = new int[0];
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/* 633 */   public static final int[] sameYearTable = new int[0];
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\format\DateUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */