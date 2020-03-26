/*    */ package android.text.style;
/*    */ 
/*    */ import android.text.TextPaint;
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
/*    */ public abstract class CharacterStyle
/*    */ {
/*    */   public CharacterStyle() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract void updateDrawState(TextPaint paramTextPaint);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static CharacterStyle wrap(CharacterStyle cs) {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public CharacterStyle getUnderlying() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\CharacterStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */