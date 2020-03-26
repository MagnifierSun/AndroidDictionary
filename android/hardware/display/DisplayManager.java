/*     */ package android.hardware.display;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Handler;
/*     */ import android.view.Display;
/*     */ import android.view.Surface;
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
/*     */ 
/*     */ public final class DisplayManager
/*     */ {
/*     */   public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
/*     */   public static final int VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR = 16;
/*     */   public static final int VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY = 8;
/*     */   public static final int VIRTUAL_DISPLAY_FLAG_PRESENTATION = 2;
/*     */   public static final int VIRTUAL_DISPLAY_FLAG_PUBLIC = 1;
/*     */   public static final int VIRTUAL_DISPLAY_FLAG_SECURE = 4;
/*     */   
/*     */   DisplayManager(Context context) {
/*  37 */     throw new RuntimeException("Stub!");
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
/*     */   public Display getDisplay(int displayId) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Display[] getDisplays() {
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
/*     */   public Display[] getDisplays(String category) {
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
/*     */   public void registerDisplayListener(DisplayListener listener, Handler handler) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unregisterDisplayListener(DisplayListener listener) {
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
/*     */   public VirtualDisplay createVirtualDisplay(@RecentlyNonNull String name, int width, int height, int densityDpi, @RecentlyNullable Surface surface, int flags) {
/* 112 */     throw new RuntimeException("Stub!");
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
/*     */   public VirtualDisplay createVirtualDisplay(@RecentlyNonNull String name, int width, int height, int densityDpi, @RecentlyNullable Surface surface, int flags, @RecentlyNullable VirtualDisplay.Callback callback, @RecentlyNullable Handler handler) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface DisplayListener {
/*     */     void onDisplayAdded(int param1Int);
/*     */     
/*     */     void onDisplayRemoved(int param1Int);
/*     */     
/*     */     void onDisplayChanged(int param1Int);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\hardware\display\DisplayManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */