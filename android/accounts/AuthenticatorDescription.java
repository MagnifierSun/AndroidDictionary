/*     */ package android.accounts;
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
/*     */ public class AuthenticatorDescription
/*     */   implements Parcelable
/*     */ {
/*     */   public AuthenticatorDescription(String type, String packageName, int labelId, int iconId, int smallIconId, int prefId, boolean customTokens) {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   } public AuthenticatorDescription(String type, String packageName, int labelId, int iconId, int smallIconId, int prefId) {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AuthenticatorDescription newKey(String type) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int describeContents() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean equals(Object o) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void writeToParcel(Parcel dest, int flags) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  64 */   public static final Parcelable.Creator<AuthenticatorDescription> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  72 */   public final int accountPreferencesId = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean customTokens = false;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  82 */   public final int iconId = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  87 */   public final int labelId = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  92 */   public final String packageName = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  97 */   public final int smallIconId = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 102 */   public final String type = null;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\accounts\AuthenticatorDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */