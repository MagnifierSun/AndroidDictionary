/*     */ package android.net.wifi;
/*     */ 
/*     */ import android.net.ProxyInfo;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.util.BitSet;
/*     */ 
/*     */ public class WifiConfiguration
/*     */   implements Parcelable
/*     */ {
/*     */   public String BSSID;
/*     */   public String FQDN;
/*     */   public String SSID;
/*     */   public BitSet allowedAuthAlgorithms;
/*     */   public BitSet allowedGroupCiphers;
/*     */   public BitSet allowedKeyManagement;
/*     */   public BitSet allowedPairwiseCiphers;
/*     */   public BitSet allowedProtocols;
/*     */   public WifiEnterpriseConfig enterpriseConfig;
/*     */   public boolean hiddenSSID;
/*     */   public boolean isHomeProviderNetwork;
/*     */   public int networkId;
/*     */   public String preSharedKey;
/*     */   @Deprecated
/*     */   public int priority;
/*     */   public String providerFriendlyName;
/*     */   public long[] roamingConsortiumIds;
/*     */   public int status;
/*     */   @Deprecated
/*     */   public String[] wepKeys;
/*     */   @Deprecated
/*     */   public int wepTxKeyIndex;
/*     */   
/*     */   public WifiConfiguration() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPasspoint() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ProxyInfo getHttpProxy() {
/*  51 */     throw new RuntimeException("Stub!");
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
/*     */   public void setHttpProxy(ProxyInfo httpProxy) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int describeContents() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void writeToParcel(Parcel dest, int flags) {
/*  73 */     throw new RuntimeException("Stub!");
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
/*     */   public static class AuthAlgorithm
/*     */   {
/*     */     public static final int LEAP = 2;
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
/*     */     public static final int OPEN = 0;
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
/*     */     @Deprecated
/*     */     public static final int SHARED = 1;
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
/*     */     AuthAlgorithm() {
/* 237 */       throw new RuntimeException("Stub!");
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
/* 254 */     public static final String[] strings = new String[0];
/*     */     
/*     */     public static final String varName = "auth_alg";
/*     */   }
/*     */ 
/*     */   
/*     */   public static class GroupCipher
/*     */   {
/*     */     public static final int CCMP = 3;
/*     */     
/*     */     public static final int TKIP = 2;
/*     */     
/*     */     @Deprecated
/*     */     public static final int WEP104 = 1;
/*     */     @Deprecated
/*     */     public static final int WEP40 = 0;
/*     */     
/*     */     GroupCipher() {
/* 272 */       throw new RuntimeException("Stub!");
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
/* 295 */     public static final String[] strings = new String[0];
/*     */     public static final String varName = "group";
/*     */   }
/*     */   
/*     */   public static class KeyMgmt
/*     */   {
/*     */     public static final int IEEE8021X = 3;
/*     */     public static final int NONE = 0;
/*     */     public static final int WPA_EAP = 2;
/*     */     public static final int WPA_PSK = 1;
/*     */     
/*     */     KeyMgmt() {
/* 307 */       throw new RuntimeException("Stub!");
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
/* 327 */     public static final String[] strings = new String[0];
/*     */     public static final String varName = "key_mgmt";
/*     */   }
/*     */   
/*     */   public static class PairwiseCipher
/*     */   {
/*     */     public static final int CCMP = 2;
/*     */     public static final int NONE = 0;
/*     */     @Deprecated
/*     */     public static final int TKIP = 1;
/*     */     
/*     */     PairwiseCipher() {
/* 339 */       throw new RuntimeException("Stub!");
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
/* 356 */     public static final String[] strings = new String[0];
/*     */     
/*     */     public static final String varName = "pairwise";
/*     */   }
/*     */   
/*     */   public static class Protocol
/*     */   {
/*     */     public static final int RSN = 1;
/*     */     @Deprecated
/*     */     public static final int WPA = 0;
/*     */     
/*     */     Protocol() {
/* 368 */       throw new RuntimeException("Stub!");
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
/* 381 */     public static final String[] strings = new String[0];
/*     */     public static final String varName = "proto";
/*     */   }
/*     */   
/*     */   public static class Status {
/*     */     public static final int CURRENT = 0;
/*     */     public static final int DISABLED = 1;
/*     */     public static final int ENABLED = 2;
/*     */     
/*     */     Status() {
/* 391 */       throw new RuntimeException("Stub!");
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
/* 406 */     public static final String[] strings = new String[0];
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\WifiConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */