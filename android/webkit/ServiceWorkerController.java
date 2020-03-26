/*    */ package android.webkit;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ServiceWorkerController
/*    */ {
/*    */   public ServiceWorkerController() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public static ServiceWorkerController getInstance() {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @RecentlyNonNull
/*    */   public abstract ServiceWorkerWebSettings getServiceWorkerWebSettings();
/*    */   
/*    */   public abstract void setServiceWorkerClient(@RecentlyNullable ServiceWorkerClient paramServiceWorkerClient);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\webkit\ServiceWorkerController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */