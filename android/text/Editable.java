/*     */ package android.text;
/*     */ 
/*     */ import java.io.IOException;
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
/*     */ public interface Editable
/*     */   extends CharSequence, GetChars, Spannable, Appendable
/*     */ {
/*     */   Editable replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4);
/*     */   
/*     */   Editable replace(int paramInt1, int paramInt2, CharSequence paramCharSequence);
/*     */   
/*     */   Editable insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3);
/*     */   
/*     */   Editable insert(int paramInt, CharSequence paramCharSequence);
/*     */   
/*     */   Editable delete(int paramInt1, int paramInt2);
/*     */   
/*     */   Editable append(CharSequence paramCharSequence);
/*     */   
/*     */   Editable append(CharSequence paramCharSequence, int paramInt1, int paramInt2);
/*     */   
/*     */   Editable append(char paramChar);
/*     */   
/*     */   void clear();
/*     */   
/*     */   void clearSpans();
/*     */   
/*     */   void setFilters(InputFilter[] paramArrayOfInputFilter);
/*     */   
/*     */   InputFilter[] getFilters();
/*     */   
/*     */   public static class Factory
/*     */   {
/*     */     public Factory() {
/* 147 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public static Factory getInstance() {
/* 153 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Editable newEditable(CharSequence source) {
/* 161 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\Editable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */