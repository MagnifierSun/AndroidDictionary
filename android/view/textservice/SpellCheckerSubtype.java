/*     */ package android.view.textservice;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.pm.ApplicationInfo;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class SpellCheckerSubtype
/*     */   implements Parcelable
/*     */ {
/*     */   @Deprecated
/*     */   public SpellCheckerSubtype(int nameId, String locale, String extraValue) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNameResId() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   @RecentlyNonNull
/*     */   public String getLocale() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public String getLanguageTag() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getExtraValue() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean containsExtraValueKey(String key) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getExtraValueOf(String key) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/* 104 */     throw new RuntimeException("Stub!");
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
/*     */   public CharSequence getDisplayName(Context context, String packageName, ApplicationInfo appInfo) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 124 */   public static final Parcelable.Creator<SpellCheckerSubtype> CREATOR = null;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\textservice\SpellCheckerSubtype.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */