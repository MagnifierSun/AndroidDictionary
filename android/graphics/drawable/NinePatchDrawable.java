/*     */ package android.graphics.drawable;
/*     */ 
/*     */ import android.content.res.ColorStateList;
/*     */ import android.content.res.Resources;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.ColorFilter;
/*     */ import android.graphics.NinePatch;
/*     */ import android.graphics.Outline;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Region;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.DisplayMetrics;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.IOException;
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
/*     */ public class NinePatchDrawable
/*     */   extends Drawable
/*     */ {
/*     */   @Deprecated
/*     */   public NinePatchDrawable(Bitmap bitmap, byte[] chunk, Rect padding, String srcName) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NinePatchDrawable(Resources res, Bitmap bitmap, byte[] chunk, Rect padding, String srcName) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public NinePatchDrawable(@RecentlyNonNull NinePatch patch) {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NinePatchDrawable(@RecentlyNullable Resources res, @RecentlyNonNull NinePatch patch) {
/*  82 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTargetDensity(@RecentlyNonNull Canvas canvas) {
/*  96 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTargetDensity(@RecentlyNonNull DisplayMetrics metrics) {
/* 108 */     throw new RuntimeException("Stub!");
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
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChangingConfigurations() {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getPadding(@RecentlyNonNull Rect padding) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void getOutline(@RecentlyNonNull Outline outline) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   } public void setAlpha(int alpha) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   } public int getAlpha() {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColorFilter(@RecentlyNullable ColorFilter colorFilter) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTintList(@RecentlyNullable ColorStateList tint) {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTintMode(@RecentlyNullable PorterDuff.Mode tintMode) {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   } public void setDither(boolean dither) {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   } public void setAutoMirrored(boolean mirrored) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAutoMirrored() {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   } public void setFilterBitmap(boolean filter) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isFilterBitmap() {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   } public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws IOException, XmlPullParserException {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void applyTheme(@RecentlyNonNull Resources.Theme t) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   } public boolean canApplyTheme() {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public Paint getPaint() {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicWidth() {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicHeight() {
/* 191 */     throw new RuntimeException("Stub!");
/*     */   } public int getOpacity() {
/* 193 */     throw new RuntimeException("Stub!");
/*     */   } public Region getTransparentRegion() {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable.ConstantState getConstantState() {
/* 197 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable mutate() {
/* 199 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onStateChange(int[] stateSet) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStateful() {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\drawable\NinePatchDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */