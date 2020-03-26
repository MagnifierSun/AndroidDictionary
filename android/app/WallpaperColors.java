/*     */ package android.app;
/*     */ 
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Color;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
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
/*     */ public final class WallpaperColors
/*     */   implements Parcelable
/*     */ {
/*     */   public WallpaperColors(Parcel parcel) {
/*  36 */     throw new RuntimeException("Stub!");
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
/*     */   public WallpaperColors(@RecentlyNonNull Color primaryColor, @RecentlyNullable Color secondaryColor, @RecentlyNullable Color tertiaryColor) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static WallpaperColors fromDrawable(Drawable drawable) {
/*  61 */     throw new RuntimeException("Stub!");
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
/*     */   public static WallpaperColors fromBitmap(@RecentlyNonNull Bitmap bitmap) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public Color getPrimaryColor() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Color getSecondaryColor() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Color getTertiaryColor() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 114 */   public static final Parcelable.Creator<WallpaperColors> CREATOR = null;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\WallpaperColors.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */