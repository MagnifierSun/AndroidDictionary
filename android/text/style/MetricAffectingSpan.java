/*    */ package android.text.style;
/*    */ 
/*    */ import android.text.TextPaint;
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
/*    */ public abstract class MetricAffectingSpan
/*    */   extends CharacterStyle
/*    */   implements UpdateLayout
/*    */ {
/*    */   public MetricAffectingSpan() {
/* 29 */     throw new RuntimeException("Stub!");
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public MetricAffectingSpan getUnderlying() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void updateMeasureState(@RecentlyNonNull TextPaint paramTextPaint);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\MetricAffectingSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */