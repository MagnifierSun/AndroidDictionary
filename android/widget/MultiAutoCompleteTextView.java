/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.util.AttributeSet;
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
/*     */ public class MultiAutoCompleteTextView
/*     */   extends AutoCompleteTextView
/*     */ {
/*     */   public MultiAutoCompleteTextView(Context context) {
/*  54 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public MultiAutoCompleteTextView(Context context, AttributeSet attrs) {
/*  56 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public MultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  58 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public MultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  60 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTokenizer(Tokenizer t) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void performFiltering(CharSequence text, int keyCode) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean enoughToFilter() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void performValidation() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void performFiltering(CharSequence text, int start, int end, int keyCode) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   protected void replaceText(CharSequence text) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public static interface Tokenizer { int findTokenStart(CharSequence param1CharSequence, int param1Int); int findTokenEnd(CharSequence param1CharSequence, int param1Int); CharSequence terminateToken(CharSequence param1CharSequence); } public CharSequence getAccessibilityClassName() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class CommaTokenizer
/*     */     implements Tokenizer
/*     */   {
/*     */     public CommaTokenizer() {
/* 129 */       throw new RuntimeException("Stub!");
/*     */     } public int findTokenStart(CharSequence text, int cursor) {
/* 131 */       throw new RuntimeException("Stub!");
/*     */     } public int findTokenEnd(CharSequence text, int cursor) {
/* 133 */       throw new RuntimeException("Stub!");
/*     */     } public CharSequence terminateToken(CharSequence text) {
/* 135 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\MultiAutoCompleteTextView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */