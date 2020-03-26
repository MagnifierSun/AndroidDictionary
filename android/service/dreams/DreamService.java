/*     */ package android.service.dreams;
/*     */ 
/*     */ import android.app.Service;
/*     */ import android.content.Intent;
/*     */ import android.os.IBinder;
/*     */ import android.view.ActionMode;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.Menu;
/*     */ import android.view.MenuItem;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.SearchEvent;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
/*     */ import android.view.Window;
/*     */ import android.view.WindowManager;
/*     */ import android.view.accessibility.AccessibilityEvent;
/*     */ import androidx.annotation.RecentlyNonNull;
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
/*     */ public class DreamService
/*     */   extends Service
/*     */   implements Window.Callback
/*     */ {
/*     */   public static final String DREAM_META_DATA = "android.service.dream";
/*     */   public static final String SERVICE_INTERFACE = "android.service.dreams.DreamService";
/*     */   
/*     */   public DreamService() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean dispatchKeyEvent(KeyEvent event) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean dispatchKeyShortcutEvent(KeyEvent event) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean dispatchTouchEvent(MotionEvent event) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean dispatchTrackballEvent(MotionEvent event) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean dispatchGenericMotionEvent(MotionEvent event) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public View onCreatePanelView(int featureId) {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean onCreatePanelMenu(int featureId, Menu menu) {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean onPreparePanel(int featureId, View view, Menu menu) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean onMenuOpened(int featureId, Menu menu) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean onMenuItemSelected(int featureId, MenuItem item) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onContentChanged() {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onWindowFocusChanged(boolean hasFocus) {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onAttachedToWindow() {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onDetachedFromWindow() {
/* 193 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onPanelClosed(int featureId, Menu menu) {
/* 197 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean onSearchRequested(SearchEvent event) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean onSearchRequested() {
/* 205 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
/* 209 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onActionModeStarted(ActionMode mode) {
/* 217 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onActionModeFinished(ActionMode mode) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WindowManager getWindowManager() {
/* 230 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Window getWindow() {
/* 239 */     throw new RuntimeException("Stub!");
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
/*     */   public void setContentView(int layoutResID) {
/* 253 */     throw new RuntimeException("Stub!");
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
/*     */   public void setContentView(View view) {
/* 268 */     throw new RuntimeException("Stub!");
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
/*     */   public void setContentView(View view, ViewGroup.LayoutParams params) {
/* 287 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addContentView(View view, ViewGroup.LayoutParams params) {
/* 298 */     throw new RuntimeException("Stub!");
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
/*     */   public <T extends View> T findViewById(int id) {
/* 317 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public final <T extends View> T requireViewById(int id) {
/* 338 */     throw new RuntimeException("Stub!");
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
/*     */   public void setInteractive(boolean interactive) {
/* 350 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isInteractive() {
/* 358 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFullscreen(boolean fullscreen) {
/* 368 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFullscreen() {
/* 376 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setScreenBright(boolean screenBright) {
/* 384 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isScreenBright() {
/* 393 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCreate() {
/* 399 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDreamingStarted() {
/* 405 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDreamingStopped() {
/* 412 */     throw new RuntimeException("Stub!");
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
/*     */   public void onWakeUp() {
/* 427 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final IBinder onBind(Intent intent) {
/* 431 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void finish() {
/* 441 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void wakeUp() {
/* 451 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onDestroy() {
/* 455 */     throw new RuntimeException("Stub!");
/*     */   } protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
/* 457 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\dreams\DreamService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */