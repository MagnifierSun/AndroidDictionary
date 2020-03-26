/*    */ package android.text.method;
/*    */ 
/*    */ import android.graphics.Rect;
/*    */ import android.view.View;
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
/*    */ public abstract class ReplacementTransformationMethod
/*    */   implements TransformationMethod
/*    */ {
/*    */   public ReplacementTransformationMethod() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected abstract char[] getOriginal();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected abstract char[] getReplacement();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public CharSequence getTransformation(CharSequence source, View v) {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   } public void onFocusChanged(View view, CharSequence sourceText, boolean focused, int direction, Rect previouslyFocusedRect) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\method\ReplacementTransformationMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */