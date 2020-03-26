/*    */ package android.text.style;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface TabStopSpan
/*    */   extends ParagraphStyle
/*    */ {
/*    */   int getTabStop();
/*    */   
/*    */   public static class Standard
/*    */     implements TabStopSpan
/*    */   {
/*    */     public Standard(int offset) {
/* 63 */       throw new RuntimeException("Stub!");
/*    */     } public int getTabStop() {
/* 65 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\TabStopSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */