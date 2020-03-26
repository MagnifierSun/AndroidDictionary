/*     */ package android.telephony;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ServiceState
/*     */   implements Parcelable
/*     */ {
/*     */   public ServiceState() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceState(ServiceState s) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceState(Parcel in) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } protected void copyFrom(ServiceState s) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getState() {
/*  70 */     throw new RuntimeException("Stub!");
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
/*     */   public int getDuplexMode() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChannelNumber() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getCellBandwidths() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getRoaming() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getOperatorAlphaLong() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getOperatorAlphaShort() {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getOperatorNumeric() {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getIsManualSelection() {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   } public void setStateOutOfService() {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   } public void setStateOff() {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   } public void setState(int state) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } public void setRoaming(boolean roaming) {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   } public void setOperatorName(String longName, String shortName, String numeric) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   } public void setIsManualSelection(boolean isManual) {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCdmaNetworkId() {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCdmaSystemId() {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 189 */   public static final Parcelable.Creator<ServiceState> CREATOR = null;
/*     */   public static final int DUPLEX_MODE_FDD = 1;
/*     */   public static final int DUPLEX_MODE_TDD = 2;
/*     */   public static final int DUPLEX_MODE_UNKNOWN = 0;
/*     */   public static final int STATE_EMERGENCY_ONLY = 2;
/*     */   public static final int STATE_IN_SERVICE = 0;
/*     */   public static final int STATE_OUT_OF_SERVICE = 1;
/*     */   public static final int STATE_POWER_OFF = 3;
/*     */   public static final int UNKNOWN_ID = -1;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\ServiceState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */