/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.InputFilter;
/*    */ import android.text.Spannable;
/*    */ import android.text.Spanned;
/*    */ import android.view.KeyEvent;
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
/*    */ public abstract class NumberKeyListener
/*    */   extends BaseKeyListener
/*    */   implements InputFilter
/*    */ {
/*    */   public NumberKeyListener() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   protected abstract char[] getAcceptedChars();
/*    */ 
/*    */   
/*    */   protected int lookup(KeyEvent event, Spannable content) {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   } protected static boolean ok(char[] accept, char c) {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   } public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\method\NumberKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */