/*     */ package android.view;
/*     */ 
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.SurfaceTexture;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Surface
/*     */   implements Parcelable
/*     */ {
/*     */   public Surface(SurfaceTexture surfaceTexture) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void release() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValid() {
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
/*     */ 
/*     */ 
/*     */   
/*     */   public Canvas lockCanvas(Rect inOutDirty) throws IllegalArgumentException, OutOfResourcesException {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unlockCanvasAndPost(Canvas canvas) {
/* 111 */     throw new RuntimeException("Stub!");
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
/*     */   public Canvas lockHardwareCanvas() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void unlockCanvas(Canvas canvas) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public void readFromParcel(Parcel source) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 149 */   public static final Parcelable.Creator<Surface> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ROTATION_0 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ROTATION_180 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ROTATION_270 = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ROTATION_90 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class OutOfResourcesException
/*     */     extends RuntimeException
/*     */   {
/*     */     public OutOfResourcesException() {
/* 182 */       throw new RuntimeException("Stub!");
/*     */     } public OutOfResourcesException(String name) {
/* 184 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\Surface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */