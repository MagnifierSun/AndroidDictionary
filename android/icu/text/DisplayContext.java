/*    */ package android.icu.text;
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
/*    */ public enum DisplayContext
/*    */ {
/* 21 */   STANDARD_NAMES, DIALECT_NAMES, CAPITALIZATION_NONE, CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE, CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE, CAPITALIZATION_FOR_UI_LIST_OR_MENU, CAPITALIZATION_FOR_STANDALONE, LENGTH_FULL, LENGTH_SHORT, SUBSTITUTE, NO_SUBSTITUTE;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Type type() {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int value() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public enum Type
/*    */   {
/* 42 */     DIALECT_HANDLING, CAPITALIZATION, DISPLAY_LENGTH, SUBSTITUTE_HANDLING;
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\icu\text\DisplayContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */