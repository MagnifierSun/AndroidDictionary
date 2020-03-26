/*    */ package android.webkit;
/*    */ 
/*    */ import android.content.Context;
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
/*    */ public abstract class WebViewDatabase
/*    */ {
/*    */   public WebViewDatabase() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public static WebViewDatabase getInstance(Context context) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public abstract boolean hasUsernamePassword();
/*    */   
/*    */   @Deprecated
/*    */   public abstract void clearUsernamePassword();
/*    */   
/*    */   public abstract boolean hasHttpAuthUsernamePassword();
/*    */   
/*    */   public abstract void clearHttpAuthUsernamePassword();
/*    */   
/*    */   public abstract void setHttpAuthUsernamePassword(String paramString1, String paramString2, String paramString3, String paramString4);
/*    */   
/*    */   @RecentlyNullable
/*    */   public abstract String[] getHttpAuthUsernamePassword(String paramString1, String paramString2);
/*    */   
/*    */   @Deprecated
/*    */   public abstract boolean hasFormData();
/*    */   
/*    */   @Deprecated
/*    */   public abstract void clearFormData();
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\webkit\WebViewDatabase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */