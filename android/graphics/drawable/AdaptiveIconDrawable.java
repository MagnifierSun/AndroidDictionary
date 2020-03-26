/*     */ package android.graphics.drawable;
/*     */ 
/*     */ import android.content.res.ColorStateList;
/*     */ import android.content.res.Resources;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.ColorFilter;
/*     */ import android.graphics.Outline;
/*     */ import android.graphics.Path;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Region;
/*     */ import android.util.AttributeSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AdaptiveIconDrawable
/*     */   extends Drawable
/*     */   implements Drawable.Callback
/*     */ {
/*     */   public AdaptiveIconDrawable(Drawable backgroundDrawable, Drawable foregroundDrawable) {
/*  56 */     throw new RuntimeException("Stub!");
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
/*     */   public void inflate(@RecentlyNonNull Resources r, @RecentlyNonNull XmlPullParser parser, @RecentlyNonNull AttributeSet attrs, @RecentlyNullable Resources.Theme theme) throws IOException, XmlPullParserException {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float getExtraInsetFraction() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Path getIconMask() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable getForeground() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable getBackground() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } protected void onBoundsChange(Rect bounds) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public void invalidateSelf() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void getOutline(@RecentlyNonNull Outline outline) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Region getTransparentRegion() {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void applyTheme(@RecentlyNonNull Resources.Theme t) {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   } public boolean canApplyTheme() {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void invalidateDrawable(@RecentlyNonNull Drawable who) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void scheduleDrawable(@RecentlyNonNull Drawable who, @RecentlyNonNull Runnable what, long when) {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unscheduleDrawable(@RecentlyNonNull Drawable who, @RecentlyNonNull Runnable what) {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChangingConfigurations() {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   } public void setHotspot(float x, float y) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } public void setHotspotBounds(int left, int top, int right, int bottom) {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   } public void getHotspotBounds(Rect outRect) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   } public boolean setVisible(boolean visible, boolean restart) {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   } public void setDither(boolean dither) {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   } public void setAlpha(int alpha) {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public int getAlpha() {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   } public void setColorFilter(ColorFilter colorFilter) {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   } public void setTintList(ColorStateList tint) {
/* 180 */     throw new RuntimeException("Stub!");
/*     */   } public void setTintMode(PorterDuff.Mode tintMode) {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   } public void setOpacity(int opacity) {
/* 184 */     throw new RuntimeException("Stub!");
/*     */   } public int getOpacity() {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   } public void setAutoMirrored(boolean mirrored) {
/* 188 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAutoMirrored() {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   } public void jumpToCurrentState() {
/* 192 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStateful() {
/* 194 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onStateChange(int[] state) {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onLevelChange(int level) {
/* 198 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicWidth() {
/* 200 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicHeight() {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable.ConstantState getConstantState() {
/* 204 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable mutate() {
/* 206 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\drawable\AdaptiveIconDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */