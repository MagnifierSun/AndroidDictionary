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
/*     */ public final class ImageTransformation
/*     */   implements Transformation, Parcelable
/*     */ {
/*     */   ImageTransformation(Builder builder) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel parcel, int flags) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  58 */   public static final Parcelable.Creator<ImageTransformation> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */     @Deprecated
/*     */     public Builder(@RecentlyNonNull AutofillId id, @RecentlyNonNull Pattern regex, int resId) {
/*  81 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder(@RecentlyNonNull AutofillId id, @RecentlyNonNull Pattern regex, int resId, @RecentlyNonNull CharSequence contentDescription) {
/*  98 */       throw new RuntimeException("Stub!");
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
/*     */     @Deprecated
/*     */     public Builder addOption(@RecentlyNonNull Pattern regex, int resId) {
/* 113 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder addOption(@RecentlyNonNull Pattern regex, int resId, @RecentlyNonNull CharSequence contentDescription) {
/* 129 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public ImageTransformation build() {
/* 135 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\autofill\ImageTransformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */