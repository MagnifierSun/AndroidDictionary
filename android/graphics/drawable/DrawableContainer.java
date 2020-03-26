/*     */ package android.graphics.drawable;
/*     */ 
/*     */ import android.content.res.ColorStateList;
/*     */ import android.content.res.Resources;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.ColorFilter;
/*     */ import android.graphics.Outline;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.Rect;
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
/*     */ public class DrawableContainer
/*     */   extends Drawable
/*     */   implements Drawable.Callback
/*     */ {
/*     */   public DrawableContainer() {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChangingConfigurations() {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   } public boolean getPadding(Rect padding) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void getOutline(@RecentlyNonNull Outline outline) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   } public void setAlpha(int alpha) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public int getAlpha() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } public void setDither(boolean dither) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public void setColorFilter(ColorFilter colorFilter) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public void setTintList(ColorStateList tint) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public void setTintMode(PorterDuff.Mode tintMode) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnterFadeDuration(int ms) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExitFadeDuration(int ms) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   } protected void onBoundsChange(Rect bounds) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStateful() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   } public void setAutoMirrored(boolean mirrored) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAutoMirrored() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   } public void jumpToCurrentState() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   } public void setHotspot(float x, float y) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public void setHotspotBounds(int left, int top, int right, int bottom) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public void getHotspotBounds(Rect outRect) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onStateChange(int[] state) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onLevelChange(int level) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onLayoutDirectionChanged(int layoutDirection) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicWidth() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicHeight() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   } public int getMinimumWidth() {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   } public int getMinimumHeight() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void invalidateDrawable(@RecentlyNonNull Drawable who) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void scheduleDrawable(@RecentlyNonNull Drawable who, @RecentlyNonNull Runnable what, long when) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unscheduleDrawable(@RecentlyNonNull Drawable who, @RecentlyNonNull Runnable what) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   } public boolean setVisible(boolean visible, boolean restart) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public int getOpacity() {
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
/*     */   public boolean selectDrawable(int index) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable getCurrent() {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   } public void applyTheme(Resources.Theme theme) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   } public boolean canApplyTheme() {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable.ConstantState getConstantState() {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable mutate() {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   } protected void setConstantState(DrawableContainerState state) {
/* 161 */     throw new RuntimeException("Stub!");
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
/*     */   public static abstract class DrawableContainerState
/*     */     extends Drawable.ConstantState
/*     */   {
/*     */     DrawableContainerState(DrawableContainerState orig, DrawableContainer owner, Resources res) {
/* 176 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int getChangingConfigurations() {
/* 182 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int addChild(Drawable dr) {
/* 191 */       throw new RuntimeException("Stub!");
/*     */     } public final int getChildCount() {
/* 193 */       throw new RuntimeException("Stub!");
/*     */     } public final Drawable[] getChildren() {
/* 195 */       throw new RuntimeException("Stub!");
/*     */     } public final Drawable getChild(int index) {
/* 197 */       throw new RuntimeException("Stub!");
/*     */     } public boolean canApplyTheme() {
/* 199 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void setVariablePadding(boolean variable) {
/* 207 */       throw new RuntimeException("Stub!");
/*     */     } public final Rect getConstantPadding() {
/* 209 */       throw new RuntimeException("Stub!");
/*     */     } public final void setConstantSize(boolean constant) {
/* 211 */       throw new RuntimeException("Stub!");
/*     */     } public final boolean isConstantSize() {
/* 213 */       throw new RuntimeException("Stub!");
/*     */     } public final int getConstantWidth() {
/* 215 */       throw new RuntimeException("Stub!");
/*     */     } public final int getConstantHeight() {
/* 217 */       throw new RuntimeException("Stub!");
/*     */     } public final int getConstantMinimumWidth() {
/* 219 */       throw new RuntimeException("Stub!");
/*     */     } public final int getConstantMinimumHeight() {
/* 221 */       throw new RuntimeException("Stub!");
/*     */     } protected void computeConstantSize() {
/* 223 */       throw new RuntimeException("Stub!");
/*     */     } public final void setEnterFadeDuration(int duration) {
/* 225 */       throw new RuntimeException("Stub!");
/*     */     } public final int getEnterFadeDuration() {
/* 227 */       throw new RuntimeException("Stub!");
/*     */     } public final void setExitFadeDuration(int duration) {
/* 229 */       throw new RuntimeException("Stub!");
/*     */     } public final int getExitFadeDuration() {
/* 231 */       throw new RuntimeException("Stub!");
/*     */     } public final int getOpacity() {
/* 233 */       throw new RuntimeException("Stub!");
/*     */     } public final boolean isStateful() {
/* 235 */       throw new RuntimeException("Stub!");
/*     */     } public void growArray(int oldSize, int newSize) {
/* 237 */       throw new RuntimeException("Stub!");
/*     */     } public synchronized boolean canConstantState() {
/* 239 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\drawable\DrawableContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */