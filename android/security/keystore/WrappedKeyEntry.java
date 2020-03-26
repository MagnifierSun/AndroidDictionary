/*    */ package android.security.keystore;
/*    */ 
/*    */ import java.security.KeyStore;
/*    */ import java.security.spec.AlgorithmParameterSpec;
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
/*    */ public class WrappedKeyEntry
/*    */   implements KeyStore.Entry
/*    */ {
/*    */   public WrappedKeyEntry(byte[] wrappedKeyBytes, String wrappingKeyAlias, String transformation, AlgorithmParameterSpec algorithmParameterSpec) {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   } public byte[] getWrappedKeyBytes() {
/* 89 */     throw new RuntimeException("Stub!");
/*    */   } public String getWrappingKeyAlias() {
/* 91 */     throw new RuntimeException("Stub!");
/*    */   } public String getTransformation() {
/* 93 */     throw new RuntimeException("Stub!");
/*    */   } public AlgorithmParameterSpec getAlgorithmParameterSpec() {
/* 95 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\security\keystore\WrappedKeyEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */