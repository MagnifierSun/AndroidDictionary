/*     */ package android.provider;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.pm.PackageManager;
/*     */ import android.graphics.Typeface;
/*     */ import android.graphics.fonts.FontVariationAxis;
/*     */ import android.net.Uri;
/*     */ import android.os.CancellationSignal;
/*     */ import android.os.Handler;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FontsContract
/*     */ {
/*     */   FontsContract() {
/*  32 */     throw new RuntimeException("Stub!");
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
/*     */   public static void requestFonts(@RecentlyNonNull Context context, @RecentlyNonNull FontRequest request, @RecentlyNonNull Handler handler, @RecentlyNullable CancellationSignal cancellationSignal, @RecentlyNonNull FontRequestCallback callback) {
/*  60 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public static FontFamilyResult fetchFonts(@RecentlyNonNull Context context, @RecentlyNullable CancellationSignal cancellationSignal, @RecentlyNonNull FontRequest request) throws PackageManager.NameNotFoundException {
/*  81 */     throw new RuntimeException("Stub!");
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
/*     */   public static Typeface buildTypeface(@RecentlyNonNull Context context, @RecentlyNullable CancellationSignal cancellationSignal, @RecentlyNonNull FontInfo[] fonts) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static final class Columns
/*     */     implements BaseColumns {
/*     */     public static final String FILE_ID = "file_id";
/*     */     public static final String ITALIC = "font_italic";
/*     */     public static final String RESULT_CODE = "result_code";
/*     */     public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
/*     */     public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
/*     */     
/*     */     Columns() {
/* 111 */       throw new RuntimeException("Stub!");
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
/*     */     public static final int RESULT_CODE_MALFORMED_QUERY = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int RESULT_CODE_OK = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String TTC_INDEX = "font_ttc_index";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String VARIATION_SETTINGS = "font_variation_settings";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String WEIGHT = "font_weight";
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
/*     */   public static class FontFamilyResult
/*     */   {
/*     */     public static final int STATUS_OK = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int STATUS_REJECTED = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int STATUS_WRONG_CERTIFICATES = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     FontFamilyResult(int statusCode, FontsContract.FontInfo[] fonts) {
/* 207 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int getStatusCode() {
/* 213 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public FontsContract.FontInfo[] getFonts() {
/* 219 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class FontInfo
/*     */   {
/*     */     FontInfo(Uri uri, int ttcIndex, FontVariationAxis[] axes, int weight, boolean italic, int resultCode) {
/* 261 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Uri getUri() {
/* 269 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getTtcIndex() {
/* 277 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNullable
/*     */     public FontVariationAxis[] getAxes() {
/* 285 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getWeight() {
/* 293 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isItalic() {
/* 299 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getResultCode() {
/* 307 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static class FontRequestCallback {
/*     */     public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
/*     */     public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
/*     */     public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
/*     */     
/*     */     public FontRequestCallback() {
/* 317 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int FAIL_REASON_MALFORMED_QUERY = 3;
/*     */     public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
/*     */     public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
/*     */     
/*     */     public void onTypefaceRetrieved(Typeface typeface) {
/* 325 */       throw new RuntimeException("Stub!");
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
/*     */     public void onTypefaceRequestFailed(int reason) {
/* 341 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\provider\FontsContract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */