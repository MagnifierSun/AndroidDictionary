/*    */ package android.app;
/*    */ 
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Bundle;
/*    */ import android.view.InputQueue;
/*    */ import android.view.SurfaceHolder;
/*    */ import android.view.ViewTreeObserver;
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
/*    */ 
/*    */ public class NativeActivity
/*    */   extends Activity
/*    */   implements SurfaceHolder.Callback2, InputQueue.Callback, ViewTreeObserver.OnGlobalLayoutListener
/*    */ {
/*    */   public static final String META_DATA_FUNC_NAME = "android.app.func_name";
/*    */   public static final String META_DATA_LIB_NAME = "android.app.lib_name";
/*    */   
/*    */   public NativeActivity() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   } protected void onCreate(Bundle savedInstanceState) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } protected void onDestroy() {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } protected void onPause() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   } protected void onResume() {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } protected void onSaveInstanceState(Bundle outState) {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   } protected void onStart() {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   } protected void onStop() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   } public void onConfigurationChanged(Configuration newConfig) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public void onLowMemory() {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   } public void onWindowFocusChanged(boolean hasFocus) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   } public void surfaceCreated(SurfaceHolder holder) {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   } public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   } public void surfaceRedrawNeeded(SurfaceHolder holder) {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   } public void surfaceDestroyed(SurfaceHolder holder) {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   } public void onInputQueueCreated(InputQueue queue) {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   } public void onInputQueueDestroyed(InputQueue queue) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   } public void onGlobalLayout() {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\NativeActivity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */