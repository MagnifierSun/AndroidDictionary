/*     */ package android.graphics.drawable.shapes;
/*     */ 
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Outline;
/*     */ import android.graphics.Paint;
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
/*     */ public abstract class Shape
/*     */   implements Cloneable
/*     */ {
/*     */   public Shape() {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getWidth() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getHeight() {
/*  50 */     throw new RuntimeException("Stub!");
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
/*     */   public final void resize(float width, float height) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasAlpha() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onResize(float width, float height) {
/*  92 */     throw new RuntimeException("Stub!");
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
/*     */   public void getOutline(@RecentlyNonNull Outline outline) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public Shape clone() throws CloneNotSupportedException {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public abstract void draw(Canvas paramCanvas, Paint paramPaint);
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\drawable\shapes\Shape.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */