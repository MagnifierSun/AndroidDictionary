/*     */ package android.net.wifi.hotspot2.pps;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.cert.X509Certificate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Credential
/*     */   implements Parcelable
/*     */ {
/*     */   public Credential() {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Credential(Credential source) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRealm(String realm) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRealm() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserCredential(UserCredential userCredential) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UserCredential getUserCredential() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCertCredential(CertificateCredential certCredential) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CertificateCredential getCertCredential() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSimCredential(SimCredential simCredential) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimCredential getSimCredential() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCaCertificate(X509Certificate caCertificate) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public X509Certificate getCaCertificate() {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setClientCertificateChain(X509Certificate[] certificateChain) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public X509Certificate[] getClientCertificateChain() {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setClientPrivateKey(PrivateKey clientPrivateKey) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PrivateKey getClientPrivateKey() {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object thatObject) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 175 */   public static final Parcelable.Creator<Credential> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class CertificateCredential
/*     */     implements Parcelable
/*     */   {
/*     */     public CertificateCredential() {
/* 188 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public CertificateCredential(CertificateCredential source) {
/* 196 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setCertType(String certType) {
/* 204 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getCertType() {
/* 212 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setCertSha256Fingerprint(byte[] certSha256Fingerprint) {
/* 220 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public byte[] getCertSha256Fingerprint() {
/* 228 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 230 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 232 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object thatObject) {
/* 234 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 236 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 238 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 241 */     public static final Parcelable.Creator<CertificateCredential> CREATOR = null;
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
/*     */   public static final class SimCredential
/*     */     implements Parcelable
/*     */   {
/*     */     public SimCredential() {
/* 256 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public SimCredential(SimCredential source) {
/* 264 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setImsi(String imsi) {
/* 273 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getImsi() {
/* 282 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setEapType(int eapType) {
/* 291 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getEapType() {
/* 300 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 302 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object thatObject) {
/* 304 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 306 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 308 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 310 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 313 */     public static final Parcelable.Creator<SimCredential> CREATOR = null;
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
/*     */   public static final class UserCredential
/*     */     implements Parcelable
/*     */   {
/*     */     public UserCredential() {
/* 328 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public UserCredential(UserCredential source) {
/* 336 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setUsername(String username) {
/* 344 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUsername() {
/* 352 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setPassword(String password) {
/* 360 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getPassword() {
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
/*     */     public void setEapType(int eapType) {
/* 380 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getEapType() {
/* 389 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setNonEapInnerMethod(String nonEapInnerMethod) {
/* 397 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getNonEapInnerMethod() {
/* 405 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 407 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 409 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object thatObject) {
/* 411 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 413 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 415 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 418 */     public static final Parcelable.Creator<UserCredential> CREATOR = null;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\wifi\hotspot2\pps\Credential.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */