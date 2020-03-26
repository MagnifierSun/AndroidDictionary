/*     */ package android.graphics.drawable;
/*     */ 
/*     */ import android.content.res.ColorStateList;
/*     */ import android.content.res.Resources;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.ColorFilter;
/*     */ import android.graphics.Outline;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Shader;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.DisplayMetrics;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import org.xmlpull.v1.XmlPullParser;
/*     */ import org.xmlpull.v1.XmlPullParserException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BitmapDrawable
/*     */   extends Drawable
/*     */ {
/*     */   @Deprecated
/*     */   public BitmapDrawable() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public BitmapDrawable(Resources res) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public BitmapDrawable(Bitmap bitmap) {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BitmapDrawable(Resources res, Bitmap bitmap) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public BitmapDrawable(String filepath) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BitmapDrawable(Resources res, String filepath) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public BitmapDrawable(InputStream is) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BitmapDrawable(Resources res, InputStream is) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final Paint getPaint() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final Bitmap getBitmap() {
/* 127 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTargetDensity(Canvas canvas) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTargetDensity(DisplayMetrics metrics) {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTargetDensity(int density) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGravity() {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGravity(int gravity) {
/* 176 */     throw new RuntimeException("Stub!");
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
/*     */   public void setMipMap(boolean mipMap) {
/* 189 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean hasMipMap() {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAntiAlias(boolean aa) {
/* 212 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasAntiAlias() {
/* 222 */     throw new RuntimeException("Stub!");
/*     */   } public void setFilterBitmap(boolean filter) {
/* 224 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isFilterBitmap() {
/* 226 */     throw new RuntimeException("Stub!");
/*     */   } public void setDither(boolean dither) {
/* 228 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Shader.TileMode getTileModeX() {
/* 238 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Shader.TileMode getTileModeY() {
/* 248 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTileModeX(Shader.TileMode mode) {
/* 263 */     throw new RuntimeException("Stub!");
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
/*     */   public final void setTileModeY(Shader.TileMode mode) {
/* 278 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTileModeXY(Shader.TileMode xmode, Shader.TileMode ymode) {
/* 293 */     throw new RuntimeException("Stub!");
/*     */   } public void setAutoMirrored(boolean mirrored) {
/* 295 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean isAutoMirrored() {
/* 297 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChangingConfigurations() {
/* 303 */     throw new RuntimeException("Stub!");
/*     */   } protected void onBoundsChange(Rect bounds) {
/* 305 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/* 307 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void getOutline(@RecentlyNonNull Outline outline) {
/* 313 */     throw new RuntimeException("Stub!");
/*     */   } public void setAlpha(int alpha) {
/* 315 */     throw new RuntimeException("Stub!");
/*     */   } public int getAlpha() {
/* 317 */     throw new RuntimeException("Stub!");
/*     */   } public void setColorFilter(ColorFilter colorFilter) {
/* 319 */     throw new RuntimeException("Stub!");
/*     */   } public ColorFilter getColorFilter() {
/* 321 */     throw new RuntimeException("Stub!");
/*     */   } public void setTintList(ColorStateList tint) {
/* 323 */     throw new RuntimeException("Stub!");
/*     */   } public void setTintMode(PorterDuff.Mode tintMode) {
/* 325 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable mutate() {
/* 334 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onStateChange(int[] stateSet) {
/* 336 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStateful() {
/* 338 */     throw new RuntimeException("Stub!");
/*     */   } public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws IOException, XmlPullParserException {
/* 340 */     throw new RuntimeException("Stub!");
/*     */   } public void applyTheme(Resources.Theme t) {
/* 342 */     throw new RuntimeException("Stub!");
/*     */   } public boolean canApplyTheme() {
/* 344 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicWidth() {
/* 346 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicHeight() {
/* 348 */     throw new RuntimeException("Stub!");
/*     */   } public int getOpacity() {
/* 350 */     throw new RuntimeException("Stub!");
/*     */   } public final Drawable.ConstantState getConstantState() {
/* 352 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\drawable\BitmapDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */