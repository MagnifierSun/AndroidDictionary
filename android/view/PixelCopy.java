/*     */ package android.view;
/*     */ 
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Rect;
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
/*     */ public final class PixelCopy
/*     */ {
/*     */   public static final int ERROR_DESTINATION_INVALID = 5;
/*     */   public static final int ERROR_SOURCE_INVALID = 4;
/*     */   public static final int ERROR_SOURCE_NO_DATA = 3;
/*     */   public static final int ERROR_TIMEOUT = 2;
/*     */   public static final int ERROR_UNKNOWN = 1;
/*     */   public static final int SUCCESS = 0;
/*     */   
/*     */   PixelCopy() {
/*  33 */     throw new RuntimeException("Stub!");
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
/*     */   public static void request(@RecentlyNonNull SurfaceView source, @RecentlyNonNull Bitmap dest, @RecentlyNonNull OnPixelCopyFinishedListener listener, @RecentlyNonNull Handler listenerThread) {
/*  57 */     throw new RuntimeException("Stub!");
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
/*     */   public static void request(@RecentlyNonNull SurfaceView source, @RecentlyNullable Rect srcRect, @RecentlyNonNull Bitmap dest, @RecentlyNonNull OnPixelCopyFinishedListener listener, @RecentlyNonNull Handler listenerThread) {
/*  85 */     throw new RuntimeException("Stub!");
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
/*     */   public static void request(@RecentlyNonNull Surface source, @RecentlyNonNull Bitmap dest, @RecentlyNonNull OnPixelCopyFinishedListener listener, @RecentlyNonNull Handler listenerThread) {
/* 109 */     throw new RuntimeException("Stub!");
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
/*     */   public static void request(@RecentlyNonNull Surface source, @RecentlyNullable Rect srcRect, @RecentlyNonNull Bitmap dest, @RecentlyNonNull OnPixelCopyFinishedListener listener, @RecentlyNonNull Handler listenerThread) {
/* 137 */     throw new RuntimeException("Stub!");
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
/*     */   public static void request(@RecentlyNonNull Window source, @RecentlyNonNull Bitmap dest, @RecentlyNonNull OnPixelCopyFinishedListener listener, @RecentlyNonNull Handler listenerThread) {
/* 170 */     throw new RuntimeException("Stub!");
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
/*     */   public static void request(@RecentlyNonNull Window source, @RecentlyNullable Rect srcRect, @RecentlyNonNull Bitmap dest, @RecentlyNonNull OnPixelCopyFinishedListener listener, @RecentlyNonNull Handler listenerThread) {
/* 207 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnPixelCopyFinishedListener {
/*     */     void onPixelCopyFinished(int param1Int);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\PixelCopy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */