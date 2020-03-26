/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.Configuration;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.Menu;
/*     */ import android.view.MenuItem;
/*     */ import android.view.ViewGroup;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ActionMenuView
/*     */   extends LinearLayout
/*     */ {
/*     */   public ActionMenuView(Context context) {
/*  35 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public ActionMenuView(Context context, AttributeSet attrs) {
/*  37 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPopupTheme(int resId) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPopupTheme() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public void onConfigurationChanged(Configuration newConfig) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public void setOnMenuItemClickListener(OnMenuItemClickListener listener) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } public void onDetachedFromWindow() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOverflowIcon(@RecentlyNullable Drawable icon) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Drawable getOverflowIcon() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   } protected LayoutParams generateDefaultLayoutParams() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   } public LayoutParams generateLayoutParams(AttributeSet attrs) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Menu getMenu() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean showOverflowMenu() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hideOverflowMenu() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOverflowMenuShowing() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static interface OnMenuItemClickListener {
/*     */     boolean onMenuItemClick(MenuItem param1MenuItem); }
/*     */   
/*     */   public void dismissPopupMenus() {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static class LayoutParams extends LinearLayout.LayoutParams { public LayoutParams(Context c, AttributeSet attrs) {
/* 139 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public LayoutParams(ViewGroup.LayoutParams other) {
/* 141 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public LayoutParams(LayoutParams other) {
/* 143 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } public LayoutParams(int width, int height) {
/* 145 */       super((ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!");
/*     */     } }
/*     */ 
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\ActionMenuView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */