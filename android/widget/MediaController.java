/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
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
/*     */ public class MediaController
/*     */   extends FrameLayout
/*     */ {
/*     */   public MediaController(Context context, AttributeSet attrs) {
/*  55 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public MediaController(Context context, boolean useFastForward) {
/*  57 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public MediaController(Context context) {
/*  59 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public void onFinishInflate() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   } public void setMediaPlayer(MediaPlayerControl player) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAnchorView(View view) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void show() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void show(int timeout) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isShowing() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void hide() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent event) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTrackballEvent(MotionEvent ev) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchKeyEvent(KeyEvent event) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public void setEnabled(boolean enabled) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   } public void setPrevNextListeners(View.OnClickListener next, View.OnClickListener prev) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface MediaPlayerControl {
/*     */     void start();
/*     */     
/*     */     void pause();
/*     */     
/*     */     int getDuration();
/*     */     
/*     */     int getCurrentPosition();
/*     */     
/*     */     void seekTo(int param1Int);
/*     */     
/*     */     boolean isPlaying();
/*     */     
/*     */     int getBufferPercentage();
/*     */     
/*     */     boolean canPause();
/*     */     
/*     */     boolean canSeekBackward();
/*     */     
/*     */     boolean canSeekForward();
/*     */     
/*     */     int getAudioSessionId();
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\MediaController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */