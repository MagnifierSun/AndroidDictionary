/*     */ package android.telephony;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class NetworkScanRequest
/*     */   implements Parcelable
/*     */ {
/*     */   public NetworkScanRequest(int scanType, RadioAccessSpecifier[] specifiers, int searchPeriodicity, int maxSearchTime, boolean incrementalResults, int incrementalResultsPeriodicity, ArrayList<String> mccMncs) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getScanType() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int getSearchPeriodicity() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int getMaxSearchTime() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getIncrementalResults() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int getIncrementalResultsPeriodicity() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public RadioAccessSpecifier[] getSpecifiers() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList<String> getPlmns() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 100 */   public static final Parcelable.Creator<NetworkScanRequest> CREATOR = null;
/*     */   public static final int SCAN_TYPE_ONE_SHOT = 0;
/*     */   public static final int SCAN_TYPE_PERIODIC = 1;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\NetworkScanRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */