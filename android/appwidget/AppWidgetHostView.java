/*     */ package android.appwidget;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.graphics.Rect;
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.SparseArray;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
/*     */ import android.widget.FrameLayout;
/*     */ import android.widget.RemoteViews;
/*     */ import java.util.concurrent.Executor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AppWidgetHostView
/*     */   extends FrameLayout
/*     */ {
/*     */   public AppWidgetHostView(Context context) {
/*  42 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AppWidgetHostView(Context context, int animationIn, int animationOut) {
/*  52 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAppWidget(int appWidgetId, AppWidgetProviderInfo info) {
/*  60 */     throw new RuntimeException("Stub!");
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
/*     */   public static Rect getDefaultPaddingForWidget(Context context, ComponentName component, Rect padding) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   } public int getAppWidgetId() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   } public AppWidgetProviderInfo getAppWidgetInfo() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   } protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
/*  89 */     throw new RuntimeException("Stub!");
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
/*     */   public void updateAppWidgetSize(Bundle newOptions, int minWidth, int minHeight, int maxWidth, int maxHeight) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateAppWidgetOptions(Bundle options) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExecutor(Executor executor) {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateAppWidget(RemoteViews remoteViews) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void prepareView(View view) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected View getDefaultView() {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected View getErrorView() {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\appwidget\AppWidgetHostView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */