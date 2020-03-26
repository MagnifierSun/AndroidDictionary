/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Point;
/*    */ import android.graphics.Rect;
/*    */ import android.os.Bundle;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import androidx.annotation.RecentlyNonNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface ViewParent
/*    */ {
/*    */   void requestLayout();
/*    */   
/*    */   boolean isLayoutRequested();
/*    */   
/*    */   void requestTransparentRegion(View paramView);
/*    */   
/*    */   default void onDescendantInvalidated(@RecentlyNonNull View child, @RecentlyNonNull View target) {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   void invalidateChild(View paramView, Rect paramRect);
/*    */   
/*    */   @Deprecated
/*    */   ViewParent invalidateChildInParent(int[] paramArrayOfint, Rect paramRect);
/*    */   
/*    */   ViewParent getParent();
/*    */   
/*    */   void requestChildFocus(View paramView1, View paramView2);
/*    */   
/*    */   void recomputeViewAttributes(View paramView);
/*    */   
/*    */   void clearChildFocus(View paramView);
/*    */   
/*    */   boolean getChildVisibleRect(View paramView, Rect paramRect, Point paramPoint);
/*    */   
/*    */   View focusSearch(View paramView, int paramInt);
/*    */   
/*    */   View keyboardNavigationClusterSearch(View paramView, int paramInt);
/*    */   
/*    */   void bringChildToFront(View paramView);
/*    */   
/*    */   void focusableViewAvailable(View paramView);
/*    */   
/*    */   boolean showContextMenuForChild(View paramView);
/*    */   
/*    */   boolean showContextMenuForChild(View paramView, float paramFloat1, float paramFloat2);
/*    */   
/*    */   void createContextMenu(ContextMenu paramContextMenu);
/*    */   
/*    */   ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback);
/*    */   
/*    */   ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt);
/*    */   
/*    */   void childDrawableStateChanged(View paramView);
/*    */   
/*    */   void requestDisallowInterceptTouchEvent(boolean paramBoolean);
/*    */   
/*    */   boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean);
/*    */   
/*    */   boolean requestSendAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent);
/*    */   
/*    */   void childHasTransientStateChanged(View paramView, boolean paramBoolean);
/*    */   
/*    */   void requestFitSystemWindows();
/*    */   
/*    */   ViewParent getParentForAccessibility();
/*    */   
/*    */   void notifySubtreeAccessibilityStateChanged(View paramView1, @RecentlyNonNull View paramView2, int paramInt);
/*    */   
/*    */   boolean canResolveLayoutDirection();
/*    */   
/*    */   boolean isLayoutDirectionResolved();
/*    */   
/*    */   int getLayoutDirection();
/*    */   
/*    */   boolean canResolveTextDirection();
/*    */   
/*    */   boolean isTextDirectionResolved();
/*    */   
/*    */   int getTextDirection();
/*    */   
/*    */   boolean canResolveTextAlignment();
/*    */   
/*    */   boolean isTextAlignmentResolved();
/*    */   
/*    */   int getTextAlignment();
/*    */   
/*    */   boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt);
/*    */   
/*    */   void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt);
/*    */   
/*    */   void onStopNestedScroll(View paramView);
/*    */   
/*    */   void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint);
/*    */   
/*    */   boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean);
/*    */   
/*    */   boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2);
/*    */   
/*    */   boolean onNestedPrePerformAccessibilityAction(View paramView, int paramInt, Bundle paramBundle);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\ViewParent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */