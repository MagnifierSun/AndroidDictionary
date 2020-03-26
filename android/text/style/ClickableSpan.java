/*    */ package android.text.style;
/*    */ 
/*    */ import android.text.TextPaint;
/*    */ import android.view.View;
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
/*    */ public abstract class ClickableSpan
/*    */   extends CharacterStyle
/*    */   implements UpdateAppearance
/*    */ {
/*    */   public ClickableSpan() {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract void onClick(@RecentlyNonNull View paramView);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void updateDrawState(@RecentlyNonNull TextPaint ds) {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\ClickableSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */