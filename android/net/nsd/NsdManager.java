/*     */ package android.net.nsd;
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
/*     */ public final class NsdManager
/*     */ {
/*     */   public static final String ACTION_NSD_STATE_CHANGED = "android.net.nsd.STATE_CHANGED";
/*     */   public static final String EXTRA_NSD_STATE = "nsd_state";
/*     */   public static final int FAILURE_ALREADY_ACTIVE = 3;
/*     */   public static final int FAILURE_INTERNAL_ERROR = 0;
/*     */   public static final int FAILURE_MAX_LIMIT = 4;
/*     */   public static final int NSD_STATE_DISABLED = 1;
/*     */   public static final int NSD_STATE_ENABLED = 2;
/*     */   public static final int PROTOCOL_DNS_SD = 1;
/*     */   
/*     */   NsdManager() {
/* 108 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void registerService(NsdServiceInfo serviceInfo, int protocolType, RegistrationListener listener) {
/* 128 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void unregisterService(RegistrationListener listener) {
/* 144 */     throw new RuntimeException("Stub!");
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
/*     */   public void discoverServices(String serviceType, int protocolType, DiscoveryListener listener) {
/* 175 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stopServiceDiscovery(DiscoveryListener listener) {
/* 194 */     throw new RuntimeException("Stub!");
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
/*     */   public void resolveService(NsdServiceInfo serviceInfo, ResolveListener listener) {
/* 206 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface ResolveListener {
/*     */     void onResolveFailed(NsdServiceInfo param1NsdServiceInfo, int param1Int);
/*     */     
/*     */     void onServiceResolved(NsdServiceInfo param1NsdServiceInfo);
/*     */   }
/*     */   
/*     */   public static interface RegistrationListener {
/*     */     void onRegistrationFailed(NsdServiceInfo param1NsdServiceInfo, int param1Int);
/*     */     
/*     */     void onUnregistrationFailed(NsdServiceInfo param1NsdServiceInfo, int param1Int);
/*     */     
/*     */     void onServiceRegistered(NsdServiceInfo param1NsdServiceInfo);
/*     */     
/*     */     void onServiceUnregistered(NsdServiceInfo param1NsdServiceInfo);
/*     */   }
/*     */   
/*     */   public static interface DiscoveryListener {
/*     */     void onStartDiscoveryFailed(String param1String, int param1Int);
/*     */     
/*     */     void onStopDiscoveryFailed(String param1String, int param1Int);
/*     */     
/*     */     void onDiscoveryStarted(String param1String);
/*     */     
/*     */     void onDiscoveryStopped(String param1String);
/*     */     
/*     */     void onServiceFound(NsdServiceInfo param1NsdServiceInfo);
/*     */     
/*     */     void onServiceLost(NsdServiceInfo param1NsdServiceInfo);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\nsd\NsdManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */