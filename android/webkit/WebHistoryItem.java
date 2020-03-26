/*    */ package android.webkit;
/*    */ 
/*    */ import android.graphics.Bitmap;
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
/*    */ public abstract class WebHistoryItem
/*    */   implements Cloneable
/*    */ {
/*    */   protected abstract WebHistoryItem clone();
/*    */   
/*    */   @RecentlyNullable
/*    */   public abstract Bitmap getFavicon();
/*    */   
/*    */   public abstract String getTitle();
/*    */   
/*    */   public abstract String getOriginalUrl();
/*    */   
/*    */   public abstract String getUrl();
/*    */   
/*    */   public WebHistoryItem() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\webkit\WebHistoryItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */