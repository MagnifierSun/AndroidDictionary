/*     */ package android.text.style;
/*     */ 
/*     */ import android.graphics.Typeface;
/*     */ import android.os.Parcel;
/*     */ import android.text.ParcelableSpan;
/*     */ import android.text.TextPaint;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TypefaceSpan
/*     */   extends MetricAffectingSpan
/*     */   implements ParcelableSpan
/*     */ {
/*     */   public TypefaceSpan(@RecentlyNullable String family) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TypefaceSpan(@RecentlyNonNull Typeface typeface) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TypefaceSpan(@RecentlyNonNull Parcel src) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   } public int getSpanTypeId() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(@RecentlyNonNull Parcel dest, int flags) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getFamily() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Typeface getTypeface() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateDrawState(@RecentlyNonNull TextPaint ds) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateMeasureState(@RecentlyNonNull TextPaint paint) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\TypefaceSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */