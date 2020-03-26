/*    */ package android.text.style;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.text.Layout;
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DrawableMarginSpan
/*    */   implements LeadingMarginSpan, LineHeightSpan
/*    */ {
/*    */   public DrawableMarginSpan(@RecentlyNonNull Drawable drawable) {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public DrawableMarginSpan(@RecentlyNonNull Drawable drawable, int pad) {
/* 65 */     throw new RuntimeException("Stub!");
/*    */   } public int getLeadingMargin(boolean first) {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void drawLeadingMargin(@RecentlyNonNull Canvas c, @RecentlyNonNull Paint p, int x, int dir, int top, int baseline, int bottom, @RecentlyNonNull CharSequence text, int start, int end, boolean first, @RecentlyNonNull Layout layout) {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void chooseHeight(@RecentlyNonNull CharSequence text, int start, int end, int istartv, int v, @RecentlyNonNull Paint.FontMetricsInt fm) {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\DrawableMarginSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */