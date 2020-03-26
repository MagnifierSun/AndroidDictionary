/*     */ package android.service.autofill;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.view.autofill.AutofillId;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class CharSequenceTransformation
/*     */   implements Transformation, Parcelable
/*     */ {
/*     */   CharSequenceTransformation(Builder builder) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel parcel, int flags) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  61 */   public static final Parcelable.Creator<CharSequenceTransformation> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */     public Builder(@RecentlyNonNull AutofillId id, @RecentlyNonNull Pattern regex, @RecentlyNonNull String subst) {
/*  84 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder addField(@RecentlyNonNull AutofillId id, @RecentlyNonNull Pattern regex, @RecentlyNonNull String subst) {
/* 101 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public CharSequenceTransformation build() {
/* 107 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\autofill\CharSequenceTransformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */