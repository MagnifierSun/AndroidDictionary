/*    */ package android.text;
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
/*    */ @Deprecated
/*    */ public abstract class ClipboardManager
/*    */ {
/*    */   public ClipboardManager() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract CharSequence getText();
/*    */   
/*    */   public abstract void setText(CharSequence paramCharSequence);
/*    */   
/*    */   public abstract boolean hasText();
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\ClipboardManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */