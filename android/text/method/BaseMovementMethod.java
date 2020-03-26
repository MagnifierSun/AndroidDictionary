/*     */ package android.text.method;
/*     */ 
/*     */ import android.text.Spannable;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.widget.TextView;
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
/*     */ public class BaseMovementMethod
/*     */   implements MovementMethod
/*     */ {
/*     */   public BaseMovementMethod() {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   } public boolean canSelectArbitrarily() {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   } public void initialize(TextView widget, Spannable text) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyDown(TextView widget, Spannable text, int keyCode, KeyEvent event) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyOther(TextView widget, Spannable text, KeyEvent event) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyUp(TextView widget, Spannable text, int keyCode, KeyEvent event) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   } public void onTakeFocus(TextView widget, Spannable text, int direction) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(TextView widget, Spannable text, MotionEvent event) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTrackballEvent(TextView widget, Spannable text, MotionEvent event) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onGenericMotionEvent(TextView widget, Spannable text, MotionEvent event) {
/*  49 */     throw new RuntimeException("Stub!");
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
/*     */   protected int getMovementMetaState(Spannable buffer, KeyEvent event) {
/*  63 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean handleMovementKey(TextView widget, Spannable buffer, int keyCode, int movementMetaState, KeyEvent event) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean left(TextView widget, Spannable buffer) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean right(TextView widget, Spannable buffer) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean up(TextView widget, Spannable buffer) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean down(TextView widget, Spannable buffer) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean pageUp(TextView widget, Spannable buffer) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean pageDown(TextView widget, Spannable buffer) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean top(TextView widget, Spannable buffer) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean bottom(TextView widget, Spannable buffer) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean lineStart(TextView widget, Spannable buffer) {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean lineEnd(TextView widget, Spannable buffer) {
/* 193 */     throw new RuntimeException("Stub!");
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
/*     */   protected boolean home(TextView widget, Spannable buffer) {
/* 206 */     throw new RuntimeException("Stub!");
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
/*     */   protected boolean end(TextView widget, Spannable buffer) {
/* 219 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\method\BaseMovementMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */