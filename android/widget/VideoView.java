/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Canvas;
/*     */ import android.media.AudioAttributes;
/*     */ import android.media.MediaFormat;
/*     */ import android.media.MediaPlayer;
/*     */ import android.net.Uri;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.SurfaceView;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.io.InputStream;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class VideoView
/*     */   extends SurfaceView
/*     */   implements MediaController.MediaPlayerControl
/*     */ {
/*     */   public VideoView(Context context) {
/*  55 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public VideoView(Context context, AttributeSet attrs) {
/*  57 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public VideoView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  59 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public VideoView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  61 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   } public int resolveAdjustedSize(int desiredSize, int measureSpec) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVideoPath(String path) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVideoURI(Uri uri) {
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
/*     */ 
/*     */   
/*     */   public void setVideoURI(Uri uri, Map<String, String> headers) {
/*  96 */     throw new RuntimeException("Stub!");
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
/*     */   public void setAudioFocusRequest(int focusGain) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAudioAttributes(@RecentlyNonNull AudioAttributes attributes) {
/* 121 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addSubtitleSource(InputStream is, MediaFormat format) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   } public void stopPlayback() {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   } public void setMediaController(MediaController controller) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnPreparedListener(MediaPlayer.OnPreparedListener l) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnCompletionListener(MediaPlayer.OnCompletionListener l) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnErrorListener(MediaPlayer.OnErrorListener l) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnInfoListener(MediaPlayer.OnInfoListener l) {
/* 188 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent ev) {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTrackballEvent(MotionEvent ev) {
/* 192 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyDown(int keyCode, KeyEvent event) {
/* 194 */     throw new RuntimeException("Stub!");
/*     */   } public void start() {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   } public void pause() {
/* 198 */     throw new RuntimeException("Stub!");
/*     */   } public void suspend() {
/* 200 */     throw new RuntimeException("Stub!");
/*     */   } public void resume() {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   } public int getDuration() {
/* 204 */     throw new RuntimeException("Stub!");
/*     */   } public int getCurrentPosition() {
/* 206 */     throw new RuntimeException("Stub!");
/*     */   } public void seekTo(int msec) {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isPlaying() {
/* 210 */     throw new RuntimeException("Stub!");
/*     */   } public int getBufferPercentage() {
/* 212 */     throw new RuntimeException("Stub!");
/*     */   } public boolean canPause() {
/* 214 */     throw new RuntimeException("Stub!");
/*     */   } public boolean canSeekBackward() {
/* 216 */     throw new RuntimeException("Stub!");
/*     */   } public boolean canSeekForward() {
/* 218 */     throw new RuntimeException("Stub!");
/*     */   } public int getAudioSessionId() {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   } protected void onAttachedToWindow() {
/* 222 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDetachedFromWindow() {
/* 224 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
/* 226 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/* 228 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\VideoView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */