/*     */ package android.text.method;
/*     */ 
/*     */ import android.text.Editable;
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
/*     */ public abstract class MetaKeyKeyListener
/*     */ {
/*     */   public static final int META_ALT_LOCKED = 512;
/*     */   public static final int META_ALT_ON = 2;
/*     */   public static final int META_CAP_LOCKED = 256;
/*     */   public static final int META_SHIFT_ON = 1;
/*     */   public static final int META_SYM_LOCKED = 1024;
/*     */   public static final int META_SYM_ON = 4;
/*     */   
/*     */   public MetaKeyKeyListener() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void resetMetaState(Spannable text) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int getMetaState(CharSequence text) {
/*  92 */     throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public static final int getMetaState(CharSequence text, KeyEvent event) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int getMetaState(CharSequence text, int meta) {
/* 120 */     throw new RuntimeException("Stub!");
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
/*     */   public static final int getMetaState(CharSequence text, int meta, KeyEvent event) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void adjustMetaAfterKeypress(Spannable content) {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isMetaTracker(CharSequence text, Object what) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isSelectingMetaTracker(CharSequence text, Object what) {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static void resetLockedMeta(Spannable content) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onKeyUp(View view, Editable content, int keyCode, KeyEvent event) {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   } public void clearMetaKeyState(View view, Editable content, int states) {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   } public static void clearMetaKeyState(Editable content, int states) {
/* 180 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long resetLockedMeta(long state) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int getMetaState(long state) {
/* 198 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int getMetaState(long state, int meta) {
/* 209 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long adjustMetaAfterKeypress(long state) {
/* 218 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long handleKeyDown(long state, int keyCode, KeyEvent event) {
/* 224 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long handleKeyUp(long state, int keyCode, KeyEvent event) {
/* 230 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long clearMetaKeyState(long state, int which) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\method\MetaKeyKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */