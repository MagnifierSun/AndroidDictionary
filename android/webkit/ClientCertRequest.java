/*    */ package android.webkit;
/*    */ 
/*    */ import androidx.annotation.RecentlyNullable;
/*    */ import java.security.Principal;
/*    */ import java.security.PrivateKey;
/*    */ import java.security.cert.X509Certificate;
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
/*    */ public abstract class ClientCertRequest
/*    */ {
/*    */   public ClientCertRequest() {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @RecentlyNullable
/*    */   public abstract String[] getKeyTypes();
/*    */   
/*    */   @RecentlyNullable
/*    */   public abstract Principal[] getPrincipals();
/*    */   
/*    */   public abstract String getHost();
/*    */   
/*    */   public abstract int getPort();
/*    */   
/*    */   public abstract void proceed(PrivateKey paramPrivateKey, X509Certificate[] paramArrayOfX509Certificate);
/*    */   
/*    */   public abstract void ignore();
/*    */   
/*    */   public abstract void cancel();
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\webkit\ClientCertRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */