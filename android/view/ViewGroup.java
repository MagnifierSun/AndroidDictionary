/*      */ package android.view;
/*      */ 
/*      */ import android.animation.LayoutTransition;
/*      */ import android.content.Context;
/*      */ import android.content.res.Configuration;
/*      */ import android.content.res.TypedArray;
/*      */ import android.graphics.Canvas;
/*      */ import android.graphics.Point;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.Region;
/*      */ import android.os.Bundle;
/*      */ import android.os.Parcelable;
/*      */ import android.util.AttributeSet;
/*      */ import android.util.SparseArray;
/*      */ import android.view.accessibility.AccessibilityEvent;
/*      */ import android.view.animation.Animation;
/*      */ import android.view.animation.LayoutAnimationController;
/*      */ import android.view.animation.Transformation;
/*      */ import androidx.annotation.RecentlyNonNull;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collection;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class ViewGroup
/*      */   extends View
/*      */   implements ViewParent, ViewManager
/*      */ {
/*      */   protected static final int CLIP_TO_PADDING_MASK = 34;
/*      */   public static final int FOCUS_AFTER_DESCENDANTS = 262144;
/*      */   public static final int FOCUS_BEFORE_DESCENDANTS = 131072;
/*      */   public static final int FOCUS_BLOCK_DESCENDANTS = 393216;
/*      */   public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
/*      */   public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
/*      */   @Deprecated
/*      */   public static final int PERSISTENT_ALL_CACHES = 3;
/*      */   @Deprecated
/*      */   public static final int PERSISTENT_ANIMATION_CACHE = 1;
/*      */   @Deprecated
/*      */   public static final int PERSISTENT_NO_CACHE = 0;
/*      */   @Deprecated
/*      */   public static final int PERSISTENT_SCROLLING_CACHE = 2;
/*      */   
/*      */   public ViewGroup(Context context) {
/*   85 */     super((Context)null); throw new RuntimeException("Stub!");
/*      */   } public ViewGroup(Context context, AttributeSet attrs) {
/*   87 */     super((Context)null); throw new RuntimeException("Stub!");
/*      */   } public ViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
/*   89 */     super((Context)null); throw new RuntimeException("Stub!");
/*      */   } public ViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*   91 */     super((Context)null); throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @ExportedProperty(category = "focus", mapping = {@IntToString(from = 131072, to = "FOCUS_BEFORE_DESCENDANTS"), @IntToString(from = 262144, to = "FOCUS_AFTER_DESCENDANTS"), @IntToString(from = 393216, to = "FOCUS_BLOCK_DESCENDANTS")})
/*      */   public int getDescendantFocusability() {
/*  103 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDescendantFocusability(int focusability) {
/*  114 */     throw new RuntimeException("Stub!");
/*      */   } public void requestChildFocus(View child, View focused) {
/*  116 */     throw new RuntimeException("Stub!");
/*      */   } public void focusableViewAvailable(View v) {
/*  118 */     throw new RuntimeException("Stub!");
/*      */   } public boolean showContextMenuForChild(View originalView) {
/*  120 */     throw new RuntimeException("Stub!");
/*      */   } public boolean showContextMenuForChild(View originalView, float x, float y) {
/*  122 */     throw new RuntimeException("Stub!");
/*      */   } public ActionMode startActionModeForChild(View originalView, ActionMode.Callback callback) {
/*  124 */     throw new RuntimeException("Stub!");
/*      */   } public ActionMode startActionModeForChild(View originalView, ActionMode.Callback callback, int type) {
/*  126 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public View focusSearch(View focused, int direction) {
/*  137 */     throw new RuntimeException("Stub!");
/*      */   } public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
/*  139 */     throw new RuntimeException("Stub!");
/*      */   } public boolean requestSendAccessibilityEvent(View child, AccessibilityEvent event) {
/*  141 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean onRequestSendAccessibilityEvent(View child, AccessibilityEvent event) {
/*  160 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void childHasTransientStateChanged(View child, boolean childHasTransientState) {
/*  166 */     throw new RuntimeException("Stub!");
/*      */   } public boolean hasTransientState() {
/*  168 */     throw new RuntimeException("Stub!");
/*      */   } public boolean dispatchUnhandledMove(View focused, int direction) {
/*  170 */     throw new RuntimeException("Stub!");
/*      */   } public void clearChildFocus(View child) {
/*  172 */     throw new RuntimeException("Stub!");
/*      */   } public void clearFocus() {
/*  174 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public View getFocusedChild() {
/*  183 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasFocus() {
/*  191 */     throw new RuntimeException("Stub!");
/*      */   } public View findFocus() {
/*  193 */     throw new RuntimeException("Stub!");
/*      */   } public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
/*  195 */     throw new RuntimeException("Stub!");
/*      */   } public void addKeyboardNavigationClusters(Collection<View> views, int direction) {
/*  197 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTouchscreenBlocksFocus(boolean touchscreenBlocksFocus) {
/*  207 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */   
/*      */   @ExportedProperty(category = "focus")
/*      */   public boolean getTouchscreenBlocksFocus() {
/*  213 */     throw new RuntimeException("Stub!");
/*      */   } public void findViewsWithText(ArrayList<View> outViews, CharSequence text, int flags) {
/*  215 */     throw new RuntimeException("Stub!");
/*      */   } public void dispatchWindowFocusChanged(boolean hasFocus) {
/*  217 */     throw new RuntimeException("Stub!");
/*      */   } public void addTouchables(ArrayList<View> views) {
/*  219 */     throw new RuntimeException("Stub!");
/*      */   } public void dispatchDisplayHint(int hint) {
/*  221 */     throw new RuntimeException("Stub!");
/*      */   } protected void dispatchVisibilityChanged(View changedView, int visibility) {
/*  223 */     throw new RuntimeException("Stub!");
/*      */   } public void dispatchWindowVisibilityChanged(int visibility) {
/*  225 */     throw new RuntimeException("Stub!");
/*      */   } public void dispatchConfigurationChanged(Configuration newConfig) {
/*  227 */     throw new RuntimeException("Stub!");
/*      */   } public void recomputeViewAttributes(View child) {
/*  229 */     throw new RuntimeException("Stub!");
/*      */   } public void bringChildToFront(View child) {
/*  231 */     throw new RuntimeException("Stub!");
/*      */   } public boolean dispatchDragEvent(DragEvent event) {
/*  233 */     throw new RuntimeException("Stub!");
/*      */   } public void dispatchWindowSystemUiVisiblityChanged(int visible) {
/*  235 */     throw new RuntimeException("Stub!");
/*      */   } public void dispatchSystemUiVisibilityChanged(int visible) {
/*  237 */     throw new RuntimeException("Stub!");
/*      */   } public boolean dispatchKeyEventPreIme(KeyEvent event) {
/*  239 */     throw new RuntimeException("Stub!");
/*      */   } public boolean dispatchKeyEvent(KeyEvent event) {
/*  241 */     throw new RuntimeException("Stub!");
/*      */   } public boolean dispatchKeyShortcutEvent(KeyEvent event) {
/*  243 */     throw new RuntimeException("Stub!");
/*      */   } public boolean dispatchTrackballEvent(MotionEvent event) {
/*  245 */     throw new RuntimeException("Stub!");
/*      */   } public boolean dispatchCapturedPointerEvent(MotionEvent event) {
/*  247 */     throw new RuntimeException("Stub!");
/*      */   } public void dispatchPointerCaptureChanged(boolean hasCapture) {
/*  249 */     throw new RuntimeException("Stub!");
/*      */   } public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
/*  251 */     throw new RuntimeException("Stub!");
/*      */   } protected boolean dispatchHoverEvent(MotionEvent event) {
/*  253 */     throw new RuntimeException("Stub!");
/*      */   } public void addChildrenForAccessibility(ArrayList<View> outChildren) {
/*  255 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean onInterceptHoverEvent(MotionEvent event) {
/*  296 */     throw new RuntimeException("Stub!");
/*      */   } protected boolean dispatchGenericPointerEvent(MotionEvent event) {
/*  298 */     throw new RuntimeException("Stub!");
/*      */   } protected boolean dispatchGenericFocusedEvent(MotionEvent event) {
/*  300 */     throw new RuntimeException("Stub!");
/*      */   } public boolean dispatchTouchEvent(MotionEvent ev) {
/*  302 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMotionEventSplittingEnabled(boolean split) {
/*  320 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isMotionEventSplittingEnabled() {
/*  327 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isTransitionGroup() {
/*  342 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTransitionGroup(boolean isTransitionGroup) {
/*  355 */     throw new RuntimeException("Stub!");
/*      */   } public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
/*  357 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean onInterceptTouchEvent(MotionEvent ev) {
/*  397 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
/*  414 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
/*  428 */     throw new RuntimeException("Stub!");
/*      */   } public boolean restoreDefaultFocus() {
/*  430 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void dispatchStartTemporaryDetach() {
/*  438 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void dispatchFinishTemporaryDetach() {
/*  446 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void dispatchProvideStructure(ViewStructure structure) {
/*  454 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) {
/*  465 */     throw new RuntimeException("Stub!");
/*      */   } public CharSequence getAccessibilityClassName() {
/*  467 */     throw new RuntimeException("Stub!");
/*      */   } public void notifySubtreeAccessibilityStateChanged(View child, View source, int changeType) {
/*  469 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean onNestedPrePerformAccessibilityAction(View target, int action, Bundle args) {
/*  483 */     throw new RuntimeException("Stub!");
/*      */   } protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
/*  485 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void dispatchFreezeSelfOnly(SparseArray<Parcelable> container) {
/*  496 */     throw new RuntimeException("Stub!");
/*      */   } protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
/*  498 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void dispatchThawSelfOnly(SparseArray<Parcelable> container) {
/*  509 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   protected void setChildrenDrawingCacheEnabled(boolean enabled) {
/*  530 */     throw new RuntimeException("Stub!");
/*      */   } protected void dispatchDraw(Canvas canvas) {
/*  532 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ViewGroupOverlay getOverlay() {
/*  551 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int getChildDrawingOrder(int childCount, int i) {
/*  568 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
/*  582 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @ExportedProperty(category = "drawing")
/*      */   public boolean getClipChildren() {
/*  593 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setClipChildren(boolean clipChildren) {
/*  604 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setClipToPadding(boolean clipToPadding) {
/*  618 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @ExportedProperty(category = "drawing")
/*      */   public boolean getClipToPadding() {
/*  633 */     throw new RuntimeException("Stub!");
/*      */   } public void dispatchSetSelected(boolean selected) {
/*  635 */     throw new RuntimeException("Stub!");
/*      */   } public void dispatchSetActivated(boolean activated) {
/*  637 */     throw new RuntimeException("Stub!");
/*      */   } protected void dispatchSetPressed(boolean pressed) {
/*  639 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void dispatchDrawableHotspotChanged(float x, float y) {
/*  656 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void setStaticTransformationsEnabled(boolean enabled) {
/*  673 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean getChildStaticTransformation(View child, Transformation t) {
/*  688 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addView(View child) {
/*  703 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addView(View child, int index) {
/*  719 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addView(View child, int width, int height) {
/*  732 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addView(View child, LayoutParams params) {
/*  745 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addView(View child, int index, LayoutParams params) {
/*  759 */     throw new RuntimeException("Stub!");
/*      */   } public void updateViewLayout(View view, LayoutParams params) {
/*  761 */     throw new RuntimeException("Stub!");
/*      */   } protected boolean checkLayoutParams(LayoutParams p) {
/*  763 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOnHierarchyChangeListener(OnHierarchyChangeListener listener) {
/*  772 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onViewAdded(View child) {
/*  781 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onViewRemoved(View child) {
/*  790 */     throw new RuntimeException("Stub!");
/*      */   } protected void onAttachedToWindow() {
/*  792 */     throw new RuntimeException("Stub!");
/*      */   } protected void onDetachedFromWindow() {
/*  794 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean addViewInLayout(View child, int index, LayoutParams params) {
/*  808 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean addViewInLayout(View child, int index, LayoutParams params, boolean preventRequestLayout) {
/*  824 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void cleanupLayoutState(View child) {
/*  832 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void attachLayoutAnimationParameters(View child, LayoutParams params, int index, int count) {
/*  845 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeView(View view) {
/*  855 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeViewInLayout(View view) {
/*  868 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeViewsInLayout(int start, int count) {
/*  882 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeViewAt(int index) {
/*  894 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeViews(int start, int count) {
/*  907 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLayoutTransition(LayoutTransition transition) {
/*  924 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LayoutTransition getLayoutTransition() {
/*  936 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeAllViews() {
/*  947 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeAllViewsInLayout() {
/*  963 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void removeDetachedView(View child, boolean animate) {
/*  986 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void attachViewToParent(View child, int index, LayoutParams params) {
/* 1012 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void detachViewFromParent(View child) {
/* 1032 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void detachViewFromParent(int index) {
/* 1052 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void detachViewsFromParent(int start, int count) {
/* 1073 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void detachAllViewsFromParent() {
/* 1091 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onDescendantInvalidated(@RecentlyNonNull View child, @RecentlyNonNull View target) {
/* 1100 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public final void invalidateChild(View child, Rect dirty) {
/* 1110 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
/* 1124 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void offsetDescendantRectToMyCoords(View descendant, Rect rect) {
/* 1133 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void offsetRectIntoDescendantCoords(View descendant, Rect rect) {
/* 1142 */     throw new RuntimeException("Stub!");
/*      */   } public boolean getChildVisibleRect(View child, Rect r, Point offset) {
/* 1144 */     throw new RuntimeException("Stub!");
/*      */   } public final void layout(int l, int t, int r, int b) {
/* 1146 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean canAnimate() {
/* 1157 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void startLayoutAnimation() {
/* 1164 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void scheduleLayoutAnimation() {
/* 1173 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLayoutAnimation(LayoutAnimationController controller) {
/* 1182 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LayoutAnimationController getLayoutAnimation() {
/* 1191 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean isAnimationCacheEnabled() {
/* 1208 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setAnimationCacheEnabled(boolean enabled) {
/* 1225 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean isAlwaysDrawnWithCacheEnabled() {
/* 1241 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setAlwaysDrawnWithCacheEnabled(boolean always) {
/* 1264 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   protected boolean isChildrenDrawnWithCacheEnabled() {
/* 1280 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   protected void setChildrenDrawnWithCacheEnabled(boolean enabled) {
/* 1300 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @ExportedProperty(category = "drawing")
/*      */   protected boolean isChildrenDrawingOrderEnabled() {
/* 1313 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void setChildrenDrawingOrderEnabled(boolean enabled) {
/* 1329 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   @ExportedProperty(category = "drawing", mapping = {@IntToString(from = 0, to = "NONE"), @IntToString(from = 1, to = "ANIMATION"), @IntToString(from = 2, to = "SCROLLING"), @IntToString(from = 3, to = "ALL")})
/*      */   public int getPersistentDrawingCache() {
/* 1355 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setPersistentDrawingCache(int drawingCacheToKeep) {
/* 1382 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLayoutMode() {
/* 1397 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLayoutMode(int layoutMode) {
/* 1410 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LayoutParams generateLayoutParams(AttributeSet attrs) {
/* 1421 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LayoutParams generateLayoutParams(LayoutParams p) {
/* 1438 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LayoutParams generateDefaultLayoutParams() {
/* 1448 */     throw new RuntimeException("Stub!");
/*      */   } protected void debug(int depth) {
/* 1450 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int indexOfChild(View child) {
/* 1460 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getChildCount() {
/* 1469 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public View getChildAt(int index) {
/* 1479 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void measureChildren(int widthMeasureSpec, int heightMeasureSpec) {
/* 1491 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
/* 1503 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
/* 1520 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getChildMeasureSpec(int spec, int padding, int childDimension) {
/* 1542 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearDisappearingChildren() {
/* 1549 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void startViewTransition(View view) {
/* 1564 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void endViewTransition(View view) {
/* 1577 */     throw new RuntimeException("Stub!");
/*      */   } public boolean gatherTransparentRegion(Region region) {
/* 1579 */     throw new RuntimeException("Stub!");
/*      */   } public void requestTransparentRegion(View child) {
/* 1581 */     throw new RuntimeException("Stub!");
/*      */   } public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
/* 1583 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Animation.AnimationListener getLayoutAnimationListener() {
/* 1592 */     throw new RuntimeException("Stub!");
/*      */   } protected void drawableStateChanged() {
/* 1594 */     throw new RuntimeException("Stub!");
/*      */   } public void jumpDrawablesToCurrentState() {
/* 1596 */     throw new RuntimeException("Stub!");
/*      */   } protected int[] onCreateDrawableState(int extraSpace) {
/* 1598 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAddStatesFromChildren(boolean addsStates) {
/* 1607 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean addStatesFromChildren() {
/* 1616 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void childDrawableStateChanged(View child) {
/* 1623 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLayoutAnimationListener(Animation.AnimationListener animationListener) {
/* 1636 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean shouldDelayChildPressedState() {
/* 1648 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
/* 1654 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void onNestedScrollAccepted(View child, View target, int axes) {
/* 1660 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onStopNestedScroll(View child) {
/* 1669 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
/* 1675 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
/* 1681 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
/* 1687 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
/* 1693 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getNestedScrollAxes() {
/* 1707 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected abstract void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class LayoutParams
/*      */   {
/*      */     @Deprecated
/*      */     public static final int FILL_PARENT = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MATCH_PARENT = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int WRAP_CONTENT = -2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @ExportedProperty(category = "layout", mapping = {@IntToString(from = -1, to = "MATCH_PARENT"), @IntToString(from = -2, to = "WRAP_CONTENT")})
/*      */     public int height;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public LayoutAnimationController.AnimationParameters layoutAnimationParameters;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @ExportedProperty(category = "layout", mapping = {@IntToString(from = -1, to = "MATCH_PARENT"), @IntToString(from = -2, to = "WRAP_CONTENT")})
/*      */     public int width;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public LayoutParams(Context c, AttributeSet attrs) {
/* 1879 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public LayoutParams(int width, int height) {
/* 1893 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public LayoutParams(LayoutParams source) {
/* 1901 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) {
/* 1911 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void resolveLayoutDirection(int layoutDirection) {
/* 1924 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class MarginLayoutParams
/*      */     extends LayoutParams
/*      */   {
/*      */     @ExportedProperty(category = "layout")
/*      */     public int bottomMargin;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @ExportedProperty(category = "layout")
/*      */     public int leftMargin;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @ExportedProperty(category = "layout")
/*      */     public int rightMargin;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @ExportedProperty(category = "layout")
/*      */     public int topMargin;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MarginLayoutParams(Context c, AttributeSet attrs) {
/* 2003 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*      */     } public MarginLayoutParams(int width, int height) {
/* 2005 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MarginLayoutParams(MarginLayoutParams source) {
/* 2013 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*      */     } public MarginLayoutParams(ViewGroup.LayoutParams source) {
/* 2015 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setMargins(int left, int top, int right, int bottom) {
/* 2034 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setMarginStart(int start) {
/* 2044 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getMarginStart() {
/* 2054 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setMarginEnd(int end) {
/* 2064 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getMarginEnd() {
/* 2074 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isMarginRelative() {
/* 2085 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setLayoutDirection(int layoutDirection) {
/* 2094 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getLayoutDirection() {
/* 2103 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void resolveLayoutDirection(int layoutDirection) {
/* 2110 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */   
/*      */   public static interface OnHierarchyChangeListener {
/*      */     void onChildViewAdded(View param1View1, View param1View2);
/*      */     
/*      */     void onChildViewRemoved(View param1View1, View param1View2);
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\view\ViewGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */