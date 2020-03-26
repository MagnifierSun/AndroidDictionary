/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Outline;
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
/*    */ public abstract class ViewOutlineProvider
/*    */ {
/*    */   public ViewOutlineProvider() {
/* 30 */     throw new RuntimeException("Stub!");
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
/* 56 */   public static final ViewOutlineProvider BACKGROUND = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 66 */   public static final ViewOutlineProvider BOUNDS = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 76 */   public static final ViewOutlineProvider PADDED_BOUNDS = null;
/*    */   
/*    */   public abstract void getOutline(View paramView, Outline paramOutline);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\ViewOutlineProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */