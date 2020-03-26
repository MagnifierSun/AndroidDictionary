/*     */ package android.widget;
/*     */ 
/*     */ import android.app.LocalActivityManager;
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.View;
/*     */ import android.view.ViewTreeObserver;
/*     */ import androidx.annotation.RecentlyNonNull;
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
/*     */ public class TabHost
/*     */   extends FrameLayout
/*     */   implements ViewTreeObserver.OnTouchModeChangeListener
/*     */ {
/*     */   public TabHost(Context context) {
/*  34 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TabHost(Context context, AttributeSet attrs) {
/*  36 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TabHost(Context context, AttributeSet attrs, int defStyleAttr) {
/*  38 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TabHost(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  40 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public TabSpec newTabSpec(@RecentlyNonNull String tag) {
/*  50 */     throw new RuntimeException("Stub!");
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
/*     */   public void setup() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setup(LocalActivityManager activityGroup) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public void onTouchModeChanged(boolean isInTouchMode) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addTab(TabSpec tabSpec) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void clearAllTabs() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public TabWidget getTabWidget() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public int getCurrentTab() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getCurrentTabTag() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public View getCurrentTabView() {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public View getCurrentView() {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCurrentTabByTag(String tag) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FrameLayout getTabContentView() {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   } public boolean dispatchKeyEvent(KeyEvent event) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public void dispatchWindowFocusChanged(boolean hasFocus) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   } public void setCurrentTab(int index) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnTabChangedListener(OnTabChangeListener l) {
/* 150 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public class TabSpec
/*     */   {
/*     */     TabSpec(String tag) {
/* 204 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public TabSpec setIndicator(CharSequence label) {
/* 210 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public TabSpec setIndicator(CharSequence label, Drawable icon) {
/* 216 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public TabSpec setIndicator(View view) {
/* 222 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public TabSpec setContent(int viewId) {
/* 229 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public TabSpec setContent(TabHost.TabContentFactory contentFactory) {
/* 236 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public TabSpec setContent(Intent intent) {
/* 242 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public String getTag() {
/* 252 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface TabContentFactory {
/*     */     View createTabContent(String param1String);
/*     */   }
/*     */   
/*     */   public static interface OnTabChangeListener {
/*     */     void onTabChanged(String param1String);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\TabHost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */