/*     */ package android.text.method;
/*     */ 
/*     */ import android.text.Editable;
/*     */ import android.text.SpanWatcher;
/*     */ import android.text.Spannable;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.View;
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
/*     */ public class TextKeyListener
/*     */   extends BaseKeyListener
/*     */   implements SpanWatcher
/*     */ {
/*     */   public TextKeyListener(Capitalize cap, boolean autotext) {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static TextKeyListener getInstance(boolean autotext, Capitalize cap) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static TextKeyListener getInstance() {
/*  59 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean shouldCap(Capitalize cap, CharSequence cs, int off) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public int getInputType() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyUp(View view, Editable content, int keyCode, KeyEvent event) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyOther(View view, Editable content, KeyEvent event) {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void clear(Editable e) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public void onSpanAdded(Spannable s, Object what, int start, int end) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public void onSpanRemoved(Spannable s, Object what, int start, int end) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public void onSpanChanged(Spannable s, Object what, int start, int end, int st, int en) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public void release() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 101 */   public enum Capitalize { NONE, SENTENCES, WORDS, CHARACTERS; }
/*     */ 
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\method\TextKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */