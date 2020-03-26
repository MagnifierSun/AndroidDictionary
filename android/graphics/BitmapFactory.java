/*     */ package android.graphics;
/*     */ 
/*     */ import android.content.res.Resources;
/*     */ import android.util.TypedValue;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BitmapFactory
/*     */ {
/*     */   public BitmapFactory() {
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
/*     */   public static Bitmap decodeFile(String pathName, Options opts) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Bitmap decodeFile(String pathName) {
/*  61 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public static Bitmap decodeResourceStream(@RecentlyNullable Resources res, @RecentlyNullable TypedValue value, @RecentlyNullable InputStream is, @RecentlyNullable Rect pad, @RecentlyNullable Options opts) {
/*  80 */     throw new RuntimeException("Stub!");
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
/*     */   public static Bitmap decodeResource(Resources res, int id, Options opts) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Bitmap decodeResource(Resources res, int id) {
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
/*     */   public static Bitmap decodeByteArray(byte[] data, int offset, int length, Options opts) {
/* 132 */     throw new RuntimeException("Stub!");
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
/*     */   public static Bitmap decodeByteArray(byte[] data, int offset, int length) {
/* 144 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public static Bitmap decodeStream(@RecentlyNullable InputStream is, @RecentlyNullable Rect outPadding, @RecentlyNullable Options opts) {
/* 178 */     throw new RuntimeException("Stub!");
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
/*     */   public static Bitmap decodeStream(InputStream is) {
/* 191 */     throw new RuntimeException("Stub!");
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
/*     */   public static Bitmap decodeFileDescriptor(FileDescriptor fd, Rect outPadding, Options opts) {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Bitmap decodeFileDescriptor(FileDescriptor fd) {
/* 224 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static class Options { public Bitmap inBitmap; public int inDensity; @Deprecated
/*     */     public boolean inDither;
/*     */     @Deprecated
/*     */     public boolean inInputShareable;
/*     */     public boolean inJustDecodeBounds;
/*     */     
/*     */     public Options() {
/* 233 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     public boolean inMutable; @Deprecated
/*     */     public boolean inPreferQualityOverSpeed; public ColorSpace inPreferredColorSpace; public Bitmap.Config inPreferredConfig; public boolean inPremultiplied; @Deprecated
/*     */     public boolean inPurgeable; public int inSampleSize; public boolean inScaled; public int inScreenDensity; public int inTargetDensity; public byte[] inTempStorage;
/*     */     @Deprecated
/*     */     public boolean mCancel;
/*     */     public ColorSpace outColorSpace;
/*     */     public Bitmap.Config outConfig;
/*     */     public int outHeight;
/*     */     public String outMimeType;
/*     */     public int outWidth;
/*     */     
/*     */     @Deprecated
/*     */     public void requestCancelDecode() {
/* 248 */       throw new RuntimeException("Stub!");
/*     */     } }
/*     */ 
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\BitmapFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */