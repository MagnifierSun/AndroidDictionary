/*     */ package android.graphics.drawable;
/*     */ 
/*     */ import android.content.res.ColorStateList;
/*     */ import android.content.res.Resources;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.ColorFilter;
/*     */ import android.graphics.Outline;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Shader;
/*     */ import android.graphics.drawable.shapes.Shape;
/*     */ import android.util.AttributeSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ShapeDrawable
/*     */   extends Drawable
/*     */ {
/*     */   public ShapeDrawable() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ShapeDrawable(Shape s) {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Shape getShape() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShape(Shape s) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShaderFactory(ShaderFactory fact) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ShaderFactory getShaderFactory() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Paint getPaint() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPadding(int left, int top, int right, int bottom) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPadding(Rect padding) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIntrinsicWidth(int width) {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIntrinsicHeight(int height) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicWidth() {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   } public int getIntrinsicHeight() {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   } public boolean getPadding(Rect padding) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onDraw(Shape shape, Canvas canvas, Paint paint) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChangingConfigurations() {
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
/*     */   public void setAlpha(int alpha) {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   } public int getAlpha() {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public void setTintList(ColorStateList tint) {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   } public void setTintMode(PorterDuff.Mode tintMode) {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   } public void setColorFilter(ColorFilter colorFilter) {
/* 180 */     throw new RuntimeException("Stub!");
/*     */   } public int getOpacity() {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   } public void setDither(boolean dither) {
/* 184 */     throw new RuntimeException("Stub!");
/*     */   } protected void onBoundsChange(Rect bounds) {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onStateChange(int[] stateSet) {
/* 188 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStateful() {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean inflateTag(String name, Resources r, XmlPullParser parser, AttributeSet attrs) {
/* 197 */     throw new RuntimeException("Stub!");
/*     */   } public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws IOException, XmlPullParserException {
/* 199 */     throw new RuntimeException("Stub!");
/*     */   } public void applyTheme(Resources.Theme t) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   } public void getOutline(Outline outline) {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable.ConstantState getConstantState() {
/* 205 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable mutate() {
/* 207 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static abstract class ShaderFactory
/*     */   {
/*     */     public ShaderFactory() {
/* 219 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public abstract Shader resize(int param1Int1, int param1Int2);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\drawable\ShapeDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */