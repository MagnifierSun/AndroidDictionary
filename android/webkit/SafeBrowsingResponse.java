/*    */ package android.webkit;
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
/*    */ public abstract class SafeBrowsingResponse
/*    */ {
/*    */   public SafeBrowsingResponse() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void showInterstitial(boolean paramBoolean);
/*    */   
/*    */   public abstract void proceed(boolean paramBoolean);
/*    */   
/*    */   public abstract void backToSafety(boolean paramBoolean);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\webkit\SafeBrowsingResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */