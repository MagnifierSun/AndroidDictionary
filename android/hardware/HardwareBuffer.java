/*     */ package android.hardware;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class HardwareBuffer
/*     */   implements Parcelable, AutoCloseable
/*     */ {
/*     */   public static final int BLOB = 33;
/*     */   
/*     */   HardwareBuffer(long nativeObject) {
/*  40 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public static HardwareBuffer create(int width, int height, int format, int layers, long usage) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWidth() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getHeight() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFormat() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLayers() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getUsage() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
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
/*     */   public boolean isClosed() {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 121 */     throw new RuntimeException("Stub!");
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
/*     */   public void writeToParcel(Parcel dest, int flags) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 141 */   public static final Parcelable.Creator<HardwareBuffer> CREATOR = null;
/*     */   public static final int DS_24UI8 = 50;
/*     */   public static final int DS_FP32UI8 = 52;
/*     */   public static final int D_16 = 48;
/*     */   public static final int D_24 = 49;
/*     */   public static final int D_FP32 = 51;
/*     */   public static final int RGBA_1010102 = 43;
/*     */   public static final int RGBA_8888 = 1;
/*     */   public static final int RGBA_FP16 = 22;
/*     */   public static final int RGBX_8888 = 2;
/*     */   public static final int RGB_565 = 4;
/*     */   public static final int RGB_888 = 3;
/*     */   public static final int S_UI8 = 53;
/*     */   public static final long USAGE_CPU_READ_OFTEN = 3L;
/*     */   public static final long USAGE_CPU_READ_RARELY = 2L;
/*     */   public static final long USAGE_CPU_WRITE_OFTEN = 48L;
/*     */   public static final long USAGE_CPU_WRITE_RARELY = 32L;
/*     */   public static final long USAGE_GPU_COLOR_OUTPUT = 512L;
/*     */   public static final long USAGE_GPU_CUBE_MAP = 33554432L;
/*     */   public static final long USAGE_GPU_DATA_BUFFER = 16777216L;
/*     */   public static final long USAGE_GPU_MIPMAP_COMPLETE = 67108864L;
/*     */   public static final long USAGE_GPU_SAMPLED_IMAGE = 256L;
/*     */   public static final long USAGE_PROTECTED_CONTENT = 16384L;
/*     */   public static final long USAGE_SENSOR_DIRECT_DATA = 8388608L;
/*     */   public static final long USAGE_VIDEO_ENCODE = 65536L;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\hardware\HardwareBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */