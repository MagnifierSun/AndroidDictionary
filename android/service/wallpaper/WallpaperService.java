/*     */ package android.service.wallpaper;
/*     */ 
/*     */ import android.app.Service;
/*     */ import android.app.WallpaperColors;
/*     */ import android.content.Intent;
/*     */ import android.os.Bundle;
/*     */ import android.os.IBinder;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.SurfaceHolder;
/*     */ import android.view.WindowInsets;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.PrintWriter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class WallpaperService
/*     */   extends Service
/*     */ {
/*     */   public static final String SERVICE_INTERFACE = "android.service.wallpaper.WallpaperService";
/*     */   public static final String SERVICE_META_DATA = "android.service.wallpaper";
/*     */   
/*     */   public WallpaperService() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public void onCreate() {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public void onDestroy() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final IBinder onBind(Intent intent) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract Engine onCreateEngine();
/*     */ 
/*     */ 
/*     */   
/*     */   protected void dump(FileDescriptor fd, PrintWriter out, String[] args) {
/*  66 */     throw new RuntimeException("Stub!");
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
/*     */   public class Engine
/*     */   {
/*     */     public Engine() {
/* 100 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public SurfaceHolder getSurfaceHolder() {
/* 106 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getDesiredMinimumWidth() {
/* 114 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getDesiredMinimumHeight() {
/* 122 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isVisible() {
/* 130 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isPreview() {
/* 138 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setTouchEventsEnabled(boolean enabled) {
/* 148 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setOffsetNotificationsEnabled(boolean enabled) {
/* 159 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onCreate(SurfaceHolder surfaceHolder) {
/* 166 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onDestroy() {
/* 174 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onVisibilityChanged(boolean visible) {
/* 182 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onApplyWindowInsets(WindowInsets insets) {
/* 192 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onTouchEvent(MotionEvent event) {
/* 202 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep, int xPixelOffset, int yPixelOffset) {
/* 211 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Bundle onCommand(String action, int x, int y, int z, Bundle extras, boolean resultRequested) {
/* 231 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onDesiredSizeChanged(int desiredWidth, int desiredHeight) {
/* 238 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onSurfaceChanged(SurfaceHolder holder, int format, int width, int height) {
/* 245 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onSurfaceRedrawNeeded(SurfaceHolder holder) {
/* 252 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onSurfaceCreated(SurfaceHolder holder) {
/* 259 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onSurfaceDestroyed(SurfaceHolder holder) {
/* 266 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void notifyColorsChanged() {
/* 273 */       throw new RuntimeException("Stub!");
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
/*     */     @RecentlyNullable
/*     */     public WallpaperColors onComputeColors() {
/* 289 */       throw new RuntimeException("Stub!");
/*     */     } protected void dump(String prefix, FileDescriptor fd, PrintWriter out, String[] args) {
/* 291 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\wallpaper\WallpaperService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */