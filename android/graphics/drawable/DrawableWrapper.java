/*     */ package android.graphics.drawable;
/*     */ 
/*     */ import android.content.res.ColorStateList;
/*     */ import android.content.res.Resources;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.ColorFilter;
/*     */ import android.graphics.Outline;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.Rect;
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
/*     */ public abstract class DrawableWrapper
/*     */   extends Drawable
/*     */   implements Drawable.Callback
/*     */ {
/*     */   public DrawableWrapper(@RecentlyNullable Drawable dr) {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDrawable(@RecentlyNullable Drawable dr) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Drawable getDrawable() {
/*  58 */     throw new RuntimeException("Stub!");
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
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void applyTheme(@RecentlyNonNull Resources.Theme t) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public boolean canApplyTheme() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void invalidateDrawable(@RecentlyNonNull Drawable who) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void scheduleDrawable(@RecentlyNonNull Drawable who, @RecentlyNonNull Runnable what, long when) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unscheduleDrawable(@RecentlyNonNull Drawable who, @RecentlyNonNull Runnable what) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void draw(@RecentlyNonNull Canvas canvas) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChangingConfigurations() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getPadding(@RecentlyNonNull Rect padding) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public void setHotspot(float x, float y) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public void setHotspotBounds(int left, int top, int right, int bottom) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void getHotspotBounds(@RecentlyNonNull Rect outRect) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   } public boolean setVisible(boolean visible, boolean restart) {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   } public void setAlpha(int alpha) {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   } public int getAlpha() {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColorFilter(@RecentlyNullable ColorFilter colorFilter) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public ColorFilter getColorFilter() {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTintList(@RecentlyNullable ColorStateList tint) {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTintMode(@RecentlyNullable PorterDuff.Mode tintMode) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onLayoutDirectionChanged(int layoutDirection) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   } public int getOpacity() {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStateful() {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onStateChange(int[] state) {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onLevelChange(int level) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onBoundsChange(@RecentlyNonNull Rect bounds) {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicWidth() {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicHeight() {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void getOutline(@RecentlyNonNull Outline outline) {
/* 184 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Drawable.ConstantState getConstantState() {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public Drawable mutate() {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\drawable\DrawableWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */