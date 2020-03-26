/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
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
/*    */ @Deprecated
/*    */ public class FragmentBreadCrumbs
/*    */   extends ViewGroup
/*    */   implements FragmentManager.OnBackStackChangedListener
/*    */ {
/*    */   public FragmentBreadCrumbs(Context context) {
/* 39 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   } public FragmentBreadCrumbs(Context context, AttributeSet attrs) {
/* 41 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   } public FragmentBreadCrumbs(Context context, AttributeSet attrs, int defStyleAttr) {
/* 43 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setActivity(Activity a) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setMaxVisible(int visibleCrumbs) {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public void setParentTitle(CharSequence title, CharSequence shortTitle, View.OnClickListener listener) {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setOnBreadCrumbClickListener(OnBreadCrumbClickListener listener) {
/* 80 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setTitle(CharSequence title, CharSequence shortTitle) {
/* 88 */     throw new RuntimeException("Stub!");
/*    */   } protected void onLayout(boolean changed, int l, int t, int r, int b) {
/* 90 */     throw new RuntimeException("Stub!");
/*    */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 92 */     throw new RuntimeException("Stub!");
/*    */   } public void onBackStackChanged() {
/* 94 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public static interface OnBreadCrumbClickListener {
/*    */     boolean onBreadCrumbClick(FragmentManager.BackStackEntry param1BackStackEntry, int param1Int);
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\FragmentBreadCrumbs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */