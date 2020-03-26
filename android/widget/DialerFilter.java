/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Rect;
/*    */ import android.text.TextWatcher;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
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
/*    */ public class DialerFilter
/*    */   extends RelativeLayout
/*    */ {
/*    */   public static final int DIGITS_AND_LETTERS = 1;
/*    */   public static final int DIGITS_AND_LETTERS_NO_DIGITS = 2;
/*    */   public static final int DIGITS_AND_LETTERS_NO_LETTERS = 3;
/*    */   public static final int DIGITS_ONLY = 4;
/*    */   public static final int LETTERS_ONLY = 5;
/*    */   
/*    */   public DialerFilter(Context context) {
/* 31 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   } public DialerFilter(Context context, AttributeSet attrs) {
/* 33 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   } protected void onFinishInflate() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   } public boolean isQwertyKeyboard() {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   } public boolean onKeyDown(int keyCode, KeyEvent event) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   } public boolean onKeyUp(int keyCode, KeyEvent event) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   } public int getMode() {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setMode(int newMode) {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   } public CharSequence getLetters() {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   } public CharSequence getDigits() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   } public CharSequence getFilterText() {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   } public void append(String text) {
/* 65 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void clearText() {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   } public void setLettersWatcher(TextWatcher watcher) {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   } public void setDigitsWatcher(TextWatcher watcher) {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   } public void setFilterWatcher(TextWatcher watcher) {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   } public void removeFilterWatcher(TextWatcher watcher) {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void onModeChange(int oldMode, int newMode) {
/* 86 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\widget\DialerFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */