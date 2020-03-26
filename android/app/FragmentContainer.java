/*    */ package android.app;
/*    */ 
/*    */ import androidx.annotation.RecentlyNullable;
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
/*    */ public abstract class FragmentContainer
/*    */ {
/*    */   public FragmentContainer() {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @RecentlyNullable
/*    */   public abstract <T extends android.view.View> T onFindViewById(int paramInt);
/*    */   
/*    */   public abstract boolean onHasView();
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\FragmentContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */