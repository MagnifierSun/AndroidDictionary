/*     */ package android.inputmethodservice;
/*     */ 
/*     */ import android.app.Service;
/*     */ import android.content.Intent;
/*     */ import android.os.IBinder;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.inputmethod.InputMethod;
/*     */ import android.view.inputmethod.InputMethodSession;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.PrintWriter;
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
/*     */ public abstract class AbstractInputMethodService
/*     */   extends Service
/*     */   implements KeyEvent.Callback
/*     */ {
/*     */   public AbstractInputMethodService() {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KeyEvent.DispatcherState getKeyDispatcherState() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract AbstractInputMethodImpl onCreateInputMethodInterface();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void dump(FileDescriptor fd, PrintWriter fout, String[] args) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public final IBinder onBind(Intent intent) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onTrackballEvent(MotionEvent event) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onGenericMotionEvent(MotionEvent event) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract class AbstractInputMethodImpl
/*     */     implements InputMethod
/*     */   {
/*     */     public AbstractInputMethodImpl() {
/* 108 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void createSession(InputMethod.SessionCallback callback) {
/* 119 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setSessionEnabled(InputMethodSession session, boolean enabled) {
/* 130 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void revokeSession(InputMethodSession session) {
/* 141 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract class AbstractInputMethodSessionImpl
/*     */     implements InputMethodSession
/*     */   {
/*     */     public AbstractInputMethodSessionImpl() {
/* 153 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isEnabled() {
/* 160 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isRevoked() {
/* 168 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setEnabled(boolean enabled) {
/* 175 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void revokeSelf() {
/* 182 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void dispatchKeyEvent(int seq, KeyEvent event, InputMethodSession.EventCallback callback) {
/* 189 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void dispatchTrackballEvent(int seq, MotionEvent event, InputMethodSession.EventCallback callback) {
/* 196 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void dispatchGenericMotionEvent(int seq, MotionEvent event, InputMethodSession.EventCallback callback) {
/* 203 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\inputmethodservice\AbstractInputMethodService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */