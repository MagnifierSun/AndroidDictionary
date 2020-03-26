/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Parcelable;
/*     */ import android.text.Editable;
/*     */ import android.text.TextWatcher;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.SparseBooleanArray;
/*     */ import android.view.ActionMode;
/*     */ import android.view.ContextMenu;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.PointerIcon;
/*     */ import android.view.View;
/*     */ import android.view.ViewDebug.ExportedProperty;
/*     */ import android.view.ViewGroup;
/*     */ import android.view.ViewTreeObserver;
/*     */ import android.view.accessibility.AccessibilityEvent;
/*     */ import android.view.accessibility.AccessibilityNodeInfo;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbsListView
/*     */   extends AdapterView<ListAdapter>
/*     */   implements TextWatcher, ViewTreeObserver.OnGlobalLayoutListener, Filter.FilterListener, ViewTreeObserver.OnTouchModeChangeListener
/*     */ {
/*     */   public static final int CHOICE_MODE_MULTIPLE = 2;
/*     */   public static final int CHOICE_MODE_MULTIPLE_MODAL = 3;
/*     */   public static final int CHOICE_MODE_NONE = 0;
/*     */   public static final int CHOICE_MODE_SINGLE = 1;
/*     */   public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;
/*     */   public static final int TRANSCRIPT_MODE_DISABLED = 0;
/*     */   public static final int TRANSCRIPT_MODE_NORMAL = 1;
/*     */   
/*     */   public AbsListView(Context context) {
/*  57 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AbsListView(Context context, AttributeSet attrs) {
/*  59 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AbsListView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  61 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public AbsListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  63 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public void setOverScrollMode(int mode) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAdapter(ListAdapter adapter) {
/*  71 */     throw new RuntimeException("Stub!");
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
/*     */   public int getCheckedItemCount() {
/*  87 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean isItemChecked(int position) {
/* 101 */     throw new RuntimeException("Stub!");
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
/*     */   public int getCheckedItemPosition() {
/* 113 */     throw new RuntimeException("Stub!");
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
/*     */   public SparseBooleanArray getCheckedItemPositions() {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long[] getCheckedItemIds() {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void clearChoices() {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItemChecked(int position, boolean value) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   } public boolean performItemClick(View view, int position, long id) {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChoiceMode() {
/* 163 */     throw new RuntimeException("Stub!");
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
/*     */   public void setChoiceMode(int choiceMode) {
/* 175 */     throw new RuntimeException("Stub!");
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
/*     */   public void setMultiChoiceModeListener(MultiChoiceModeListener listener) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFastScrollEnabled(boolean enabled) {
/* 205 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFastScrollStyle(int styleResId) {
/* 214 */     throw new RuntimeException("Stub!");
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
/*     */   public void setFastScrollAlwaysVisible(boolean alwaysShow) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFastScrollAlwaysVisible() {
/* 240 */     throw new RuntimeException("Stub!");
/*     */   } public int getVerticalScrollbarWidth() {
/* 242 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExportedProperty
/*     */   public boolean isFastScrollEnabled() {
/* 251 */     throw new RuntimeException("Stub!");
/*     */   } public void setVerticalScrollbarPosition(int position) {
/* 253 */     throw new RuntimeException("Stub!");
/*     */   } public void setScrollBarStyle(int style) {
/* 255 */     throw new RuntimeException("Stub!");
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
/*     */   public void setSmoothScrollbarEnabled(boolean enabled) {
/* 276 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExportedProperty
/*     */   public boolean isSmoothScrollbarEnabled() {
/* 286 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnScrollListener(OnScrollListener l) {
/* 294 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
/* 298 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 300 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExportedProperty
/*     */   public boolean isScrollingCacheEnabled() {
/* 312 */     throw new RuntimeException("Stub!");
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
/*     */   public void setScrollingCacheEnabled(boolean enabled) {
/* 328 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTextFilterEnabled(boolean textFilterEnabled) {
/* 341 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExportedProperty
/*     */   public boolean isTextFilterEnabled() {
/* 352 */     throw new RuntimeException("Stub!");
/*     */   } public void getFocusedRect(Rect r) {
/* 354 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExportedProperty
/*     */   public boolean isStackFromBottom() {
/* 363 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStackFromBottom(boolean stackFromBottom) {
/* 373 */     throw new RuntimeException("Stub!");
/*     */   } public Parcelable onSaveInstanceState() {
/* 375 */     throw new RuntimeException("Stub!");
/*     */   } public void onRestoreInstanceState(Parcelable state) {
/* 377 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFilterText(String filterText) {
/* 386 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getTextFilter() {
/* 393 */     throw new RuntimeException("Stub!");
/*     */   } protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
/* 395 */     throw new RuntimeException("Stub!");
/*     */   } public void requestLayout() {
/* 397 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollExtent() {
/* 399 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollOffset() {
/* 401 */     throw new RuntimeException("Stub!");
/*     */   } protected int computeVerticalScrollRange() {
/* 403 */     throw new RuntimeException("Stub!");
/*     */   } protected float getTopFadingEdgeStrength() {
/* 405 */     throw new RuntimeException("Stub!");
/*     */   } protected float getBottomFadingEdgeStrength() {
/* 407 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 409 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onLayout(boolean changed, int l, int t, int r, int b) {
/* 416 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void layoutChildren() {
/* 422 */     throw new RuntimeException("Stub!"); } @ExportedProperty
/*     */   public View getSelectedView() {
/* 424 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getListPaddingTop() {
/* 435 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getListPaddingBottom() {
/* 446 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getListPaddingLeft() {
/* 457 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getListPaddingRight() {
/* 468 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onInitializeAccessibilityNodeInfoForItem(View view, int position, AccessibilityNodeInfo info) {
/* 479 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchDraw(Canvas canvas) {
/* 481 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean isPaddingOffsetRequired() {
/* 483 */     throw new RuntimeException("Stub!");
/*     */   } protected int getLeftPaddingOffset() {
/* 485 */     throw new RuntimeException("Stub!");
/*     */   } protected int getTopPaddingOffset() {
/* 487 */     throw new RuntimeException("Stub!");
/*     */   } protected int getRightPaddingOffset() {
/* 489 */     throw new RuntimeException("Stub!");
/*     */   } protected int getBottomPaddingOffset() {
/* 491 */     throw new RuntimeException("Stub!");
/*     */   } protected void onSizeChanged(int w, int h, int oldw, int oldh) {
/* 493 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDrawSelectorOnTop(boolean onTop) {
/* 505 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelector(int resID) {
/* 515 */     throw new RuntimeException("Stub!");
/*     */   } public void setSelector(Drawable sel) {
/* 517 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Drawable getSelector() {
/* 526 */     throw new RuntimeException("Stub!");
/*     */   } public void setScrollIndicators(View up, View down) {
/* 528 */     throw new RuntimeException("Stub!");
/*     */   } protected void drawableStateChanged() {
/* 530 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean verifyDrawable(@RecentlyNonNull Drawable dr) {
/* 536 */     throw new RuntimeException("Stub!");
/*     */   } public void jumpDrawablesToCurrentState() {
/* 538 */     throw new RuntimeException("Stub!");
/*     */   } protected void onAttachedToWindow() {
/* 540 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDetachedFromWindow() {
/* 542 */     throw new RuntimeException("Stub!");
/*     */   } public void onWindowFocusChanged(boolean hasWindowFocus) {
/* 544 */     throw new RuntimeException("Stub!");
/*     */   } public void onRtlPropertiesChanged(int layoutDirection) {
/* 546 */     throw new RuntimeException("Stub!");
/*     */   } public void onCancelPendingInputEvents() {
/* 548 */     throw new RuntimeException("Stub!");
/*     */   } protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
/* 550 */     throw new RuntimeException("Stub!");
/*     */   } public boolean showContextMenu() {
/* 552 */     throw new RuntimeException("Stub!");
/*     */   } public boolean showContextMenu(float x, float y) {
/* 554 */     throw new RuntimeException("Stub!");
/*     */   } public boolean showContextMenuForChild(View originalView) {
/* 556 */     throw new RuntimeException("Stub!");
/*     */   } public boolean showContextMenuForChild(View originalView, float x, float y) {
/* 558 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyDown(int keyCode, KeyEvent event) {
/* 560 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onKeyUp(int keyCode, KeyEvent event) {
/* 562 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchSetPressed(boolean pressed) {
/* 564 */     throw new RuntimeException("Stub!");
/*     */   } public void dispatchDrawableHotspotChanged(float x, float y) {
/* 566 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int pointToPosition(int x, int y) {
/* 577 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long pointToRowId(int x, int y) {
/* 588 */     throw new RuntimeException("Stub!");
/*     */   } public void onTouchModeChanged(boolean isInTouchMode) {
/* 590 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onTouchEvent(MotionEvent ev) {
/* 592 */     throw new RuntimeException("Stub!");
/*     */   } protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
/* 594 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onGenericMotionEvent(MotionEvent event) {
/* 596 */     throw new RuntimeException("Stub!");
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
/*     */   public void fling(int velocityY) {
/* 608 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
/* 610 */     throw new RuntimeException("Stub!");
/*     */   } public void onNestedScrollAccepted(View child, View target, int axes) {
/* 612 */     throw new RuntimeException("Stub!");
/*     */   } public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
/* 614 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
/* 616 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas canvas) {
/* 618 */     throw new RuntimeException("Stub!");
/*     */   } public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
/* 620 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onInterceptHoverEvent(MotionEvent event) {
/* 622 */     throw new RuntimeException("Stub!");
/*     */   } public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
/* 624 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onInterceptTouchEvent(MotionEvent ev) {
/* 626 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addTouchables(ArrayList<View> views) {
/* 632 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFriction(float friction) {
/* 639 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVelocityScale(float scale) {
/* 648 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void smoothScrollToPosition(int position) {
/* 656 */     throw new RuntimeException("Stub!");
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
/*     */   public void smoothScrollToPositionFromTop(int position, int offset, int duration) {
/* 671 */     throw new RuntimeException("Stub!");
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
/*     */   public void smoothScrollToPositionFromTop(int position, int offset) {
/* 685 */     throw new RuntimeException("Stub!");
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
/*     */   public void smoothScrollToPosition(int position, int boundPosition) {
/* 698 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void smoothScrollBy(int distance, int duration) {
/* 706 */     throw new RuntimeException("Stub!");
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
/*     */   public void scrollListBy(int y) {
/* 718 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean canScrollList(int direction) {
/* 730 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void invalidateViews() {
/* 736 */     throw new RuntimeException("Stub!");
/*     */   } protected void handleDataChanged() {
/* 738 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDisplayHint(int hint) {
/* 740 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean isInFilterMode() {
/* 742 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
/* 748 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean checkInputConnectionProxy(View view) {
/* 755 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void clearTextFilter() {
/* 761 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasTextFilter() {
/* 767 */     throw new RuntimeException("Stub!");
/*     */   } public void onGlobalLayout() {
/* 769 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void beforeTextChanged(CharSequence s, int start, int count, int after) {
/* 776 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onTextChanged(CharSequence s, int start, int before, int count) {
/* 784 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void afterTextChanged(Editable s) {
/* 791 */     throw new RuntimeException("Stub!");
/*     */   } public void onFilterComplete(int count) {
/* 793 */     throw new RuntimeException("Stub!");
/*     */   } protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 795 */     throw new RuntimeException("Stub!");
/*     */   } protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
/* 797 */     throw new RuntimeException("Stub!");
/*     */   } public LayoutParams generateLayoutParams(AttributeSet attrs) {
/* 799 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
/* 801 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTranscriptMode(int mode) {
/* 814 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTranscriptMode() {
/* 823 */     throw new RuntimeException("Stub!");
/*     */   } public int getSolidColor() {
/* 825 */     throw new RuntimeException("Stub!");
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
/*     */   public void setCacheColorHint(int color) {
/* 838 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExportedProperty(category = "drawing")
/*     */   public int getCacheColorHint() {
/* 847 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void reclaimViews(List<View> views) {
/* 857 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRemoteViewsAdapter(Intent intent) {
/* 865 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deferNotifyDataSetChanged() {
/* 872 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onRemoteAdapterConnected() {
/* 878 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRemoteAdapterDisconnected() {
/* 884 */     throw new RuntimeException("Stub!");
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
/*     */   public void setRecyclerListener(RecyclerListener listener) {
/* 898 */     throw new RuntimeException("Stub!");
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
/*     */   public void setSelectionFromTop(int position, int y) {
/* 910 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface SelectionBoundsAdjuster
/*     */   {
/*     */     void adjustListItemSelectionBounds(Rect param1Rect);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface RecyclerListener
/*     */   {
/*     */     void onMovedToScrapHeap(View param1View);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnScrollListener
/*     */   {
/*     */     public static final int SCROLL_STATE_FLING = 2;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int SCROLL_STATE_IDLE = 0;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void onScrollStateChanged(AbsListView param1AbsListView, int param1Int);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface MultiChoiceModeListener
/*     */     extends ActionMode.Callback
/*     */   {
/*     */     void onItemCheckedStateChanged(ActionMode param1ActionMode, int param1Int, long param1Long, boolean param1Boolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class LayoutParams
/*     */     extends ViewGroup.LayoutParams
/*     */   {
/*     */     public LayoutParams(Context c, AttributeSet attrs) {
/* 969 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public LayoutParams(int w, int h) {
/* 971 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public LayoutParams(int w, int h, int viewType) {
/* 973 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public LayoutParams(ViewGroup.LayoutParams source) {
/* 975 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\AbsListView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */