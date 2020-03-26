/*     */ package android.net;
/*     */ 
/*     */ import android.content.Context;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class IpSecTransform
/*     */   implements AutoCloseable
/*     */ {
/*     */   IpSecTransform() {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   protected void finalize() throws Throwable {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     public Builder(@RecentlyNonNull Context context) {
/*  69 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setEncryption(@RecentlyNonNull IpSecAlgorithm algo) {
/*  82 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setAuthentication(@RecentlyNonNull IpSecAlgorithm algo) {
/*  95 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setAuthenticatedEncryption(@RecentlyNonNull IpSecAlgorithm algo) {
/* 114 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setIpv4Encapsulation(@RecentlyNonNull IpSecManager.UdpEncapsulationSocket localSocket, int remotePort) {
/* 133 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public IpSecTransform buildTransportModeTransform(@RecentlyNonNull InetAddress sourceAddress, @RecentlyNonNull IpSecManager.SecurityParameterIndex spi) throws IOException, IpSecManager.ResourceUnavailableException, IpSecManager.SpiUnavailableException {
/* 161 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\IpSecTransform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */