/*     */ package android.content.res;
/*     */ 
/*     */ import android.os.LocaleList;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Configuration
/*     */   implements Parcelable, Comparable<Configuration>
/*     */ {
/*     */   public static final int COLOR_MODE_HDR_MASK = 12;
/*     */   public static final int COLOR_MODE_HDR_NO = 4;
/*     */   public static final int COLOR_MODE_HDR_SHIFT = 2;
/*     */   public static final int COLOR_MODE_HDR_UNDEFINED = 0;
/*     */   public static final int COLOR_MODE_HDR_YES = 8;
/*     */   public static final int COLOR_MODE_UNDEFINED = 0;
/*     */   public static final int COLOR_MODE_WIDE_COLOR_GAMUT_MASK = 3;
/*     */   public static final int COLOR_MODE_WIDE_COLOR_GAMUT_NO = 1;
/*     */   public static final int COLOR_MODE_WIDE_COLOR_GAMUT_UNDEFINED = 0;
/*     */   public static final int COLOR_MODE_WIDE_COLOR_GAMUT_YES = 2;
/*     */   
/*     */   public Configuration() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Configuration(Configuration o) {
/*  65 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean isLayoutSizeAtLeast(int size) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTo(Configuration o) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setToDefaults() {
/*  94 */     throw new RuntimeException("Stub!");
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
/*     */   public int updateFrom(@RecentlyNonNull Configuration delta) {
/* 107 */     throw new RuntimeException("Stub!");
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
/*     */   public int diff(Configuration delta) {
/* 141 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean needNewResources(int configChanges, int interestingChanges) {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   } public void readFromParcel(Parcel source) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   } public int compareTo(Configuration that) {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Configuration that) {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object that) {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public LocaleList getLocales() {
/* 187 */     throw new RuntimeException("Stub!");
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
/*     */   public void setLocales(@RecentlyNullable LocaleList locales) {
/* 203 */     throw new RuntimeException("Stub!");
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
/*     */   public void setLocale(@RecentlyNullable Locale loc) {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLayoutDirection() {
/* 230 */     throw new RuntimeException("Stub!");
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
/*     */   public void setLayoutDirection(Locale loc) {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isScreenRound() {
/* 252 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean isScreenWideColorGamut() {
/* 266 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isScreenHdr() {
/* 274 */     throw new RuntimeException("Stub!");
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
/* 339 */   public static final Parcelable.Creator<Configuration> CREATOR = null;
/*     */   public static final int DENSITY_DPI_UNDEFINED = 0;
/*     */   public static final int HARDKEYBOARDHIDDEN_NO = 1;
/*     */   public static final int HARDKEYBOARDHIDDEN_UNDEFINED = 0;
/*     */   public static final int HARDKEYBOARDHIDDEN_YES = 2;
/*     */   public static final int KEYBOARDHIDDEN_NO = 1;
/*     */   public static final int KEYBOARDHIDDEN_UNDEFINED = 0;
/*     */   public static final int KEYBOARDHIDDEN_YES = 2;
/*     */   public static final int KEYBOARD_12KEY = 3;
/*     */   public static final int KEYBOARD_NOKEYS = 1;
/*     */   public static final int KEYBOARD_QWERTY = 2;
/*     */   public static final int KEYBOARD_UNDEFINED = 0;
/*     */   public static final int MNC_ZERO = 65535;
/*     */   public static final int NAVIGATIONHIDDEN_NO = 1;
/*     */   public static final int NAVIGATIONHIDDEN_UNDEFINED = 0;
/*     */   public static final int NAVIGATIONHIDDEN_YES = 2;
/*     */   public static final int NAVIGATION_DPAD = 2;
/*     */   public static final int NAVIGATION_NONAV = 1;
/*     */   public static final int NAVIGATION_TRACKBALL = 3;
/*     */   public static final int NAVIGATION_UNDEFINED = 0;
/*     */   public static final int NAVIGATION_WHEEL = 4;
/*     */   public static final int ORIENTATION_LANDSCAPE = 2;
/*     */   public static final int ORIENTATION_PORTRAIT = 1;
/*     */   @Deprecated
/*     */   public static final int ORIENTATION_SQUARE = 3;
/*     */   public static final int ORIENTATION_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_LTR = 64;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_MASK = 192;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_RTL = 128;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_SHIFT = 6;
/*     */   public static final int SCREENLAYOUT_LAYOUTDIR_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_LONG_MASK = 48;
/*     */   public static final int SCREENLAYOUT_LONG_NO = 16;
/*     */   public static final int SCREENLAYOUT_LONG_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_LONG_YES = 32;
/*     */   public static final int SCREENLAYOUT_ROUND_MASK = 768;
/*     */   public static final int SCREENLAYOUT_ROUND_NO = 256;
/*     */   public static final int SCREENLAYOUT_ROUND_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_ROUND_YES = 512;
/*     */   public static final int SCREENLAYOUT_SIZE_LARGE = 3;
/*     */   public static final int SCREENLAYOUT_SIZE_MASK = 15;
/*     */   public static final int SCREENLAYOUT_SIZE_NORMAL = 2;
/*     */   public static final int SCREENLAYOUT_SIZE_SMALL = 1;
/*     */   public static final int SCREENLAYOUT_SIZE_UNDEFINED = 0;
/*     */   public static final int SCREENLAYOUT_SIZE_XLARGE = 4;
/*     */   public static final int SCREENLAYOUT_UNDEFINED = 0;
/*     */   public static final int SCREEN_HEIGHT_DP_UNDEFINED = 0;
/*     */   public static final int SCREEN_WIDTH_DP_UNDEFINED = 0;
/*     */   public static final int SMALLEST_SCREEN_WIDTH_DP_UNDEFINED = 0;
/*     */   public static final int TOUCHSCREEN_FINGER = 3;
/*     */   public static final int TOUCHSCREEN_NOTOUCH = 1;
/*     */   @Deprecated
/*     */   public static final int TOUCHSCREEN_STYLUS = 2;
/*     */   public static final int TOUCHSCREEN_UNDEFINED = 0;
/*     */   public static final int UI_MODE_NIGHT_MASK = 48;
/*     */   public static final int UI_MODE_NIGHT_NO = 16;
/*     */   public static final int UI_MODE_NIGHT_UNDEFINED = 0;
/*     */   public static final int UI_MODE_NIGHT_YES = 32;
/*     */   public static final int UI_MODE_TYPE_APPLIANCE = 5;
/*     */   public static final int UI_MODE_TYPE_CAR = 3;
/*     */   public static final int UI_MODE_TYPE_DESK = 2;
/*     */   public static final int UI_MODE_TYPE_MASK = 15;
/*     */   public static final int UI_MODE_TYPE_NORMAL = 1;
/*     */   public static final int UI_MODE_TYPE_TELEVISION = 4;
/*     */   public static final int UI_MODE_TYPE_UNDEFINED = 0;
/*     */   public static final int UI_MODE_TYPE_VR_HEADSET = 7;
/*     */   public static final int UI_MODE_TYPE_WATCH = 6;
/*     */   public int colorMode;
/*     */   public int densityDpi;
/*     */   public float fontScale;
/*     */   public int hardKeyboardHidden;
/*     */   public int keyboard;
/*     */   public int keyboardHidden;
/*     */   @Deprecated
/*     */   public Locale locale;
/*     */   public int mcc;
/*     */   public int mnc;
/*     */   public int navigation;
/*     */   public int navigationHidden;
/*     */   public int orientation;
/*     */   public int screenHeightDp;
/*     */   public int screenLayout;
/*     */   public int screenWidthDp;
/*     */   public int smallestScreenWidthDp;
/*     */   public int touchscreen;
/*     */   public int uiMode;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\res\Configuration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */