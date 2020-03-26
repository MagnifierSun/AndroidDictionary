/*     */ package android.gesture;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Path;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.MotionEvent;
/*     */ import android.widget.FrameLayout;
/*     */ import java.util.ArrayList;
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
/*     */ public class GestureOverlayView
/*     */   extends FrameLayout
/*     */ {
/*     */   public static final int GESTURE_STROKE_TYPE_MULTIPLE = 1;
/*     */   public static final int GESTURE_STROKE_TYPE_SINGLE = 0;
/*     */   public static final int ORIENTATION_HORIZONTAL = 0;
/*     */   public static final int ORIENTATION_VERTICAL = 1;
/*     */   
/*     */   public GestureOverlayView(Context context) {
/*  42 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public GestureOverlayView(Context context, AttributeSet attrs) {
/*  44 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public GestureOverlayView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  46 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public GestureOverlayView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  48 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ArrayList<GesturePoint> getCurrentStroke() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public int getOrientation() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public void setOrientation(int orientation) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public void setGestureColor(int color) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public void setUncertainGestureColor(int color) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } public int getUncertainGestureColor() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   } public int getGestureColor() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public float getGestureStrokeWidth() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public void setGestureStrokeWidth(float gestureStrokeWidth) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public int getGestureStrokeType() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public void setGestureStrokeType(int gestureStrokeType) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   } public float getGestureStrokeLengthThreshold() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public void setGestureStrokeLengthThreshold(float gestureStrokeLengthThreshold) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   } public float getGestureStrokeSquarenessTreshold() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public void setGestureStrokeSquarenessTreshold(float gestureStrokeSquarenessTreshold) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   } public float getGestureStrokeAngleThreshold() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   } public void setGestureStrokeAngleThreshold(float gestureStrokeAngleThreshold) {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isEventsInterceptionEnabled() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public void setEventsInterceptionEnabled(boolean enabled) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isFadeEnabled() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public void setFadeEnabled(boolean fadeEnabled) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public Gesture getGesture() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public void setGesture(Gesture gesture) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public Path getGesturePath() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public Path getGesturePath(Path path) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isGestureVisible() {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public void setGestureVisible(boolean visible) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public long getFadeOffset() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public void setFadeOffset(long fadeOffset) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public void addOnGestureListener(OnGestureListener listener) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public void removeOnGestureListener(OnGestureListener listener) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public void removeAllOnGestureListeners() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public void addOnGesturePerformedListener(OnGesturePerformedListener listener) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public void removeOnGesturePerformedListener(OnGesturePerformedListener listener) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } public void removeAllOnGesturePerformedListeners() {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public void addOnGesturingListener(OnGesturingListener listener) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public void removeOnGesturingListener(OnGesturingListener listener) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } public void removeAllOnGesturingListeners() {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isGesturing() {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   } public void clear(boolean animated) {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   } public void cancelClearAnimation() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   } public void cancelGesture() {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDetachedFromWindow() {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchTouchEvent(MotionEvent event) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnGesturingListener {
/*     */     void onGesturingStarted(GestureOverlayView param1GestureOverlayView);
/*     */     
/*     */     void onGesturingEnded(GestureOverlayView param1GestureOverlayView);
/*     */   }
/*     */   
/*     */   public static interface OnGesturePerformedListener {
/*     */     void onGesturePerformed(GestureOverlayView param1GestureOverlayView, Gesture param1Gesture);
/*     */   }
/*     */   
/*     */   public static interface OnGestureListener {
/*     */     void onGestureStarted(GestureOverlayView param1GestureOverlayView, MotionEvent param1MotionEvent);
/*     */     
/*     */     void onGesture(GestureOverlayView param1GestureOverlayView, MotionEvent param1MotionEvent);
/*     */     
/*     */     void onGestureEnded(GestureOverlayView param1GestureOverlayView, MotionEvent param1MotionEvent);
/*     */     
/*     */     void onGestureCancelled(GestureOverlayView param1GestureOverlayView, MotionEvent param1MotionEvent);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\gesture\GestureOverlayView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */