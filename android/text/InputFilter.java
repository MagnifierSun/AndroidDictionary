/*    */ package android.text;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import java.util.Locale;
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
/*    */ public interface InputFilter
/*    */ {
/*    */   CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4);
/*    */   
/*    */   public static class AllCaps
/*    */     implements InputFilter
/*    */   {
/*    */     public AllCaps() {
/* 59 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public AllCaps(@RecentlyNonNull Locale locale) {
/* 68 */       throw new RuntimeException("Stub!");
/*    */     } public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
/* 70 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static class LengthFilter
/*    */     implements InputFilter
/*    */   {
/*    */     public LengthFilter(int max) {
/* 81 */       throw new RuntimeException("Stub!");
/*    */     } public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
/* 83 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public int getMax() {
/* 89 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\InputFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */