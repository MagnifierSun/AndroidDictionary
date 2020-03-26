/*    */ package android.webkit;
/*    */ 
/*    */ import androidx.annotation.RecentlyNullable;
/*    */ import java.io.Serializable;
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
/*    */ public abstract class WebBackForwardList
/*    */   implements Cloneable, Serializable
/*    */ {
/*    */   protected abstract WebBackForwardList clone();
/*    */   
/*    */   public abstract int getSize();
/*    */   
/*    */   public abstract WebHistoryItem getItemAtIndex(int paramInt);
/*    */   
/*    */   public abstract int getCurrentIndex();
/*    */   
/*    */   @RecentlyNullable
/*    */   public abstract WebHistoryItem getCurrentItem();
/*    */   
/*    */   public WebBackForwardList() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\webkit\WebBackForwardList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */