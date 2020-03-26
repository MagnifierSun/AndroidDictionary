/*       */ package android.view;
/*       */ 
/*       */ import android.animation.StateListAnimator;
/*       */ import android.content.ClipData;
/*       */ import android.content.Context;
/*       */ import android.content.res.ColorStateList;
/*       */ import android.content.res.Configuration;
/*       */ import android.content.res.Resources;
/*       */ import android.graphics.Bitmap;
/*       */ import android.graphics.Canvas;
/*       */ import android.graphics.Matrix;
/*       */ import android.graphics.Paint;
/*       */ import android.graphics.Point;
/*       */ import android.graphics.PorterDuff;
/*       */ import android.graphics.Rect;
/*       */ import android.graphics.drawable.Drawable;
/*       */ import android.os.Bundle;
/*       */ import android.os.Handler;
/*       */ import android.os.IBinder;
/*       */ import android.os.Parcel;
/*       */ import android.os.Parcelable;
/*       */ import android.util.AttributeSet;
/*       */ import android.util.Property;
/*       */ import android.util.SparseArray;
/*       */ import android.view.accessibility.AccessibilityEvent;
/*       */ import android.view.accessibility.AccessibilityEventSource;
/*       */ import android.view.accessibility.AccessibilityNodeInfo;
/*       */ import android.view.accessibility.AccessibilityNodeProvider;
/*       */ import android.view.animation.Animation;
/*       */ import android.view.autofill.AutofillId;
/*       */ import android.view.autofill.AutofillValue;
/*       */ import android.view.inputmethod.EditorInfo;
/*       */ import android.view.inputmethod.InputConnection;
/*       */ import androidx.annotation.RecentlyNonNull;
/*       */ import androidx.annotation.RecentlyNullable;
/*       */ import java.util.ArrayList;
/*       */ import java.util.Collection;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ public class View
/*       */   implements Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource
/*       */ {
/*       */   public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
/*       */   public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
/*       */   public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
/*       */   
/*       */   public View(Context context) {
/*   718 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public View(Context context, @RecentlyNullable AttributeSet attrs) {
/*   738 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public View(Context context, @RecentlyNullable AttributeSet attrs, int defStyleAttr) {
/*   759 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public View(Context context, @RecentlyNullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*   796 */     throw new RuntimeException("Stub!");
/*       */   } public String toString() {
/*   798 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getVerticalFadingEdgeLength() {
/*   809 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setFadingEdgeLength(int length) {
/*   822 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getHorizontalFadingEdgeLength() {
/*   833 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getVerticalScrollbarWidth() {
/*   842 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int getHorizontalScrollbarHeight() {
/*   851 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setVerticalScrollbarPosition(int position) {
/*   861 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getVerticalScrollbarPosition() {
/*   868 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollIndicators(int indicators) {
/*   883 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollIndicators(int indicators, int mask) {
/*   917 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getScrollIndicators() {
/*   934 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnScrollChangeListener(OnScrollChangeListener l) {
/*   951 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnFocusChangeListener(OnFocusChangeListener l) {
/*   959 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void addOnLayoutChangeListener(OnLayoutChangeListener listener) {
/*   968 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void removeOnLayoutChangeListener(OnLayoutChangeListener listener) {
/*   976 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void addOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
/*   989 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void removeOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
/*   999 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public OnFocusChangeListener getOnFocusChangeListener() {
/*  1007 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnClickListener(@RecentlyNullable OnClickListener l) {
/*  1019 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean hasOnClickListeners() {
/*  1026 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnLongClickListener(@RecentlyNullable OnLongClickListener l) {
/*  1038 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnContextClickListener(@RecentlyNullable OnContextClickListener l) {
/*  1049 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnCreateContextMenuListener(OnCreateContextMenuListener l) {
/*  1059 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean performClick() {
/*  1070 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean callOnClick() {
/*  1081 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean performLongClick() {
/*  1091 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean performLongClick(float x, float y) {
/*  1106 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean performContextClick(float x, float y) {
/*  1117 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean performContextClick() {
/*  1126 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean showContextMenu() {
/*  1136 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean showContextMenu(float x, float y) {
/*  1150 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public ActionMode startActionMode(ActionMode.Callback callback) {
/*  1162 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public ActionMode startActionMode(ActionMode.Callback callback, int type) {
/*  1174 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnKeyListener(OnKeyListener l) {
/*  1183 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnTouchListener(OnTouchListener l) {
/*  1190 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnGenericMotionListener(OnGenericMotionListener l) {
/*  1197 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnHoverListener(OnHoverListener l) {
/*  1204 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnDragListener(OnDragListener l) {
/*  1214 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void setRevealOnFocusHint(boolean revealOnFocus) {
/*  1232 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final boolean getRevealOnFocusHint() {
/*  1249 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean requestRectangleOnScreen(Rect rectangle) {
/*  1266 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate) {
/*  1286 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void clearFocus() {
/*  1300 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "focus")
/*       */   public boolean hasFocus() {
/*  1309 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean hasFocusable() {
/*  1333 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean hasExplicitFocusable() {
/*  1353 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onFocusChanged(boolean gainFocus, int direction, @RecentlyNullable Rect previouslyFocusedRect) {
/*  1379 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAccessibilityPaneTitle(@RecentlyNullable CharSequence accessibilityPaneTitle) {
/*  1396 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @RecentlyNullable
/*       */   public CharSequence getAccessibilityPaneTitle() {
/*  1408 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void sendAccessibilityEvent(int eventType) {
/*  1438 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void announceForAccessibility(CharSequence text) {
/*  1450 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
/*  1468 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
/*  1496 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
/*  1532 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
/*  1563 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public AccessibilityNodeInfo createAccessibilityNodeInfo() {
/*  1582 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
/*  1618 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public CharSequence getAccessibilityClassName() {
/*  1628 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onProvideStructure(ViewStructure structure) {
/*  1637 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onProvideAutofillStructure(ViewStructure structure, int flags) {
/*  1710 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onProvideVirtualStructure(ViewStructure structure) {
/*  1721 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
/*  1788 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void autofill(AutofillValue value) {
/*  1836 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void autofill(@RecentlyNonNull SparseArray<AutofillValue> values) {
/*  1866 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final AutofillId getAutofillId() {
/*  1879 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAutofillId(@RecentlyNullable AutofillId id) {
/*  1925 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getAutofillType() {
/*  1943 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   @RecentlyNullable
/*       */   public String[] getAutofillHints() {
/*  1957 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @RecentlyNullable
/*       */   public AutofillValue getAutofillValue() {
/*  1969 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(mapping = {@IntToString(from = 0, to = "auto"), @IntToString(from = 1, to = "yes"), @IntToString(from = 2, to = "no"), @IntToString(from = 4, to = "yesExcludeDescendants"), @IntToString(from = 8, to = "noExcludeDescendants")})
/*       */   public int getImportantForAutofill() {
/*  1984 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setImportantForAutofill(int mode) {
/*  2019 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final boolean isImportantForAutofill() {
/*  2080 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchProvideStructure(ViewStructure structure) {
/*  2088 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchProvideAutofillStructure(@RecentlyNonNull ViewStructure structure, int flags) {
/*  2130 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void addExtraDataToAccessibilityNodeInfo(@RecentlyNonNull AccessibilityNodeInfo info, @RecentlyNonNull String extraDataKey, @RecentlyNullable Bundle arguments) {
/*  2153 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isVisibleToUserForAutofill(int virtualId) {
/*  2164 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAccessibilityDelegate(@RecentlyNullable AccessibilityDelegate delegate) {
/*  2189 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public AccessibilityNodeProvider getAccessibilityNodeProvider() {
/*  2214 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "accessibility")
/*       */   public CharSequence getContentDescription() {
/*  2229 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setContentDescription(CharSequence contentDescription) {
/*  2248 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAccessibilityTraversalBefore(int beforeId) {
/*  2273 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getAccessibilityTraversalBefore() {
/*  2284 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAccessibilityTraversalAfter(int afterId) {
/*  2309 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getAccessibilityTraversalAfter() {
/*  2320 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "accessibility")
/*       */   public int getLabelFor() {
/*  2329 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setLabelFor(int id) {
/*  2338 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "focus")
/*       */   public boolean isFocused() {
/*  2346 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public View findFocus() {
/*  2356 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isScrollContainer() {
/*  2368 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollContainer(boolean isScrollContainer) {
/*  2380 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public int getDrawingCacheQuality() {
/*  2409 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void setDrawingCacheQuality(int quality) {
/*  2439 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean getKeepScreenOn() {
/*  2452 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setKeepScreenOn(boolean keepScreenOn) {
/*  2465 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getNextFocusLeftId() {
/*  2474 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setNextFocusLeftId(int nextFocusLeftId) {
/*  2484 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getNextFocusRightId() {
/*  2493 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setNextFocusRightId(int nextFocusRightId) {
/*  2503 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getNextFocusUpId() {
/*  2512 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setNextFocusUpId(int nextFocusUpId) {
/*  2522 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getNextFocusDownId() {
/*  2531 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setNextFocusDownId(int nextFocusDownId) {
/*  2541 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getNextFocusForwardId() {
/*  2550 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setNextFocusForwardId(int nextFocusForwardId) {
/*  2560 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getNextClusterForwardId() {
/*  2570 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setNextClusterForwardId(int nextClusterForwardId) {
/*  2580 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isShown() {
/*  2588 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   protected boolean fitSystemWindows(Rect insets) {
/*  2654 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public WindowInsets onApplyWindowInsets(WindowInsets insets) {
/*  2682 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnApplyWindowInsetsListener(OnApplyWindowInsetsListener listener) {
/*  2696 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
/*  2720 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public WindowInsets getRootWindowInsets() {
/*  2729 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public WindowInsets computeSystemWindowInsets(WindowInsets in, Rect outLocalInsets) {
/*  2742 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setFitsSystemWindows(boolean fitSystemWindows) {
/*  2764 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean getFitsSystemWindows() {
/*  2780 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void requestFitSystemWindows() {
/*  2787 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public void requestApplyInsets() {
/*  2793 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(mapping = {@IntToString(from = 0, to = "VISIBLE"), @IntToString(from = 4, to = "INVISIBLE"), @IntToString(from = 8, to = "GONE")})
/*       */   public int getVisibility() {
/*  2803 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setVisibility(int visibility) {
/*  2813 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean isEnabled() {
/*  2822 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setEnabled(boolean enabled) {
/*  2831 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setFocusable(boolean focusable) {
/*  2846 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setFocusable(int focusable) {
/*  2864 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setFocusableInTouchMode(boolean focusableInTouchMode) {
/*  2878 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAutofillHints(@RecentlyNullable String... autofillHints) {
/*  2907 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setSoundEffectsEnabled(boolean soundEffectsEnabled) {
/*  2922 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean isSoundEffectsEnabled() {
/*  2933 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) {
/*  2948 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean isHapticFeedbackEnabled() {
/*  2959 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setLayoutDirection(int layoutDirection) {
/*  2980 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "layout", mapping = {@IntToString(from = 0, to = "RESOLVED_DIRECTION_LTR"), @IntToString(from = 1, to = "RESOLVED_DIRECTION_RTL")})
/*       */   public int getLayoutDirection() {
/*  2995 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "layout")
/*       */   public boolean hasTransientState() {
/*  3010 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setHasTransientState(boolean hasTransientState) {
/*  3026 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isAttachedToWindow() {
/*  3032 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isLaidOut() {
/*  3039 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setWillNotDraw(boolean willNotDraw) {
/*  3052 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public boolean willNotDraw() {
/*  3060 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void setWillNotCacheDrawing(boolean willNotCacheDrawing) {
/*  3085 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   @ExportedProperty(category = "drawing")
/*       */   public boolean willNotCacheDrawing() {
/*  3106 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean isClickable() {
/*  3117 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setClickable(boolean clickable) {
/*  3131 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isLongClickable() {
/*  3142 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setLongClickable(boolean longClickable) {
/*  3155 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isContextClickable() {
/*  3165 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setContextClickable(boolean contextClickable) {
/*  3175 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setPressed(boolean pressed) {
/*  3187 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void dispatchSetPressed(boolean pressed) {
/*  3197 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean isPressed() {
/*  3211 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isSaveEnabled() {
/*  3223 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setSaveEnabled(boolean enabled) {
/*  3242 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean getFilterTouchesWhenObscured() {
/*  3255 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setFilterTouchesWhenObscured(boolean enabled) {
/*  3268 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isSaveFromParentEnabled() {
/*  3281 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setSaveFromParentEnabled(boolean enabled) {
/*  3297 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "focus")
/*       */   public final boolean isFocusable() {
/*  3305 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(mapping = {@IntToString(from = 0, to = "NOT_FOCUSABLE"), @IntToString(from = 1, to = "FOCUSABLE"), @IntToString(from = 16, to = "FOCUSABLE_AUTO")}, category = "focus")
/*       */   public int getFocusable() {
/*  3315 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "focus")
/*       */   public final boolean isFocusableInTouchMode() {
/*  3326 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isScreenReaderFocusable() {
/*  3336 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScreenReaderFocusable(boolean screenReaderFocusable) {
/*  3352 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isAccessibilityHeading() {
/*  3362 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAccessibilityHeading(boolean isHeading) {
/*  3372 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public View focusSearch(int direction) {
/*  3385 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "focus")
/*       */   public final boolean isKeyboardNavigationCluster() {
/*  3394 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setKeyboardNavigationCluster(boolean isCluster) {
/*  3404 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "focus")
/*       */   public final boolean isFocusedByDefault() {
/*  3419 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setFocusedByDefault(boolean isFocusedByDefault) {
/*  3436 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public View keyboardNavigationClusterSearch(View currentCluster, int direction) {
/*  3451 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchUnhandledMove(View focused, int direction) {
/*  3466 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setDefaultFocusHighlightEnabled(boolean defaultFocusHighlightEnabled) {
/*  3478 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "focus")
/*       */   public final boolean getDefaultFocusHighlightEnabled() {
/*  3489 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public ArrayList<View> getFocusables(int direction) {
/*  3500 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void addFocusables(ArrayList<View> views, int direction) {
/*  3513 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
/*  3534 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void addKeyboardNavigationClusters(@RecentlyNonNull Collection<View> views, int direction) {
/*  3545 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void findViewsWithText(ArrayList<View> outViews, CharSequence searched, int flags) {
/*  3565 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public ArrayList<View> getTouchables() {
/*  3574 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void addTouchables(ArrayList<View> views) {
/*  3583 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isAccessibilityFocused() {
/*  3591 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final boolean requestFocus() {
/*  3611 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean restoreDefaultFocus() {
/*  3620 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final boolean requestFocus(int direction) {
/*  3640 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
/*  3672 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final boolean requestFocusFromTouch() {
/*  3685 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "accessibility", mapping = {@IntToString(from = 0, to = "auto"), @IntToString(from = 1, to = "yes"), @IntToString(from = 2, to = "no"), @IntToString(from = 4, to = "noHideDescendants")})
/*       */   public int getImportantForAccessibility() {
/*  3705 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAccessibilityLiveRegion(int mode) {
/*  3736 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getAccessibilityLiveRegion() {
/*  3748 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setImportantForAccessibility(int mode) {
/*  3765 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isImportantForAccessibility() {
/*  3803 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public ViewParent getParentForAccessibility() {
/*  3813 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void addChildrenForAccessibility(ArrayList<View> outChildren) {
/*  3824 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchNestedPrePerformAccessibilityAction(int action, Bundle arguments) {
/*  3846 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean performAccessibilityAction(int action, Bundle arguments) {
/*  3868 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final boolean isTemporarilyDetached() {
/*  3887 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchStartTemporaryDetach() {
/*  3897 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onStartTemporaryDetach() {
/*  3906 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchFinishTemporaryDetach() {
/*  3916 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onFinishTemporaryDetach() {
/*  3923 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public KeyEvent.DispatcherState getKeyDispatcherState() {
/*  3933 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchKeyEventPreIme(KeyEvent event) {
/*  3946 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchKeyEvent(KeyEvent event) {
/*  3959 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchKeyShortcutEvent(KeyEvent event) {
/*  3968 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchTouchEvent(MotionEvent event) {
/*  3978 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onFilterTouchEventForSecurity(MotionEvent event) {
/*  3989 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchTrackballEvent(MotionEvent event) {
/*  3998 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchCapturedPointerEvent(MotionEvent event) {
/*  4007 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchGenericMotionEvent(MotionEvent event) {
/*  4022 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean dispatchHoverEvent(MotionEvent event) {
/*  4035 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean dispatchGenericPointerEvent(MotionEvent event) {
/*  4048 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean dispatchGenericFocusedEvent(MotionEvent event) {
/*  4061 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchWindowFocusChanged(boolean hasFocus) {
/*  4071 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onWindowFocusChanged(boolean hasWindowFocus) {
/*  4084 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean hasWindowFocus() {
/*  4093 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void dispatchVisibilityChanged(@RecentlyNonNull View changedView, int visibility) {
/*  4107 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onVisibilityChanged(@RecentlyNonNull View changedView, int visibility) {
/*  4122 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchDisplayHint(int hint) {
/*  4136 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onDisplayHint(int hint) {
/*  4150 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchWindowVisibilityChanged(int visibility) {
/*  4162 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onWindowVisibilityChanged(int visibility) {
/*  4177 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onVisibilityAggregated(boolean isVisible) {
/*  4189 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getWindowVisibility() {
/*  4200 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void getWindowVisibleDisplayFrame(Rect outRect) {
/*  4219 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchConfigurationChanged(Configuration newConfig) {
/*  4231 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onConfigurationChanged(Configuration newConfig) {
/*  4244 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean isInTouchMode() {
/*  4254 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @CapturedViewProperty
/*       */   public final Context getContext() {
/*  4263 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onKeyPreIme(int keyCode, KeyEvent event) {
/*  4278 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onKeyDown(int keyCode, KeyEvent event) {
/*  4295 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onKeyLongPress(int keyCode, KeyEvent event) {
/*  4306 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onKeyUp(int keyCode, KeyEvent event) {
/*  4322 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
/*  4338 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onKeyShortcut(int keyCode, KeyEvent event) {
/*  4352 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onCheckIsTextEditor() {
/*  4372 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
/*  4394 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean checkInputConnectionProxy(View view) {
/*  4407 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void createContextMenu(ContextMenu menu) {
/*  4420 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
/*  4433 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onCreateContextMenu(ContextMenu menu) {
/*  4442 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onTrackballEvent(MotionEvent event) {
/*  4457 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onGenericMotionEvent(MotionEvent event) {
/*  4497 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onHoverEvent(MotionEvent event) {
/*  4536 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean isHovered() {
/*  4547 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setHovered(boolean hovered) {
/*  4565 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onHoverChanged(boolean hovered) {
/*  4580 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onTouchEvent(MotionEvent event) {
/*  4600 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void cancelLongPress() {
/*  4609 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public void setTouchDelegate(TouchDelegate delegate) {
/*  4615 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public TouchDelegate getTouchDelegate() {
/*  4621 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void requestUnbufferedDispatch(MotionEvent event) {
/*  4638 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void bringToFront() {
/*  4652 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onScrollChanged(int l, int t, int oldl, int oldt) {
/*  4666 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onSizeChanged(int w, int h, int oldw, int oldh) {
/*  4679 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void dispatchDraw(Canvas canvas) {
/*  4688 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final ViewParent getParent() {
/*  4697 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollX(int value) {
/*  4706 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollY(int value) {
/*  4715 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final int getScrollX() {
/*  4726 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final int getScrollY() {
/*  4736 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "layout")
/*       */   public final int getWidth() {
/*  4744 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "layout")
/*       */   public final int getHeight() {
/*  4752 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void getDrawingRect(Rect outRect) {
/*  4764 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final int getMeasuredWidth() {
/*  4774 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "measurement", flagMapping = {@FlagToString(mask = -16777216, equals = 16777216, name = "MEASURED_STATE_TOO_SMALL")})
/*       */   public final int getMeasuredWidthAndState() {
/*  4786 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final int getMeasuredHeight() {
/*  4796 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "measurement", flagMapping = {@FlagToString(mask = -16777216, equals = 16777216, name = "MEASURED_STATE_TOO_SMALL")})
/*       */   public final int getMeasuredHeightAndState() {
/*  4808 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final int getMeasuredState() {
/*  4818 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Matrix getMatrix() {
/*  4832 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public float getCameraDistance() {
/*  4842 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setCameraDistance(float distance) {
/*  4884 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getRotation() {
/*  4896 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setRotation(float rotation) {
/*  4913 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getRotationY() {
/*  4925 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setRotationY(float rotationY) {
/*  4947 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getRotationX() {
/*  4959 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setRotationX(float rotationX) {
/*  4981 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getScaleX() {
/*  4994 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScaleX(float scaleX) {
/*  5007 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getScaleY() {
/*  5020 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScaleY(float scaleY) {
/*  5033 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getPivotX() {
/*  5048 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setPivotX(float pivotX) {
/*  5066 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getPivotY() {
/*  5081 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setPivotY(float pivotY) {
/*  5098 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isPivotSet() {
/*  5108 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void resetPivot() {
/*  5116 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getAlpha() {
/*  5126 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void forceHasOverlappingRendering(boolean hasOverlappingRendering) {
/*  5143 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final boolean getHasOverlappingRendering() {
/*  5153 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public boolean hasOverlappingRendering() {
/*  5173 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAlpha(float alpha) {
/*  5214 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @CapturedViewProperty
/*       */   public final int getTop() {
/*  5222 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void setTop(int top) {
/*  5232 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @CapturedViewProperty
/*       */   public final int getBottom() {
/*  5240 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isDirty() {
/*  5248 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void setBottom(int bottom) {
/*  5258 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @CapturedViewProperty
/*       */   public final int getLeft() {
/*  5266 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void setLeft(int left) {
/*  5276 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @CapturedViewProperty
/*       */   public final int getRight() {
/*  5284 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void setRight(int right) {
/*  5294 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getX() {
/*  5304 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setX(float x) {
/*  5314 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getY() {
/*  5324 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setY(float y) {
/*  5334 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getZ() {
/*  5344 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setZ(float z) {
/*  5354 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getElevation() {
/*  5362 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setElevation(float elevation) {
/*  5370 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getTranslationX() {
/*  5380 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setTranslationX(float translationX) {
/*  5393 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getTranslationY() {
/*  5404 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setTranslationY(float translationY) {
/*  5417 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public float getTranslationZ() {
/*  5425 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setTranslationZ(float translationZ) {
/*  5433 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public StateListAnimator getStateListAnimator() {
/*  5442 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setStateListAnimator(StateListAnimator stateListAnimator) {
/*  5453 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final boolean getClipToOutline() {
/*  5465 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setClipToOutline(boolean clipToOutline) {
/*  5483 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOutlineProvider(ViewOutlineProvider provider) {
/*  5503 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public ViewOutlineProvider getOutlineProvider() {
/*  5512 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void invalidateOutline() {
/*  5520 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOutlineSpotShadowColor(int color) {
/*  5537 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getOutlineSpotShadowColor() {
/*  5544 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOutlineAmbientShadowColor(int color) {
/*  5561 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getOutlineAmbientShadowColor() {
/*  5568 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void getHitRect(Rect outRect) {
/*  5576 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void getFocusedRect(Rect r) {
/*  5590 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean getGlobalVisibleRect(Rect r, Point globalOffset) {
/*  5607 */     throw new RuntimeException("Stub!");
/*       */   } public final boolean getGlobalVisibleRect(Rect r) {
/*  5609 */     throw new RuntimeException("Stub!");
/*       */   } public final boolean getLocalVisibleRect(Rect r) {
/*  5611 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void offsetTopAndBottom(int offset) {
/*  5619 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void offsetLeftAndRight(int offset) {
/*  5627 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(deepExport = true, prefix = "layout_")
/*       */   public ViewGroup.LayoutParams getLayoutParams() {
/*  5645 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setLayoutParams(ViewGroup.LayoutParams params) {
/*  5657 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void scrollTo(int x, int y) {
/*  5667 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void scrollBy(int x, int y) {
/*  5677 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean awakenScrollBars() {
/*  5709 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean awakenScrollBars(int startDelay) {
/*  5746 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean awakenScrollBars(int startDelay, boolean invalidate) {
/*  5787 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void invalidate(Rect dirty) {
/*  5808 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void invalidate(int l, int t, int r, int b) {
/*  5830 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void invalidate() {
/*  5841 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public boolean isOpaque() {
/*  5855 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Handler getHandler() {
/*  5862 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean post(Runnable action) {
/*  5878 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean postDelayed(Runnable action, long delayMillis) {
/*  5900 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void postOnAnimation(Runnable action) {
/*  5912 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void postOnAnimationDelayed(Runnable action, long delayMillis) {
/*  5927 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean removeCallbacks(Runnable action) {
/*  5945 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void postInvalidate() {
/*  5958 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void postInvalidate(int left, int top, int right, int bottom) {
/*  5977 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void postInvalidateDelayed(long delayMilliseconds) {
/*  5993 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void postInvalidateDelayed(long delayMilliseconds, int left, int top, int right, int bottom) {
/*  6014 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void postInvalidateOnAnimation() {
/*  6026 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void postInvalidateOnAnimation(int left, int top, int right, int bottom) {
/*  6044 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void computeScroll() {
/*  6053 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isHorizontalFadingEdgeEnabled() {
/*  6067 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) {
/*  6082 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isVerticalFadingEdgeEnabled() {
/*  6096 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) {
/*  6111 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected float getTopFadingEdgeStrength() {
/*  6124 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected float getBottomFadingEdgeStrength() {
/*  6137 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected float getLeftFadingEdgeStrength() {
/*  6150 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected float getRightFadingEdgeStrength() {
/*  6163 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isHorizontalScrollBarEnabled() {
/*  6175 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) {
/*  6187 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isVerticalScrollBarEnabled() {
/*  6199 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) {
/*  6211 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollbarFadingEnabled(boolean fadeScrollbars) {
/*  6221 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isScrollbarFadingEnabled() {
/*  6232 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getScrollBarDefaultDelayBeforeFade() {
/*  6243 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollBarDefaultDelayBeforeFade(int scrollBarDefaultDelayBeforeFade) {
/*  6253 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getScrollBarFadeDuration() {
/*  6264 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollBarFadeDuration(int scrollBarFadeDuration) {
/*  6274 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getScrollBarSize() {
/*  6285 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollBarSize(int scrollBarSize) {
/*  6295 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setScrollBarStyle(int style) {
/*  6318 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(mapping = {@IntToString(from = 0, to = "INSIDE_OVERLAY"), @IntToString(from = 16777216, to = "INSIDE_INSET"), @IntToString(from = 33554432, to = "OUTSIDE_OVERLAY"), @IntToString(from = 50331648, to = "OUTSIDE_INSET")})
/*       */   public int getScrollBarStyle() {
/*  6332 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int computeHorizontalScrollRange() {
/*  6352 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int computeHorizontalScrollOffset() {
/*  6372 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int computeHorizontalScrollExtent() {
/*  6392 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int computeVerticalScrollRange() {
/*  6410 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int computeVerticalScrollOffset() {
/*  6430 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int computeVerticalScrollExtent() {
/*  6450 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean canScrollHorizontally(int direction) {
/*  6459 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean canScrollVertically(int direction) {
/*  6468 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected final void onDrawScrollBars(Canvas canvas) {
/*  6479 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onDraw(Canvas canvas) {
/*  6487 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onAttachedToWindow() {
/*  6501 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onScreenStateChanged(int screenState) {
/*  6513 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onRtlPropertiesChanged(int layoutDirection) {
/*  6531 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean canResolveLayoutDirection() {
/*  6539 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isLayoutDirectionResolved() {
/*  6545 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onDetachedFromWindow() {
/*  6556 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   protected int getWindowAttachCount() {
/*  6562 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public IBinder getWindowToken() {
/*  6570 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public WindowId getWindowId() {
/*  6577 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public IBinder getApplicationWindowToken() {
/*  6590 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Display getDisplay() {
/*  6598 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void cancelPendingInputEvents() {
/*  6622 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onCancelPendingInputEvents() {
/*  6636 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void saveHierarchyState(SparseArray<Parcelable> container) {
/*  6648 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
/*  6662 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @RecentlyNullable
/*       */   protected Parcelable onSaveInstanceState() {
/*  6687 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void restoreHierarchyState(SparseArray<Parcelable> container) {
/*  6699 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
/*  6714 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onRestoreInstanceState(Parcelable state) {
/*  6731 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public long getDrawingTime() {
/*  6739 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setDuplicateParentStateEnabled(boolean enabled) {
/*  6763 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isDuplicateParentStateEnabled() {
/*  6775 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setLayerType(int layerType, @RecentlyNullable Paint paint) {
/*  6816 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setLayerPaint(@RecentlyNullable Paint paint) {
/*  6845 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getLayerType() {
/*  6863 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void buildLayer() {
/*  6879 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void setDrawingCacheEnabled(boolean enabled) {
/*  6922 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   @ExportedProperty(category = "drawing")
/*       */   public boolean isDrawingCacheEnabled() {
/*  6946 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public Bitmap getDrawingCache() {
/*  6969 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public Bitmap getDrawingCache(boolean autoScale) {
/*  7012 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void destroyDrawingCache() {
/*  7038 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void setDrawingCacheBackgroundColor(int color) {
/*  7065 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public int getDrawingCacheBackgroundColor() {
/*  7086 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void buildDrawingCache() {
/*  7107 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void buildDrawingCache(boolean autoScale) {
/*  7146 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isInEditMode() {
/*  7164 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean isPaddingOffsetRequired() {
/*  7185 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int getLeftPaddingOffset() {
/*  7198 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int getRightPaddingOffset() {
/*  7211 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int getTopPaddingOffset() {
/*  7224 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int getBottomPaddingOffset() {
/*  7237 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public boolean isHardwareAccelerated() {
/*  7255 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setClipBounds(Rect clipBounds) {
/*  7266 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Rect getClipBounds() {
/*  7275 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean getClipBounds(Rect outRect) {
/*  7287 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void draw(Canvas canvas) {
/*  7301 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public ViewOverlay getOverlay() {
/*  7318 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "drawing")
/*       */   public int getSolidColor() {
/*  7332 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isLayoutRequested() {
/*  7341 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void layout(int l, int t, int r, int b) {
/*  7364 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
/*  7380 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onFinishInflate() {
/*  7393 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Resources getResources() {
/*  7401 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void invalidateDrawable(@RecentlyNonNull Drawable drawable) {
/*  7411 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void scheduleDrawable(@RecentlyNonNull Drawable who, @RecentlyNonNull Runnable what, long when) {
/*  7424 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void unscheduleDrawable(@RecentlyNonNull Drawable who, @RecentlyNonNull Runnable what) {
/*  7436 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void unscheduleDrawable(Drawable who) {
/*  7448 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean verifyDrawable(@RecentlyNonNull Drawable who) {
/*  7473 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void drawableStateChanged() {
/*  7489 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void drawableHotspotChanged(float x, float y) {
/*  7506 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchDrawableHotspotChanged(float x, float y) {
/*  7516 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void refreshDrawableState() {
/*  7527 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final int[] getDrawableState() {
/*  7540 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int[] onCreateDrawableState(int extraSpace) {
/*  7558 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected static int[] mergeDrawableStates(int[] baseState, int[] additionalState) {
/*  7578 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void jumpDrawablesToCurrentState() {
/*  7591 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setBackgroundColor(int color) {
/*  7598 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setBackgroundResource(int resid) {
/*  7608 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setBackground(Drawable background) {
/*  7621 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public void setBackgroundDrawable(Drawable background) {
/*  7627 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Drawable getBackground() {
/*  7639 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setBackgroundTintList(@RecentlyNullable ColorStateList tint) {
/*  7657 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @RecentlyNullable
/*       */   public ColorStateList getBackgroundTintList() {
/*  7668 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setBackgroundTintMode(@RecentlyNullable PorterDuff.Mode tintMode) {
/*  7683 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @RecentlyNullable
/*       */   public PorterDuff.Mode getBackgroundTintMode() {
/*  7696 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Drawable getForeground() {
/*  7707 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setForeground(Drawable foreground) {
/*  7717 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getForegroundGravity() {
/*  7729 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setForegroundGravity(int gravity) {
/*  7741 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setForegroundTintList(@RecentlyNullable ColorStateList tint) {
/*  7759 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @RecentlyNullable
/*       */   public ColorStateList getForegroundTintList() {
/*  7770 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setForegroundTintMode(@RecentlyNullable PorterDuff.Mode tintMode) {
/*  7785 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @RecentlyNullable
/*       */   public PorterDuff.Mode getForegroundTintMode() {
/*  7798 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onDrawForeground(Canvas canvas) {
/*  7810 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setPadding(int left, int top, int right, int bottom) {
/*  7830 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setPaddingRelative(int start, int top, int end, int bottom) {
/*  7850 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getPaddingTop() {
/*  7858 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getPaddingBottom() {
/*  7868 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getPaddingLeft() {
/*  7878 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getPaddingStart() {
/*  7888 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getPaddingRight() {
/*  7898 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getPaddingEnd() {
/*  7908 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isPaddingRelative() {
/*  7919 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setSelected(boolean selected) {
/*  7930 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void dispatchSetSelected(boolean selected) {
/*  7940 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean isSelected() {
/*  7948 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setActivated(boolean activated) {
/*  7964 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void dispatchSetActivated(boolean activated) {
/*  7974 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public boolean isActivated() {
/*  7982 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public ViewTreeObserver getViewTreeObserver() {
/*  7997 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public View getRootView() {
/*  8005 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void getLocationOnScreen(int[] outLocation) {
/*  8015 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void getLocationInWindow(int[] outLocation) {
/*  8025 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final <T extends View> T findViewById(int id) {
/*  8042 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @RecentlyNonNull
/*       */   public final <T extends View> T requireViewById(int id) {
/*  8060 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final <T extends View> T findViewWithTag(Object tag) {
/*  8070 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setId(int id) {
/*  8086 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @CapturedViewProperty
/*       */   public int getId() {
/*  8099 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public Object getTag() {
/*  8111 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setTag(Object tag) {
/*  8125 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Object getTag(int key) {
/*  8139 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setTag(int key, Object tag) {
/*  8163 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "layout")
/*       */   public int getBaseline() {
/*  8174 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isInLayout() {
/*  8184 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void requestLayout() {
/*  8201 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void forceLayout() {
/*  8209 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void measure(int widthMeasureSpec, int heightMeasureSpec) {
/*  8232 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/*  8281 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected final void setMeasuredDimension(int measuredWidth, int measuredHeight) {
/*  8296 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int combineMeasuredStates(int curState, int newState) {
/*  8307 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int resolveSize(int size, int measureSpec) {
/*  8314 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int resolveSizeAndState(int size, int measureSpec, int childMeasuredState) {
/*  8333 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int getDefaultSize(int size, int measureSpec) {
/*  8345 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int getSuggestedMinimumHeight() {
/*  8359 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected int getSuggestedMinimumWidth() {
/*  8373 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getMinimumHeight() {
/*  8385 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setMinimumHeight(int minHeight) {
/*  8399 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getMinimumWidth() {
/*  8411 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setMinimumWidth(int minWidth) {
/*  8425 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Animation getAnimation() {
/*  8434 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void startAnimation(Animation animation) {
/*  8442 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public void clearAnimation() {
/*  8448 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setAnimation(Animation animation) {
/*  8464 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onAnimationStart() {
/*  8477 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onAnimationEnd() {
/*  8490 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean onSetAlpha(int alpha) {
/*  8504 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void playSoundEffect(int soundConstant) {
/*  8519 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean performHapticFeedback(int feedbackConstant) {
/*  8537 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean performHapticFeedback(int feedbackConstant, int flags) {
/*  8549 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setSystemUiVisibility(int visibility) {
/*  8598 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getSystemUiVisibility() {
/*  8609 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getWindowSystemUiVisibility() {
/*  8618 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onWindowSystemUiVisibilityChanged(int visible) {
/*  8629 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchWindowSystemUiVisiblityChanged(int visible) {
/*  8636 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnSystemUiVisibilityChangeListener(OnSystemUiVisibilityChangeListener l) {
/*  8643 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchSystemUiVisibilityChanged(int visibility) {
/*  8650 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public final boolean startDrag(ClipData data, DragShadowBuilder shadowBuilder, Object myLocalState, int flags) {
/*  8657 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final boolean startDragAndDrop(ClipData data, DragShadowBuilder shadowBuilder, Object myLocalState, int flags) {
/*  8710 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void cancelDragAndDrop() {
/*  8730 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void updateDragShadow(DragShadowBuilder shadowBuilder) {
/*  8739 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onDragEvent(DragEvent event) {
/*  8770 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchDragEvent(DragEvent event) {
/*  8789 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static View inflate(Context context, int resource, ViewGroup root) {
/*  8802 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
/*  8827 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
/*  8839 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int getOverScrollMode() {
/*  8850 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOverScrollMode(int overScrollMode) {
/*  8864 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setNestedScrollingEnabled(boolean enabled) {
/*  8880 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isNestedScrollingEnabled() {
/*  8895 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean startNestedScroll(int axes) {
/*  8935 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void stopNestedScroll() {
/*  8945 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean hasNestedScrollingParent() {
/*  8956 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, @RecentlyNullable int[] offsetInWindow) {
/*  8983 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchNestedPreScroll(int dx, int dy, @RecentlyNullable int[] consumed, @RecentlyNullable int[] offsetInWindow) {
/*  9007 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
/*  9028 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
/*  9061 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setTextDirection(int textDirection) {
/*  9084 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "text", mapping = {@IntToString(from = 0, to = "INHERIT"), @IntToString(from = 1, to = "FIRST_STRONG"), @IntToString(from = 2, to = "ANY_RTL"), @IntToString(from = 3, to = "LTR"), @IntToString(from = 4, to = "RTL"), @IntToString(from = 5, to = "LOCALE"), @IntToString(from = 6, to = "FIRST_STRONG_LTR"), @IntToString(from = 7, to = "FIRST_STRONG_RTL")})
/*       */   public int getTextDirection() {
/*  9102 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean canResolveTextDirection() {
/*  9110 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isTextDirectionResolved() {
/*  9116 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setTextAlignment(int textAlignment) {
/*  9139 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty(category = "text", mapping = {@IntToString(from = 0, to = "INHERIT"), @IntToString(from = 1, to = "GRAVITY"), @IntToString(from = 2, to = "TEXT_START"), @IntToString(from = 3, to = "TEXT_END"), @IntToString(from = 4, to = "CENTER"), @IntToString(from = 5, to = "VIEW_START"), @IntToString(from = 6, to = "VIEW_END")})
/*       */   public int getTextAlignment() {
/*  9157 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean canResolveTextAlignment() {
/*  9165 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean isTextAlignmentResolved() {
/*  9171 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static int generateViewId() {
/*  9180 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
/*  9192 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setPointerIcon(PointerIcon pointerIcon) {
/*  9200 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public PointerIcon getPointerIcon() {
/*  9206 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean hasPointerCapture() {
/*  9216 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void requestPointerCapture() {
/*  9236 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void releasePointerCapture() {
/*  9246 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void onPointerCaptureChange(boolean hasCapture) {
/*  9256 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public void dispatchPointerCaptureChanged(boolean hasCapture) {
/*  9262 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean onCapturedPointerEvent(MotionEvent event) {
/*  9272 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setOnCapturedPointerListener(OnCapturedPointerListener l) {
/*  9279 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public ViewPropertyAnimator animate() {
/*  9288 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final void setTransitionName(String transitionName) {
/*  9297 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @ExportedProperty
/*       */   public String getTransitionName() {
/*  9309 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void setTooltipText(@RecentlyNullable CharSequence tooltipText) {
/*  9330 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @RecentlyNullable
/*       */   public CharSequence getTooltipText() {
/*  9345 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void addOnUnhandledKeyEventListener(OnUnhandledKeyEventListener listener) {
/*  9355 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public void removeOnUnhandledKeyEventListener(OnUnhandledKeyEventListener listener) {
/*  9365 */     throw new RuntimeException("Stub!");
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9401 */   public static final Property<View, Float> ALPHA = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int AUTOFILL_FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE = "creditCardExpirationDate";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY = "creditCardExpirationDay";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH = "creditCardExpirationMonth";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR = "creditCardExpirationYear";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_CREDIT_CARD_NUMBER = "creditCardNumber";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE = "creditCardSecurityCode";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_EMAIL_ADDRESS = "emailAddress";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_NAME = "name";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_PASSWORD = "password";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_PHONE = "phone";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_POSTAL_ADDRESS = "postalAddress";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_POSTAL_CODE = "postalCode";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final String AUTOFILL_HINT_USERNAME = "username";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int AUTOFILL_TYPE_DATE = 4;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int AUTOFILL_TYPE_LIST = 3;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int AUTOFILL_TYPE_NONE = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int AUTOFILL_TYPE_TEXT = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int AUTOFILL_TYPE_TOGGLE = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int DRAG_FLAG_GLOBAL = 256;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int DRAG_FLAG_GLOBAL_PERSISTABLE_URI_PERMISSION = 64;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int DRAG_FLAG_GLOBAL_PREFIX_URI_PERMISSION = 128;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int DRAG_FLAG_GLOBAL_URI_READ = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int DRAG_FLAG_GLOBAL_URI_WRITE = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int DRAG_FLAG_OPAQUE = 512;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public static final int DRAWING_CACHE_QUALITY_AUTO = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public static final int DRAWING_CACHE_QUALITY_HIGH = 1048576;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public static final int DRAWING_CACHE_QUALITY_LOW = 524288;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9800 */   protected static final int[] EMPTY_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9811 */   protected static final int[] ENABLED_FOCUSED_SELECTED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9824 */   protected static final int[] ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9834 */   protected static final int[] ENABLED_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9845 */   protected static final int[] ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9855 */   protected static final int[] ENABLED_SELECTED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9866 */   protected static final int[] ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9878 */   protected static final int[] ENABLED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9888 */   protected static final int[] ENABLED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FIND_VIEWS_WITH_CONTENT_DESCRIPTION = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FIND_VIEWS_WITH_TEXT = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUSABLE = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUSABLES_ALL = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUSABLES_TOUCH_MODE = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUSABLE_AUTO = 16;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9946 */   protected static final int[] FOCUSED_SELECTED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9957 */   protected static final int[] FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9969 */   protected static final int[] FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  9979 */   protected static final int[] FOCUSED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUS_BACKWARD = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUS_DOWN = 130;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUS_FORWARD = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUS_LEFT = 17;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUS_RIGHT = 66;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int FOCUS_UP = 33;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int GONE = 8;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int HAPTIC_FEEDBACK_ENABLED = 268435456;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int IMPORTANT_FOR_AUTOFILL_AUTO = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int IMPORTANT_FOR_AUTOFILL_NO = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS = 8;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int IMPORTANT_FOR_AUTOFILL_YES = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int IMPORTANT_FOR_AUTOFILL_YES_EXCLUDE_DESCENDANTS = 4;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int INVISIBLE = 4;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int KEEP_SCREEN_ON = 67108864;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int LAYER_TYPE_HARDWARE = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int LAYER_TYPE_NONE = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int LAYER_TYPE_SOFTWARE = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int LAYOUT_DIRECTION_INHERIT = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int LAYOUT_DIRECTION_LOCALE = 3;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int LAYOUT_DIRECTION_LTR = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int LAYOUT_DIRECTION_RTL = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int MEASURED_SIZE_MASK = 16777215;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int MEASURED_STATE_MASK = -16777216;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int MEASURED_STATE_TOO_SMALL = 16777216;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int NOT_FOCUSABLE = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int NO_ID = -1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int OVER_SCROLL_ALWAYS = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int OVER_SCROLL_NEVER = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10300 */   protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10314 */   protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10325 */   protected static final int[] PRESSED_ENABLED_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10338 */   protected static final int[] PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10349 */   protected static final int[] PRESSED_ENABLED_SELECTED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10362 */   protected static final int[] PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10372 */   protected static final int[] PRESSED_ENABLED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10383 */   protected static final int[] PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10394 */   protected static final int[] PRESSED_FOCUSED_SELECTED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10406 */   protected static final int[] PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10416 */   protected static final int[] PRESSED_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10427 */   protected static final int[] PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10437 */   protected static final int[] PRESSED_SELECTED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10448 */   protected static final int[] PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10460 */   protected static final int[] PRESSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10470 */   protected static final int[] PRESSED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10478 */   public static final Property<View, Float> ROTATION = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10486 */   public static final Property<View, Float> ROTATION_X = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10494 */   public static final Property<View, Float> ROTATION_Y = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10502 */   public static final Property<View, Float> SCALE_X = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10510 */   public static final Property<View, Float> SCALE_Y = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCREEN_STATE_OFF = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCREEN_STATE_ON = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLLBARS_INSIDE_INSET = 16777216;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLLBARS_INSIDE_OVERLAY = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLLBARS_OUTSIDE_INSET = 50331648;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLLBARS_OUTSIDE_OVERLAY = 33554432;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLLBAR_POSITION_DEFAULT = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLLBAR_POSITION_LEFT = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLLBAR_POSITION_RIGHT = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLL_AXIS_HORIZONTAL = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLL_AXIS_NONE = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLL_AXIS_VERTICAL = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLL_INDICATOR_BOTTOM = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLL_INDICATOR_END = 32;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLL_INDICATOR_LEFT = 4;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLL_INDICATOR_RIGHT = 8;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLL_INDICATOR_START = 16;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SCROLL_INDICATOR_TOP = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10672 */   protected static final int[] SELECTED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10682 */   protected static final int[] SELECTED_WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SOUND_EFFECTS_ENABLED = 134217728;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public static final int STATUS_BAR_HIDDEN = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   @Deprecated
/*       */   public static final int STATUS_BAR_VISIBLE = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_FULLSCREEN = 4;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_IMMERSIVE = 2048;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_IMMERSIVE_STICKY = 4096;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN = 1024;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION = 512;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_LAYOUT_STABLE = 256;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR = 16;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = 8192;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_LOW_PROFILE = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_FLAG_VISIBLE = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int SYSTEM_UI_LAYOUT_FLAGS = 1536;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_ALIGNMENT_CENTER = 4;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_ALIGNMENT_GRAVITY = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_ALIGNMENT_INHERIT = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_ALIGNMENT_TEXT_END = 3;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_ALIGNMENT_TEXT_START = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_ALIGNMENT_VIEW_END = 6;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_ALIGNMENT_VIEW_START = 5;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_DIRECTION_ANY_RTL = 2;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_DIRECTION_FIRST_STRONG = 1;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 6;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 7;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_DIRECTION_INHERIT = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_DIRECTION_LOCALE = 5;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_DIRECTION_LTR = 3;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int TEXT_DIRECTION_RTL = 4;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 11044 */   public static final Property<View, Float> TRANSLATION_X = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 11052 */   public static final Property<View, Float> TRANSLATION_Y = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 11060 */   public static final Property<View, Float> TRANSLATION_Z = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   protected static final String VIEW_LOG_TAG = "View";
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static final int VISIBLE = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 11086 */   protected static final int[] WINDOW_FOCUSED_STATE_SET = new int[0];
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 11094 */   public static final Property<View, Float> X = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 11102 */   public static final Property<View, Float> Y = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 11110 */   public static final Property<View, Float> Z = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static class AccessibilityDelegate
/*       */   {
/*       */     public AccessibilityDelegate() {
/* 11187 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public void sendAccessibilityEvent(View host, int eventType) {
/* 11204 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public boolean performAccessibilityAction(View host, int action, Bundle args) {
/* 11223 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
/* 11244 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
/* 11264 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
/* 11283 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
/* 11302 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
/* 11320 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public void addExtraDataToAccessibilityNodeInfo(@RecentlyNonNull View host, @RecentlyNonNull AccessibilityNodeInfo info, @RecentlyNonNull String extraDataKey, @RecentlyNullable Bundle arguments) {
/* 11354 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
/* 11376 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public AccessibilityNodeProvider getAccessibilityNodeProvider(View host) {
/* 11393 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static class BaseSavedState
/*       */     extends AbsSavedState
/*       */   {
/*       */     public BaseSavedState(Parcel source) {
/* 11410 */       super((Parcelable)null); throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public BaseSavedState(Parcel source, ClassLoader loader) {
/* 11420 */       super((Parcelable)null); throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public BaseSavedState(Parcelable superState) {
/* 11428 */       super((Parcelable)null); throw new RuntimeException("Stub!");
/*       */     } public void writeToParcel(Parcel out, int flags) {
/* 11430 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */     
/* 11433 */     public static final Parcelable.Creator<BaseSavedState> CREATOR = null;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static class DragShadowBuilder
/*       */   {
/*       */     public DragShadowBuilder(View view) {
/* 11475 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public DragShadowBuilder() {
/* 11485 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public final View getView() {
/* 11498 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
/* 11521 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public void onDrawShadow(Canvas canvas) {
/* 11531 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static class MeasureSpec
/*       */   {
/*       */     public static final int AT_MOST = -2147483648;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public static final int EXACTLY = 1073741824;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public static final int UNSPECIFIED = 0;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public MeasureSpec() {
/* 11565 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public static int makeMeasureSpec(int size, int mode) {
/* 11591 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public static int getMode(int measureSpec) {
/* 11604 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public static int getSize(int measureSpec) {
/* 11613 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     public static String toString(int measureSpec) {
/* 11623 */       throw new RuntimeException("Stub!");
/*       */     }
/*       */   }
/*       */   
/*       */   public static interface OnApplyWindowInsetsListener {
/*       */     WindowInsets onApplyWindowInsets(View param1View, WindowInsets param1WindowInsets);
/*       */   }
/*       */   
/*       */   public static interface OnAttachStateChangeListener {
/*       */     void onViewAttachedToWindow(View param1View);
/*       */     
/*       */     void onViewDetachedFromWindow(View param1View);
/*       */   }
/*       */   
/*       */   public static interface OnCapturedPointerListener {
/*       */     boolean onCapturedPointer(View param1View, MotionEvent param1MotionEvent);
/*       */   }
/*       */   
/*       */   public static interface OnClickListener {
/*       */     void onClick(View param1View);
/*       */   }
/*       */   
/*       */   public static interface OnContextClickListener {
/*       */     boolean onContextClick(View param1View);
/*       */   }
/*       */   
/*       */   public static interface OnCreateContextMenuListener {
/*       */     void onCreateContextMenu(ContextMenu param1ContextMenu, View param1View, ContextMenu.ContextMenuInfo param1ContextMenuInfo);
/*       */   }
/*       */   
/*       */   public static interface OnDragListener {
/*       */     boolean onDrag(View param1View, DragEvent param1DragEvent);
/*       */   }
/*       */   
/*       */   public static interface OnFocusChangeListener {
/*       */     void onFocusChange(View param1View, boolean param1Boolean);
/*       */   }
/*       */   
/*       */   public static interface OnGenericMotionListener {
/*       */     boolean onGenericMotion(View param1View, MotionEvent param1MotionEvent);
/*       */   }
/*       */   
/*       */   public static interface OnHoverListener {
/*       */     boolean onHover(View param1View, MotionEvent param1MotionEvent);
/*       */   }
/*       */   
/*       */   public static interface OnKeyListener {
/*       */     boolean onKey(View param1View, int param1Int, KeyEvent param1KeyEvent);
/*       */   }
/*       */   
/*       */   public static interface OnLayoutChangeListener {
/*       */     void onLayoutChange(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8);
/*       */   }
/*       */   
/*       */   public static interface OnLongClickListener {
/*       */     boolean onLongClick(View param1View);
/*       */   }
/*       */   
/*       */   public static interface OnScrollChangeListener {
/*       */     void onScrollChange(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
/*       */   }
/*       */   
/*       */   public static interface OnSystemUiVisibilityChangeListener {
/*       */     void onSystemUiVisibilityChange(int param1Int);
/*       */   }
/*       */   
/*       */   public static interface OnTouchListener {
/*       */     boolean onTouch(View param1View, MotionEvent param1MotionEvent);
/*       */   }
/*       */   
/*       */   public static interface OnUnhandledKeyEventListener {
/*       */     boolean onUnhandledKeyEvent(View param1View, KeyEvent param1KeyEvent);
/*       */   }
/*       */ }


/* Location:              M:\learn_android\android.jar!\android\view\View.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */