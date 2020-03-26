/*     */ package android.telecom;
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
/*     */ public final class DisconnectCause
/*     */   implements Parcelable
/*     */ {
/*     */   public static final int ANSWERED_ELSEWHERE = 11;
/*     */   public static final int BUSY = 7;
/*     */   public static final int CALL_PULLED = 12;
/*     */   public static final int CANCELED = 4;
/*     */   public static final int CONNECTION_MANAGER_NOT_SUPPORTED = 10;
/*     */   
/*     */   public DisconnectCause(int code) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DisconnectCause(int code, String reason) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DisconnectCause(int code, CharSequence label, CharSequence description, String reason) {
/*  59 */     throw new RuntimeException("Stub!");
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
/*     */   public DisconnectCause(int code, CharSequence label, CharSequence description, String reason, int toneToPlay) {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCode() {
/*  79 */     throw new RuntimeException("Stub!");
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
/*     */   public CharSequence getLabel() {
/*  91 */     throw new RuntimeException("Stub!");
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
/*     */   public CharSequence getDescription() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getReason() {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTone() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel destination, int flags) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 131 */     throw new RuntimeException("Stub!");
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
/* 162 */   public static final Parcelable.Creator<DisconnectCause> CREATOR = null;
/*     */   public static final int ERROR = 1;
/*     */   public static final int LOCAL = 2;
/*     */   public static final int MISSED = 5;
/*     */   public static final int OTHER = 9;
/*     */   public static final int REJECTED = 6;
/*     */   public static final int REMOTE = 3;
/*     */   public static final int RESTRICTED = 8;
/*     */   public static final int UNKNOWN = 0;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telecom\DisconnectCause.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */